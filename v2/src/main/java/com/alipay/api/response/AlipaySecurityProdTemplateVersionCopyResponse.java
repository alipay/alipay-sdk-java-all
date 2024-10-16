package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.template.version.copy response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-16 09:32:49
 */
public class AlipaySecurityProdTemplateVersionCopyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2266891158612186316L;

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
