package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝用户等级信息，暂时包含用户等级和登陆账号
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:41
 */
public class AlipayUserLevelInfo extends AlipayObject {

	private static final long serialVersionUID = 2425165572225253652L;

	/**
	 * 支付宝用户登陆账号；邮箱优先，手机号次之
	 */
	@ApiField("login_id")
	private String loginId;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户等级：可选5、4、3、2、1、0；等级5最高，1最低，0标示无法判断
	 */
	@ApiField("user_level")
	private String userLevel;

	public String getLoginId() {
		return this.loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserLevel() {
		return this.userLevel;
	}
	public void setUserLevel(String userLevel) {
		this.userLevel = userLevel;
	}

}
