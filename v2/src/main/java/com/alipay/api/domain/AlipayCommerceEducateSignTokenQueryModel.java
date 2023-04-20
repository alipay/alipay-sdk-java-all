package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 扫脸信息查询
 *
 * @author auto create
 * @since 1.0, 2022-11-17 14:54:16
 */
public class AlipayCommerceEducateSignTokenQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1369999377364719288L;

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
