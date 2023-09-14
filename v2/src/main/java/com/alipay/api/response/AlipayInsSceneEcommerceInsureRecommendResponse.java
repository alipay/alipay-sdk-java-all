package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InsureRecommResultDTO;
import com.alipay.api.domain.InsOpenRejectResultDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.ecommerce.insure.recommend response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-20 16:56:47
 */
public class AlipayInsSceneEcommerceInsureRecommendResponse extends AlipayResponse {

	private static final long serialVersionUID = 4685726753334788747L;

	/** 
	 * 推荐结果
	 */
	@ApiListField("recommend_results")
	@ApiField("insure_recomm_result_d_t_o")
	private List<InsureRecommResultDTO> recommendResults;

	/** 
	 * 拦截原因
	 */
	@ApiListField("reject_results")
	@ApiField("ins_open_reject_result_d_t_o")
	private List<InsOpenRejectResultDTO> rejectResults;

	public void setRecommendResults(List<InsureRecommResultDTO> recommendResults) {
		this.recommendResults = recommendResults;
	}
	public List<InsureRecommResultDTO> getRecommendResults( ) {
		return this.recommendResults;
	}

	public void setRejectResults(List<InsOpenRejectResultDTO> rejectResults) {
		this.rejectResults = rejectResults;
	}
	public List<InsOpenRejectResultDTO> getRejectResults( ) {
		return this.rejectResults;
	}

}
