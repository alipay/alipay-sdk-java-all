/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2015 All Rights Reserved.
 */
package com.alipay.api.internal.mapping;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 
 * @author jiehua
 * @version $Id: AlipayFieldMethod.java, v 0.1 2015-4-28 下午1:44:25 jiehua Exp $
 */
public class AlipayFieldMethod {

    /**
     * 属性
     */
    private Field  field;

    /**
     * 方法
     */
    private Method method;

    /**
     * Getter method for property <tt>field</tt>.
     * 
     * @return property value of field
     */
    public Field getField() {
        return field;
    }

    /**
     * Setter method for property <tt>field</tt>.
     * 
     * @param field value to be assigned to property field
     */
    public void setField(Field field) {
        this.field = field;
    }

    /**
     * Getter method for property <tt>method</tt>.
     * 
     * @return property value of method
     */
    public Method getMethod() {
        return method;
    }

    /**
     * Setter method for property <tt>method</tt>.
     * 
     * @param method value to be assigned to property method
     */
    public void setMethod(Method method) {
        this.method = method;
    }

}
