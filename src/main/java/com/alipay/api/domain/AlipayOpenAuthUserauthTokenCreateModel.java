package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户授权token创建接口
 *
 * @author auto create
 * @since 1.0, 2022-09-22 14:25:32
 */
public class AlipayOpenAuthUserauthTokenCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5276345327723939471L;

	/**
	 * 生成token所关联的scope，半角逗号分隔的列表
	 */
	@ApiField("scopes")
	private String scopes;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getScopes() {
		return this.scopes;
	}
	public void setScopes(String scopes) {
		this.scopes = scopes;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
