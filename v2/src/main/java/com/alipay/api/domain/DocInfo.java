package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 已签署完成文件列表
 *
 * @author auto create
 * @since 1.0, 2020-02-04 14:10:09
 */
public class DocInfo extends AlipayObject {

	private static final long serialVersionUID = 3329364939356396123L;

	/**
	 * 合同文件名
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * 合同下载地址
	 */
	@ApiField("file_url")
	private String fileUrl;

	public String getFileName() {
		return this.fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileUrl() {
		return this.fileUrl;
	}
	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

}
