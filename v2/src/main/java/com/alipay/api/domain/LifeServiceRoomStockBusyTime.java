package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生活服务房间库存占用时间
 *
 * @author auto create
 * @since 1.0, 2026-04-14 19:10:16
 */
public class LifeServiceRoomStockBusyTime extends AlipayObject {

	private static final long serialVersionUID = 5535557435179675147L;

	/**
	 * 无法预约的原因
	 */
	@ApiField("busy_reason")
	private String busyReason;

	/**
	 * 无法预约结束时间，要晚于busy_time_start
	 */
	@ApiField("busy_time_end")
	private String busyTimeEnd;

	/**
	 * 无法预约开始时间，HH:mm格式
	 */
	@ApiField("busy_time_start")
	private String busyTimeStart;

	public String getBusyReason() {
		return this.busyReason;
	}
	public void setBusyReason(String busyReason) {
		this.busyReason = busyReason;
	}

	public String getBusyTimeEnd() {
		return this.busyTimeEnd;
	}
	public void setBusyTimeEnd(String busyTimeEnd) {
		this.busyTimeEnd = busyTimeEnd;
	}

	public String getBusyTimeStart() {
		return this.busyTimeStart;
	}
	public void setBusyTimeStart(String busyTimeStart) {
		this.busyTimeStart = busyTimeStart;
	}

}
