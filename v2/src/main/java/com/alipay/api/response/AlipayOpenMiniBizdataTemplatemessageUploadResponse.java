package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.bizdata.templatemessage.upload response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 23:41:50
 */
public class AlipayOpenMiniBizdataTemplatemessageUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 6143425468854332123L;

	/** 
	 * 成功：true 失败：false
	 */
	@ApiField("success")
	private Boolean success;

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
