package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 转支付退款申请明细
 *
 * @author auto create
 * @since 1.0, 2026-07-20 16:32:51
 */
public class RefundApplyBizDetail extends AlipayObject {

	private static final long serialVersionUID = 4177349293734185885L;

	/**
	 * 退款类型
	 */
	@ApiField("refund_type")
	private String refundType;

	/**
	 * 请求流水号
	 */
	@ApiField("request_no")
	private String requestNo;

	/**
	 * 转支付流水号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getRefundType() {
		return this.refundType;
	}
	public void setRefundType(String refundType) {
		this.refundType = refundType;
	}

	public String getRequestNo() {
		return this.requestNo;
	}
	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
