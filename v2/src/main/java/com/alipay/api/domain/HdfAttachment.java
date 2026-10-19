package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-10-14 13:57:53
 */
public class HdfAttachment extends AlipayObject {

	private static final long serialVersionUID = 1727999171588565356L;

	/**
	 * 附件ID
	 */
	@ApiField("attachment_id")
	private String attachmentId;

	/**
	 * 路径
	 */
	@ApiField("file_path")
	private String filePath;

	/**
	 * 持有者
	 */
	@ApiField("owner_id")
	private String ownerId;

	public String getAttachmentId() {
		return this.attachmentId;
	}
	public void setAttachmentId(String attachmentId) {
		this.attachmentId = attachmentId;
	}

	public String getFilePath() {
		return this.filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getOwnerId() {
		return this.ownerId;
	}
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

}
