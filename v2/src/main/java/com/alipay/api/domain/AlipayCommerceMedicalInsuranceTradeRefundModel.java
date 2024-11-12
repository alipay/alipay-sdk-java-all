package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 代扣退款
 *
 * @author auto create
 * @since 1.0, 2024-09-19 17:50:43
 */
public class AlipayCommerceMedicalInsuranceTradeRefundModel extends AlipayObject {

	private static final long serialVersionUID = 4612145174874863135L;

	/**
	 * 标识一次退款请求，同一笔交易多次退款需要保证唯一。
注意：如需部分退款，则本参数必填。
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 订单支付时传入的商户订单号,不能和 trade_no同时为空
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 需要退款的金额，该金额不能大于订单金额，单位为元，支持两位小数。
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 外部请求来源，用于区分接入保司类型
	 */
	@ApiField("source")
	private String source;

	/**
	 * 支付宝交易号，和商户订单号不能同时为空
	 */
	@ApiField("trade_no")
	private String tradeNo;

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

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
