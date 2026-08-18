package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-08-17 15:12:49
 */
public class RentPayInfo extends AlipayObject {

	private static final long serialVersionUID = 2649811354799373488L;

	/**
	 * 租期结束日期
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 支付金额,单位:元
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 支付日期
	 */
	@ApiField("pay_date")
	private Date payDate;

	/**
	 * 支付期数
	 */
	@ApiField("pay_periods")
	private String payPeriods;

	/**
	 * 租期开始日期
	 */
	@ApiField("start_date")
	private String startDate;

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public Date getPayDate() {
		return this.payDate;
	}
	public void setPayDate(Date payDate) {
		this.payDate = payDate;
	}

	public String getPayPeriods() {
		return this.payPeriods;
	}
	public void setPayPeriods(String payPeriods) {
		this.payPeriods = payPeriods;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

}
