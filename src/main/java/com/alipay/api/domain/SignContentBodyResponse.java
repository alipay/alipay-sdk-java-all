package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 加签返回内容
 *
 * @author auto create
 * @since 1.0, 2022-03-07 19:04:10
 */
public class SignContentBodyResponse extends AlipayObject {

	private static final long serialVersionUID = 8135828919417411687L;

	/**
	 * 钱包客户端签名rsa内容
	 */
	@ApiField("alipayapp_rsa_content")
	private String alipayappRsaContent;

	/**
	 * 文件名
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * h5签名rsa内容
	 */
	@ApiField("innerapp_rsa_content")
	private String innerappRsaContent;

	public String getAlipayappRsaContent() {
		return this.alipayappRsaContent;
	}
	public void setAlipayappRsaContent(String alipayappRsaContent) {
		this.alipayappRsaContent = alipayappRsaContent;
	}

	public String getFileName() {
		return this.fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getInnerappRsaContent() {
		return this.innerappRsaContent;
	}
	public void setInnerappRsaContent(String innerappRsaContent) {
		this.innerappRsaContent = innerappRsaContent;
	}

}
