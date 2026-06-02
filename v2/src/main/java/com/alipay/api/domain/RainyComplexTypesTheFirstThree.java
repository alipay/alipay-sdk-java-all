package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 第三次
 *
 * @author auto create
 * @since 1.0, 2026-03-30 16:08:14
 */
public class RainyComplexTypesTheFirstThree extends AlipayObject {

	private static final long serialVersionUID = 8449799443271657533L;

	/**
	 * 第四层
	 */
	@ApiField("fouth_level")
	private RainyComplexTypesTheFirstFouth fouthLevel;

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

	public RainyComplexTypesTheFirstFouth getFouthLevel() {
		return this.fouthLevel;
	}
	public void setFouthLevel(RainyComplexTypesTheFirstFouth fouthLevel) {
		this.fouthLevel = fouthLevel;
	}

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
