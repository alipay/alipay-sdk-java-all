package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.LlmAnswerCardDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.largermodel.doctorcard.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-26 11:37:05
 */
public class AlipayCommerceMedicalLargermodelDoctorcardQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3839119342613396927L;

	/** 
	 * 卡片数据
	 */
	@ApiListField("llm_service_result")
	@ApiField("llm_answer_card_d_t_o")
	private List<LlmAnswerCardDTO> llmServiceResult;

	public void setLlmServiceResult(List<LlmAnswerCardDTO> llmServiceResult) {
		this.llmServiceResult = llmServiceResult;
	}
	public List<LlmAnswerCardDTO> getLlmServiceResult( ) {
		return this.llmServiceResult;
	}

}
