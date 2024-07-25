package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.service.order.unbind response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:55:10
 */
public class AlipayCommerceEcServiceOrderUnbindResponse extends AlipayResponse {

	private static final long serialVersionUID = 5868141713877448118L;

	/** 
	 * 在需要解约的情况下，返回取消服务选择需要解约的地址
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
