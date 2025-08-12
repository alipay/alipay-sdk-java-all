package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InsRecomProductPlan;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.employment.product.consult response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-23 20:59:35
 */
public class AlipayInsSceneEmploymentProductConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 8619564218541631258L;

	/** 
	 * 推荐的产品方案列表
	 */
	@ApiListField("recom_product_plan_list")
	@ApiField("ins_recom_product_plan")
	private List<InsRecomProductPlan> recomProductPlanList;

	public void setRecomProductPlanList(List<InsRecomProductPlan> recomProductPlanList) {
		this.recomProductPlanList = recomProductPlanList;
	}
	public List<InsRecomProductPlan> getRecomProductPlanList( ) {
		return this.recomProductPlanList;
	}

}
