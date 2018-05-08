package com.alipay.api.internal.mapping;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayConstants;
import com.alipay.api.AlipayResponse;
import com.alipay.api.internal.util.StringUtils;

/**
 * 转换工具类。
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class Converters {
    // 是否对JSON返回的数据类型进行校验，默认不校验。给内部测试JSON返回时用的开关。
    //规则：返回的"基本"类型只有String,Long,Boolean,Date,采取严格校验方式，如果类型不匹配，报错
    public static boolean            isCheckJsonType = false;

    private static final Set<String> baseFields      = new HashSet<String>();

    private static final Set<String> excludeFields   = new HashSet<String>();

    /** 被子类覆盖的属性 */
    private static final Set<String> overideFields   = new HashSet<String>();

    static {
        baseFields.add("code");
        baseFields.add("msg");
        baseFields.add("subCode");
        baseFields.add("subMsg");
        baseFields.add("body");
        baseFields.add("params");
        baseFields.add("success");
    }

    static {
        excludeFields.add("errorCode");

    }

    static {

        overideFields.add("code");
        overideFields.add("msg");
    }

    private Converters() {
    }

    /**
     * 使用指定 的读取器去转换字符串为对象。
     * 
     * @param <T> 领域泛型
     * @param clazz 领域类型
     * @param reader 读取器
     * @return 领域对象
     * @throws ApiException
     */
    public static <T> T convert(Class<T> clazz, Reader reader) throws AlipayApiException {
        T rsp = null;

        try {
            rsp = clazz.newInstance();
            BeanInfo beanInfo = Introspector.getBeanInfo(clazz);
            PropertyDescriptor[] pds = beanInfo.getPropertyDescriptors();

            boolean isResponseClazz = AlipayResponse.class.isAssignableFrom(clazz);

            for (PropertyDescriptor pd : pds) {
                Method writeMethod = pd.getWriteMethod();
                if (writeMethod == null) { // ignore read-only fields
                    continue;
                }

                String itemName = pd.getName();
                String listName = null;

                // 之前errorCode的属性要剔除掉
                if (isResponseClazz && excludeFields.contains(itemName)) {

                    continue;
                }

                List<AlipayFieldMethod> alipayFieldMethods = new ArrayList<AlipayFieldMethod>();

                if (baseFields.contains(itemName) && isResponseClazz) {

                    Field field = AlipayResponse.class.getDeclaredField(itemName);

                    AlipayFieldMethod alipayFieldMethod = new AlipayFieldMethod();
                    alipayFieldMethod.setField(field);

                    // writeMethod属于父类，则直接使用
                    if (writeMethod.getDeclaringClass().getName().contains("AlipayResponse")) {

                        alipayFieldMethod.setMethod(writeMethod);
                    } else {
                        // 否则从父类再取一次
                        writeMethod = tryGetSetMethod(AlipayResponse.class, field,
                            writeMethod.getName());
                        if (writeMethod == null) {
                            continue;
                        }

                        alipayFieldMethod.setMethod(writeMethod);
                    }
                    alipayFieldMethods.add(alipayFieldMethod);

                    // 如果被子类覆盖的，则从尝试从子类中获取
                    if (overideFields.contains(itemName)) {

                        field = tryGetFieldWithoutExp(clazz, itemName);
                        // 属性存在则需要重新从子类获取访问方法
                        if (field != null) {

                            writeMethod = tryGetSetMethod(clazz, field, writeMethod.getName());
                            if (writeMethod == null) {
                                continue;
                            }
                            alipayFieldMethod = new AlipayFieldMethod();
                            alipayFieldMethod.setField(field);
                            alipayFieldMethod.setMethod(writeMethod);
                            alipayFieldMethods.add(alipayFieldMethod);
                        }
                    }

                } else {

                    Field field = clazz.getDeclaredField(itemName);

                    AlipayFieldMethod alipayFieldMethod = new AlipayFieldMethod();
                    alipayFieldMethod.setField(field);
                    alipayFieldMethod.setMethod(writeMethod);
                    alipayFieldMethods.add(alipayFieldMethod);
                }

                // 迭代设置属性
                for (AlipayFieldMethod alipayFieldMethod : alipayFieldMethods) {

                    Field field = alipayFieldMethod.getField();
                    Method method = alipayFieldMethod.getMethod();

                    ApiField jsonField = field.getAnnotation(ApiField.class);
                    if (jsonField != null) {
                        itemName = jsonField.value();
                    }
                    ApiListField jsonListField = field.getAnnotation(ApiListField.class);
                    if (jsonListField != null) {
                        listName = jsonListField.value();
                    }

                    if (!reader.hasReturnField(itemName)) {
                        if (listName == null || !reader.hasReturnField(listName)) {
                            continue; // ignore non-return field
                        }
                    }

                    Class<?> typeClass = field.getType();
                    // 目前
                    if (String.class.isAssignableFrom(typeClass)) {
                        Object value = reader.getPrimitiveObject(itemName);
                        if (value instanceof String) {
                            method.invoke(rsp, value.toString());
                        } else {
                            if (isCheckJsonType && value != null) {
                                throw new AlipayApiException(itemName + " is not a String");
                            }
                            if (value != null) {
                                method.invoke(rsp, value.toString());
                            } else {
                                method.invoke(rsp, "");
                            }
                        }
                    } else if (Long.class.isAssignableFrom(typeClass)) {
                        Object value = reader.getPrimitiveObject(itemName);
                        if (value instanceof Long) {
                            method.invoke(rsp, (Long) value);
                        } else {
                            if (isCheckJsonType && value != null) {
                                throw new AlipayApiException(itemName + " is not a Number(Long)");
                            }
                            if (StringUtils.isNumeric(value)) {
                                method.invoke(rsp, Long.valueOf(value.toString()));
                            }
                        }
                    } else if (Integer.class.isAssignableFrom(typeClass)) {
                        Object value = reader.getPrimitiveObject(itemName);
                        if (value instanceof Integer) {
                            method.invoke(rsp, (Integer) value);
                        } else {
                            if (isCheckJsonType && value != null) {
                                throw new AlipayApiException(itemName + " is not a Number(Integer)");
                            }
                            if (StringUtils.isNumeric(value)) {
                                method.invoke(rsp, Integer.valueOf(value.toString()));
                            }
                        }
                    } else if (Boolean.class.isAssignableFrom(typeClass)) {
                        Object value = reader.getPrimitiveObject(itemName);
                        if (value instanceof Boolean) {
                            method.invoke(rsp, (Boolean) value);
                        } else {
                            if (isCheckJsonType && value != null) {
                                throw new AlipayApiException(itemName + " is not a Boolean");
                            }
                            if (value != null) {
                                method.invoke(rsp, Boolean.valueOf(value.toString()));
                            }
                        }
                    } else if (Double.class.isAssignableFrom(typeClass)) {
                        Object value = reader.getPrimitiveObject(itemName);
                        if (value instanceof Double) {
                            method.invoke(rsp, (Double) value);
                        } else {
                            if (isCheckJsonType && value != null) {
                                throw new AlipayApiException(itemName + " is not a Double");
                            }
                        }
                    } else if (Number.class.isAssignableFrom(typeClass)) {
                        Object value = reader.getPrimitiveObject(itemName);
                        if (value instanceof Number) {
                            method.invoke(rsp, (Number) value);
                        } else {
                            if (isCheckJsonType && value != null) {
                                throw new AlipayApiException(itemName + " is not a Number");
                            }
                        }
                    } else if (Date.class.isAssignableFrom(typeClass)) {
                        DateFormat format = new SimpleDateFormat(AlipayConstants.DATE_TIME_FORMAT);
                        format.setTimeZone(TimeZone.getTimeZone(AlipayConstants.DATE_TIMEZONE));
                        Object value = reader.getPrimitiveObject(itemName);
                        if (value instanceof String) {
                            method.invoke(rsp, format.parse(value.toString()));
                        }
                    } else if (List.class.isAssignableFrom(typeClass)) {
                        Type fieldType = field.getGenericType();
                        if (fieldType instanceof ParameterizedType) {
                            ParameterizedType paramType = (ParameterizedType) fieldType;
                            Type[] genericTypes = paramType.getActualTypeArguments();
                            if (genericTypes != null && genericTypes.length > 0) {
                                if (genericTypes[0] instanceof Class<?>) {
                                    Class<?> subType = (Class<?>) genericTypes[0];
                                    List<?> listObjs = reader.getListObjects(listName, itemName,
                                        subType);
                                    if (listObjs != null) {
                                        method.invoke(rsp, listObjs);
                                    }
                                }
                            }
                        }
                    } else {
                        Object obj = reader.getObject(itemName, typeClass);
                        if (obj != null) {
                            method.invoke(rsp, obj);
                        }
                    }
                }

            }
        } catch (Exception e) {
            throw new AlipayApiException(e);
        }

        return rsp;
    }

    /**
     *  尝试获取属性
     *  
     *  不会抛出异常，不存在则返回null
     * 
     * @param clazz
     * @param itemName
     * @return
     */
    private static Field tryGetFieldWithoutExp(Class<?> clazz, String itemName) {

        try {

            return clazz.getDeclaredField(itemName);

        } catch (Exception e) {
            return null;
        }
    }

    /**
     *   获取属性设置属性
     * 
     * @param clazz
     * @param field
     * @return
     */
    private static <T> Method tryGetSetMethod(Class<T> clazz, Field field, String methodName) {

        try {
            return clazz.getDeclaredMethod(methodName, field.getType());
        } catch (Exception e) {

            return null;
        }

    }
}
