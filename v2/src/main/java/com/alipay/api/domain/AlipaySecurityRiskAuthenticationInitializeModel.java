package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 身份认证业务初始化接口
 *
 * @author auto create
 * @since 1.0, 2017-11-28 15:46:58
 */
public class AlipaySecurityRiskAuthenticationInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 2247523999758498996L;

	/**
	 * 用于身份安全业务初始化的公共入参
	 */
	@ApiField("authentication_info")
	private AuthenticationInfo authenticationInfo;

	/**
	 * 用于身份安全业务初始化的业务入参
	 */
	@ApiField("biz_info")
	private String bizInfo;

	/**
	 * 环境信息，包含设备信息、APP版本等
	 */
	@ApiField("env_info")
	private String envInfo;

	public AuthenticationInfo getAuthenticationInfo() {
		return this.authenticationInfo;
	}
	public void setAuthenticationInfo(AuthenticationInfo authenticationInfo) {
		this.authenticationInfo = authenticationInfo;
	}

	public String getBizInfo() {
		return this.bizInfo;
	}
	public void setBizInfo(String bizInfo) {
		this.bizInfo = bizInfo;
	}

	public String getEnvInfo() {
		return this.envInfo;
	}
	public void setEnvInfo(String envInfo) {
		this.envInfo = envInfo;
	}

}
