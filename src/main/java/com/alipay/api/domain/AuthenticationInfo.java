package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 公共业务信息
 *
 * @author auto create
 * @since 1.0, 2017-11-28 15:46:58
 */
public class AuthenticationInfo extends AlipayObject {

	private static final long serialVersionUID = 2372962234652484722L;

	/**
	 * 身份认证场景信息
	 */
	@ApiField("authentication_scene")
	private AuthenticationScene authenticationScene;

	/**
	 * 标识一笔业务，业务方生成
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 业务扩展信息
	 */
	@ApiField("extend_info")
	private String extendInfo;

	/**
	 * 身份认证业务用户主体信息
	 */
	@ApiField("principal_info")
	private PrincipalInfo principalInfo;

	public AuthenticationScene getAuthenticationScene() {
		return this.authenticationScene;
	}
	public void setAuthenticationScene(AuthenticationScene authenticationScene) {
		this.authenticationScene = authenticationScene;
	}

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getExtendInfo() {
		return this.extendInfo;
	}
	public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
	}

	public PrincipalInfo getPrincipalInfo() {
		return this.principalInfo;
	}
	public void setPrincipalInfo(PrincipalInfo principalInfo) {
		this.principalInfo = principalInfo;
	}

}
