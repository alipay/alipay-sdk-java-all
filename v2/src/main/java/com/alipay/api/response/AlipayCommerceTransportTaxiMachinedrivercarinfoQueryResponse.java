package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.taxi.machinedrivercarinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:34:27
 */
public class AlipayCommerceTransportTaxiMachinedrivercarinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2714721588432252491L;

	/** 
	 * 车辆颜色
	 */
	@ApiField("car_color")
	private String carColor;

	/** 
	 * 司机所在城市
	 */
	@ApiField("driver_city")
	private String driverCity;

	/** 
	 * 司机姓名
	 */
	@ApiField("driver_name")
	private String driverName;

	/** 
	 * 司机手机号
	 */
	@ApiField("phone")
	private String phone;

	/** 
	 * 司机车牌号
	 */
	@ApiField("plate_no")
	private String plateNo;

	/** 
	 * 结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 结果描述
	 */
	@ApiField("result_msg")
	private String resultMsg;

	/** 
	 * 车辆座位数
	 */
	@ApiField("seats")
	private String seats;

	/** 
	 * 司机性别，男/女
	 */
	@ApiField("sex")
	private String sex;

	/** 
	 * 司机是否已签到，T/F
	 */
	@ApiField("sign_status")
	private String signStatus;

	/** 
	 * 支付宝司机唯一id
	 */
	@ApiField("sys_driver_id")
	private String sysDriverId;

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	public String getCarColor( ) {
		return this.carColor;
	}

	public void setDriverCity(String driverCity) {
		this.driverCity = driverCity;
	}
	public String getDriverCity( ) {
		return this.driverCity;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public String getDriverName( ) {
		return this.driverName;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone( ) {
		return this.phone;
	}

	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}
	public String getPlateNo( ) {
		return this.plateNo;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public String getResultMsg( ) {
		return this.resultMsg;
	}

	public void setSeats(String seats) {
		this.seats = seats;
	}
	public String getSeats( ) {
		return this.seats;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getSex( ) {
		return this.sex;
	}

	public void setSignStatus(String signStatus) {
		this.signStatus = signStatus;
	}
	public String getSignStatus( ) {
		return this.signStatus;
	}

	public void setSysDriverId(String sysDriverId) {
		this.sysDriverId = sysDriverId;
	}
	public String getSysDriverId( ) {
		return this.sysDriverId;
	}

}
