package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.msaas.mediarecog.aivisionstored.shop.bind response.
 * 
 * @author auto create
 * @since 1.0, 2026-02-10 17:32:43
 */
public class AlipayMsaasMediarecogAivisionstoredShopBindResponse extends AlipayResponse {

	private static final long serialVersionUID = 6169254212977541528L;

	/** 
	 * AI激活状态
	 */
	@ApiField("ai_service_status")
	private String aiServiceStatus;

	public void setAiServiceStatus(String aiServiceStatus) {
		this.aiServiceStatus = aiServiceStatus;
	}
	public String getAiServiceStatus( ) {
		return this.aiServiceStatus;
	}

}
