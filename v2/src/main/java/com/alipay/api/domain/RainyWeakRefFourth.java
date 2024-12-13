package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 弱引用
 *
 * @author auto create
 * @since 1.0, 2024-12-05 10:42:23
 */
public class RainyWeakRefFourth extends AlipayObject {

	private static final long serialVersionUID = 3174445619132358929L;

	/**
	 * 新增的而已
	 */
	@ApiField("new_creat")
	private String newCreat;

	/**
	 * 价格单位 元
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
