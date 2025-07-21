package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 核销时间信息
 *
 * @author auto create
 * @since 1.0, 2024-08-08 18:12:36
 */
public class AppItemVoucherModifyUseTimeInfo extends AlipayObject {

	private static final long serialVersionUID = 1234211322582154516L;

	/**
	 * 绝对核销时间
	 */
	@ApiField("app_item_absolute_period_info")
	private AppItemAbsoluteModifyPeriodInfo appItemAbsolutePeriodInfo;

	/**
	 * 相对核销时间
	 */
	@ApiField("app_item_relative_period_info")
	private AppItemRelativeModifyPeriodInfo appItemRelativePeriodInfo;

	public AppItemAbsoluteModifyPeriodInfo getAppItemAbsolutePeriodInfo() {
		return this.appItemAbsolutePeriodInfo;
	}
	public void setAppItemAbsolutePeriodInfo(AppItemAbsoluteModifyPeriodInfo appItemAbsolutePeriodInfo) {
		this.appItemAbsolutePeriodInfo = appItemAbsolutePeriodInfo;
	}

	public AppItemRelativeModifyPeriodInfo getAppItemRelativePeriodInfo() {
		return this.appItemRelativePeriodInfo;
	}
	public void setAppItemRelativePeriodInfo(AppItemRelativeModifyPeriodInfo appItemRelativePeriodInfo) {
		this.appItemRelativePeriodInfo = appItemRelativePeriodInfo;
	}

}
