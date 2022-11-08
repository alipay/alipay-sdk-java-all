package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 玩一玩游戏业务指标上报
 *
 * @author auto create
 * @since 1.0, 2022-10-10 17:38:07
 */
public class AlipayUserGamecenterMetricSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 7539585697941786912L;

	/**
	 * 游戏侧业务指标内容，格式为json，key为指标编码，value为指标值
	 */
	@ApiField("metric_content")
	private String metricContent;

	/**
	 * 指标上报时间
	 */
	@ApiField("metric_date")
	private Date metricDate;

	public String getMetricContent() {
		return this.metricContent;
	}
	public void setMetricContent(String metricContent) {
		this.metricContent = metricContent;
	}

	public Date getMetricDate() {
		return this.metricDate;
	}
	public void setMetricDate(Date metricDate) {
		this.metricDate = metricDate;
	}

}
