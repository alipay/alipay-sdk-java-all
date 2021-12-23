package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数字人民币交易退款
 *
 * @author auto create
 * @since 1.0, 2021-12-03 16:43:09
 */
public class MybankEcnyTradeRefundModel extends AlipayObject {

	private static final long serialVersionUID = 4635613429623522822L;

	/**
	 * 退款请求号。标识一次退款请求，需要保证在交易号下唯一，如需部分退款，则此参数必传。
注：针对同一次退款请求，如果调用接口失败或异常了，重试时需要保证退款请求号不能变更，防止该笔交易重复退款。运营机构会保证同样的退款请求号多次请求只会退一次。
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 调用方订单号。由调用方(商户或者收单受理机构)定义，64个字符以内，仅支持字母、数字、下划线且需保证在调用方不重复。
out_trade_no与trade_no二选一
用于幂等
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 退款金额。需要退款的金额，该金额不能大于订单金额，单位为元，支持两位小数。
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 退款原因说明，商家自定义。
	 */
	@ApiField("refund_reason")
	private String refundReason;

	/**
	 * 运营机构交易号。和商户订单号 out_trade_no 不能同时为空。
out_trade_no与trade_no二选一
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

	public String getRefundReason() {
		return this.refundReason;
	}
	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
