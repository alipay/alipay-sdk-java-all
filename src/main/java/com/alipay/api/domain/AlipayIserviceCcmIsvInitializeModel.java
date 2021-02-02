package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ccm isv注册接口
 *
 * @author auto create
 * @since 1.0, 2020-11-24 17:05:59
 */
public class AlipayIserviceCcmIsvInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 8336126487922718859L;

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
