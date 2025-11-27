package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.commercial.shopstaff.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-05 19:57:35
 */
public class AlipayCommerceMedicalCommercialShopstaffQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8448278225828422513L;

	/** 
	 * 店员支付宝登录账号，手机号
	 */
	@ApiField("alipay_logon_id")
	private String alipayLogonId;

	/** 
	 * 描述店员角色信息
角色：
ADMIN 管理员
MEMBER 店员
	 */
	@ApiField("role")
	private String role;

	/** 
	 * 医疗门店店员名称
	 */
	@ApiField("staff_name")
	private String staffName;

	public void setAlipayLogonId(String alipayLogonId) {
		this.alipayLogonId = alipayLogonId;
	}
	public String getAlipayLogonId( ) {
		return this.alipayLogonId;
	}

	public void setRole(String role) {
		this.role = role;
	}
	public String getRole( ) {
		return this.role;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public String getStaffName( ) {
		return this.staffName;
	}

}
