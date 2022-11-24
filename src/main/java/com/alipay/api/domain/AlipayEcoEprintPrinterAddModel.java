package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 易联云打印机添加对外接口服务
 *
 * @author auto create
 * @since 1.0, 2019-09-06 18:13:00
 */
public class AlipayEcoEprintPrinterAddModel extends AlipayObject {

	private static final long serialVersionUID = 2744951325625252285L;

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

	/**
	 * 终端秘钥
	 */
	@ApiField("msign")
	private String msign;

	/**
	 * 绑定手机号
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 打印机名称
	 */
	@ApiField("print_name")
	private String printName;

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

	public String getMsign() {
		return this.msign;
	}
	public void setMsign(String msign) {
		this.msign = msign;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPrintName() {
		return this.printName;
	}
	public void setPrintName(String printName) {
		this.printName = printName;
	}

}
