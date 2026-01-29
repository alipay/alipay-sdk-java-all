package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AgentWelcomeCardDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.largermodel.agentwelcomecard.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-07 12:42:36
 */
public class AlipayCommerceMedicalLargermodelAgentwelcomecardQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7433143824745958211L;

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
