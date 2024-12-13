package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 出租车司机车辆信息
 *
 * @author auto create
 * @since 1.0, 2022-10-19 16:19:49
 */
public class DriverCarInfo extends AlipayObject {

	private static final long serialVersionUID = 1634296244779132565L;

	/**
	 * 是否开通高德聚合码
"0"-未开通
"1"-开通
	 */
	@ApiField("aggregate_code_flag")
	private String aggregateCodeFlag;

	/**
	 * 认证时间
	 */
	@ApiField("bind_time")
	private String bindTime;

	/**
	 * 车辆品牌
	 */
	@ApiField("car_brand")
	private String carBrand;

	/**
	 * 车辆颜色
	 */
	@ApiField("car_color")
	private String carColor;

	/**
	 * 车牌号
	 */
	@ApiField("car_no")
	private String carNo;

	/**
	 * 车牌颜色
	 */
	@ApiField("car_no_color")
	private String carNoColor;

	/**
	 * 运营卡号
	 */
	@ApiField("car_operation_no")
	private String carOperationNo;

	/**
	 * 车辆型号
	 */
	@ApiField("car_type")
	private String carType;

	/**
	 * 身份证号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 渠道
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 城市码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 城市名
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 所属公司
	 */
	@ApiField("company")
	private String company;

	/**
	 * 司机id
	 */
	@ApiField("driver_id")
	private String driverId;

	/**
	 * 司机姓名
	 */
	@ApiField("driver_name")
	private String driverName;

	/**
	 * 司机性别
M-男
F-女
	 */
	@ApiField("driver_sex")
	private String driverSex;

	/**
	 * 支付宝uid
	 */
	@ApiField("driver_user_id")
	private String driverUserId;

	/**
	 * 电话号码
	 */
	@ApiField("tele_no")
	private String teleNo;

	public String getAggregateCodeFlag() {
		return this.aggregateCodeFlag;
	}
	public void setAggregateCodeFlag(String aggregateCodeFlag) {
		this.aggregateCodeFlag = aggregateCodeFlag;
	}

	public String getBindTime() {
		return this.bindTime;
	}
	public void setBindTime(String bindTime) {
		this.bindTime = bindTime;
	}

	public String getCarBrand() {
		return this.carBrand;
	}
	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}

	public String getCarColor() {
		return this.carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	public String getCarNo() {
		return this.carNo;
	}
	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	public String getCarNoColor() {
		return this.carNoColor;
	}
	public void setCarNoColor(String carNoColor) {
		this.carNoColor = carNoColor;
	}

	public String getCarOperationNo() {
		return this.carOperationNo;
	}
	public void setCarOperationNo(String carOperationNo) {
		this.carOperationNo = carOperationNo;
	}

	public String getCarType() {
		return this.carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCityName() {
		return this.cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCompany() {
		return this.company;
	}
	public void setCompany(String company) {
		this.company = company;
	}

	public String getDriverId() {
		return this.driverId;
	}
	public void setDriverId(String driverId) {
		this.driverId = driverId;
	}

	public String getDriverName() {
		return this.driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getDriverSex() {
		return this.driverSex;
	}
	public void setDriverSex(String driverSex) {
		this.driverSex = driverSex;
	}

	public String getDriverUserId() {
		return this.driverUserId;
	}
	public void setDriverUserId(String driverUserId) {
		this.driverUserId = driverUserId;
	}

	public String getTeleNo() {
		return this.teleNo;
	}
	public void setTeleNo(String teleNo) {
		this.teleNo = teleNo;
	}

}
