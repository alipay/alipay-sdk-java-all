package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询刷脸用户开通详细信息
 *
 * @author auto create
 * @since 1.0, 2025-05-29 16:02:01
 */
public class AlipayCommerceEducateSceneTokenQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5124911568147448424L;

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
