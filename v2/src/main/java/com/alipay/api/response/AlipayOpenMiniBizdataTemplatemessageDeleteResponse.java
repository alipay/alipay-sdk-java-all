package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.bizdata.templatemessage.delete response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-30 14:23:31
 */
public class AlipayOpenMiniBizdataTemplatemessageDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 8433739481975182985L;

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
