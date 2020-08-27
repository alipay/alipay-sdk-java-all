package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企迈易联云打印任务提交
 *
 * @author auto create
 * @since 1.0, 2019-10-18 16:25:49
 */
public class AlipayDataPrinterTaskSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 1275694633867274593L;

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
	 * 打印内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 设备sn号
	 */
	@ApiField("device_sn")
	private String deviceSn;

	/**
	 * 订单号
	 */
	@ApiField("origin_id")
	private String originId;

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

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getDeviceSn() {
		return this.deviceSn;
	}
	public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
	}

	public String getOriginId() {
		return this.originId;
	}
	public void setOriginId(String originId) {
		this.originId = originId;
	}

}
