package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ETC行程明细项
 *
 * @author auto create
 * @since 1.0, 2024-06-24 21:33:14
 */
public class ETCTripItemDto extends AlipayObject {

	private static final long serialVersionUID = 5786749299758547674L;

	/**
	 * 高速收费站出口
	 */
	@ApiField("end_station_name")
	private String endStationName;

	/**
	 * 用户离开高速时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 当前明细费用
	 */
	@ApiField("item_amount")
	private String itemAmount;

	/**
	 * 费用类目
	 */
	@ApiField("item_category")
	private String itemCategory;

	/**
	 * 外部行程唯一流水号
	 */
	@ApiField("out_trip_id")
	private String outTripId;

	/**
	 * 高速收费站入口
	 */
	@ApiField("start_station_name")
	private String startStationName;

	/**
	 * 用户进入高速时间
	 */
	@ApiField("start_time")
	private String startTime;

	public String getEndStationName() {
		return this.endStationName;
	}
	public void setEndStationName(String endStationName) {
		this.endStationName = endStationName;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getItemAmount() {
		return this.itemAmount;
	}
	public void setItemAmount(String itemAmount) {
		this.itemAmount = itemAmount;
	}

	public String getItemCategory() {
		return this.itemCategory;
	}
	public void setItemCategory(String itemCategory) {
		this.itemCategory = itemCategory;
	}

	public String getOutTripId() {
		return this.outTripId;
	}
	public void setOutTripId(String outTripId) {
		this.outTripId = outTripId;
	}

	public String getStartStationName() {
		return this.startStationName;
	}
	public void setStartStationName(String startStationName) {
		this.startStationName = startStationName;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

}
