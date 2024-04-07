package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 文件上传根据下载url
 *
 * @author auto create
 * @since 1.0, 2021-10-15 18:11:54
 */
public class AlipaySocialBaseFileUrlUploadModel extends AlipayObject {

	private static final long serialVersionUID = 8541975628252751631L;

	/**
	 * 带后缀文件名
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * 文件下载url
	 */
	@ApiField("url")
	private String url;

	public String getFileName() {
		return this.fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
