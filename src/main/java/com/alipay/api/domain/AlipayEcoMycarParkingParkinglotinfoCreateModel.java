package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车生活停车平台录入停车场信息
 *
 * @author auto create
 * @since 1.0, 2018-01-25 08:38:17
 */
public class AlipayEcoMycarParkingParkinglotinfoCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5635375668148262447L;

	/**
	 * 该参数废弃
	 */
	@ApiField("city_id")
	private String cityId;

	/**
	 * 该参数废弃
	 */
	@ApiField("contact_alipay")
	private String contactAlipay;

	/**
	 * 该参数废弃
	 */
	@ApiField("contact_emali")
	private String contactEmali;

	/**
	 * 该参数废弃
	 */
	@ApiField("contact_mobile")
	private String contactMobile;

	/**
	 * 该参数废弃
	 */
	@ApiField("contact_name")
	private String contactName;

	/**
	 * 该参数废弃
	 */
	@ApiField("contact_tel")
	private String contactTel;

	/**
	 * 该参数废弃
	 */
	@ApiField("contact_weixin")
	private String contactWeixin;

	/**
	 * 该参数废弃
	 */
	@ApiField("equipment_name")
	private String equipmentName;

	/**
	 * 该参数废弃
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 该参数废弃
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * ISV停车场ID，由ISV提供，同一个isv或商户范围内唯一
	 */
	@ApiField("out_parking_id")
	private String outParkingId;

	/**
	 * 停车场地址
	 */
	@ApiField("parking_address")
	private String parkingAddress;

	/**
	 * 该参数废弃
	 */
	@ApiField("parking_end_time")
	private String parkingEndTime;

	/**
	 * 收费说明
	 */
	@ApiField("parking_fee_description")
	private String parkingFeeDescription;

	/**
	 * 停车场类型，1为小区停车场、2为商圈停车场、3为路面停车场、4为园区停车场、5为写字楼停车场、6为私人停车场
	 */
	@ApiField("parking_lot_type")
	private String parkingLotType;

	/**
	 * 停车场客服电话
	 */
	@ApiField("parking_mobile")
	private String parkingMobile;

	/**
	 * 停车场名称
	 */
	@ApiField("parking_name")
	private String parkingName;

	/**
	 * 该参数废弃
	 */
	@ApiField("parking_number")
	private String parkingNumber;

	/**
	 * 高德地图唯一标识
	 */
	@ApiField("parking_poiid")
	private String parkingPoiid;

	/**
	 * 该参数废弃
	 */
	@ApiField("parking_start_time")
	private String parkingStartTime;

	/**
	 * 该参数废弃
	 */
	@ApiField("parking_type")
	private String parkingType;

	/**
	 * 支付方式（1为支付宝在线缴费，2为支付宝代扣缴费，3当面付)，如支持多种方式以','进行间隔
	 */
	@ApiField("pay_type")
	private String payType;

	/**
	 * 该参数废弃
	 */
	@ApiField("payment_mode")
	private String paymentMode;

	/**
	 * 商圈id
	 */
	@ApiField("shopingmall_id")
	private String shopingmallId;

	/**
	 * 用户支付未离场的超时时间(以分钟为单位)
	 */
	@ApiField("time_out")
	private String timeOut;

	public String getCityId() {
		return this.cityId;
	}
	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public String getContactAlipay() {
		return this.contactAlipay;
	}
	public void setContactAlipay(String contactAlipay) {
		this.contactAlipay = contactAlipay;
	}

	public String getContactEmali() {
		return this.contactEmali;
	}
	public void setContactEmali(String contactEmali) {
		this.contactEmali = contactEmali;
	}

	public String getContactMobile() {
		return this.contactMobile;
	}
	public void setContactMobile(String contactMobile) {
		this.contactMobile = contactMobile;
	}

	public String getContactName() {
		return this.contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactTel() {
		return this.contactTel;
	}
	public void setContactTel(String contactTel) {
		this.contactTel = contactTel;
	}

	public String getContactWeixin() {
		return this.contactWeixin;
	}
	public void setContactWeixin(String contactWeixin) {
		this.contactWeixin = contactWeixin;
	}

	public String getEquipmentName() {
		return this.equipmentName;
	}
	public void setEquipmentName(String equipmentName) {
		this.equipmentName = equipmentName;
	}

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return this.longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getOutParkingId() {
		return this.outParkingId;
	}
	public void setOutParkingId(String outParkingId) {
		this.outParkingId = outParkingId;
	}

	public String getParkingAddress() {
		return this.parkingAddress;
	}
	public void setParkingAddress(String parkingAddress) {
		this.parkingAddress = parkingAddress;
	}

	public String getParkingEndTime() {
		return this.parkingEndTime;
	}
	public void setParkingEndTime(String parkingEndTime) {
		this.parkingEndTime = parkingEndTime;
	}

	public String getParkingFeeDescription() {
		return this.parkingFeeDescription;
	}
	public void setParkingFeeDescription(String parkingFeeDescription) {
		this.parkingFeeDescription = parkingFeeDescription;
	}

	public String getParkingLotType() {
		return this.parkingLotType;
	}
	public void setParkingLotType(String parkingLotType) {
		this.parkingLotType = parkingLotType;
	}

	public String getParkingMobile() {
		return this.parkingMobile;
	}
	public void setParkingMobile(String parkingMobile) {
		this.parkingMobile = parkingMobile;
	}

	public String getParkingName() {
		return this.parkingName;
	}
	public void setParkingName(String parkingName) {
		this.parkingName = parkingName;
	}

	public String getParkingNumber() {
		return this.parkingNumber;
	}
	public void setParkingNumber(String parkingNumber) {
		this.parkingNumber = parkingNumber;
	}

	public String getParkingPoiid() {
		return this.parkingPoiid;
	}
	public void setParkingPoiid(String parkingPoiid) {
		this.parkingPoiid = parkingPoiid;
	}

	public String getParkingStartTime() {
		return this.parkingStartTime;
	}
	public void setParkingStartTime(String parkingStartTime) {
		this.parkingStartTime = parkingStartTime;
	}

	public String getParkingType() {
		return this.parkingType;
	}
	public void setParkingType(String parkingType) {
		this.parkingType = parkingType;
	}

	public String getPayType() {
		return this.payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getPaymentMode() {
		return this.paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public String getShopingmallId() {
		return this.shopingmallId;
	}
	public void setShopingmallId(String shopingmallId) {
		this.shopingmallId = shopingmallId;
	}

	public String getTimeOut() {
		return this.timeOut;
	}
	public void setTimeOut(String timeOut) {
		this.timeOut = timeOut;
	}

}
