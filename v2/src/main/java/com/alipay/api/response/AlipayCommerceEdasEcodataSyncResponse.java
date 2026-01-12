package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.edas.ecodata.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-09 13:57:44
 */
public class AlipayCommerceEdasEcodataSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4715625583415459337L;

	/** 
	 * 创建的数据内容ID
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
