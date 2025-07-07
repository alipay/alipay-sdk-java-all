package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 加固类名方法配置
 *
 * @author auto create
 * @since 1.0, 2023-05-25 16:28:29
 */
public class ClassMethodConfig extends AlipayObject {

	private static final long serialVersionUID = 2319219918744118552L;

	/**
	 * 加固的类名
	 */
	@ApiField("class_name")
	private String className;

	/**
	 * 方法集合，多个使用英文逗号分隔
	 */
	@ApiField("methods")
	private String methods;

	public String getClassName() {
		return this.className;
	}
	public void setClassName(String className) {
		this.className = className;
	}

	public String getMethods() {
		return this.methods;
	}
	public void setMethods(String methods) {
		this.methods = methods;
	}

}
