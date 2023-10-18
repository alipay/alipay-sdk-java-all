package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 身份认证业务取消接口
 *
 * @author auto create
 * @since 1.0, 2017-11-27 13:52:36
 */
public class AlipaySecurityRiskAuthenticationCancelModel extends AlipayObject {

	private static final long serialVersionUID = 3256688194331644923L;

	/**
	 * 身份认证场景信息
	 */
	@ApiField("authentication_scene")
	private AuthenticationScene authenticationScene;

	/**
	 * 业务流水号，与初始化接口保持一致
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 业务参数
	 */
	@ApiField("biz_info")
	private String bizInfo;

	/**
	 * 身份认证初始化返回token_id
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
