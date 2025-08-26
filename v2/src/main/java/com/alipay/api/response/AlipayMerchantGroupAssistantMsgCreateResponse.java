package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.group.assistant.msg.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 10:12:16
 */
public class AlipayMerchantGroupAssistantMsgCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1853481334395593299L;

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
