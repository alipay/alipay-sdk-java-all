package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 流程附件
 *
 * @author auto create
 * @since 1.0, 2020-03-30 14:15:10
 */
public class ContractManagerAttachmentsSyncrequest extends AlipayObject {

	private static final long serialVersionUID = 3137986753978565333L;

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
