package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.bizdata.templatemessage.upload response.
 * 
 * @author auto create
 * @since 1.0, 2019-11-27 01:51:59
 */
public class AlipayOpenMiniBizdataTemplatemessageUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 5222858641733482434L;

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
