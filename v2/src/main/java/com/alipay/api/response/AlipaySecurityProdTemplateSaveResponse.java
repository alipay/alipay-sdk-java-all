package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.template.save response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-30 15:57:43
 */
public class AlipaySecurityProdTemplateSaveResponse extends AlipayResponse {

	private static final long serialVersionUID = 8829923883783452566L;

	/** 
	 * 模板更新结果
	 */
	@ApiField("update_result")
	private Boolean updateResult;

	public void setUpdateResult(Boolean updateResult) {
		this.updateResult = updateResult;
	}
	public Boolean getUpdateResult( ) {
		return this.updateResult;
	}

}
