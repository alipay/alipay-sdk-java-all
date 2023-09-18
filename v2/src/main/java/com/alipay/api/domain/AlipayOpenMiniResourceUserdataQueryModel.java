package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 跨端运营流量位用户维度数据查询接口
 *
 * @author auto create
 * @since 1.0, 2021-07-01 19:47:44
 */
public class AlipayOpenMiniResourceUserdataQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8744444444396528829L;

	/**
	 * 插件appId
	 */
	@ApiField("plugin_id")
	private String pluginId;

	/**
	 * 用户画像类别，可选值为：user_age(年龄)、user_gender(性别)、resident_city(城市)、active_hour(活跃时间-小时)
	 */
	@ApiField("profile_type")
	private String profileType;

	/**
	 * 需要查询的日期，格式: yyyyMMdd
	 */
	@ApiField("report_date")
	private String reportDate;

	public String getPluginId() {
		return this.pluginId;
	}
	public void setPluginId(String pluginId) {
		this.pluginId = pluginId;
	}

	public String getProfileType() {
		return this.profileType;
	}
	public void setProfileType(String profileType) {
		this.profileType = profileType;
	}

	public String getReportDate() {
		return this.reportDate;
	}
	public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
	}

}
