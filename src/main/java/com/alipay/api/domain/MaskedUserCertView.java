package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户身份脱敏信息视图
 *
 * @author auto create
 * @since 1.0, 2019-01-26 16:33:40
 */
public class MaskedUserCertView extends AlipayObject {

	private static final long serialVersionUID = 8589358963355435195L;

	/**
	 * 是否通过实名认证， 是 - T； 否 - F
	 */
	@ApiField("is_certified")
	private String isCertified;

	/**
	 * 支付宝userId
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 脱敏后的姓名
	 */
	@ApiField("user_name")
	private String userName;

	public String getIsCertified() {
		return this.isCertified;
	}
	public void setIsCertified(String isCertified) {
		this.isCertified = isCertified;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
