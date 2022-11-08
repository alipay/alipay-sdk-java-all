package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 加签内容
 *
 * @author auto create
 * @since 1.0, 2022-03-07 19:04:10
 */
public class SignContentBodyRequest extends AlipayObject {

	private static final long serialVersionUID = 7161533761757676748L;

	/**
	 * 文件名
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * 原始内容
	 */
	@ApiField("plain_content")
	private String plainContent;

	/**
	 * sha1加签后内容，如果没有加签内容则取原始内容加sha1
	 */
	@ApiField("sha_content")
	private String shaContent;

	public String getFileName() {
		return this.fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getPlainContent() {
		return this.plainContent;
	}
	public void setPlainContent(String plainContent) {
		this.plainContent = plainContent;
	}

	public String getShaContent() {
		return this.shaContent;
	}
	public void setShaContent(String shaContent) {
		this.shaContent = shaContent;
	}

}
