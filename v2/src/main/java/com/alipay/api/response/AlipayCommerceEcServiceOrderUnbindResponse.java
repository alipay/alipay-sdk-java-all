package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.service.order.unbind response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 02:51:50
 */
public class AlipayCommerceEcServiceOrderUnbindResponse extends AlipayResponse {

	private static final long serialVersionUID = 8427817715512789485L;

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
