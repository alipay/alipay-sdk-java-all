package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合同文件DTO
 *
 * @author auto create
 * @since 1.0, 2023-11-06 14:45:03
 */
public class OpenApiContractFileSaDTO extends AlipayObject {

	private static final long serialVersionUID = 8225559256949958732L;

	/**
	 * 合同文件名
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * 文件下载的http链接
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
