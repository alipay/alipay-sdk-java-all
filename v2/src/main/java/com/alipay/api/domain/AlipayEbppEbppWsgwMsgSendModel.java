package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 国网消息发送
 *
 * @author auto create
 * @since 1.0, 2026-04-16 16:52:45
 */
public class AlipayEbppEbppWsgwMsgSendModel extends AlipayObject {

	private static final long serialVersionUID = 1258461998295427571L;

	/**
	 * 省码
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 加密后的二
进制做
base64 编
码
	 */
	@ApiField("secret_content")
	private String secretContent;

	/**
	 * 消息类型
	 */
	@ApiField("type_code")
	private String typeCode;

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getSecretContent() {
		return this.secretContent;
	}
	public void setSecretContent(String secretContent) {
		this.secretContent = secretContent;
	}

	public String getTypeCode() {
		return this.typeCode;
	}
	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

}
