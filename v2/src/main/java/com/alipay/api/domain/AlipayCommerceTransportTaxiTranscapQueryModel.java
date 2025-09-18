package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 出租车运力推荐查询接口
 *
 * @author auto create
 * @since 1.0, 2023-12-12 14:07:18
 */
public class AlipayCommerceTransportTaxiTranscapQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2124851299927673185L;

	/**
	 * 车牌号
	 */
	@ApiField("car_no")
	private String carNo;

	/**
	 * 城市码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 企业ID
	 */
	@ApiField("corp_id")
	private String corpId;

	/**
	 * 请求ID，唯一标识一次请求，
由调用方自行确保唯一性
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 请求时间
	 */
	@ApiField("request_time")
	private Date requestTime;

	/**
	 * 车辆/机具ID
	 */
	@ApiField("vehicle_id")
	private String vehicleId;

	public String getCarNo() {
		return this.carNo;
	}
	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCorpId() {
		return this.corpId;
	}
	public void setCorpId(String corpId) {
		this.corpId = corpId;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Date getRequestTime() {
		return this.requestTime;
	}
	public void setRequestTime(Date requestTime) {
		this.requestTime = requestTime;
	}

	public String getVehicleId() {
		return this.vehicleId;
	}
	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}

}
