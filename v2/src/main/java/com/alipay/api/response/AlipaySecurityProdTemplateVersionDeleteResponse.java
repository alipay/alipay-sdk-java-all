package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.template.version.delete response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-11 19:50:58
 */
public class AlipaySecurityProdTemplateVersionDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 2125354129374639248L;

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
