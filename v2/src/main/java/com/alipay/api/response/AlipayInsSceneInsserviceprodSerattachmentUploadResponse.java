package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.insserviceprod.serattachment.upload response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-10 23:16:38
 */
public class AlipayInsSceneInsserviceprodSerattachmentUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 8369167537345181139L;

	/** 
	 * 附件编号(业务主键)
	 */
	@ApiField("attachment_no")
	private String attachmentNo;

	public void setAttachmentNo(String attachmentNo) {
		this.attachmentNo = attachmentNo;
	}
	public String getAttachmentNo( ) {
		return this.attachmentNo;
	}

}
