package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 扫脸信息查询
 *
 * @author auto create
 * @since 1.0, 2022-04-27 22:33:42
 */
public class AlipayCommerceEducateSignTokenQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1695971365583562714L;

	/**
	 * 加密TOKEN
	 */
	@ApiField("token_key")
	private String tokenKey;

	public String getTokenKey() {
		return this.tokenKey;
	}
	public void setTokenKey(String tokenKey) {
		this.tokenKey = tokenKey;
	}

}
