package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户授权关系校验
 *
 * @author auto create
 * @since 1.0, 2019-10-12 16:38:08
 */
public class AlipayOpenAuthUserauthRelationshipCertifyModel extends AlipayObject {

	private static final long serialVersionUID = 6684977872577264415L;

	/**
	 * 操作接口名字
	 */
	@ApiField("action")
	private String action;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
