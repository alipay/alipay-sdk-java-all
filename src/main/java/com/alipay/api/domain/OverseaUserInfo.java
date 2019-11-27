package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户信息
 *
 * @author auto create
 * @since 1.0, 2019-08-08 15:18:35
 */
public class OverseaUserInfo extends AlipayObject {

	private static final long serialVersionUID = 4841451652619176832L;

	/**
	 * 用户id，与user_id_type配合使用，暂时仅支持:
1. 阿里集团havanaId;
2. 支付宝2088开头的数字ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户id类型枚举，与user_id配合使用。取值说明：
1. HAVANA为阿里集团的havanaId；
2. ALIPAY为支付宝2088开头的数字id
	 */
	@ApiField("user_id_type")
	private String userIdType;

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserIdType() {
		return this.userIdType;
	}
	public void setUserIdType(String userIdType) {
		this.userIdType = userIdType;
	}

}
