package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.template.save response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-10 15:54:19
 */
public class AlipaySecurityProdTemplateSaveResponse extends AlipayResponse {

	private static final long serialVersionUID = 5812255576978914412L;

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
