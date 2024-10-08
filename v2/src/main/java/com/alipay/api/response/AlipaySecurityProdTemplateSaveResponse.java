package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.template.save response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-11 19:52:04
 */
public class AlipaySecurityProdTemplateSaveResponse extends AlipayResponse {

	private static final long serialVersionUID = 5589781878992581477L;

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
