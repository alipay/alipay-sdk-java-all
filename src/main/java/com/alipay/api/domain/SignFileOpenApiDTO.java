package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签署文件
 *
 * @author auto create
 * @since 1.0, 2021-12-27 09:31:36
 */
public class SignFileOpenApiDTO extends AlipayObject {

	private static final long serialVersionUID = 2314791448337221622L;

	/**
	 * String	文件名称（一个
业务单据号对应的多个用印文件名称要不一样）
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * http的oss地址
	 */
	@ApiField("http_oss_url")
	private String httpOssUrl;

	/**
	 * 文件oss地址
	 */
	@ApiField("oss_url")
	private String ossUrl;

	public String getFileName() {
		return this.fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getHttpOssUrl() {
		return this.httpOssUrl;
	}
	public void setHttpOssUrl(String httpOssUrl) {
		this.httpOssUrl = httpOssUrl;
	}

	public String getOssUrl() {
		return this.ossUrl;
	}
	public void setOssUrl(String ossUrl) {
		this.ossUrl = ossUrl;
	}

}
