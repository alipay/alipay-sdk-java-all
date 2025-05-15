package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 核销时间
 *
 * @author auto create
 * @since 1.0, 2024-08-08 18:12:31
 */
public class AppItemVoucherUseTimeInfo extends AlipayObject {

	private static final long serialVersionUID = 7156112425762462568L;

	/**
	 * 绝对核销时间
	 */
	@ApiField("app_item_absolute_period_info")
	private AppItemAbsolutePeriodInfo appItemAbsolutePeriodInfo;

	/**
	 * 相对核销时间
	 */
	@ApiField("app_item_relative_period_info")
	private AppItemRelativePeriodInfo appItemRelativePeriodInfo;

	/**
	 * 【描述】券有效期
【枚举值】
绝对时间 : ABSOLUTE
相对时间: RELATIVE
	 */
	@ApiField("period_type")
	private String periodType;

	public AppItemAbsolutePeriodInfo getAppItemAbsolutePeriodInfo() {
		return this.appItemAbsolutePeriodInfo;
	}
	public void setAppItemAbsolutePeriodInfo(AppItemAbsolutePeriodInfo appItemAbsolutePeriodInfo) {
		this.appItemAbsolutePeriodInfo = appItemAbsolutePeriodInfo;
	}

	public AppItemRelativePeriodInfo getAppItemRelativePeriodInfo() {
		return this.appItemRelativePeriodInfo;
	}
	public void setAppItemRelativePeriodInfo(AppItemRelativePeriodInfo appItemRelativePeriodInfo) {
		this.appItemRelativePeriodInfo = appItemRelativePeriodInfo;
	}

	public String getPeriodType() {
		return this.periodType;
	}
	public void setPeriodType(String periodType) {
		this.periodType = periodType;
	}

}
