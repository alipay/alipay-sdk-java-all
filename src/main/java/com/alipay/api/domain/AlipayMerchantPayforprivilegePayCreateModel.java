package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建充值卡支付单
 *
 * @author auto create
 * @since 1.0, 2021-04-19 19:08:48
 */
public class AlipayMerchantPayforprivilegePayCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5815697956977473492L;

	/**
	 * 该字段已废弃，请使用user_id字段查询
	 */
	@ApiField("member_id")
	private String memberId;

	/**
	 * 外部业务号，用于幂等控制一次充值行为
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 充值方案ID
	 */
	@ApiField("promotion_plan_id")
	private String promotionPlanId;

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

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPromotionPlanId() {
		return this.promotionPlanId;
	}
	public void setPromotionPlanId(String promotionPlanId) {
		this.promotionPlanId = promotionPlanId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
