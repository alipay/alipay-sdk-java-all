package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 高德授权认证结果查询
 *
 * @author auto create
 * @since 1.0, 2025-06-27 18:13:52
 */
public class EtcAuthTrip extends AlipayObject {

	private static final long serialVersionUID = 4432315776372363847L;

	/**
	 * 出站名称
	 */
	@ApiField("end_station_name")
	private String endStationName;

	/**
	 * 出站时间
	 */
	@ApiField("end_station_time")
	private String endStationTime;

	/**
	 * 商户侧运单号
	 */
	@ApiField("out_waybill_no")
	private String outWaybillNo;

	/**
	 * 行程账单支付时间
	 */
	@ApiField("pay_time")
	private String payTime;

	/**
	 * 车牌颜色
	 */
	@ApiField("plate_color")
	private String plateColor;

	/**
	 * 车牌号
	 */
	@ApiField("plate_no")
	private String plateNo;

	/**
	 * 入站名称
	 */
	@ApiField("start_station_name")
	private String startStationName;

	/**
	 * 入站时间
	 */
	@ApiField("start_station_time")
	private String startStationTime;

	/**
	 * 交易子场景
	 */
	@ApiField("sub_scene")
	private String subScene;

	/**
	 * 高速通行费用总金额，单位:元。
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 通行记录唯一标识
	 */
	@ApiField("trade_id")
	private String tradeId;

	/**
	 * 支付宝运单号
	 */
	@ApiField("waybill_no")
	private String waybillNo;

	public String getEndStationName() {
		return this.endStationName;
	}
	public void setEndStationName(String endStationName) {
		this.endStationName = endStationName;
	}

	public String getEndStationTime() {
		return this.endStationTime;
	}
	public void setEndStationTime(String endStationTime) {
		this.endStationTime = endStationTime;
	}

	public String getOutWaybillNo() {
		return this.outWaybillNo;
	}
	public void setOutWaybillNo(String outWaybillNo) {
		this.outWaybillNo = outWaybillNo;
	}

	public String getPayTime() {
		return this.payTime;
	}
	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}

	public String getPlateColor() {
		return this.plateColor;
	}
	public void setPlateColor(String plateColor) {
		this.plateColor = plateColor;
	}

	public String getPlateNo() {
		return this.plateNo;
	}
	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

	public String getStartStationName() {
		return this.startStationName;
	}
	public void setStartStationName(String startStationName) {
		this.startStationName = startStationName;
	}

	public String getStartStationTime() {
		return this.startStationTime;
	}
	public void setStartStationTime(String startStationTime) {
		this.startStationTime = startStationTime;
	}

	public String getSubScene() {
		return this.subScene;
	}
	public void setSubScene(String subScene) {
		this.subScene = subScene;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getTradeId() {
		return this.tradeId;
	}
	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}

	public String getWaybillNo() {
		return this.waybillNo;
	}
	public void setWaybillNo(String waybillNo) {
		this.waybillNo = waybillNo;
	}

}
