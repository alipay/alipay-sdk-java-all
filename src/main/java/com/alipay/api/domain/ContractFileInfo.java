package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合同文件信息
 *
 * @author auto create
 * @since 1.0, 2019-12-20 17:59:15
 */
public class ContractFileInfo extends AlipayObject {

	private static final long serialVersionUID = 8431314488118464839L;

	/**
	 * 合同文件名称
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * 合同文件url
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
