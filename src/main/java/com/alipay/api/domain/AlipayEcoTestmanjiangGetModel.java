package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 111testmanjiang
 *
 * @author auto create
 * @since 1.0, 2022-09-07 11:27:27
 */
public class AlipayEcoTestmanjiangGetModel extends AlipayObject {

	private static final long serialVersionUID = 8137221535819511854L;

	/**
	 * 1
	 */
	@ApiField("s")
	private String s;

	/**
	 * 1
	 */
	@ApiField("test")
	private String test;

	/**
	 * 3
	 */
	@ApiField("x_op")
	private Date xOp;

	/**
	 * 1
	 */
	@ApiField("x_sss")
	private String xSss;

	/**
	 * 基础描述
	 */
	@ApiField("x_test")
	private String xTest;

	public String getS() {
		return this.s;
	}
	public void setS(String s) {
		this.s = s;
	}

	public String getTest() {
		return this.test;
	}
	public void setTest(String test) {
		this.test = test;
	}

	public Date getxOp() {
		return this.xOp;
	}
	public void setxOp(Date xOp) {
		this.xOp = xOp;
	}

	public String getxSss() {
		return this.xSss;
	}
	public void setxSss(String xSss) {
		this.xSss = xSss;
	}

	public String getxTest() {
		return this.xTest;
	}
	public void setxTest(String xTest) {
		this.xTest = xTest;
	}

}
