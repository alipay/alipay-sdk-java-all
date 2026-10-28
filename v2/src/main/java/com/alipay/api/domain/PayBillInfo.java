package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 买单金额摘要。根据 pay_bill_info 是否为空判断是否为买单场景
 *
 * @author auto create
 * @since 1.0, 2026-10-27 16:41:14
 */
public class PayBillInfo extends AlipayObject {

	private static final long serialVersionUID = 5289611741287177962L;

	/**
	 * 本次剩余应付，即动态尾款金额。货币单位固定为"CNY"。
	 */
	@ApiField("bill_amount")
	private String billAmount;

	/**
	 * 消费总额。货币单位固定为"CNY"。
	 */
	@ApiField("bill_total_amount")
	private String billTotalAmount;

	/**
	 * 买单来源或业务类型。货币单位固定为"CNY"。
	 */
	@ApiField("order_source")
	private String orderSource;

	/**
	 * 买单共省金额。货币单位固定为"CNY"。
	 */
	@ApiField("total_discount_amount")
	private String totalDiscountAmount;

	/**
	 * 用户总实付，即本次新购券实付加尾款。货币单位固定为"CNY"。
	 */
	@ApiField("user_pay_amount")
	private String userPayAmount;

	public String getBillAmount() {
		return this.billAmount;
	}
	public void setBillAmount(String billAmount) {
		this.billAmount = billAmount;
	}

	public String getBillTotalAmount() {
		return this.billTotalAmount;
	}
	public void setBillTotalAmount(String billTotalAmount) {
		this.billTotalAmount = billTotalAmount;
	}

	public String getOrderSource() {
		return this.orderSource;
	}
	public void setOrderSource(String orderSource) {
		this.orderSource = orderSource;
	}

	public String getTotalDiscountAmount() {
		return this.totalDiscountAmount;
	}
	public void setTotalDiscountAmount(String totalDiscountAmount) {
		this.totalDiscountAmount = totalDiscountAmount;
	}

	public String getUserPayAmount() {
		return this.userPayAmount;
	}
	public void setUserPayAmount(String userPayAmount) {
		this.userPayAmount = userPayAmount;
	}

}
