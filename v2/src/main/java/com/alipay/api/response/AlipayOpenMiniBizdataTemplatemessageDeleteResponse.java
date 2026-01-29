package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.bizdata.templatemessage.delete response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 14:32:43
 */
public class AlipayOpenMiniBizdataTemplatemessageDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 6583171623338778257L;

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
