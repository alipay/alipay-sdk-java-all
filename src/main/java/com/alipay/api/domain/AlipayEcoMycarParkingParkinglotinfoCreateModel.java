package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车生活停车平台录入停车场信息
 *
 * @author auto create
 * @since 1.0, 2019-07-24 20:28:51
 */
public class AlipayEcoMycarParkingParkinglotinfoCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7114272315682336113L;

	/**
	 * 服务商ID（2088开头的16位纯数字），由服务商提供给ISV
	 */
	@ApiField("agent_id")
	private String agentId;

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
	 * 收款方ID（2088开头的16位纯数字），由停车场收款的业主方提供给ISV，该字段暂用于机具和物料申领
	 */
	@ApiField("mchnt_id")
	private String mchntId;

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
	 * 停车场类型，1为居民小区、2为商圈停车场（购物中心商业广场商场等）、3为路侧停车、4为公园景点（景点乐园公园老街古镇等）、5为商务楼宇（酒店写字楼商务楼园区等）、6为其他、7为交通枢纽（机场火车站汽车站码头港口等）、8为市政设施（体育场博物图书馆医院学校等）
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
	 * 高德地图唯一标识，查看方法可参考 https://openclub.alipay.com/club/history/read/5150
若需新增高德兴趣点，请访问高德网站http://map.amap.com/help/index.html?type=addpoi
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

	public String getAgentId() {
		return this.agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

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

	public String getMchntId() {
		return this.mchntId;
	}
	public void setMchntId(String mchntId) {
		this.mchntId = mchntId;
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
