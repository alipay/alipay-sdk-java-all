package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AttachmentDetail;
import com.alipay.api.domain.DocInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.signflows.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 01:47:12
 */
public class AlipayEcoSignflowsDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2879981686654759269L;

	/** 
	 * 创建流程时平台上传的附件及签署时用户上传的附件或身份证
	 */
	@ApiField("attachments")
	private AttachmentDetail attachments;

	/** 
	 * 已签署完成文件列表
	 */
	@ApiField("docs")
	private DocInfo docs;

	public void setAttachments(AttachmentDetail attachments) {
		this.attachments = attachments;
	}
	public AttachmentDetail getAttachments( ) {
		return this.attachments;
	}

	public void setDocs(DocInfo docs) {
		this.docs = docs;
	}
	public DocInfo getDocs( ) {
		return this.docs;
	}

}
