package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场馆配置模型
 *
 * @author auto create
 * @since 1.0, 2026-03-25 20:47:21
 */
public class VenueConfigModel extends AlipayObject {

	private static final long serialVersionUID = 8642537861453238753L;

	/**
	 * 最多可容纳签到的人数
	 */
	@ApiField("max_capacity")
	private Long maxCapacity;

	/**
	 * 用户停留的最短时长，单位：分钟
	 */
	@ApiField("min_stay_minutes")
	private Long minStayMinutes;

	public Long getMaxCapacity() {
		return this.maxCapacity;
	}
	public void setMaxCapacity(Long maxCapacity) {
		this.maxCapacity = maxCapacity;
	}

	public Long getMinStayMinutes() {
		return this.minStayMinutes;
	}
	public void setMinStayMinutes(Long minStayMinutes) {
		this.minStayMinutes = minStayMinutes;
	}

}
