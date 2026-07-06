package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 受影响线路对象
 *
 * @author auto create
 * @since 1.0, 2026-07-06 11:41:16
 */
public class EffectBusRouteObject extends AlipayObject {

	private static final long serialVersionUID = 3889275987226454934L;

	/**
	 * 变化比例
	 */
	@ApiField("change_ratio")
	private String changeRatio;

	/**
	 * 日均客流，单位：人次
	 */
	@ApiField("daily_passenger_flow")
	private String dailyPassengerFlow;

	/**
	 * 下行方向
	 */
	@ApiField("down_direction")
	private String downDirection;

	/**
	 * 下行客流下降站点信息
	 */
	@ApiField("down_passenger_drop_station")
	private String downPassengerDropStation;

	/**
	 * 客流变化量。单位：人
	 */
	@ApiField("passenger_delta")
	private String passengerDelta;

	/**
	 * 排名
	 */
	@ApiField("rank")
	private Long rank;

	/**
	 * 线路信息
	 */
	@ApiField("route_information")
	private String routeInformation;

	/**
	 * 线路名称
	 */
	@ApiField("route_name")
	private String routeName;

	/**
	 * 线路重复情况
	 */
	@ApiField("route_repeat")
	private String routeRepeat;

	/**
	 * 趋势类型
	 */
	@ApiField("trend_type")
	private String trendType;

	/**
	 * 上行方向
	 */
	@ApiField("up_direction")
	private String upDirection;

	/**
	 * 上行客流下降站点
	 */
	@ApiField("up_passenger_drop_station")
	private String upPassengerDropStation;

	public String getChangeRatio() {
		return this.changeRatio;
	}
	public void setChangeRatio(String changeRatio) {
		this.changeRatio = changeRatio;
	}

	public String getDailyPassengerFlow() {
		return this.dailyPassengerFlow;
	}
	public void setDailyPassengerFlow(String dailyPassengerFlow) {
		this.dailyPassengerFlow = dailyPassengerFlow;
	}

	public String getDownDirection() {
		return this.downDirection;
	}
	public void setDownDirection(String downDirection) {
		this.downDirection = downDirection;
	}

	public String getDownPassengerDropStation() {
		return this.downPassengerDropStation;
	}
	public void setDownPassengerDropStation(String downPassengerDropStation) {
		this.downPassengerDropStation = downPassengerDropStation;
	}

	public String getPassengerDelta() {
		return this.passengerDelta;
	}
	public void setPassengerDelta(String passengerDelta) {
		this.passengerDelta = passengerDelta;
	}

	public Long getRank() {
		return this.rank;
	}
	public void setRank(Long rank) {
		this.rank = rank;
	}

	public String getRouteInformation() {
		return this.routeInformation;
	}
	public void setRouteInformation(String routeInformation) {
		this.routeInformation = routeInformation;
	}

	public String getRouteName() {
		return this.routeName;
	}
	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}

	public String getRouteRepeat() {
		return this.routeRepeat;
	}
	public void setRouteRepeat(String routeRepeat) {
		this.routeRepeat = routeRepeat;
	}

	public String getTrendType() {
		return this.trendType;
	}
	public void setTrendType(String trendType) {
		this.trendType = trendType;
	}

	public String getUpDirection() {
		return this.upDirection;
	}
	public void setUpDirection(String upDirection) {
		this.upDirection = upDirection;
	}

	public String getUpPassengerDropStation() {
		return this.upPassengerDropStation;
	}
	public void setUpPassengerDropStation(String upPassengerDropStation) {
		this.upPassengerDropStation = upPassengerDropStation;
	}

}
