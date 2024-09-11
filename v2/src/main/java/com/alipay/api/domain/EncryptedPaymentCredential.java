package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 码值加密结果。{The encrypted credential value}
 *
 * @author auto create
 * @since 1.0, 2020-02-20 19:41:04
 */
public class EncryptedPaymentCredential extends AlipayObject {

	private static final long serialVersionUID = 4359977833289435691L;

	/**
	 * 码值密文。{Base64 encrypted data}
	 */
	@ApiField("data")
	private String data;

	/**
	 * 加密产生的临时公钥。
{Base64 encoded ephemeral public key}
	 */
	@ApiField("ephemeral_public_key")
	private String ephemeralPublicKey;

	/**
	 * 加密用的WAGU秘钥公钥Hash。
{Base64 encoded SHA-256 hash of the encoded public key used to encrypt}
	 */
	@ApiField("public_key_hash")
	private String publicKeyHash;

	/**
	 * 加密版本。{Encryption version. }
{ECC椭圆曲线算法+DH交换秘钥。Elliptic Curve Cryptography Version 2}
	 */
	@ApiField("version")
	private String version;

	public String getData() {
		return this.data;
	}
	public void setData(String data) {
		this.data = data;
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

	public String getVersion() {
		return this.version;
	}
	public void setVersion(String version) {
		this.version = version;
	}

}
