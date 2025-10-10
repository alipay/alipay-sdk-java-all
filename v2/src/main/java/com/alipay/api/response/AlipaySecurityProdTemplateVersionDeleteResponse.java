package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.template.version.delete response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-07 12:57:37
 */
public class AlipaySecurityProdTemplateVersionDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 1419876739595824989L;

	/** 
	 * 删除结果
	 */
	@ApiField("delete_result")
	private Boolean deleteResult;

	public void setDeleteResult(Boolean deleteResult) {
		this.deleteResult = deleteResult;
	}
	public Boolean getDeleteResult( ) {
		return this.deleteResult;
	}

}
