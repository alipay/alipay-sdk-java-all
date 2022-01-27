package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取终端状态接口对外
 *
 * @author auto create
 * @since 1.0, 2019-09-06 17:57:20
 */
public class AlipayEcoPrinterStatusQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2593225554955879814L;

	/**
	 * 应用ID
	 */
	@ApiField("client_id")
	private String clientId;

	/**
	 * 应用Secret
	 */
	@ApiField("client_secret")
	private String clientSecret;

	/**
	 * 应用访问凭证
	 */
	@ApiField("eprint_token")
	private String eprintToken;

	/**
	 * 终端号
	 */
	@ApiField("machine_code")
	private String machineCode;

	public String getClientId() {
		return this.clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getClientSecret() {
		return this.clientSecret;
	}
	public void setClientSecret(String clientSecret) {
		this.clientSecret = clientSecret;
	}

	public String getEprintToken() {
		return this.eprintToken;
	}
	public void setEprintToken(String eprintToken) {
		this.eprintToken = eprintToken;
	}

	public String getMachineCode() {
		return this.machineCode;
	}
	public void setMachineCode(String machineCode) {
		this.machineCode = machineCode;
	}

}
