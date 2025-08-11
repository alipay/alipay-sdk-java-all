package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PurchaseRecommResultDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.ecommerce.purchase.recommend response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-01 23:24:54
 */
public class AlipayInsSceneEcommercePurchaseRecommendResponse extends AlipayResponse {

	private static final long serialVersionUID = 2216795545626647372L;

	/** 
	 * 推荐结果
	 */
	@ApiListField("recommend_results")
	@ApiField("purchase_recomm_result_d_t_o")
	private List<PurchaseRecommResultDTO> recommendResults;

	public void setRecommendResults(List<PurchaseRecommResultDTO> recommendResults) {
		this.recommendResults = recommendResults;
	}
	public List<PurchaseRecommResultDTO> getRecommendResults( ) {
		return this.recommendResults;
	}

}
