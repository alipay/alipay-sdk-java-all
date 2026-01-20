package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-01-04 15:22:42
 */
public class ServiceTrendsMetric extends AlipayObject {

	private static final long serialVersionUID = 4428761414737181642L;

	/**
	 * 趋势类型
	 */
	@ApiField("aggr_day")
	private String aggrDay;

	/**
	 * 数据日期
	 */
	@ApiField("data_dt")
	private String dataDt;

	/**
	 * 服务点击PV
	 */
	@ApiField("service_pv")
	private Long servicePv;

	/**
	 * 服务UV
	 */
	@ApiField("service_uv")
	private Long serviceUv;

	public String getAggrDay() {
		return this.aggrDay;
	}
	public void setAggrDay(String aggrDay) {
		this.aggrDay = aggrDay;
	}

	public String getDataDt() {
		return this.dataDt;
	}
	public void setDataDt(String dataDt) {
		this.dataDt = dataDt;
	}

	public Long getServicePv() {
		return this.servicePv;
	}
	public void setServicePv(Long servicePv) {
		this.servicePv = servicePv;
	}

	public Long getServiceUv() {
		return this.serviceUv;
	}
	public void setServiceUv(Long serviceUv) {
		this.serviceUv = serviceUv;
	}

}
