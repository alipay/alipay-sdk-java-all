package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.template.version.publish response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-11 19:52:05
 */
public class AlipaySecurityProdTemplateVersionPublishResponse extends AlipayResponse {

	private static final long serialVersionUID = 3684587149315193143L;

	/** 
	 * 发布结果
	 */
	@ApiField("publish_result")
	private Boolean publishResult;

	public void setPublishResult(Boolean publishResult) {
		this.publishResult = publishResult;
	}
	public Boolean getPublishResult( ) {
		return this.publishResult;
	}

}
