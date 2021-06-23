package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 费用记录
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class FeeRecords extends AlipayObject {

	private static final long serialVersionUID = 7685385359476859852L;

	/**
	 * 费用余额，单位为元，小数点保留2位
	 */
	@ApiField("balance")
	private String balance;

	/**
	 * 交易时间
	 */
	@ApiField("date")
	private Date date;

	/**
	 * 费用交易流水备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 费用交易额度
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public String getBalance() {
		return this.balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}

	public Date getDate() {
		return this.date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

}
