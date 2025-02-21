package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.template.versioncontent.save response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-10 15:52:44
 */
public class AlipaySecurityProdTemplateVersioncontentSaveResponse extends AlipayResponse {

	private static final long serialVersionUID = 2192726542388235744L;

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
