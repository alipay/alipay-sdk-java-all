package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.content.community.data.send response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:36
 */
public class AntfortuneContentCommunityDataSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 4777528717516566189L;

	/** 
	 * 是否成功
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
