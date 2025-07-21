package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AgentWelcomeCardDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.largermodel.agentwelcomecard.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-10 19:18:47
 */
public class AlipayCommerceMedicalLargermodelAgentwelcomecardQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2448451386753273971L;

	/** 
	 * 欢迎页卡片数据
	 */
	@ApiField("data")
	private AgentWelcomeCardDTO data;

	/** 
	 * 结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 结果描述
	 */
	@ApiField("result_desc")
	private String resultDesc;

	public void setData(AgentWelcomeCardDTO data) {
		this.data = data;
	}
	public AgentWelcomeCardDTO getData( ) {
		return this.data;
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
