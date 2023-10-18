package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 审批单行程
 *
 * @author auto create
 * @since 1.0, 2023-06-20 14:05:25
 */
public class ApprovalItinerary extends AlipayObject {

	private static final long serialVersionUID = 5318299975814941493L;

	/**
	 * 到达城市
	 */
	@ApiField("arr_city")
	private String arrCity;

	/**
	 * 成都市
	 */
	@ApiField("arr_city_code")
	private String arrCityCode;

	/**
	 * 出发城市
	 */
	@ApiField("dep_city")
	private String depCity;

	/**
	 * 出发城市编码
	 */
	@ApiField("dep_city_code")
	private String depCityCode;

	/**
	 * 行程结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 行程单ID
	 */
	@ApiField("itinerary_id")
	private String itineraryId;

	/**
	 * 行程开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 交通方式
	 */
	@ApiField("traffic_type")
	private String trafficType;

	/**
	 * 行程类型
	 */
	@ApiField("trip_way")
	private String tripWay;

	public String getArrCity() {
		return this.arrCity;
	}
	public void setArrCity(String arrCity) {
		this.arrCity = arrCity;
	}

	public String getArrCityCode() {
		return this.arrCityCode;
	}
	public void setArrCityCode(String arrCityCode) {
		this.arrCityCode = arrCityCode;
	}

	public String getDepCity() {
		return this.depCity;
	}
	public void setDepCity(String depCity) {
		this.depCity = depCity;
	}

	public String getDepCityCode() {
		return this.depCityCode;
	}
	public void setDepCityCode(String depCityCode) {
		this.depCityCode = depCityCode;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getItineraryId() {
		return this.itineraryId;
	}
	public void setItineraryId(String itineraryId) {
		this.itineraryId = itineraryId;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getTrafficType() {
		return this.trafficType;
	}
	public void setTrafficType(String trafficType) {
		this.trafficType = trafficType;
	}

	public String getTripWay() {
		return this.tripWay;
	}
	public void setTripWay(String tripWay) {
		this.tripWay = tripWay;
	}

}
