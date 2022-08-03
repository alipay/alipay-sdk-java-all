package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 社区门禁公钥对象
 *
 * @author auto create
 * @since 1.0, 2021-01-13 17:05:02
 */
public class AccessPublicKey extends AlipayObject {

	private static final long serialVersionUID = 1686358856485658743L;

	/**
	 * 公钥id
	 */
	@ApiField("key_id")
	private Long keyId;

	/**
	 * 公钥内容
	 */
	@ApiField("public_key")
	private String publicKey;

	public Long getKeyId() {
		return this.keyId;
	}
	public void setKeyId(Long keyId) {
		this.keyId = keyId;
	}

	public String getPublicKey() {
		return this.publicKey;
	}
	public void setPublicKey(String publicKey) {
		this.publicKey = publicKey;
	}

}
