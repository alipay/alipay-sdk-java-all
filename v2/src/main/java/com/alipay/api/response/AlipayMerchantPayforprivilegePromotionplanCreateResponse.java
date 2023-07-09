package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PayForPrivilegePromotionPlanInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.payforprivilege.promotionplan.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 04:45:59
 */
public class AlipayMerchantPayforprivilegePromotionplanCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7857678942834798261L;

	/** 
	 * 充值方案，当前接口创建的充值方案
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
