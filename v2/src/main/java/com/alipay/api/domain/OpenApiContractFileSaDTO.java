package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合同文件DTO
 *
 * @author auto create
 * @since 1.0, 2024-12-23 10:36:08
 */
public class OpenApiContractFileSaDTO extends AlipayObject {

	private static final long serialVersionUID = 3625512131149222291L;

	/**
	 * 合同文件名
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * 签署类型
	 */
	@ApiField("file_sign_type")
	private String fileSignType;

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

	public String getFileSignType() {
		return this.fileSignType;
	}
	public void setFileSignType(String fileSignType) {
		this.fileSignType = fileSignType;
	}

	public String getFileUrl() {
		return this.fileUrl;
	}
	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

}
