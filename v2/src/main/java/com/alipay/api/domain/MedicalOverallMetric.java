package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗全局指标
 *
 * @author auto create
 * @since 1.0, 2026-01-04 15:22:42
 */
public class MedicalOverallMetric extends AlipayObject {

	private static final long serialVersionUID = 3664197797365428281L;

	/**
	 * 日均服务次数
	 */
	@ApiField("avg_service_pv_30d")
	private Long avgServicePv30d;

	public Long getAvgServicePv30d() {
		return this.avgServicePv30d;
	}
	public void setAvgServicePv30d(Long avgServicePv30d) {
		this.avgServicePv30d = avgServicePv30d;
	}

}
