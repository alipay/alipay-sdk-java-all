package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝广告报表指标详情实体
 *
 * @author auto create
 * @since 1.0, 2025-08-21 10:58:19
 */
public class AdReportMetricDetail extends AlipayObject {

	private static final long serialVersionUID = 8437464447668718944L;

	/**
	 * 指标对客描述
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 指标code(唯一值)
	 */
	@ApiField("metric_code")
	private String metricCode;

	/**
	 * 指标名称
	 */
	@ApiField("metric_name")
	private String metricName;

	/**
	 * 指标转化类型num
	 */
	@ApiField("metric_num")
	private Long metricNum;

	/**
	 * 指标类型-BASE:基础指标｜NATIVE:原生指标｜NATIVE@THREE:原生3天指标｜NATIVE@SEVEN：原生7天指标｜EXTEND：扩展指标
	 */
	@ApiField("metric_type")
	private String metricType;

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getMetricCode() {
		return this.metricCode;
	}
	public void setMetricCode(String metricCode) {
		this.metricCode = metricCode;
	}

	public String getMetricName() {
		return this.metricName;
	}
	public void setMetricName(String metricName) {
		this.metricName = metricName;
	}

	public Long getMetricNum() {
		return this.metricNum;
	}
	public void setMetricNum(Long metricNum) {
		this.metricNum = metricNum;
	}

	public String getMetricType() {
		return this.metricType;
	}
	public void setMetricType(String metricType) {
		this.metricType = metricType;
	}

}
