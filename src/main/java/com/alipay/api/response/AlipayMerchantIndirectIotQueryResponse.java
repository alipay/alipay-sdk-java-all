package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.indirect.iot.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-26 11:15:00
 */
public class AlipayMerchantIndirectIotQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3755912448795526464L;

	/** 
	 * 内容id，下发如果是阿里云等平台可以播报的，是一种内容id
	 */
	@ApiField("content_id")
	private String contentId;

	/** 
	 * 代表内容id可以播报的平台
	 */
	@ApiField("content_type")
	private String contentType;

	/** 
	 * 营销文案
	 */
	@ApiField("text")
	private String text;

	public void setContentId(String contentId) {
		this.contentId = contentId;
	}
	public String getContentId( ) {
		return this.contentId;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	public String getContentType( ) {
		return this.contentType;
	}

	public void setText(String text) {
		this.text = text;
	}
	public String getText( ) {
		return this.text;
	}

}
