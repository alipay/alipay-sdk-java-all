package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 单个公有复杂类型
 *
 * @author auto create
 * @since 1.0, 2023-12-08 17:39:18
 */
public class RegressionPublic extends AlipayObject {

	private static final long serialVersionUID = 7267794397775957348L;

	/**
	 * 1
	 */
	@ApiField("a_open_id")
	private String aOpenId;

	/**
	 * a下普通字段a
	 */
	@ApiField("a_test_a")
	private Boolean aTestA;

	/**
	 * sdfs
	 */
	@ApiField("b")
	private Long b;

	/**
	 * 1999-11-11
	 */
	@ApiField("date")
	private Date date;

	/**
	 * 1
	 */
	@ApiField("input_a")
	private String inputA;

	public String getaOpenId() {
		return this.aOpenId;
	}
	public void setaOpenId(String aOpenId) {
		this.aOpenId = aOpenId;
	}

	public Boolean getaTestA() {
		return this.aTestA;
	}
	public void setaTestA(Boolean aTestA) {
		this.aTestA = aTestA;
	}

	public Long getB() {
		return this.b;
	}
	public void setB(Long b) {
		this.b = b;
	}

	public Date getDate() {
		return this.date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	public String getInputA() {
		return this.inputA;
	}
	public void setInputA(String inputA) {
		this.inputA = inputA;
	}

}
