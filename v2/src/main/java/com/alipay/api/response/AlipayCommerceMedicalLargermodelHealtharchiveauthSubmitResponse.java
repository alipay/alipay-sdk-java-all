package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.largermodel.healtharchiveauth.submit response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-07 12:32:37
 */
public class AlipayCommerceMedicalLargermodelHealtharchiveauthSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 1411483141611811384L;

	/** 
	 * 权限编码
	 */
	@ApiField("auth_code")
	private String authCode;

	/** 
	 * 机构id
	 */
	@ApiField("org_id")
	private String orgId;

	/** 
	 * 场景码
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/** 
	 * 授权状态
	 */
	@ApiField("status")
	private String status;

	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}
	public String getAuthCode( ) {
		return this.authCode;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
	public String getOrgId( ) {
		return this.orgId;
	}

	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}
	public String getSceneCode( ) {
		return this.sceneCode;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
