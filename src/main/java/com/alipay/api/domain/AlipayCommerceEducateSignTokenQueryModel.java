package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 扫脸信息查询
 *
 * @author auto create
 * @since 1.0, 2021-01-11 16:54:35
 */
public class AlipayCommerceEducateSignTokenQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2351135572748931345L;

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
