package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车主服务订单退款
 *
 * @author auto create
 * @since 1.0, 2022-10-14 11:50:07
 */
public class AlipayCommerceTransportVehicleownerSettlementRefundModel extends AlipayObject {

	private static final long serialVersionUID = 2254693628357644575L;

	/**
	 * 业务协议号，通过外部单号发起时这个参数必传；
以下两个传参方法二选一：
1、协议号+外部订单号
2、交易号
	 */
	@ApiField("biz_agreement_no")
	private String bizAgreementNo;

	/**
	 * 标识一次退款请求，同一笔交易多次退款需要保证唯一，如需部分退款，则此参数必传。
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 订单支付时传入的商户订单号，支付宝交易号和（商户订单号+协议号）不能同时为空
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 需要退款的金额，该金额不能大于订单金额,单位为元，支持两位小数
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 支付宝交易号,支付宝交易号和（商户订单号+协议号）不能同时为空
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getBizAgreementNo() {
		return this.bizAgreementNo;
	}
	public void setBizAgreementNo(String bizAgreementNo) {
		this.bizAgreementNo = bizAgreementNo;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
