package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户授权关系校验
 *
 * @author auto create
 * @since 1.0, 2022-09-22 14:26:34
 */
public class AlipayOpenAuthUserauthRelationshipCertifyModel extends AlipayObject {

	private static final long serialVersionUID = 5434518154873533836L;

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
