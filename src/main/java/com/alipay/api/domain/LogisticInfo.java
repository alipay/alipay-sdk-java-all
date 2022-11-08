package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单物流详情
 *
 * @author auto create
 * @since 1.0, 2022-05-18 16:09:22
 */
public class LogisticInfo extends AlipayObject {

	private static final long serialVersionUID = 3743434675969216771L;

	/**
	 * 物流公司名称
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 物流详情
	 */
	@ApiField("detail")
	private String detail;

	/**
	 * 物流id
	 */
	@ApiField("logistic_id")
	private String logisticId;

	/**
	 * 发货地
	 */
	@ApiField("ship_area")
	private String shipArea;

	/**
	 * 发货时效
	 */
	@ApiField("ship_period")
	private String shipPeriod;

	/**
	 * 物流状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 物流停更时间
	 */
	@ApiField("stop_update_time")
	private String stopUpdateTime;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getDetail() {
		return this.detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getLogisticId() {
		return this.logisticId;
	}
	public void setLogisticId(String logisticId) {
		this.logisticId = logisticId;
	}

	public String getShipArea() {
		return this.shipArea;
	}
	public void setShipArea(String shipArea) {
		this.shipArea = shipArea;
	}

	public String getShipPeriod() {
		return this.shipPeriod;
	}
	public void setShipPeriod(String shipPeriod) {
		this.shipPeriod = shipPeriod;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getStopUpdateTime() {
		return this.stopUpdateTime;
	}
	public void setStopUpdateTime(String stopUpdateTime) {
		this.stopUpdateTime = stopUpdateTime;
	}

}
