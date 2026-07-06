package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.passport.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-18 17:40:20
 */
public class AnttechOceanbasePassportCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7736773279216392349L;

	/** 
	 * 实体角色id
	 */
	@ApiField("entity_role_id")
	private String entityRoleId;

	/** 
	 * 用户通行证id
	 */
	@ApiField("passport_id")
	private String passportId;

	public void setEntityRoleId(String entityRoleId) {
		this.entityRoleId = entityRoleId;
	}
	public String getEntityRoleId( ) {
		return this.entityRoleId;
	}

	public void setPassportId(String passportId) {
		this.passportId = passportId;
	}
	public String getPassportId( ) {
		return this.passportId;
	}

}
