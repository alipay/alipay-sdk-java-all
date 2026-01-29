package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 放款服务类型
 *
 * @author auto create
 * @since 1.0, 2026-01-08 11:02:57
 */
public class CarfinLendServiceInfo extends AlipayObject {

	private static final long serialVersionUID = 5368719458515167238L;

	/**
	 * 服务类型
ST_PRO：车抵贷pro
ST_STD：车抵贷std
ST_PLUS：车抵贷plus
	 */
	@ApiField("service_type")
	private String serviceType;

	/**
	 * 服务类型版本
	 */
	@ApiField("service_type_version")
	private String serviceTypeVersion;

	public String getServiceType() {
		return this.serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getServiceTypeVersion() {
		return this.serviceTypeVersion;
	}
	public void setServiceTypeVersion(String serviceTypeVersion) {
		this.serviceTypeVersion = serviceTypeVersion;
	}

}
