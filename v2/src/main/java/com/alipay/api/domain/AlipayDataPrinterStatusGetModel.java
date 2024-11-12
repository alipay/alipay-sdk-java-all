package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企迈易联云状态查询接口
 *
 * @author auto create
 * @since 1.0, 2019-10-17 19:23:37
 */
public class AlipayDataPrinterStatusGetModel extends AlipayObject {

	private static final long serialVersionUID = 7397856735555378728L;

	/**
	 * 应用token
	 */
	@ApiField("access_token")
	private String accessToken;

	/**
	 * 应用id
	 */
	@ApiField("client_id")
	private String clientId;

	/**
	 * 应用秘钥
	 */
	@ApiField("client_secret")
	private String clientSecret;

	/**
	 * 设备sn号
	 */
	@ApiField("device_sn")
	private String deviceSn;

	public String getAccessToken() {
		return this.accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

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

	public String getDeviceSn() {
		return this.deviceSn;
	}
	public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
	}

}
