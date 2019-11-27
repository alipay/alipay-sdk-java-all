package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开卡返回参数
 *
 * @author auto create
 * @since 1.0, 2019-11-07 21:46:28
 */
public class OpenApiPrepareProvisioningBundleResponseParams extends AlipayObject {

	private static final long serialVersionUID = 4294254394915459615L;

	/**
	 * 激活数据
	 */
	@ApiField("activation_data")
	private String activationData;

	/**
	 * 加密后的卡数据
	 */
	@ApiField("encrypted_pass_data")
	private String encryptedPassData;

	/**
	 * 临时加密公钥
	 */
	@ApiField("ephemeral_public_key")
	private String ephemeralPublicKey;

	public String getActivationData() {
		return this.activationData;
	}
	public void setActivationData(String activationData) {
		this.activationData = activationData;
	}

	public String getEncryptedPassData() {
		return this.encryptedPassData;
	}
	public void setEncryptedPassData(String encryptedPassData) {
		this.encryptedPassData = encryptedPassData;
	}

	public String getEphemeralPublicKey() {
		return this.ephemeralPublicKey;
	}
	public void setEphemeralPublicKey(String ephemeralPublicKey) {
		this.ephemeralPublicKey = ephemeralPublicKey;
	}

}
