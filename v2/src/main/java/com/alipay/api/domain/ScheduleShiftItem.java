package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 轮班结果
 *
 * @author auto create
 * @since 1.0, 2020-06-08 16:36:50
 */
public class ScheduleShiftItem extends AlipayObject {

	private static final long serialVersionUID = 7464367173849962257L;

	/**
	 * 班次序号（可关联排班表得到具体工作计划，0表示休息）
	 */
	@ApiField("chain_num")
	private Long chainNum;

	/**
	 * 轮班周期内的第几天
	 */
	@ApiField("day_num")
	private Long dayNum;

	/**
	 * 线路id
	 */
	@ApiField("line_id")
	private String lineId;

	/**
	 * 车辆编号id
	 */
	@ApiField("vehicle_id")
	private String vehicleId;

	/**
	 * 虚拟员工编号
	 */
	@ApiField("vir_employ_id")
	private String virEmployId;

	public Long getChainNum() {
		return this.chainNum;
	}
	public void setChainNum(Long chainNum) {
		this.chainNum = chainNum;
	}

	public Long getDayNum() {
		return this.dayNum;
	}
	public void setDayNum(Long dayNum) {
		this.dayNum = dayNum;
	}

	public String getLineId() {
		return this.lineId;
	}
	public void setLineId(String lineId) {
		this.lineId = lineId;
	}

	public String getVehicleId() {
		return this.vehicleId;
	}
	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVirEmployId() {
		return this.virEmployId;
	}
	public void setVirEmployId(String virEmployId) {
		this.virEmployId = virEmployId;
	}

}
