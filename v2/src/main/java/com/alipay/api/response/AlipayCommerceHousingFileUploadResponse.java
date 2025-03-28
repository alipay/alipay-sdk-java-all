package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.housing.file.upload response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-13 14:37:25
 */
public class AlipayCommerceHousingFileUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 5747496561368637189L;

	/** 
	 * 附件id
	 */
	@ApiField("attachment_id")
	private String attachmentId;

	public void setAttachmentId(String attachmentId) {
		this.attachmentId = attachmentId;
	}
	public String getAttachmentId( ) {
		return this.attachmentId;
	}

}
