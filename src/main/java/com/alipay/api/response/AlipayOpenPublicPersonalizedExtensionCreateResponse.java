package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.personalized.extension.create response.
 * 
 * @author auto create
 * @since 1.0, 2020-01-10 18:10:55
 */
public class AlipayOpenPublicPersonalizedExtensionCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1147626294893894484L;

	/** 
	 * 扩展区套id，创建个性化扩展区成功后，支付宝会将该字段返回，后续扩展区上下线或者扩展区删除都会用到这个值。
	 */
	@ApiField("extension_key")
	private String extensionKey;

	public void setExtensionKey(String extensionKey) {
		this.extensionKey = extensionKey;
	}
	public String getExtensionKey( ) {
		return this.extensionKey;
	}

}
