package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 单个域内复杂类型
 *
 * @author auto create
 * @since 1.0, 2023-11-30 16:03:56
 */
public class RegressionInDomian extends AlipayObject {

	private static final long serialVersionUID = 2566994552775699848L;

	/**
	 * a下普通字段a
	 */
	@ApiField("a_test_a")
	private String aTestA;

	/**
	 * fasf
	 */
	@ApiField("bb")
	private Date bb;

	/**
	 * sdfs
	 */
	@ApiField("cc")
	private String cc;

	/**
	 * asfa
	 */
	@ApiField("input_b")
	private Boolean inputB;

	public String getaTestA() {
		return this.aTestA;
	}
	public void setaTestA(String aTestA) {
		this.aTestA = aTestA;
	}

	public Date getBb() {
		return this.bb;
	}
	public void setBb(Date bb) {
		this.bb = bb;
	}

	public String getCc() {
		return this.cc;
	}
	public void setCc(String cc) {
		this.cc = cc;
	}

	public Boolean getInputB() {
		return this.inputB;
	}
	public void setInputB(Boolean inputB) {
		this.inputB = inputB;
	}

}
