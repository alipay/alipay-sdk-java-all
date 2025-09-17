package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合同文件DTO，用于消息发送
 *
 * @author auto create
 * @since 1.0, 2023-11-06 14:45:23
 */
public class OpenApiContractFileMsgDTO extends AlipayObject {

	private static final long serialVersionUID = 3564843915728819531L;

	/**
	 * 文件类型，附件或合同
	 */
	@ApiField("contract_type")
	private String contractType;

	/**
	 * 文件名称
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * 文件下载的http链接
	 */
	@ApiField("file_url")
	private String fileUrl;

	public String getContractType() {
		return this.contractType;
	}
	public void setContractType(String contractType) {
		this.contractType = contractType;
	}

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
