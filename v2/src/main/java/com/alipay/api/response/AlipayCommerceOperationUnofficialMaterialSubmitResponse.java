package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.unofficial.material.submit response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-11 13:41:36
 */
public class AlipayCommerceOperationUnofficialMaterialSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 8518283852994418741L;

	/** 
	 * 对应所插入非官方物料数据的唯一凭证
	 */
	@ApiField("response_id")
	private String responseId;

	public void setResponseId(String responseId) {
		this.responseId = responseId;
	}
	public String getResponseId( ) {
		return this.responseId;
	}

}
