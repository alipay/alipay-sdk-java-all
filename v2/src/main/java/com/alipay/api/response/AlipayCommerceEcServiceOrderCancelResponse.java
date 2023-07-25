package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.service.order.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 20:12:00
 */
public class AlipayCommerceEcServiceOrderCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 4858958353145254592L;

	/** 
	 * 若需要解约则返回解约链接
	 */
	@ApiField("cancel_contract_url")
	private String cancelContractUrl;

	public void setCancelContractUrl(String cancelContractUrl) {
		this.cancelContractUrl = cancelContractUrl;
	}
	public String getCancelContractUrl( ) {
		return this.cancelContractUrl;
	}

}
