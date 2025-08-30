package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险交通行程信息
 *
 * @author auto create
 * @since 1.0, 2024-07-09 14:47:50
 */
public class InsTransportItineraryDTO extends AlipayObject {

	private static final long serialVersionUID = 1662813362841627385L;

	/**
	 * 到达具体地址
	 */
	@ApiField("end_address")
	private String endAddress;

	/**
	 * 到达城市
	 */
	@ApiField("end_city")
	private String endCity;

	/**
	 * 到达站
	 */
	@ApiField("end_station")
	private String endStation;

	/**
	 * 到达时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 行程订单号
	 */
	@ApiField("itinerary_order_no")
	private String itineraryOrderNo;

	/**
	 * 乘客
	 */
	@ApiField("passenger")
	private InsOpenUserDTO passenger;

	/**
	 * 行程序号
	 */
	@ApiField("seq")
	private Long seq;

	/**
	 * 出发地址
	 */
	@ApiField("start_address")
	private String startAddress;

	/**
	 * 城市
	 */
	@ApiField("start_city")
	private String startCity;

	/**
	 * 出发站
	 */
	@ApiField("start_station")
	private String startStation;

	/**
	 * 出发时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 交通类型
	 */
	@ApiField("transport_mode")
	private String transportMode;

	/**
	 * 班次号
	 */
	@ApiField("transport_no")
	private String transportNo;

	public String getEndAddress() {
		return this.endAddress;
	}
	public void setEndAddress(String endAddress) {
		this.endAddress = endAddress;
	}

	public String getEndCity() {
		return this.endCity;
	}
	public void setEndCity(String endCity) {
		this.endCity = endCity;
	}

	public String getEndStation() {
		return this.endStation;
	}
	public void setEndStation(String endStation) {
		this.endStation = endStation;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getItineraryOrderNo() {
		return this.itineraryOrderNo;
	}
	public void setItineraryOrderNo(String itineraryOrderNo) {
		this.itineraryOrderNo = itineraryOrderNo;
	}

	public InsOpenUserDTO getPassenger() {
		return this.passenger;
	}
	public void setPassenger(InsOpenUserDTO passenger) {
		this.passenger = passenger;
	}

	public Long getSeq() {
		return this.seq;
	}
	public void setSeq(Long seq) {
		this.seq = seq;
	}

	public String getStartAddress() {
		return this.startAddress;
	}
	public void setStartAddress(String startAddress) {
		this.startAddress = startAddress;
	}

	public String getStartCity() {
		return this.startCity;
	}
	public void setStartCity(String startCity) {
		this.startCity = startCity;
	}

	public String getStartStation() {
		return this.startStation;
	}
	public void setStartStation(String startStation) {
		this.startStation = startStation;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getTransportMode() {
		return this.transportMode;
	}
	public void setTransportMode(String transportMode) {
		this.transportMode = transportMode;
	}

	public String getTransportNo() {
		return this.transportNo;
	}
	public void setTransportNo(String transportNo) {
		this.transportNo = transportNo;
	}

}
