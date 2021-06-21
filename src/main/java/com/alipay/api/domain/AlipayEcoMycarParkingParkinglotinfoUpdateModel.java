package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 修改停车场信息
 *
 * @author auto create
 * @since 1.0, 2021-02-19 20:37:51
 */
public class AlipayEcoMycarParkingParkinglotinfoUpdateModel extends AlipayObject {

	private static final long serialVersionUID = 6519269756525499346L;

	/**
	 * 服务商ID（2088开头的16位纯数字），由服务商提供给ISV
	 */
	@ApiField("agent_id")
	private String agentId;

	/**
	 * 车场业务归属列表
	 */
	@ApiListField("business_isv")
	@ApiField("business_item")
	private List<BusinessItem> businessIsv;

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
	@ApiField("contact_email")
	private String contactEmail;

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
	 * 是否支持电子发票。枚举支持： 
*0：表示不支持。 
*1：表示支持。
	 */
	@ApiField("is_support_invoice")
	private String isSupportInvoice;

	/**
	 * ISV电话，传入original_isv_pid、original_isv_appid时，此处为服务商电话
	 */
	@ApiField("isv_mobile")
	private String isvMobile;

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
	 * 收款方ID（2088开头的16位纯数字），由停车场收款的业主方提供给ISV，该字段暂用于机具和物料申领，更新时不影响交易接口中的收款方值。
	 */
	@ApiField("mchnt_id")
	private String mchntId;

	/**
	 * ISV的APPID,服务商调用必传，由ISV提供给服务商
	 */
	@ApiField("original_isv_appid")
	private String originalIsvAppid;

	/**
	 * ISV电话，此值与isv_mobile组合使用
	 */
	@ApiField("original_isv_mobile")
	private String originalIsvMobile;

	/**
	 * ISV的名称，服务商调用必传，由ISV提供给服务商
	 */
	@ApiField("original_isv_name")
	private String originalIsvName;

	/**
	 * ISV的PID，服务商调用必传,由ISV提供给服务商
	 */
	@ApiField("original_isv_pid")
	private String originalIsvPid;

	/**
	 * 该参数废弃
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
	 * 商户在停车平台露出的停车价格图片；注意：该图片为PNG格式内容为BASE64的字符串，大小不要超过1MB
	 */
	@ApiField("parking_fee_description_img")
	private String parkingFeeDescriptionImg;

	/**
	 * 支付宝返回停车场id，系统唯一
	 */
	@ApiField("parking_id")
	private String parkingId;

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
	 * 停车场名称，由ISV定义，尽量与高德地图上的一致
	 */
	@ApiField("parking_name")
	private String parkingName;

	/**
	 * 该参数废弃
	 */
	@ApiField("parking_number")
	private String parkingNumber;

	/**
	 * 高德地图唯一标识。新增高德兴趣点流程 <a href="https://opensupport.alipay.com/support/helpcenter/311/201602557288?ant_source=zsearch">点此查看详情</a> 。
获取高德兴趣点流程 <a href="https://opensupport.alipay.com/support/helpcenter/311/201602557287?ant_source=zsearch">点此查看详情</a>。
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
	 * 支付方式。枚举支持：
*1：表示支付宝在线缴费。 
*2：表示支付宝代扣缴费。 
*3：表示当面付。 
说明：如支持多种方式以 ',' 进行分隔。
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
	 * 停车场车位数
	 */
	@ApiField("sum_space")
	private String sumSpace;

	/**
	 * 是否支持先离后付。枚举支持： 
*Y：支持。 
*N：不支持。 
说明：默认为空不支持，此参数适用于签约信用代扣的商户。
	 */
	@ApiField("support_after_pay")
	private String supportAfterPay;

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

	public List<BusinessItem> getBusinessIsv() {
		return this.businessIsv;
	}
	public void setBusinessIsv(List<BusinessItem> businessIsv) {
		this.businessIsv = businessIsv;
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

	public String getContactEmail() {
		return this.contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
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

	public String getIsSupportInvoice() {
		return this.isSupportInvoice;
	}
	public void setIsSupportInvoice(String isSupportInvoice) {
		this.isSupportInvoice = isSupportInvoice;
	}

	public String getIsvMobile() {
		return this.isvMobile;
	}
	public void setIsvMobile(String isvMobile) {
		this.isvMobile = isvMobile;
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

	public String getOriginalIsvAppid() {
		return this.originalIsvAppid;
	}
	public void setOriginalIsvAppid(String originalIsvAppid) {
		this.originalIsvAppid = originalIsvAppid;
	}

	public String getOriginalIsvMobile() {
		return this.originalIsvMobile;
	}
	public void setOriginalIsvMobile(String originalIsvMobile) {
		this.originalIsvMobile = originalIsvMobile;
	}

	public String getOriginalIsvName() {
		return this.originalIsvName;
	}
	public void setOriginalIsvName(String originalIsvName) {
		this.originalIsvName = originalIsvName;
	}

	public String getOriginalIsvPid() {
		return this.originalIsvPid;
	}
	public void setOriginalIsvPid(String originalIsvPid) {
		this.originalIsvPid = originalIsvPid;
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

	public String getParkingFeeDescriptionImg() {
		return this.parkingFeeDescriptionImg;
	}
	public void setParkingFeeDescriptionImg(String parkingFeeDescriptionImg) {
		this.parkingFeeDescriptionImg = parkingFeeDescriptionImg;
	}

	public String getParkingId() {
		return this.parkingId;
	}
	public void setParkingId(String parkingId) {
		this.parkingId = parkingId;
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

	public String getSumSpace() {
		return this.sumSpace;
	}
	public void setSumSpace(String sumSpace) {
		this.sumSpace = sumSpace;
	}

	public String getSupportAfterPay() {
		return this.supportAfterPay;
	}
	public void setSupportAfterPay(String supportAfterPay) {
		this.supportAfterPay = supportAfterPay;
	}

	public String getTimeOut() {
		return this.timeOut;
	}
	public void setTimeOut(String timeOut) {
		this.timeOut = timeOut;
	}

}
