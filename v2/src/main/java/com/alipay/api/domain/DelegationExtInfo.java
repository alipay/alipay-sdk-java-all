package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 委托扩展信息
 *
 * @author auto create
 * @since 1.0, 2026-07-23 11:20:55
 */
public class DelegationExtInfo extends AlipayObject {

	private static final long serialVersionUID = 4112385264979344321L;

	/**
	 * 客户端ip
	 */
	@ApiField("client_ip")
	private String clientIp;

	/**
	 * 用户发现使用token
	 */
	@ApiField("user_token")
	private String userToken;

	/**
	 * 用于用发现类型
	 */
	@ApiField("user_token_type")
	private String userTokenType;

	public String getClientIp() {
		return this.clientIp;
	}
	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
	}

	public String getUserToken() {
		return this.userToken;
	}
	public void setUserToken(String userToken) {
		this.userToken = userToken;
	}

	public String getUserTokenType() {
		return this.userTokenType;
	}
	public void setUserTokenType(String userTokenType) {
		this.userTokenType = userTokenType;
	}

}
