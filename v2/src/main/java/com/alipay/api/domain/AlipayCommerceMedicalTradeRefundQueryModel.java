package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 自费退款查询
 *
 * @author auto create
 * @since 1.0, 2024-09-11 16:59:52
 */
public class AlipayCommerceMedicalTradeRefundQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2895297511763253981L;

	/**
	 * 支付时传入的商户交易号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 同一笔交易多次请求撤销需保证唯一
	 */
	@ApiField("refund_request_no")
	private String refundRequestNo;

	/**
	 * 逸康交易号和out_trade_no不能同时为空
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getRefundRequestNo() {
		return this.refundRequestNo;
	}
	public void setRefundRequestNo(String refundRequestNo) {
		this.refundRequestNo = refundRequestNo;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
