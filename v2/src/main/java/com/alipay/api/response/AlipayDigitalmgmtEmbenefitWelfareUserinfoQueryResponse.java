package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.digitalmgmt.embenefit.welfare.userinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-27 10:57:57
 */
public class AlipayDigitalmgmtEmbenefitWelfareUserinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8457355183963681179L;

	/** 
	 * 登录人生日
	 */
	@ApiField("birthday")
	private String birthday;

	/** 
	 * 员工的登录渠道唯一id
	 */
	@ApiField("emp_login_id")
	private String empLoginId;

	/** 
	 * 员工ID
	 */
	@ApiField("emp_sid")
	private String empSid;

	/** 
	 * 性别
	 */
	@ApiField("gender")
	private String gender;

	/** 
	 * 是否有权限
	 */
	@ApiField("has_auth")
	private Boolean hasAuth;

	/** 
	 * 登录人手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/** 
	 * 登录人姓名
	 */
	@ApiField("name")
	private String name;

	/** 
	 * 租户编码
	 */
	@ApiField("tenant_code")
	private String tenantCode;

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getBirthday( ) {
		return this.birthday;
	}

	public void setEmpLoginId(String empLoginId) {
		this.empLoginId = empLoginId;
	}
	public String getEmpLoginId( ) {
		return this.empLoginId;
	}

	public void setEmpSid(String empSid) {
		this.empSid = empSid;
	}
	public String getEmpSid( ) {
		return this.empSid;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getGender( ) {
		return this.gender;
	}

	public void setHasAuth(Boolean hasAuth) {
		this.hasAuth = hasAuth;
	}
	public Boolean getHasAuth( ) {
		return this.hasAuth;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getMobile( ) {
		return this.mobile;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName( ) {
		return this.name;
	}

	public void setTenantCode(String tenantCode) {
		this.tenantCode = tenantCode;
	}
	public String getTenantCode( ) {
		return this.tenantCode;
	}

}
