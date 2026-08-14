package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OfflineLaborRecomInsuranceProduct;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.offlinelabor.insurance.recommend response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-24 14:17:50
 */
public class AlipayCommerceOfflinelaborInsuranceRecommendResponse extends AlipayResponse {

	private static final long serialVersionUID = 7553688786678689821L;

	/** 
	 * null
	 */
	@ApiListField("recom_product_plan_list")
	@ApiField("offline_labor_recom_insurance_product")
	private List<OfflineLaborRecomInsuranceProduct> recomProductPlanList;

	public void setRecomProductPlanList(List<OfflineLaborRecomInsuranceProduct> recomProductPlanList) {
		this.recomProductPlanList = recomProductPlanList;
	}
	public List<OfflineLaborRecomInsuranceProduct> getRecomProductPlanList( ) {
		return this.recomProductPlanList;
	}

}
