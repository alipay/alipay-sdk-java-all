package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.user.role.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-02 11:44:34
 */
public class MybankCreditUserRoleCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6752891287685487317L;

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
