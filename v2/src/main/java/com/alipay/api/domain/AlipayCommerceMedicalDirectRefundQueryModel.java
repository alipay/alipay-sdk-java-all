package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗移动支付场景退款查询
 *
 * @author auto create
 * @since 1.0, 2026-09-15 16:38:19
 */
public class AlipayCommerceMedicalDirectRefundQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4274854299614832259L;

	/**
	 * 外部交易号，该字段与逸康交易号不能都为空
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 退款请求流水号
	 */
	@ApiField("refund_request_no")
	private String refundRequestNo;

	/**
	 * 创建交易单时返回的逸康交易单号，该字段与外部交易号不能都为空
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
