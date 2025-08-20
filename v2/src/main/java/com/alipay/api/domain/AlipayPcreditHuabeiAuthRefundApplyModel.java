package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 花芝结算扣款费用逆向退款申请
 *
 * @author auto create
 * @since 1.0, 2024-10-16 11:27:56
 */
public class AlipayPcreditHuabeiAuthRefundApplyModel extends AlipayObject {

	private static final long serialVersionUID = 5693142477647245239L;

	/**
	 * 签约花芝的业务协议号，在签约成功、结算成功等通知中回回传给商户。
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 支付宝侧授权操作单据id,在结算扣款成功的通知消息中会回传。在周期扣款场景下，和trade_no必传其中一个值。
	 */
	@ApiField("auth_opt_id")
	private String authOptId;

	/**
	 * 本次退款说明
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("open_id")
	private String openId;

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
	 * MEMBER_FEE_REFUND 会员费结算退款
WITHHOLD_FEE_REFUND 周期扣款金额退款
默认为MEMBER_FEE_REFUND
	 */
	@ApiField("refund_type")
	private String refundType;

	/**
	 * 支付宝交易号,在结算扣款成功的通知中会回传。
在周期扣款场景下，和auth_opt_id必传其中一个值。
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getAuthOptId() {
		return this.authOptId;
	}
	public void setAuthOptId(String authOptId) {
		this.authOptId = authOptId;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
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

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
