package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 易联云打印对外接口服务
 *
 * @author auto create
 * @since 1.0, 2019-09-06 17:56:47
 */
public class AlipayEcoEprintTaskSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 6485165358149273258L;

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
	 * 打印内容
	 */
	@ApiField("content")
	private String content;

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

	/**
	 * 业务内部编号
	 */
	@ApiField("origin_id")
	private String originId;

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

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
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

	public String getOriginId() {
		return this.originId;
	}
	public void setOriginId(String originId) {
		this.originId = originId;
	}

}
