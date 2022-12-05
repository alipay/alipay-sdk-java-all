package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.unofficial.material.submit response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-25 17:14:41
 */
public class AlipayCommerceOperationUnofficialMaterialSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 7694863626561651682L;

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
