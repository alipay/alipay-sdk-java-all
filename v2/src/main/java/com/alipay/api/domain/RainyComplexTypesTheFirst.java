package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * Complex Types -- string，bool
 *
 * @author auto create
 * @since 1.0, 2024-07-04 15:50:05
 */
public class RainyComplexTypesTheFirst extends AlipayObject {

	private static final long serialVersionUID = 8227824998743545438L;

	/**
	 * 新增的而已
	 */
	@ApiField("new_creat")
	private String newCreat;

	/**
	 * 字符串的复杂类型拉
	 */
	@ApiField("test_a")
	private String testA;

	/**
	 * boolean,V2版本改成可选；
	 */
	@ApiField("test_b")
	private Boolean testB;

	public String getNewCreat() {
		return this.newCreat;
	}
	public void setNewCreat(String newCreat) {
		this.newCreat = newCreat;
	}

	public String getTestA() {
		return this.testA;
	}
	public void setTestA(String testA) {
		this.testA = testA;
	}

	public Boolean getTestB() {
		return this.testB;
	}
	public void setTestB(Boolean testB) {
		this.testB = testB;
	}

}
