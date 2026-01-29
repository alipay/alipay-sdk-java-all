package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.hufu.auth.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:37
 */
public class AlipaySecurityRiskHufuAuthCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7332391875549747486L;

	/** 
	 * 额外信息
	 */
	@ApiField("info")
	private String info;

	/** 
	 * 调用应用传入的serial
	 */
	@ApiField("serial")
	private String serial;

	/** 
	 * 虎符创建成功的token，有效时间3分钟
	 */
	@ApiField("token")
	private String token;

	public void setInfo(String info) {
		this.info = info;
	}
	public String getInfo( ) {
		return this.info;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}
	public String getSerial( ) {
		return this.serial;
	}

	public void setToken(String token) {
		this.token = token;
	}
	public String getToken( ) {
		return this.token;
	}

}
