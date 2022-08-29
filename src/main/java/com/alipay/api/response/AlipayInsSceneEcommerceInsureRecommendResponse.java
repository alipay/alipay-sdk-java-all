package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InsureRecommResultDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.ecommerce.insure.recommend response.
 * 
 * @author auto create
 * @since 1.0, 2022-08-26 20:01:47
 */
public class AlipayInsSceneEcommerceInsureRecommendResponse extends AlipayResponse {

	private static final long serialVersionUID = 6862863695929598275L;

	/** 
	 * 推荐结果
	 */
	@ApiListField("recommend_results")
	@ApiField("insure_recomm_result_d_t_o")
	private List<InsureRecommResultDTO> recommendResults;

	public void setRecommendResults(List<InsureRecommResultDTO> recommendResults) {
		this.recommendResults = recommendResults;
	}
	public List<InsureRecommResultDTO> getRecommendResults( ) {
		return this.recommendResults;
	}

}
