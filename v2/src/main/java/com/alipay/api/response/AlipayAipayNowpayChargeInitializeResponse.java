package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.aipay.nowpay.charge.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-02 00:47:51
 */
public class AlipayAipayNowpayChargeInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 3227553314636915357L;

	/** 
	 * 配置入口二维码
	 */
	@ApiField("configuration_qr_code")
	private String configurationQrCode;

	/** 
	 * 需要继续配置时返回
	 */
	@ApiField("configuration_url")
	private String configurationUrl;

	/** 
	 * 已完成配置时返回
	 */
	@ApiField("management_url")
	private String managementUrl;

	public void setConfigurationQrCode(String configurationQrCode) {
		this.configurationQrCode = configurationQrCode;
	}
	public String getConfigurationQrCode( ) {
		return this.configurationQrCode;
	}

	public void setConfigurationUrl(String configurationUrl) {
		this.configurationUrl = configurationUrl;
	}
	public String getConfigurationUrl( ) {
		return this.configurationUrl;
	}

	public void setManagementUrl(String managementUrl) {
		this.managementUrl = managementUrl;
	}
	public String getManagementUrl( ) {
		return this.managementUrl;
	}

}
