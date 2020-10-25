package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ApplePay卡信息
 *
 * @author auto create
 * @since 1.0, 2020-07-08 11:48:07
 */
public class OpenApiProvisioningBundle extends AlipayObject {

	private static final long serialVersionUID = 4267438212879156923L;

	/**
	 * 加密后的数据
	 */
	@ApiField("data")
	private String data;

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

	/**
	 * EC_v2
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
