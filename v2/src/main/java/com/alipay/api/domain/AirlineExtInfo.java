package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 航段扩展信息
 *
 * @author auto create
 * @since 1.0, 2024-09-30 01:14:32
 */
public class AirlineExtInfo extends AlipayObject {

	private static final long serialVersionUID = 8328299352839659153L;

	/**
	 * 航班到达的准点率
	 */
	@ApiField("arr_on_time")
	private String arrOnTime;

	/**
	 * 航班平均到达延误时长，单位：分钟
	 */
	@ApiField("avg_arr_delay")
	private String avgArrDelay;

	/**
	 * 航班平均出发延误时长，单位：分钟
	 */
	@ApiField("avg_dep_delay")
	private String avgDepDelay;

	/**
	 * 航班取消率
	 */
	@ApiField("cancel_pt")
	private String cancelPt;

	/**
	 * 是否有充电口，true:有，false:无
	 */
	@ApiField("charging_port")
	private String chargingPort;

	/**
	 * 航班廊桥率
	 */
	@ApiField("covered_bridge")
	private String coveredBridge;

	/**
	 * 航班出发的准点率
	 */
	@ApiField("dep_on_time")
	private String depOnTime;

	/**
	 * 是否有电视节目，true:有，false:无
	 */
	@ApiField("tv")
	private String tv;

	/**
	 * 是否有wifi，true:有，false:无
	 */
	@ApiField("wifi")
	private String wifi;

	public String getArrOnTime() {
		return this.arrOnTime;
	}
	public void setArrOnTime(String arrOnTime) {
		this.arrOnTime = arrOnTime;
	}

	public String getAvgArrDelay() {
		return this.avgArrDelay;
	}
	public void setAvgArrDelay(String avgArrDelay) {
		this.avgArrDelay = avgArrDelay;
	}

	public String getAvgDepDelay() {
		return this.avgDepDelay;
	}
	public void setAvgDepDelay(String avgDepDelay) {
		this.avgDepDelay = avgDepDelay;
	}

	public String getCancelPt() {
		return this.cancelPt;
	}
	public void setCancelPt(String cancelPt) {
		this.cancelPt = cancelPt;
	}

	public String getChargingPort() {
		return this.chargingPort;
	}
	public void setChargingPort(String chargingPort) {
		this.chargingPort = chargingPort;
	}

	public String getCoveredBridge() {
		return this.coveredBridge;
	}
	public void setCoveredBridge(String coveredBridge) {
		this.coveredBridge = coveredBridge;
	}

	public String getDepOnTime() {
		return this.depOnTime;
	}
	public void setDepOnTime(String depOnTime) {
		this.depOnTime = depOnTime;
	}

	public String getTv() {
		return this.tv;
	}
	public void setTv(String tv) {
		this.tv = tv;
	}

	public String getWifi() {
		return this.wifi;
	}
	public void setWifi(String wifi) {
		this.wifi = wifi;
	}

}
