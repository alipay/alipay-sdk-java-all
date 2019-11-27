package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卡信息
 *
 * @author auto create
 * @since 1.0, 2019-11-07 21:46:59
 */
public class OpenApiProvisioningBundle extends AlipayObject {

	private static final long serialVersionUID = 5568991934553735615L;

	/**
	 * 加密后的数据
	 */
	@ApiField("data")
	private String data;

	/**
	 * EC_v2
	 */
	@ApiField("encryption_version")
	private String encryptionVersion;

	/**
	 * 一次性公密钥
	 */
	@ApiField("ephemeral_public_key")
	private String ephemeralPublicKey;

	/**
	 * 公钥hash
	 */
	@ApiField("public_key_hash")
	private String publicKeyHash;

	public String getData() {
		return this.data;
	}
	public void setData(String data) {
		this.data = data;
	}

	public String getEncryptionVersion() {
		return this.encryptionVersion;
	}
	public void setEncryptionVersion(String encryptionVersion) {
		this.encryptionVersion = encryptionVersion;
	}

	public String getEphemeralPublicKey() {
		return this.ephemeralPublicKey;
	}
	public void setEphemeralPublicKey(String ephemeralPublicKey) {
		this.ephemeralPublicKey = ephemeralPublicKey;
	}

	public String getPublicKeyHash() {
		return this.publicKeyHash;
	}
	public void setPublicKeyHash(String publicKeyHash) {
		this.publicKeyHash = publicKeyHash;
	}

}
