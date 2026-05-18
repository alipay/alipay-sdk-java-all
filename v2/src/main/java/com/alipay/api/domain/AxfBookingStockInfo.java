package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 安心付预约库存
 *
 * @author auto create
 * @since 1.0, 2026-02-05 16:44:09
 */
public class AxfBookingStockInfo extends AlipayObject {

	private static final long serialVersionUID = 4318197245361153379L;

	/**
	 * 剩余可约数量，active时，这个数量应该大于0
	 */
	@ApiField("available_quantity")
	private Long availableQuantity;

	/**
	 * 库存状态（枚举）
active      可预约
inactive    不可预约(无原因)
full        不可预约(已约满)
	 */
	@ApiField("status")
	private String status;

	/**
	 * 时间  格式24小时制 09:30  不可超出门店营业时间
或者传时间段  09:00-10:00，则代表这个时间段的库存
	 */
	@ApiField("time")
	private String time;

	public Long getAvailableQuantity() {
		return this.availableQuantity;
	}
	public void setAvailableQuantity(Long availableQuantity) {
		this.availableQuantity = availableQuantity;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTime() {
		return this.time;
	}
	public void setTime(String time) {
		this.time = time;
	}

}
