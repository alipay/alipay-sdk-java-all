package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询刷脸用户开通详细信息
 *
 * @author auto create
 * @since 1.0, 2025-12-17 10:47:50
 */
public class AlipayCommerceEducateSceneTokenQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2728179241163428444L;

	/**
	 * 用于查询用户详情的凭证
	 */
	@ApiField("user_token")
	private String userToken;

	public String getUserToken() {
		return this.userToken;
	}
	public void setUserToken(String userToken) {
		this.userToken = userToken;
	}

}
