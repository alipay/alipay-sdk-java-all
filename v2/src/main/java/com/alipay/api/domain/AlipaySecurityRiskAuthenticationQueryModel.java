package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 身份认证业务查询接口
 *
 * @author auto create
 * @since 1.0, 2022-12-07 11:43:32
 */
public class AlipaySecurityRiskAuthenticationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6819134237691293337L;

	/**
	 * 身份安全业务场景信息
	 */
	@ApiField("authentication_scene")
	private AuthenticationScene authenticationScene;

	/**
	 * 业务ID
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 业务信息
	 */
	@ApiField("biz_info")
	private String bizInfo;

	/**
	 * 身份安全业务初始化后生成的token
	 */
	@ApiField("token_id")
	private String tokenId;

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

	public String getBizInfo() {
		return this.bizInfo;
	}
	public void setBizInfo(String bizInfo) {
		this.bizInfo = bizInfo;
	}

	public String getTokenId() {
		return this.tokenId;
	}
	public void setTokenId(String tokenId) {
		this.tokenId = tokenId;
	}

}
