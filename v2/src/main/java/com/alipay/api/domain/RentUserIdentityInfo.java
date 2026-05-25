package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户身份信息
 *
 * @author auto create
 * @since 1.0, 2026-04-24 10:13:52
 */
public class RentUserIdentityInfo extends AlipayObject {

	private static final long serialVersionUID = 2874577618179469128L;

	/**
	 * 加密的用户身份信息内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 用户身份信息安全密钥，用于对content进行解密
	 */
	@ApiField("secure_key")
	private String secureKey;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getSecureKey() {
		return this.secureKey;
	}
	public void setSecureKey(String secureKey) {
		this.secureKey = secureKey;
	}

}
