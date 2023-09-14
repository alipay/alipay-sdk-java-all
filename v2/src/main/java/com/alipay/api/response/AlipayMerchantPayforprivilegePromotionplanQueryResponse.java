package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PayForPrivilegePromotionPlanInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.payforprivilege.promotionplan.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 02:56:52
 */
public class AlipayMerchantPayforprivilegePromotionplanQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3183335859538688989L;

	/** 
	 * 充值方案信息，返回之前创建的充值方案信息，方案不存在或者无权限返回空
	 */
	@ApiField("promotion_plan")
	private PayForPrivilegePromotionPlanInfo promotionPlan;

	public void setPromotionPlan(PayForPrivilegePromotionPlanInfo promotionPlan) {
		this.promotionPlan = promotionPlan;
	}
	public PayForPrivilegePromotionPlanInfo getPromotionPlan( ) {
		return this.promotionPlan;
	}

}
