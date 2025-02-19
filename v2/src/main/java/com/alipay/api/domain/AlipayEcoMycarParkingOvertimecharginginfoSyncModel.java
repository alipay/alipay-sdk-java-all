package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车辆停车超时重计费接口
 *
 * @author auto create
 * @since 1.0, 2021-07-05 19:32:07
 */
public class AlipayEcoMycarParkingOvertimecharginginfoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8418672985392425599L;

	/**
	 * 车牌号
	 */
	@ApiField("car_number")
	private String carNumber;

	/**
	 * 智能助理当前的跳转链接
	 */
	@ApiField("isv_url")
	private String isvUrl;

	/**
	 * 支付宝停车平台ID，由支付宝定义的该停车场标识，同一个isv或商户范围内唯一。通过 alipay.eco.mycar.parking.parkinglotinfo.create(录入停车场信息)接口获取。
	 */
	@ApiField("parking_id")
	private String parkingId;

	/**
	 * 支付宝业务流水号，用于记录车辆从驶入到驶出的全流程
	 */
	@ApiField("serial_no")
	private String serialNo;

	public String getCarNumber() {
		return this.carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public String getIsvUrl() {
		return this.isvUrl;
	}
	public void setIsvUrl(String isvUrl) {
		this.isvUrl = isvUrl;
	}

	public String getParkingId() {
		return this.parkingId;
	}
	public void setParkingId(String parkingId) {
		this.parkingId = parkingId;
	}

	public String getSerialNo() {
		return this.serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

}
