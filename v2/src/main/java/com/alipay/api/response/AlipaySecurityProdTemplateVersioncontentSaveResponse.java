package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.template.versioncontent.save response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-30 15:57:43
 */
public class AlipaySecurityProdTemplateVersioncontentSaveResponse extends AlipayResponse {

	private static final long serialVersionUID = 6418129396881711287L;

	/** 
	 * 编辑结果
	 */
	@ApiField("save_result")
	private Boolean saveResult;

	public void setSaveResult(Boolean saveResult) {
		this.saveResult = saveResult;
	}
	public Boolean getSaveResult( ) {
		return this.saveResult;
	}

}
