package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.passport.huaweimp.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-09 15:22:29
 */
public class AnttechOceanbasePassportHuaweimpCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4385442514597758966L;

	/** 
	 * 加密后的账号
	 */
	@ApiField("account_name")
	private String accountName;

	/** 
	 * 实体角色id
	 */
	@ApiField("entity_role_id")
	private String entityRoleId;

	/** 
	 * true时，accountName为空
false时，accountName为实际注册使用账号
	 */
	@ApiField("idempotent")
	private Boolean idempotent;

	/** 
	 * 通行证id，用户UID
	 */
	@ApiField("passport_id")
	private String passportId;

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getAccountName( ) {
		return this.accountName;
	}

	public void setEntityRoleId(String entityRoleId) {
		this.entityRoleId = entityRoleId;
	}
	public String getEntityRoleId( ) {
		return this.entityRoleId;
	}

	public void setIdempotent(Boolean idempotent) {
		this.idempotent = idempotent;
	}
	public Boolean getIdempotent( ) {
		return this.idempotent;
	}

	public void setPassportId(String passportId) {
		this.passportId = passportId;
	}
	public String getPassportId( ) {
		return this.passportId;
	}

}
