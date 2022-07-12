package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.content.community.data.send response.
 * 
 * @author auto create
 * @since 1.0, 2021-03-11 15:55:42
 */
public class AntfortuneContentCommunityDataSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 2795259112671254469L;

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
