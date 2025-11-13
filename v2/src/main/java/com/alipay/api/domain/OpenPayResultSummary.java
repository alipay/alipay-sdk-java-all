package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付结果概要信息
 *
 * @author auto create
 * @since 1.0, 2025-08-18 16:36:16
 */
public class OpenPayResultSummary extends AlipayObject {

	private static final long serialVersionUID = 2136579323192212748L;

	/**
	 * 实付金额，客户端播报金额，单位元
	 */
	@ApiField("actual_amount")
	private String actualAmount;

	/**
	 * 付款人钱包侧名称
	 */
	@ApiField("payer_name")
	private String payerName;

	/**
	 * 概要主题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 交易总金额,单位元
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public String getActualAmount() {
		return this.actualAmount;
	}
	public void setActualAmount(String actualAmount) {
		this.actualAmount = actualAmount;
	}

	public String getPayerName() {
		return this.payerName;
	}
	public void setPayerName(String payerName) {
		this.payerName = payerName;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

}
