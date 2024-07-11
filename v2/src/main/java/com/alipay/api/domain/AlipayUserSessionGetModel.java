package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 登录凭证校验
 *
 * @author auto create
 * @since 1.0, 2023-05-30 10:49:55
 */
public class AlipayUserSessionGetModel extends AlipayObject {

	private static final long serialVersionUID = 6538419658793526155L;

	/**
	 * 代理的小程序appid，用于生成openId和unionId
	 */
	@ApiField("agent_app_id")
	private String agentAppId;

	/**
	 * 登录时调用my.authLogin获取的 code
	 */
	@ApiField("login_code")
	private String loginCode;

	public String getAgentAppId() {
		return this.agentAppId;
	}
	public void setAgentAppId(String agentAppId) {
		this.agentAppId = agentAppId;
	}

	public String getLoginCode() {
		return this.loginCode;
	}
	public void setLoginCode(String loginCode) {
		this.loginCode = loginCode;
	}

}
