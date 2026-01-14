package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 申请新增租房账号的请求中，机构传过来的文件信息
 *
 * @author auto create
 * @since 1.0, 2026-01-06 17:26:34
 */
public class IndrFileInfo extends AlipayObject {

	private static final long serialVersionUID = 5765529721396962495L;

	/**
	 * 文件格式
	 */
	@ApiField("file_format")
	private String fileFormat;

	/**
	 * 文件id
	 */
	@ApiField("file_id")
	private String fileId;

	public String getFileFormat() {
		return this.fileFormat;
	}
	public void setFileFormat(String fileFormat) {
		this.fileFormat = fileFormat;
	}

	public String getFileId() {
		return this.fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

}
