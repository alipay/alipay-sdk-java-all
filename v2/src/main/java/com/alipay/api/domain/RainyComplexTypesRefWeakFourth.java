package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * TEST DATA
 *
 * @author auto create
 * @since 1.0, 2025-08-18 23:02:19
 */
public class RainyComplexTypesRefWeakFourth extends AlipayObject {

	private static final long serialVersionUID = 3734761276512598329L;

	/**
	 * 测试数据，无需关注
	 */
	@ApiField("seconde_demo_boolean")
	private Boolean secondeDemoBoolean;

	/**
	 * 测试数据，无需关注
	 */
	@ApiField("seconde_demo_date")
	private Date secondeDemoDate;

	/**
	 * 测试数据，无需关注
	 */
	@ApiField("seconde_demo_num")
	private Long secondeDemoNum;

	/**
	 * 测试数据，无需关注
	 */
	@ApiField("seconde_demo_price")
	private String secondeDemoPrice;

	/**
	 * 测试数据，无需关注
	 */
	@ApiField("seconde_demo_string")
	private String secondeDemoString;

	public Boolean getSecondeDemoBoolean() {
		return this.secondeDemoBoolean;
	}
	public void setSecondeDemoBoolean(Boolean secondeDemoBoolean) {
		this.secondeDemoBoolean = secondeDemoBoolean;
	}

	public Date getSecondeDemoDate() {
		return this.secondeDemoDate;
	}
	public void setSecondeDemoDate(Date secondeDemoDate) {
		this.secondeDemoDate = secondeDemoDate;
	}

	public Long getSecondeDemoNum() {
		return this.secondeDemoNum;
	}
	public void setSecondeDemoNum(Long secondeDemoNum) {
		this.secondeDemoNum = secondeDemoNum;
	}

	public String getSecondeDemoPrice() {
		return this.secondeDemoPrice;
	}
	public void setSecondeDemoPrice(String secondeDemoPrice) {
		this.secondeDemoPrice = secondeDemoPrice;
	}

	public String getSecondeDemoString() {
		return this.secondeDemoString;
	}
	public void setSecondeDemoString(String secondeDemoString) {
		this.secondeDemoString = secondeDemoString;
	}

}
