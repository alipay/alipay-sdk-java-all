package com.alipay.api.internal.mapping;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 数据结构列表属性注解。
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(value = { ElementType.FIELD })
public @interface ApiListField {

    /** JSON列表属性映射名称 **/
	public String value() default "";

}
