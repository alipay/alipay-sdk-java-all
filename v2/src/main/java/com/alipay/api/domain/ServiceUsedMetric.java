package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-01-04 15:22:42
 */
public class ServiceUsedMetric extends AlipayObject {

	private static final long serialVersionUID = 5757468458961926779L;

	/**
	 * 服务名称
	 */
	@ApiField("service_name")
	private String serviceName;

	/**
	 * 服务使用用户人数
	 */
	@ApiField("service_used_cnt")
	private Long serviceUsedCnt;

	public String getServiceName() {
		return this.serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public Long getServiceUsedCnt() {
		return this.serviceUsedCnt;
	}
	public void setServiceUsedCnt(Long serviceUsedCnt) {
		this.serviceUsedCnt = serviceUsedCnt;
	}

}
