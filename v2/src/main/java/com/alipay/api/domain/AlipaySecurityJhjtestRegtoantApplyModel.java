package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回归toant
 *
 * @author auto create
 * @since 1.0, 2023-12-08 17:39:18
 */
public class AlipaySecurityJhjtestRegtoantApplyModel extends AlipayObject {

	private static final long serialVersionUID = 6724235899523151741L;

	/**
	 * a下普通字段a
	 */
	@ApiField("a_open_id")
	private String aOpenId;

	/**
	 * a下普通字段a
	 */
	@ApiField("a_test_a")
	private String aTestA;

	/**
	 * 1
	 */
	@ApiField("boolean_a")
	private Boolean booleanA;

	/**
	 * 1
	 */
	@ApiField("comp_a")
	private RegressionInDomian compA;

	/**
	 * 1
	 */
	@ApiField("comp_nest")
	private PubNestPub compNest;

	/**
	 * 1
	 */
	@ApiField("comp_pub")
	private RegressionPublic compPub;

	/**
	 * 11
	 */
	@ApiField("date_a")
	private Date dateA;

	/**
	 * 1
	 */
	@ApiField("number_a")
	private Long numberA;

	/**
	 * 1
	 */
	@ApiField("string_a")
	private String stringA;

	public String getaOpenId() {
		return this.aOpenId;
	}
	public void setaOpenId(String aOpenId) {
		this.aOpenId = aOpenId;
	}

	public String getaTestA() {
		return this.aTestA;
	}
	public void setaTestA(String aTestA) {
		this.aTestA = aTestA;
	}

	public Boolean getBooleanA() {
		return this.booleanA;
	}
	public void setBooleanA(Boolean booleanA) {
		this.booleanA = booleanA;
	}

	public RegressionInDomian getCompA() {
		return this.compA;
	}
	public void setCompA(RegressionInDomian compA) {
		this.compA = compA;
	}

	public PubNestPub getCompNest() {
		return this.compNest;
	}
	public void setCompNest(PubNestPub compNest) {
		this.compNest = compNest;
	}

	public RegressionPublic getCompPub() {
		return this.compPub;
	}
	public void setCompPub(RegressionPublic compPub) {
		this.compPub = compPub;
	}

	public Date getDateA() {
		return this.dateA;
	}
	public void setDateA(Date dateA) {
		this.dateA = dateA;
	}

	public Long getNumberA() {
		return this.numberA;
	}
	public void setNumberA(Long numberA) {
		this.numberA = numberA;
	}

	public String getStringA() {
		return this.stringA;
	}
	public void setStringA(String stringA) {
		this.stringA = stringA;
	}

}
