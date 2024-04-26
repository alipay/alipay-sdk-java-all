package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.user.role.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:28:36
 */
public class MybankCreditUserRoleCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4254461359636123644L;

	/** 
	 * 参与者
	 */
	@ApiField("ip_id")
	private String ipId;

	/** 
	 * 参与者会员角色号
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	public void setIpId(String ipId) {
		this.ipId = ipId;
	}
	public String getIpId( ) {
		return this.ipId;
	}

	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}
	public String getIpRoleId( ) {
		return this.ipRoleId;
	}

}
