package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回收用户授权确认
 *
 * @author auto create
 * @since 1.0, 2025-07-02 14:25:45
 */
public class AlipayCommerceRecycleAuthConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 6424297196918721486L;

	/**
	 * 用户的支付宝登陆号，可以是手机或邮箱
	 */
	@ApiField("login_id")
	private String loginId;

	/**
	 * 场景
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 验证码
	 */
	@ApiField("verify_code")
	private String verifyCode;

	public String getLoginId() {
		return this.loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getVerifyCode() {
		return this.verifyCode;
	}
	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}

}
