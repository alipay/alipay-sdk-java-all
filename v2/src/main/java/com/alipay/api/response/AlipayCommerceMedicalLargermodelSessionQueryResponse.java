package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.LlmServiceDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.largermodel.session.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-08 10:11:14
 */
public class AlipayCommerceMedicalLargermodelSessionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2666817567486216582L;

	/** 
	 * 返回数据
	 */
	@ApiField("llm_service_result")
	private LlmServiceDTO llmServiceResult;

	/** 
	 * SUCCESS：业务处理成功
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 结果描述
	 */
	@ApiField("result_desc")
	private String resultDesc;

	public void setLlmServiceResult(LlmServiceDTO llmServiceResult) {
		this.llmServiceResult = llmServiceResult;
	}
	public LlmServiceDTO getLlmServiceResult( ) {
		return this.llmServiceResult;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultDesc(String resultDesc) {
		this.resultDesc = resultDesc;
	}
	public String getResultDesc( ) {
		return this.resultDesc;
	}

}
