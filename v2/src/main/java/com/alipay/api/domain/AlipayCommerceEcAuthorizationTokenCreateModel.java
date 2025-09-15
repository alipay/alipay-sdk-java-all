package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生成授权令牌
 *
 * @author auto create
 * @since 1.0, 2024-08-15 19:43:24
 */
public class AlipayCommerceEcAuthorizationTokenCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8825773379344193111L;

	/**
	 * 授权码，和刷新令牌参数二选一
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 员工id
	 */
	@ApiField("employee_id")
	private String employeeId;

	/**
	 * 企业id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 刷新令牌，和授权码参数二选一
	 */
	@ApiField("refresh_token")
	private String refreshToken;

	public String getAuthCode() {
		return this.authCode;
	}
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public String getEmployeeId() {
		return this.employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getRefreshToken() {
		return this.refreshToken;
	}
	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

}
