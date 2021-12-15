package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.facefeature.info.send response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-23 15:18:33
 */
public class AlipayCommerceEducateFacefeatureInfoSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 2755886694188831487L;

	/** 
	 * 返回更新失败的userId集合
	 */
	@ApiField("error_uids")
	private String errorUids;

	public void setErrorUids(String errorUids) {
		this.errorUids = errorUids;
	}
	public String getErrorUids( ) {
		return this.errorUids;
	}

}
