package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝IOT-bpaas服务绑定
 *
 * @author auto create
 * @since 1.0, 2021-03-22 09:57:53
 */
public class AlipayOpenBpaasServiceBindModel extends AlipayObject {

	private static final long serialVersionUID = 4555771337676466671L;

	/**
	 * bpaas应用id
	 */
	@ApiField("bpaas_app_id")
	private String bpaasAppId;

	/**
	 * 应用版本号
	 */
	@ApiField("bpaas_app_version")
	private String bpaasAppVersion;

	/**
	 * 服务code
	 */
	@ApiField("service_code")
	private String serviceCode;

	/**
	 * 服务版本
	 */
	@ApiField("service_version")
	private String serviceVersion;

	public String getBpaasAppId() {
		return this.bpaasAppId;
	}
	public void setBpaasAppId(String bpaasAppId) {
		this.bpaasAppId = bpaasAppId;
	}

	public String getBpaasAppVersion() {
		return this.bpaasAppVersion;
	}
	public void setBpaasAppVersion(String bpaasAppVersion) {
		this.bpaasAppVersion = bpaasAppVersion;
	}

	public String getServiceCode() {
		return this.serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public String getServiceVersion() {
		return this.serviceVersion;
	}
	public void setServiceVersion(String serviceVersion) {
		this.serviceVersion = serviceVersion;
	}

}
