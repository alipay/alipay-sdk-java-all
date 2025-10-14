package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益服务信息
 *
 * @author auto create
 * @since 1.0, 2025-08-14 13:50:22
 */
public class EquityServiceInfo extends AlipayObject {

	private static final long serialVersionUID = 1681942342428967596L;

	/**
	 * 权益服务代码
	 */
	@ApiField("service_code")
	private String serviceCode;

	/**
	 * 权益服务名称
	 */
	@ApiField("service_name")
	private String serviceName;

	public String getServiceCode() {
		return this.serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public String getServiceName() {
		return this.serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

}
