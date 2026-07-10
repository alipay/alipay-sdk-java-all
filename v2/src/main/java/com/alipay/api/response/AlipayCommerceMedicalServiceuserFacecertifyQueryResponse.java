package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.serviceuser.facecertify.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-25 11:42:55
 */
public class AlipayCommerceMedicalServiceuserFacecertifyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8841998791697567165L;

	/** 
	 * 人脸核身查询结果
	 */
	@ApiField("content")
	private String content;

	public void setContent(String content) {
		this.content = content;
	}
	public String getContent( ) {
		return this.content;
	}

}
