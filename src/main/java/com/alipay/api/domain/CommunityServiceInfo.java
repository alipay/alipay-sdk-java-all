package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小区服务信息
 *
 * @author auto create
 * @since 1.0, 2021-01-27 20:04:50
 */
public class CommunityServiceInfo extends AlipayObject {

	private static final long serialVersionUID = 7775899639616237965L;

	/**
	 * 服务类型
	 */
	@ApiField("service_type")
	private String serviceType;

	/**
	 * 服务状态
	 */
	@ApiField("status")
	private String status;

	public String getServiceType() {
		return this.serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
