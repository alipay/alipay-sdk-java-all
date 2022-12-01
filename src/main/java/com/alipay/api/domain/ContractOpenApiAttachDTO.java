package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合同附件
 *
 * @author auto create
 * @since 1.0, 2022-11-09 16:04:05
 */
public class ContractOpenApiAttachDTO extends AlipayObject {

	private static final long serialVersionUID = 3788952496763794332L;

	/**
	 * 文件地址
	 */
	@ApiField("file_location")
	private String fileLocation;

	/**
	 * 合同文件
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * 文件版本
	 */
	@ApiField("file_version")
	private String fileVersion;

	/**
	 * 合同PDF文件
	 */
	@ApiField("pdf_file_location")
	private String pdfFileLocation;

	public String getFileLocation() {
		return this.fileLocation;
	}
	public void setFileLocation(String fileLocation) {
		this.fileLocation = fileLocation;
	}

	public String getFileName() {
		return this.fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileVersion() {
		return this.fileVersion;
	}
	public void setFileVersion(String fileVersion) {
		this.fileVersion = fileVersion;
	}

	public String getPdfFileLocation() {
		return this.pdfFileLocation;
	}
	public void setPdfFileLocation(String pdfFileLocation) {
		this.pdfFileLocation = pdfFileLocation;
	}

}
