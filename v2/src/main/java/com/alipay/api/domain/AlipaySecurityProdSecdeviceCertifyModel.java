package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 可信设备认证校验
 *
 * @author auto create
 * @since 1.0, 2026-04-21 11:23:45
 */
public class AlipaySecurityProdSecdeviceCertifyModel extends AlipayObject {

	private static final long serialVersionUID = 1257944848395137241L;

	/**
	 * 初始化令牌
	 */
	@ApiField("ifaa_token")
	private String ifaaToken;

	/**
	 * 协议版本
	 */
	@ApiField("ifaa_version")
	private String ifaaVersion;

	/**
	 * 验证数据
	 */
	@ApiField("ifaf_message")
	private String ifafMessage;

	public String getIfaaToken() {
		return this.ifaaToken;
	}
	public void setIfaaToken(String ifaaToken) {
		this.ifaaToken = ifaaToken;
	}

	public String getIfaaVersion() {
		return this.ifaaVersion;
	}
	public void setIfaaVersion(String ifaaVersion) {
		this.ifaaVersion = ifaaVersion;
	}

	public String getIfafMessage() {
		return this.ifafMessage;
	}
	public void setIfafMessage(String ifafMessage) {
		this.ifafMessage = ifafMessage;
	}

}
