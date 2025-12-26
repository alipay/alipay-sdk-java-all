package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用于外部服务商修改疫苗商品库存入参
 *
 * @author auto create
 * @since 1.0, 2025-09-25 13:40:51
 */
public class ItemStockUpdateByIsvItemIdParam extends AlipayObject {

	private static final long serialVersionUID = 1858166134779452167L;

	/**
	 * 库存结束时间, 毫秒精度时间戳
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 外部服务商的疫苗ID定位商品
	 */
	@ApiField("isv_item_id")
	private String isvItemId;

	/**
	 * 库存开始时间, 毫秒精度时间戳
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * 服务商商品时间段库存数量 单位个
	 */
	@ApiField("stock")
	private Long stock;

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getIsvItemId() {
		return this.isvItemId;
	}
	public void setIsvItemId(String isvItemId) {
		this.isvItemId = isvItemId;
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
