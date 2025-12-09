package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 停车场可提供服务信息和链接
 *
 * @author auto create
 * @since 1.0, 2024-08-12 14:48:17
 */
public class ParkingLotServiceInfo extends AlipayObject {

	private static final long serialVersionUID = 4869691468457674814L;

	/**
	 * 在线缴费服务名称
	 */
	@ApiField("service_name")
	private String serviceName;

	/**
	 * 停车场可提供的服务类型
发票服务：INVOICE_SERVICE
优惠套餐: DISCOUNT_PACKAGE
预约停车: RESERVED_PARKING
	 */
	@ApiField("service_type")
	private String serviceType;

	/**
	 * 商户提供服务对应的跳转链接
	 */
	@ApiField("service_url")
	private String serviceUrl;

	public String getServiceName() {
		return this.serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getServiceType() {
		return this.serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getServiceUrl() {
		return this.serviceUrl;
	}
	public void setServiceUrl(String serviceUrl) {
		this.serviceUrl = serviceUrl;
	}

}
