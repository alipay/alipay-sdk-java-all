package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 流量位插件广告效果查询
 *
 * @author auto create
 * @since 1.0, 2021-07-01 19:47:34
 */
public class AlipayOpenMiniResourceDataQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7853145782277752259L;

	/**
	 * 插件appId
	 */
	@ApiField("plugin_id")
	private String pluginId;

	/**
	 * 数据日期，格式为yyyyMMdd
	 */
	@ApiField("report_date")
	private String reportDate;

	/**
	 * 创建流量位时返回的流量位id
	 */
	@ApiField("resource_id")
	private String resourceId;

	public String getPluginId() {
		return this.pluginId;
	}
	public void setPluginId(String pluginId) {
		this.pluginId = pluginId;
	}

	public String getReportDate() {
		return this.reportDate;
	}
	public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
	}

	public String getResourceId() {
		return this.resourceId;
	}
	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

}
