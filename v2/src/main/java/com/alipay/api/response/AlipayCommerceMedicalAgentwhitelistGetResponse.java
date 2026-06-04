package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.agentwhitelist.get response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-12 17:22:44
 */
public class AlipayCommerceMedicalAgentwhitelistGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 5568675279281521299L;

	/** 
	 * null
	 */
	@ApiListField("white_list")
	@ApiField("string")
	private List<String> whiteList;

	public void setWhiteList(List<String> whiteList) {
		this.whiteList = whiteList;
	}
	public List<String> getWhiteList( ) {
		return this.whiteList;
	}

}
