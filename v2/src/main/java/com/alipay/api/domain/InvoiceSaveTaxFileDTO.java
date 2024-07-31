package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票新增报税文件DTO
 *
 * @author auto create
 * @since 1.0, 2023-07-07 14:20:28
 */
public class InvoiceSaveTaxFileDTO extends AlipayObject {

	private static final long serialVersionUID = 7622786489581521266L;

	/**
	 * 采购报税文件名称
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * 采购报税文件大小
	 */
	@ApiField("file_size")
	private Long fileSize;

	/**
	 * 采购报税文件资源ID
	 */
	@ApiField("resource_id")
	private String resourceId;

	public String getFileName() {
		return this.fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Long getFileSize() {
		return this.fileSize;
	}
	public void setFileSize(Long fileSize) {
		this.fileSize = fileSize;
	}

	public String getResourceId() {
		return this.resourceId;
	}
	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

}
