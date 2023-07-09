package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.passinfo.logininfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-08-26 14:00:31
 */
public class AnttechOceanbasePassinfoLogininfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7452535388866731218L;

	/** 
	 * 自然实体id。当获取个人信息时为空，当获取企业信息时是企业id。
	 */
	@ApiField("entity_id")
	private String entityId;

	/** 
	 * 通行证ID
	 */
	@ApiField("passport_id")
	private String passportId;

	/** 
	 * 自然实体类型。MEMBER（个人账号）、MASTER（企业主账号）
	 */
	@ApiField("role_type")
	private String roleType;

	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}
	public String getEntityId( ) {
		return this.entityId;
	}

	public void setPassportId(String passportId) {
		this.passportId = passportId;
	}
	public String getPassportId( ) {
		return this.passportId;
	}

	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}
	public String getRoleType( ) {
		return this.roleType;
	}

}
