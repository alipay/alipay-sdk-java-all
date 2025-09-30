package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.finresearch.copilot.consult response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-18 17:06:59
 */
public class AntfortuneFinresearchCopilotConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 2276886918644274741L;

	/** 
	 * 咨询ID
	 */
	@ApiField("consult_id")
	private String consultId;

	public void setConsultId(String consultId) {
		this.consultId = consultId;
	}
	public String getConsultId( ) {
		return this.consultId;
	}

}
