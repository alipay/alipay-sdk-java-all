package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票OCR识别服务
 *
 * @author auto create
 * @since 1.0, 2025-09-18 19:52:33
 */
public class AlipayCommerceInvoiceOcrIdentifyModel extends AlipayObject {

	private static final long serialVersionUID = 4716842141939333721L;

	/**
	 * 文件类型
	 */
	@ApiField("file_type")
	private String fileType;

	/**
	 * 文件下载链接，要求公网可访问
	 */
	@ApiField("file_url")
	private String fileUrl;

	public String getFileType() {
		return this.fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getFileUrl() {
		return this.fileUrl;
	}
	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

}
