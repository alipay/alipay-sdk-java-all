package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 一码通退款接口
 *
 * @author auto create
 * @since 1.0, 2022-12-20 19:50:34
 */
public class AlipayEbppIndustryOnecodepassOrderRefundModel extends AlipayObject {

	private static final long serialVersionUID = 3353256838619857388L;

	/**
	 * 机构编码，接入时由支付宝小二分配
	 */
	@ApiField("org_code")
	private String orgCode;

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
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getOrgCode() {
		return this.orgCode;
	}
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
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
