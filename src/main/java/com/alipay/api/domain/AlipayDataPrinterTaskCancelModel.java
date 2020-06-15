package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企迈易联云取消一条未打印接口
 *
 * @author auto create
 * @since 1.0, 2019-10-18 10:58:59
 */
public class AlipayDataPrinterTaskCancelModel extends AlipayObject {

	private static final long serialVersionUID = 3865252194681294652L;

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

	/**
	 * 订单号
	 */
	@ApiField("order_id")
	private String orderId;

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

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

}
