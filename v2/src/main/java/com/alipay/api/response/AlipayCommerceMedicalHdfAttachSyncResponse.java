package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.hdf.attach.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-14 16:32:59
 */
public class AlipayCommerceMedicalHdfAttachSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2648873988614179731L;

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
