package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 附件信息（E签宝）
 *
 * @author auto create
 * @since 1.0, 2020-05-06 14:36:29
 */
public class Attachment extends AlipayObject {

	private static final long serialVersionUID = 2666488727223347351L;

	/**
	 * 流程附件名称
	 */
	@ApiField("attachment_name")
	private String attachmentName;

	/**
	 * 流程附件id
	 */
	@ApiField("file_id")
	private String fileId;

	public String getAttachmentName() {
		return this.attachmentName;
	}
	public void setAttachmentName(String attachmentName) {
		this.attachmentName = attachmentName;
	}

	public String getFileId() {
		return this.fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

}
