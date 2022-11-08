package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 加密配置信息
 *
 * @author auto create
 * @since 1.0, 2022-11-02 15:43:10
 */
public class EncryptConfigExt extends AlipayObject {

	private static final long serialVersionUID = 6327684638874979889L;

	/**
	 * APPID
	 */
	@ApiField("app_number")
	private String appNumber;

	/**
	 * 加密类型
	 */
	@ApiField("encrypt_type")
	private String encryptType;

	/**
	 * ID
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 密钥
	 */
	@ApiField("secret_key")
	private String secretKey;

	public String getAppNumber() {
		return this.appNumber;
	}
	public void setAppNumber(String appNumber) {
		this.appNumber = appNumber;
	}

	public String getEncryptType() {
		return this.encryptType;
	}
	public void setEncryptType(String encryptType) {
		this.encryptType = encryptType;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getSecretKey() {
		return this.secretKey;
	}
	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}

}
