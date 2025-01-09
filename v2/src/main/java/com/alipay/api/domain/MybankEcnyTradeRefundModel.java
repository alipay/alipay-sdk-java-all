package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数字人民币交易退款
 *
 * @author auto create
 * @since 1.0, 2024-11-20 14:46:15
 */
public class MybankEcnyTradeRefundModel extends AlipayObject {

	private static final long serialVersionUID = 2572815262951343545L;

	/**
	 * 商户ID
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 退款请求号。标识一次退款请求，需要保证在交易号下唯一。
注：针对同一次退款请求，如果调用接口失败或异常了，重试时需要保证退款请求号不能变更，防止该笔交易重复退款。运营机构会保证同样的退款请求号多次请求只会退一次。
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 调用方订单号
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
	 * 运营机构交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
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
