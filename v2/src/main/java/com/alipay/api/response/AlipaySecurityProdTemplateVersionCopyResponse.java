package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.template.version.copy response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-11 19:52:05
 */
public class AlipaySecurityProdTemplateVersionCopyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2695973881233313921L;

	/** 
	 * 版本拷贝结果
	 */
	@ApiField("copy_result")
	private Boolean copyResult;

	public void setCopyResult(Boolean copyResult) {
		this.copyResult = copyResult;
	}
	public Boolean getCopyResult( ) {
		return this.copyResult;
	}

}
