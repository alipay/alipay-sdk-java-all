package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InsureRecomProductPlan;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.flexiblestaffing.insure.consult response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-15 10:28:22
 */
public class AlipayFundFlexiblestaffingInsureConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 4251695923573821625L;

	/** 
	 * 推荐的产品方案列表
	 */
	@ApiListField("recom_product_plan_list")
	@ApiField("insure_recom_product_plan")
	private List<InsureRecomProductPlan> recomProductPlanList;

	public void setRecomProductPlanList(List<InsureRecomProductPlan> recomProductPlanList) {
		this.recomProductPlanList = recomProductPlanList;
	}
	public List<InsureRecomProductPlan> getRecomProductPlanList( ) {
		return this.recomProductPlanList;
	}

}
