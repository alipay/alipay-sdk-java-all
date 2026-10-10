package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.studentverify.photo.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-08 10:52:56
 */
public class AlipayCommerceEducateStudentverifyPhotoSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 7826647376434937318L;

	/** 
	 * 请求响应结果数据
	 */
	@ApiField("data")
	private String data;

	public void setData(String data) {
		this.data = data;
	}
	public String getData( ) {
		return this.data;
	}

}
