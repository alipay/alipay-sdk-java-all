package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.schoolcontent.modify response.
 * 
 * @author auto create
 * @since 1.0, 2022-07-18 15:01:45
 */
public class AlipayCommerceEducateSchoolcontentModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5819725828925349446L;

	/** 
	 * 支付宝返回的内容唯一Id
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
