package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻GO结算退款接口
 *
 * @author auto create
 * @since 1.0, 2022-11-15 16:18:59
 */
public class ZhimaCreditPeZmgoSettleRefundModel extends AlipayObject {

	private static final long serialVersionUID = 2391146592584487616L;

	/**
	 * 签约芝麻GO的业务协议号，在签约成功、结算成功等通知中回回传给商户。
	 */
	@ApiField("agreement_id")
	private String agreementId;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("alipay_open_id")
	private String alipayOpenId;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 本次退款说明
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 外部请求号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 退款金额，单位为：元（人民币），精确到小数点后两位
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 退款类型：
MEMBER_FEE_REFUND 会员费结算退款 ，WITHHOLD_FEE_REFUND 周期扣款金额退款。
不填写默认为 MEMBER_FEE_REFUND
	 */
	@ApiField("refund_type")
	private String refundType;

	/**
	 * 芝麻侧扣款计划单据号，在结算扣款成功的通知消息中会回传。
	 */
	@ApiField("withhold_plan_no")
	private String withholdPlanNo;

	public String getAgreementId() {
		return this.agreementId;
	}
	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}

	public String getAlipayOpenId() {
		return this.alipayOpenId;
	}
	public void setAlipayOpenId(String alipayOpenId) {
		this.alipayOpenId = alipayOpenId;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getRefundType() {
		return this.refundType;
	}
	public void setRefundType(String refundType) {
		this.refundType = refundType;
	}

	public String getWithholdPlanNo() {
		return this.withholdPlanNo;
	}
	public void setWithholdPlanNo(String withholdPlanNo) {
		this.withholdPlanNo = withholdPlanNo;
	}

}
