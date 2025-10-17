package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.interactiveprod.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:27:36
 */
public class AlipaySecurityProdInteractiveprodInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 4851315486477427792L;

	/** 
	 * 扩展参数，JSON格式
	 */
	@ApiField("ext_params")
	private String extParams;

	/** 
	 * 交互Id，格式为SSP_CONTEXT_bizId
	 */
	@ApiField("interact_id")
	private String interactId;

	/** 
	 * 交互产品跳转地址
	 */
	@ApiField("interact_url")
	private String interactUrl;

	public void setExtParams(String extParams) {
		this.extParams = extParams;
	}
	public String getExtParams( ) {
		return this.extParams;
	}

	public void setInteractId(String interactId) {
		this.interactId = interactId;
	}
	public String getInteractId( ) {
		return this.interactId;
	}

	public void setInteractUrl(String interactUrl) {
		this.interactUrl = interactUrl;
	}
	public String getInteractUrl( ) {
		return this.interactUrl;
	}

}
