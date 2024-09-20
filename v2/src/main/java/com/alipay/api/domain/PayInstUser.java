package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 微信用户信息
 *
 * @author auto create
 * @since 1.0, 2024-04-24 10:53:59
 */
public class PayInstUser extends AlipayObject {

	private static final long serialVersionUID = 2555556633523527523L;

	/**
	 * mobile_sha_256标识用户唯一信息，通过用户手机号SHA256 哈希后获得
	 */
	@ApiField("mobile_sha_256")
	private String mobileSha256;

	/**
	 * 用户ID信息，该字段拼接方式：appID#openID
	 */
	@ApiField("user_id")
	private String userId;

	public String getMobileSha256() {
		return this.mobileSha256;
	}
	public void setMobileSha256(String mobileSha256) {
		this.mobileSha256 = mobileSha256;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
