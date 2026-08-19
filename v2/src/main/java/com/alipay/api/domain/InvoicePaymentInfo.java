package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票支付信息
 *
 * @author auto create
 * @since 1.0, 2026-08-14 19:59:20
 */
public class InvoicePaymentInfo extends AlipayObject {

	private static final long serialVersionUID = 6797358174657216585L;

	/**
	 * 业务订单单据金额，以元为单位精确到分
	 */
	@ApiField("biz_order_amount")
	private String bizOrderAmount;

	/**
	 * 业务单号；ALIPAY_SAAS_BIZ_ORDER 时为支付宝 SaaS 业务单号，NON_ALIPAY_SAAS_BIZ_ORDER 时为外部业务单号，平台不解析外部单号
	 */
	@ApiField("biz_order_no")
	private String bizOrderNo;

	/**
	 * 业务单号类型：ALIPAY_SAAS_BIZ_ORDER 、NON_ALIPAY_SAAS_BIZ_ORDER
	 */
	@ApiField("biz_order_type")
	private String bizOrderType;

	/**
	 * 订单支付金额，以元为单位精确到分
	 */
	@ApiField("payment_amount")
	private String paymentAmount;

	/**
	 * 实际支付订单号/渠道交易号
	 */
	@ApiField("payment_order_no")
	private String paymentOrderNo;

	/**
	 * 实际支付渠道类型；与 payment_order_no 成对传入，不替代业务单号类型
	 */
	@ApiField("payment_order_type")
	private String paymentOrderType;

	public String getBizOrderAmount() {
		return this.bizOrderAmount;
	}
	public void setBizOrderAmount(String bizOrderAmount) {
		this.bizOrderAmount = bizOrderAmount;
	}

	public String getBizOrderNo() {
		return this.bizOrderNo;
	}
	public void setBizOrderNo(String bizOrderNo) {
		this.bizOrderNo = bizOrderNo;
	}

	public String getBizOrderType() {
		return this.bizOrderType;
	}
	public void setBizOrderType(String bizOrderType) {
		this.bizOrderType = bizOrderType;
	}

	public String getPaymentAmount() {
		return this.paymentAmount;
	}
	public void setPaymentAmount(String paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public String getPaymentOrderNo() {
		return this.paymentOrderNo;
	}
	public void setPaymentOrderNo(String paymentOrderNo) {
		this.paymentOrderNo = paymentOrderNo;
	}

	public String getPaymentOrderType() {
		return this.paymentOrderType;
	}
	public void setPaymentOrderType(String paymentOrderType) {
		this.paymentOrderType = paymentOrderType;
	}

}
