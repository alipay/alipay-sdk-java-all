package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企迈易联云获取token接口
 *
 * @author auto create
 * @since 1.0, 2019-10-17 19:21:53
 */
public class AlipayDataPrinterTokenGetModel extends AlipayObject {

	private static final long serialVersionUID = 8185648161964722585L;

	/**
	 * 应用id
	 */
	@ApiField("client_id")
	private String clientId;

	/**
	 * 授与方式
	 */
	@ApiField("grant_type")
	private String grantType;

	/**
	 * 权限
	 */
	@ApiField("scope")
	private String scope;

	/**
	 * 应用秘钥
	 */
	@ApiField("secret")
	private String secret;

	public String getClientId() {
		return this.clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getGrantType() {
		return this.grantType;
	}
	public void setGrantType(String grantType) {
		this.grantType = grantType;
	}

	public String getScope() {
		return this.scope;
	}
	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getSecret() {
		return this.secret;
	}
	public void setSecret(String secret) {
		this.secret = secret;
	}

}
