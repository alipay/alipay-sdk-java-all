package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.group.entry.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:41:17
 */
public class AlipayMerchantGroupEntryCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6198316115222575658L;

	/** 
	 * 用户绑定链接
	 */
	@ApiField("binding_link")
	private String bindingLink;

	public void setBindingLink(String bindingLink) {
		this.bindingLink = bindingLink;
	}
	public String getBindingLink( ) {
		return this.bindingLink;
	}

}
