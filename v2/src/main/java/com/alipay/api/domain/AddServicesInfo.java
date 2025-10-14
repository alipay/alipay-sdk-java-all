package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 增值服务信息
 *
 * @author auto create
 * @since 1.0, 2024-11-14 15:17:09
 */
public class AddServicesInfo extends AlipayObject {

	private static final long serialVersionUID = 7892942711836676271L;

	/**
	 * 增值服务名称
	 */
	@ApiField("service_name")
	private String serviceName;

	/**
	 * 增值服务价格 单位元
	 */
	@ApiField("service_price")
	private String servicePrice;

	public String getServiceName() {
		return this.serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getServicePrice() {
		return this.servicePrice;
	}
	public void setServicePrice(String servicePrice) {
		this.servicePrice = servicePrice;
	}

}
