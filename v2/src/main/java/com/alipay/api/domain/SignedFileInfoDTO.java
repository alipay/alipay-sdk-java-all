package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签名文件信息模型
 *
 * @author auto create
 * @since 1.0, 2022-12-07 14:05:35
 */
public class SignedFileInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 6384115356794628495L;

	/**
	 * 签约后的文件地址
	 */
	@ApiField("e_signed_file_key")
	private String eSignedFileKey;

	/**
	 * 签约原文件地址
	 */
	@ApiField("file_key")
	private String fileKey;

	public String geteSignedFileKey() {
		return this.eSignedFileKey;
	}
	public void seteSignedFileKey(String eSignedFileKey) {
		this.eSignedFileKey = eSignedFileKey;
	}

	public String getFileKey() {
		return this.fileKey;
	}
	public void setFileKey(String fileKey) {
		this.fileKey = fileKey;
	}

}
