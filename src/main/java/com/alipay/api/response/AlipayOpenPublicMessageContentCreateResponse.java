package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.message.content.create response.
 * 
 * @author auto create
 * @since 1.0, 2018-07-13 17:18:06
 */
public class AlipayOpenPublicMessageContentCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2699774858699537321L;

	/** 
	 * 内容id
	 */
	@ApiField("content_id")
	private String contentId;

	/** 
	 * 内容详情内链url
	 */
	@ApiField("content_url")
	private String contentUrl;

	public void setContentId(String contentId) {
		this.contentId = contentId;
	}
	public String getContentId( ) {
		return this.contentId;
	}

	public void setContentUrl(String contentUrl) {
		this.contentUrl = contentUrl;
	}
	public String getContentUrl( ) {
		return this.contentUrl;
	}

}
