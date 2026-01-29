package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场地库存同步
 *
 * @author auto create
 * @since 1.0, 2026-01-26 16:02:42
 */
public class AlipayCommerceLifeserviceRoomstockSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6344646124134991755L;

	/**
	 * 三方场地id【需保证唯一性】
	 */
	@ApiField("out_room_id")
	private String outRoomId;

	/**
	 * 场地id【和out_room_id二选一】
	 */
	@ApiField("room_id")
	private String roomId;

	/**
	 * 蚂蚁门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 库存状态（枚举）【必填】 active 可预约 inactive 不可预约(无原因) full 不可预约(已约满)
	 */
	@ApiField("status")
	private String status;

	/**
	 * 库存日期【必填】 格式 yyyy-MM-dd
	 */
	@ApiField("stock_date")
	private String stockDate;

	/**
	 * 库存结束时间【必填】
	 */
	@ApiField("stock_end_time")
	private Date stockEndTime;

	/**
	 * 库存开始时间【必填】
	 */
	@ApiField("stock_start_time")
	private Date stockStartTime;

	public String getOutRoomId() {
		return this.outRoomId;
	}
	public void setOutRoomId(String outRoomId) {
		this.outRoomId = outRoomId;
	}

	public String getRoomId() {
		return this.roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getStockDate() {
		return this.stockDate;
	}
	public void setStockDate(String stockDate) {
		this.stockDate = stockDate;
	}

	public Date getStockEndTime() {
		return this.stockEndTime;
	}
	public void setStockEndTime(Date stockEndTime) {
		this.stockEndTime = stockEndTime;
	}

	public Date getStockStartTime() {
		return this.stockStartTime;
	}
	public void setStockStartTime(Date stockStartTime) {
		this.stockStartTime = stockStartTime;
	}

}
