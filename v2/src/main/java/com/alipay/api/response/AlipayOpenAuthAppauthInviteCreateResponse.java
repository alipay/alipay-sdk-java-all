package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.auth.appauth.invite.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 05:11:50
 */
public class AlipayOpenAuthAppauthInviteCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5883944996443334839L;

	/** 
	 * 商户授权的详情页地址
	 */
	@ApiField("task_page_url")
	private String taskPageUrl;

	public void setTaskPageUrl(String taskPageUrl) {
		this.taskPageUrl = taskPageUrl;
	}
	public String getTaskPageUrl( ) {
		return this.taskPageUrl;
	}

}
