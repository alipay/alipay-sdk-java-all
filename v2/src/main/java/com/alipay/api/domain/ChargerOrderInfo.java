package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 新能源行业，充电业务订单信息
 *
 * @author auto create
 * @since 1.0, 2025-04-10 12:00:47
 */
public class ChargerOrderInfo extends AlipayObject {

	private static final long serialVersionUID = 4293481832968194352L;

	/**
	 * 充电结束时间
	 */
	@ApiField("charging_end_time")
	private Date chargingEndTime;

	/**
	 * 充电开始时间
	 */
	@ApiField("charging_start_time")
	private Date chargingStartTime;

	/**
	 * 充电使用的设备ID（充电枪编号）
	 */
	@ApiField("connector_id")
	private String connectorId;

	/**
	 * 电费。单位为元，精确到小数点后两位
	 */
	@ApiField("elec_amount")
	private String elecAmount;

	/**
	 * 商户订单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 总电量。两位小数，单位：度。
	 */
	@ApiField("power")
	private String power;

	/**
	 * 服务费。单位为元，精确到小数点后两位
	 */
	@ApiField("service_amount")
	private String serviceAmount;

	/**
	 * 互联互通充电站编码
	 */
	@ApiField("station_id")
	private String stationId;

	/**
	 * 商户同步的充电业务订单总金额。单位为元，精确到小数点后两位
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public Date getChargingEndTime() {
		return this.chargingEndTime;
	}
	public void setChargingEndTime(Date chargingEndTime) {
		this.chargingEndTime = chargingEndTime;
	}

	public Date getChargingStartTime() {
		return this.chargingStartTime;
	}
	public void setChargingStartTime(Date chargingStartTime) {
		this.chargingStartTime = chargingStartTime;
	}

	public String getConnectorId() {
		return this.connectorId;
	}
	public void setConnectorId(String connectorId) {
		this.connectorId = connectorId;
	}

	public String getElecAmount() {
		return this.elecAmount;
	}
	public void setElecAmount(String elecAmount) {
		this.elecAmount = elecAmount;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getPower() {
		return this.power;
	}
	public void setPower(String power) {
		this.power = power;
	}

	public String getServiceAmount() {
		return this.serviceAmount;
	}
	public void setServiceAmount(String serviceAmount) {
		this.serviceAmount = serviceAmount;
	}

	public String getStationId() {
		return this.stationId;
	}
	public void setStationId(String stationId) {
		this.stationId = stationId;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

}
