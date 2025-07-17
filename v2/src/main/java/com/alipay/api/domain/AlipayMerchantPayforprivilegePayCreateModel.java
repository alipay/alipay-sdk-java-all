package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建充值卡支付单
 *
 * @author auto create
 * @since 1.0, 2022-11-18 17:24:52
 */
public class AlipayMerchantPayforprivilegePayCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5335986525414344346L;

	/**
	 * 该字段已废弃，请使用user_id字段查询
	 */
	@ApiField("member_id")
	private String memberId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部业务号，用于幂等控制一次充值行为
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 付款人uid，异名充值场景必传，需要与支付宝确认是否开通该场景
	 */
	@ApiField("payer_user_id")
	private String payerUserId;

	/**
	 * 充值方案ID
	 */
	@ApiField("promotion_plan_id")
	private String promotionPlanId;

	/**
	 * 充值金额，单位元。
在用户自定义金额充值场景中必传，需要与支付宝确认是否开通该场景
	 */
	@ApiField("recharge_amount")
	private String rechargeAmount;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getMemberId() {
		return this.memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPayerUserId() {
		return this.payerUserId;
	}
	public void setPayerUserId(String payerUserId) {
		this.payerUserId = payerUserId;
	}

	public String getPromotionPlanId() {
		return this.promotionPlanId;
	}
	public void setPromotionPlanId(String promotionPlanId) {
		this.promotionPlanId = promotionPlanId;
	}

	public String getRechargeAmount() {
		return this.rechargeAmount;
	}
	public void setRechargeAmount(String rechargeAmount) {
		this.rechargeAmount = rechargeAmount;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
