package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 出租车司机机具签到绑定
 *
 * @author auto create
 * @since 1.0, 2022-12-30 10:09:52
 */
public class AlipayCommerceTransportTaxiDrivermachineBindModel extends AlipayObject {

	private static final long serialVersionUID = 2524424875635128172L;

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
	 * 支付宝用户id
	 */
	@ApiField("driver_open_id")
	private String driverOpenId;

	/**
	 * 支付宝用户id
	 */
	@ApiField("driver_user_id")
	private String driverUserId;

	/**
	 * 签到时间
	 */
	@ApiField("gmt_signin")
	private Date gmtSignin;

	/**
	 * 签到位置点信息
	 */
	@ApiField("location_info")
	private GPSLocationInfo locationInfo;

	/**
	 * 机具sn
	 */
	@ApiField("machine_sn")
	private String machineSn;

	/**
	 * 机具供应商id
	 */
	@ApiField("machine_supplier_id")
	private String machineSupplierId;

	/**
	 * 请求id,保证全局唯一性
	 */
	@ApiField("request_id")
	private String requestId;

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

	public String getDriverOpenId() {
		return this.driverOpenId;
	}
	public void setDriverOpenId(String driverOpenId) {
		this.driverOpenId = driverOpenId;
	}

	public String getDriverUserId() {
		return this.driverUserId;
	}
	public void setDriverUserId(String driverUserId) {
		this.driverUserId = driverUserId;
	}

	public Date getGmtSignin() {
		return this.gmtSignin;
	}
	public void setGmtSignin(Date gmtSignin) {
		this.gmtSignin = gmtSignin;
	}

	public GPSLocationInfo getLocationInfo() {
		return this.locationInfo;
	}
	public void setLocationInfo(GPSLocationInfo locationInfo) {
		this.locationInfo = locationInfo;
	}

	public String getMachineSn() {
		return this.machineSn;
	}
	public void setMachineSn(String machineSn) {
		this.machineSn = machineSn;
	}

	public String getMachineSupplierId() {
		return this.machineSupplierId;
	}
	public void setMachineSupplierId(String machineSupplierId) {
		this.machineSupplierId = machineSupplierId;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
