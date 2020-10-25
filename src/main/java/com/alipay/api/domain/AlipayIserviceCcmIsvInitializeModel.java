package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ccm isv注册接口
 *
 * @author auto create
 * @since 1.0, 2020-10-19 16:44:33
 */
public class AlipayIserviceCcmIsvInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 3346345852548858488L;

	/**
	 * 用于接入ccm iframe接口安全认证的isv公钥，采用base64编码，秘钥对生成算法:RSA2048
	 */
	@ApiField("isv_pub_key")
	private String isvPubKey;

	public String getIsvPubKey() {
		return this.isvPubKey;
	}
	public void setIsvPubKey(String isvPubKey) {
		this.isvPubKey = isvPubKey;
	}

}
