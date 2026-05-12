package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 测试
 *
 * @author auto create
 * @since 1.0, 2026-03-30 16:08:14
 */
public class RainyComplexTypesTheFirstTwo extends AlipayObject {

	private static final long serialVersionUID = 8157279319194731868L;

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

	/**
	 * 第三次
	 */
	@ApiField("third_level")
	private RainyComplexTypesTheFirstThree thirdLevel;

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

	public RainyComplexTypesTheFirstThree getThirdLevel() {
		return this.thirdLevel;
	}
	public void setThirdLevel(RainyComplexTypesTheFirstThree thirdLevel) {
		this.thirdLevel = thirdLevel;
	}

}
