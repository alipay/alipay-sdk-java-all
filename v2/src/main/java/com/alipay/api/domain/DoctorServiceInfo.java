package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医生服务信息
 *
 * @author auto create
 * @since 1.0, 2026-08-27 20:28:46
 */
public class DoctorServiceInfo extends AlipayObject {

	private static final long serialVersionUID = 7889895659145417354L;

	/**
	 * 服务图标
	 */
	@ApiField("service_icon")
	private String serviceIcon;

	/**
	 * 服务名称
	 */
	@ApiField("service_name")
	private String serviceName;

	/**
	 * 服务开关，1: 可用，0:不可用
	 */
	@ApiField("service_status")
	private Long serviceStatus;

	/**
	 * 服务类型
	 */
	@ApiField("service_type")
	private String serviceType;

	/**
	 * 服务链接
	 */
	@ApiField("service_url")
	private String serviceUrl;

	public String getServiceIcon() {
		return this.serviceIcon;
	}
	public void setServiceIcon(String serviceIcon) {
		this.serviceIcon = serviceIcon;
	}

	public String getServiceName() {
		return this.serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public Long getServiceStatus() {
		return this.serviceStatus;
	}
	public void setServiceStatus(Long serviceStatus) {
		this.serviceStatus = serviceStatus;
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
