package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ccm isv注册接口
 *
 * @author auto create
 * @since 1.0, 2023-08-21 15:10:53
 */
public class AlipayIserviceCcmIsvInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 2239528158467885919L;

	/**
	 * 用于接入CCM iframe接口安全认证的 ISV 公钥，采用 base64 编码，秘钥对生成算法为 RSA2048。
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
