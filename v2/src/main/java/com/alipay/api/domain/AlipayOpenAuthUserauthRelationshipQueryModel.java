package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户授权关系查询
 *
 * @author auto create
 * @since 1.0, 2023-02-01 17:26:56
 */
public class AlipayOpenAuthUserauthRelationshipQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1311892187622664693L;

	/**
	 * 蚂蚁统一会员ID，蚂蚁统一会员ID，如果已完成openid改造，则此值必传
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 查询授权关系所关联的scope，半角逗号分隔的列表，且不允许有重复值
	 */
	@ApiField("scopes")
	private String scopes;

	/**
	 * 蚂蚁统一会员ID，如果未开启openid改造，则此值必传
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

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
