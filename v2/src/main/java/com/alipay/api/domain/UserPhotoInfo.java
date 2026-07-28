package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-07-28 17:57:52
 */
public class UserPhotoInfo extends AlipayObject {

	private static final long serialVersionUID = 5779467597661131737L;

	/**
	 * 照片文件地址
	 */
	@ApiField("file_url")
	private String fileUrl;

	/**
	 * 照片关键词
	 */
	@ApiField("keyword")
	private String keyword;

	public String getFileUrl() {
		return this.fileUrl;
	}
	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	public String getKeyword() {
		return this.keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

}
