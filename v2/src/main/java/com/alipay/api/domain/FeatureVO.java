package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 城市地铁特性
 *
 * @author auto create
 * @since 1.0, 2026-07-31 21:12:33
 */
public class FeatureVO extends AlipayObject {

	private static final long serialVersionUID = 6839897452748826375L;

	/**
	 * 是否支持拥挤度。枚举：Y=支持，N=不支持。
	 */
	@ApiField("congestion_rate")
	private String congestionRate;

	/**
	 * 是否支持实时时刻。枚举：Y=支持，N=不支持。N 时实时接口该城市可能无数据。
	 */
	@ApiField("real_time")
	private String realTime;

	/**
	 * 是否支持首末班车。枚举：Y=支持，N=不支持。
	 */
	@ApiField("start_end")
	private String startEnd;

	public String getCongestionRate() {
		return this.congestionRate;
	}
	public void setCongestionRate(String congestionRate) {
		this.congestionRate = congestionRate;
	}

	public String getRealTime() {
		return this.realTime;
	}
	public void setRealTime(String realTime) {
		this.realTime = realTime;
	}

	public String getStartEnd() {
		return this.startEnd;
	}
	public void setStartEnd(String startEnd) {
		this.startEnd = startEnd;
	}

}
