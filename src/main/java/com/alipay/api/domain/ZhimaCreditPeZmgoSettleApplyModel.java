package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻GO结算申请
 *
 * @author auto create
 * @since 1.0, 2021-09-07 15:18:58
 */
public class ZhimaCreditPeZmgoSettleApplyModel extends AlipayObject {

	private static final long serialVersionUID = 4163287848435389268L;

	/**
	 * DEFAULT_SETTLE 默认结算模式;
	 */
	@ApiField("action_type")
	private String actionType;

	/**
	 * 支付宝系统中用以唯一标识用户签约记录的编号。
	 */
	@ApiField("agreement_id")
	private String agreementId;

	/**
	 * 买家在支付宝的用户id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 商户本次操作的请求流水号，用于标示请求流水的唯一性，不能包含除中文、英文、数字以外的字符，需要保证在商户端不重复。
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 需要支付的金额，单位为：元（人民币），精确到小数点后两位
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 扩展的退出类型等信息
	 */
	@ApiField("settle_extend_params")
	private SettleExtraParams settleExtendParams;

	/**
	 * 芝麻GO任务开始到到期过程中和任务相关享受的总优惠金额，单位为：元（人民币），精确到小数点后两位。
	 */
	@ApiField("total_discount_amount")
	private String totalDiscountAmount;

	/**
	 * 芝麻GO任务开始到到期过程中和任务相关支付的总金额，单位为：元（人民币），精确到小数点后两位。
	 */
	@ApiField("total_real_pay_amount")
	private String totalRealPayAmount;

	/**
	 * 芝麻GO任务开始到到期过程中和任务相关完成的任务次数
	 */
	@ApiField("total_task_count")
	private String totalTaskCount;

	/**
	 * 芝麻GO结算时，需要传入的扣款单据号。来源于协议到期通知消息，外部商户接入时，该参数必填
	 */
	@ApiField("withhold_plan_no")
	private String withholdPlanNo;

	public String getActionType() {
		return this.actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getAgreementId() {
		return this.agreementId;
	}
	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
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

	public String getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public SettleExtraParams getSettleExtendParams() {
		return this.settleExtendParams;
	}
	public void setSettleExtendParams(SettleExtraParams settleExtendParams) {
		this.settleExtendParams = settleExtendParams;
	}

	public String getTotalDiscountAmount() {
		return this.totalDiscountAmount;
	}
	public void setTotalDiscountAmount(String totalDiscountAmount) {
		this.totalDiscountAmount = totalDiscountAmount;
	}

	public String getTotalRealPayAmount() {
		return this.totalRealPayAmount;
	}
	public void setTotalRealPayAmount(String totalRealPayAmount) {
		this.totalRealPayAmount = totalRealPayAmount;
	}

	public String getTotalTaskCount() {
		return this.totalTaskCount;
	}
	public void setTotalTaskCount(String totalTaskCount) {
		this.totalTaskCount = totalTaskCount;
	}

	public String getWithholdPlanNo() {
		return this.withholdPlanNo;
	}
	public void setWithholdPlanNo(String withholdPlanNo) {
		this.withholdPlanNo = withholdPlanNo;
	}

}
