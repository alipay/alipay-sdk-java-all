package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 内容风险感知接口服务
 *
 * @author auto create
 * @since 1.0, 2022-12-01 16:03:45
 */
public class AlipaySecurityRiskContentPerceptionSendModel extends AlipayObject {

	private static final long serialVersionUID = 3144421529219848623L;

	/**
	 * 业务时间。日期格式化后的字符串。
	 */
	@ApiField("business_time")
	private String businessTime;

	/**
	 * 创建时间。日期格式化后的字符串，和business_time区分，标识计算引擎得出指标的时间。
	 */
	@ApiField("create_time")
	private String createTime;

	/**
	 * 持续时间。单位默认1min。
	 */
	@ApiField("duration")
	private Long duration;

	/**
	 * 风险感知度量的键
	 */
	@ApiField("metric")
	private String metric;

	/**
	 * 风险感知度量的值。对应为metric的值。通常是一个可解析的json串。
	 */
	@ApiField("value")
	private String value;

	public String getBusinessTime() {
		return this.businessTime;
	}
	public void setBusinessTime(String businessTime) {
		this.businessTime = businessTime;
	}

	public String getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public Long getDuration() {
		return this.duration;
	}
	public void setDuration(Long duration) {
		this.duration = duration;
	}

	public String getMetric() {
		return this.metric;
	}
	public void setMetric(String metric) {
		this.metric = metric;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
