package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PayForPrivilegePromotionPlanInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.payforprivilege.promotionplan.create response.
 * 
 * @author auto create
 * @since 1.0, 2020-07-01 11:17:42
 */
public class AlipayMerchantPayforprivilegePromotionplanCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6488542422767859434L;

	/** 
	 * 充享惠方案，当前接口创建的充享惠方案
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
