package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.privilegerecord.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-02-03 19:42:43
 */
public class AlipayUserPrivilegerecordQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2183115652339788793L;

	/** 
	 * 特权使用状态
	 */
	@ApiField("privilege_usage_status")
	private String privilegeUsageStatus;

	/** 
	 * 特权对应的凭证码
	 */
	@ApiField("voucher_code")
	private String voucherCode;

	public void setPrivilegeUsageStatus(String privilegeUsageStatus) {
		this.privilegeUsageStatus = privilegeUsageStatus;
	}
	public String getPrivilegeUsageStatus( ) {
		return this.privilegeUsageStatus;
	}

	public void setVoucherCode(String voucherCode) {
		this.voucherCode = voucherCode;
	}
	public String getVoucherCode( ) {
		return this.voucherCode;
	}

}
