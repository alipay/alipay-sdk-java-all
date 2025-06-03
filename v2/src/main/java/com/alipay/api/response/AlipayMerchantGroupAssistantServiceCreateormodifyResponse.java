package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.group.assistant.service.createormodify response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-27 10:30:27
 */
public class AlipayMerchantGroupAssistantServiceCreateormodifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7794615419624648932L;

	/** 
	 * 小助手内容id，创建快捷服务时返回的数据唯一id
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
