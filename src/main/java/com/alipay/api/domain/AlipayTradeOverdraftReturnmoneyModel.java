package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 垫资追款结算
 *
 * @author auto create
 * @since 1.0, 2022-09-23 10:41:49
 */
public class AlipayTradeOverdraftReturnmoneyModel extends AlipayObject {

	private static final long serialVersionUID = 3218863627964586176L;

	/**
	 * 追款请求号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 商户订单号。 订单支付时传入的商户订单号，商家自定义且保证商家系统中唯一。与支付宝交易号 trade_no 不能同时为空。
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 退款时上传的外部请求号。仅特定商户可选
	 */
	@ApiField("refund_out_request_no")
	private String refundOutRequestNo;

	/**
	 * 支付宝交易号。 和商户订单号 out_trade_no 不能同时为空。
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

	public String getRefundOutRequestNo() {
		return this.refundOutRequestNo;
	}
	public void setRefundOutRequestNo(String refundOutRequestNo) {
		this.refundOutRequestNo = refundOutRequestNo;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
