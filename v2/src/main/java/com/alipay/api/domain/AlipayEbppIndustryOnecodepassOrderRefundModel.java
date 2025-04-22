package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 一码通退款接口
 *
 * @author auto create
 * @since 1.0, 2024-01-26 16:13:47
 */
public class AlipayEbppIndustryOnecodepassOrderRefundModel extends AlipayObject {

	private static final long serialVersionUID = 5637961634883711683L;

	/**
	 * 机构编码，接入时由支付宝小二分配
	 */
	@ApiField("org_code")
	private String orgCode;

	/**
	 * 退款请求号。
标识一次退款请求，需要保证在交易号下唯一，如需部分退款，则此参数必传。
注：针对同一次退款请求，如果调用接口失败或异常了，重试时需要保证退款请求号不能变更，防止该笔交易重复退款。支付宝会保证同样的退款请求号多次请求只会退一次。
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 商户订单号。
和支付宝交易号不能同时为空
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 退款金额。
需要退款的金额，该金额不能大于订单金额，单位为元，支持两位小数。
如果不传，默认全额退款。
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 退款原因说明。商家自定义，将在会在商户和用户的pc退款账单详情中展示
	 */
	@ApiField("refund_reason")
	private String refundReason;

	/**
	 * 卖家支付宝用户ID。
商户订单号不为空时，卖家支付宝用户ID必选
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 支付宝交易号，和支付宝交易号不能同时为空
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getOrgCode() {
		return this.orgCode;
	}
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
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

	public String getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
