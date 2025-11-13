package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支小助文件详情
 *
 * @author auto create
 * @since 1.0, 2024-05-20 10:35:01
 */
public class ZXZFileDetail extends AlipayObject {

	private static final long serialVersionUID = 4543955649151624742L;

	/**
	 * 文件id
	 */
	@ApiField("file_id")
	private String fileId;

	/**
	 * 文件名称
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
