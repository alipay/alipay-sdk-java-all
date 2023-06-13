package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.insserviceprod.serattachment.delete response.
 * 
 * @author auto create
 * @since 1.0, 2023-06-09 18:04:23
 */
public class AlipayInsSceneInsserviceprodSerattachmentDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 6688437382812726159L;

	/** 
	 * 文件编号
(原封不动地把请求中的附件编号返回给你)
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
