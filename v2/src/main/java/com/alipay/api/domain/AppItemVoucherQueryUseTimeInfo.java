package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 时间规则查询信息
 *
 * @author auto create
 * @since 1.0, 2024-08-08 18:12:19
 */
public class AppItemVoucherQueryUseTimeInfo extends AlipayObject {

	private static final long serialVersionUID = 1397859264627667549L;

	/**
	 * 绝对核销时间
	 */
	@ApiField("app_item_absolute_period_info")
	private AppItemAbsoluteQueryPeriodInfo appItemAbsolutePeriodInfo;

	/**
	 * 相对核销时间
	 */
	@ApiField("app_item_relative_period_info")
	private AppItemRelativeQueryPeriodInfo appItemRelativePeriodInfo;

	/**
	 * 券有效期 【枚举值】 绝对时间 : ABSOLUTE 相对时间: RELATIVE
	 */
	@ApiField("period_type")
	private String periodType;

	public AppItemAbsoluteQueryPeriodInfo getAppItemAbsolutePeriodInfo() {
		return this.appItemAbsolutePeriodInfo;
	}
	public void setAppItemAbsolutePeriodInfo(AppItemAbsoluteQueryPeriodInfo appItemAbsolutePeriodInfo) {
		this.appItemAbsolutePeriodInfo = appItemAbsolutePeriodInfo;
	}

	public AppItemRelativeQueryPeriodInfo getAppItemRelativePeriodInfo() {
		return this.appItemRelativePeriodInfo;
	}
	public void setAppItemRelativePeriodInfo(AppItemRelativeQueryPeriodInfo appItemRelativePeriodInfo) {
		this.appItemRelativePeriodInfo = appItemRelativePeriodInfo;
	}

	public String getPeriodType() {
		return this.periodType;
	}
	public void setPeriodType(String periodType) {
		this.periodType = periodType;
	}

}
