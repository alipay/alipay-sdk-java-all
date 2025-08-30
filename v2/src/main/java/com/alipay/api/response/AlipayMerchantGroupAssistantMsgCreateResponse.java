package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.group.assistant.msg.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-27 10:22:36
 */
public class AlipayMerchantGroupAssistantMsgCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7889445395343163585L;

	/** 
	 * 小助手消息内容id
	 */
	@ApiField("content_id")
	private String contentId;

	public void setContentId(String contentId) {
		this.contentId = contentId;
	}
	public String getContentId( ) {
		return this.contentId;
	}

}
