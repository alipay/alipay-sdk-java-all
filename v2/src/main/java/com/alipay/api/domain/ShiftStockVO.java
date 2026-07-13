package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 日历库存列表
 *
 * @author auto create
 * @since 1.0, 2026-04-10 16:25:05
 */
public class ShiftStockVO extends AlipayObject {

	private static final long serialVersionUID = 6615867613481196487L;

	/**
	 * 时间段结束毫秒时间戳
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 时间段开始毫秒时间戳
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * 库存数量
	 */
	@ApiField("stock")
	private Long stock;

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public Long getStock() {
		return this.stock;
	}
	public void setStock(Long stock) {
		this.stock = stock;
	}

}
