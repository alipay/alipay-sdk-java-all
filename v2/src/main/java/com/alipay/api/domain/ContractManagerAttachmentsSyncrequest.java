package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 流程附件
 *
 * @author auto create
 * @since 1.0, 2020-05-19 13:56:28
 */
public class ContractManagerAttachmentsSyncrequest extends AlipayObject {

	private static final long serialVersionUID = 2483172461891717486L;

	/**
	 * 附件fileId
	 */
	@ApiField("file_id")
	private String fileId;

	/**
	 * 附件名称
	 */
	@ApiField("file_name")
	private String fileName;

	public String getFileId() {
		return this.fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getFileName() {
		return this.fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

}
