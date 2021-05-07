package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序访问趋势数据
 *
 * @author auto create
 * @since 1.0, 2019-06-20 16:57:27
 */
public class AppVisitTrendDataResponse extends AlipayObject {

	private static final long serialVersionUID = 1842479972391288579L;

	/**
	 * 小程序的访问次数
	 */
	@ApiField("app_pv")
	private Long appPv;

	/**
	 * 小程序访问人数
	 */
	@ApiField("app_uv")
	private Long appUv;

	/**
	 * 数据采集时间 yyyy-MM-dd hh:mm:ss
	 */
	@ApiField("report_time")
	private Date reportTime;

	public Long getAppPv() {
		return this.appPv;
	}
	public void setAppPv(Long appPv) {
		this.appPv = appPv;
	}

	public Long getAppUv() {
		return this.appUv;
	}
	public void setAppUv(Long appUv) {
		this.appUv = appUv;
	}

	public Date getReportTime() {
		return this.reportTime;
	}
	public void setReportTime(Date reportTime) {
		this.reportTime = reportTime;
	}

}
