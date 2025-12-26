package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户信息
 *
 * @author auto create
 * @since 1.0, 2025-11-19 10:43:58
 */
public class TaxUserDto extends AlipayObject {

	private static final long serialVersionUID = 3143259948967849873L;

	/**
	 * 用户Id
	 */
	@ApiField("payee_user_open_id")
	private String payeeUserOpenId;

	/**
	 * The unique ID that is assigned by the MPP to identify a user.
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * The ID that the user uses to log in to the MPP platform. The ID is assigned by the MPP and is desensitized.
	 */
	@ApiField("user_login_id")
	private String userLoginId;

	/**
	 * 用户姓名
	 */
	@ApiField("user_name")
	private TaxUserNameDto userName;

	public String getPayeeUserOpenId() {
		return this.payeeUserOpenId;
	}
	public void setPayeeUserOpenId(String payeeUserOpenId) {
		this.payeeUserOpenId = payeeUserOpenId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserLoginId() {
		return this.userLoginId;
	}
	public void setUserLoginId(String userLoginId) {
		this.userLoginId = userLoginId;
	}

	public TaxUserNameDto getUserName() {
		return this.userName;
	}
	public void setUserName(TaxUserNameDto userName) {
		this.userName = userName;
	}

}
