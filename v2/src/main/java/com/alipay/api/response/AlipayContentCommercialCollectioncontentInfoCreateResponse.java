package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.content.commercial.collectioncontent.info.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-28 16:57:38
 */
public class AlipayContentCommercialCollectioncontentInfoCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8751236928394685414L;

	/** 
	 * 短带长内容创建成功，返回的操作成功的内容ID
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
