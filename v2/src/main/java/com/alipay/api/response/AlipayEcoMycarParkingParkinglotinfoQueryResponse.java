package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BusinessItem;
import com.alipay.api.domain.ParkingLotChargingRuleInfo;
import com.alipay.api.domain.ParkingLotServiceInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.parking.parkinglotinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-26 10:27:16
 */
public class AlipayEcoMycarParkingParkinglotinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1114896512974528519L;

	/** 
	 * 地区编码
	 */
	@ApiField("address_id")
	private String addressId;

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
	 * 停车场详细计费规则
	 */
	@ApiListField("charging_rule")
	@ApiField("parking_lot_charging_rule_info")
	private List<ParkingLotChargingRuleInfo> chargingRule;

	/** 
	 * 城市编码
	 */
	@ApiField("city_id")
	private String cityId;

	/** 
	 * 高德检索地址
	 */
	@ApiField("map_poi_address")
	private String mapPoiAddress;

	/** 
	 * 高德检索名称
	 */
	@ApiField("map_poi_name")
	private String mapPoiName;

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
	 * 收费说明
	 */
	@ApiField("parking_fee_description")
	private String parkingFeeDescription;

	/** 
	 * 商户在停车平台露出的停车价格图片地址
	 */
	@ApiField("parking_fee_description_img")
	private String parkingFeeDescriptionImg;

	/** 
	 * 支付宝返回停车场id，系统唯一
	 */
	@ApiField("parking_id")
	private String parkingId;

	/** 
	 * 停车场位置经度（优先高德坐标获取结果）单位：度
	 */
	@ApiField("parking_latitude")
	private String parkingLatitude;

	/** 
	 * 停车场位置经度（优先高德坐标获取结果）单位：度
	 */
	@ApiField("parking_longitude")
	private String parkingLongitude;

	/** 
	 * 停车场类型，1为居民小区、2为商圈停车场（购物中心商业广场商场等）、3为路侧停车、4为公园景点（景点乐园公园老街古镇等）、5为商务楼宇（酒店写字楼商务楼园区等）、6为其他、7为交通枢纽（机场火车站汽车站码头港口等）、8为市政设施（体育场博物图书馆医院学校等）、9独立园区（办公工业物流园区等）、10经营场所（4S店、门市餐饮等
	 */
	@ApiField("parking_lot_type")
	private String parkingLotType;

	/** 
	 * 停车场类型，COMMUNITY为居民小区、BUSINESS_AREA为商圈停车场（购物中心商业广场商场等）、ROADSIDE为路侧停车、PARK_SCENIC为公园景点（景点乐园公园老街古镇等）、OFFICE_BUILDING为商务楼宇（酒店写字楼商务楼园区等）、OTHER为其他、TRANSPORTATION为交通枢纽（机场火车站汽车站码头港口等）、PUBLIC_FACILITIES为市政设施（体育场博物图书馆医院学校等）、TERRITORY独立园区（办公工业物流园区等）、BUSINESS_PLACE经营场所（4S店、门市餐饮等
	 */
	@ApiField("parking_lot_type_code")
	private String parkingLotTypeCode;

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
	 * 高德地图唯一标识
	 */
	@ApiField("parking_poiid")
	private String parkingPoiid;

	/** 
	 * 支付方式（1为支付宝在线缴费，2为支付宝代扣缴费，3当面付 4现金)，如支持多种方式以','进行间隔
	 */
	@ApiField("pay_type")
	private String payType;

	/** 
	 * 省份编码
	 */
	@ApiField("province_id")
	private String provinceId;

	/** 
	 * 提供用户查看停车状态、缴费功能
	 */
	@ApiField("serivce_url")
	private String serivceUrl;

	/** 
	 * 停车场服务信息列表
	 */
	@ApiListField("service_list")
	@ApiField("parking_lot_service_info")
	private List<ParkingLotServiceInfo> serviceList;

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

	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}
	public String getAddressId( ) {
		return this.addressId;
	}

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}
	public String getAgentId( ) {
		return this.agentId;
	}

	public void setBusinessIsv(List<BusinessItem> businessIsv) {
		this.businessIsv = businessIsv;
	}
	public List<BusinessItem> getBusinessIsv( ) {
		return this.businessIsv;
	}

	public void setChargingRule(List<ParkingLotChargingRuleInfo> chargingRule) {
		this.chargingRule = chargingRule;
	}
	public List<ParkingLotChargingRuleInfo> getChargingRule( ) {
		return this.chargingRule;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
	}
	public String getCityId( ) {
		return this.cityId;
	}

	public void setMapPoiAddress(String mapPoiAddress) {
		this.mapPoiAddress = mapPoiAddress;
	}
	public String getMapPoiAddress( ) {
		return this.mapPoiAddress;
	}

	public void setMapPoiName(String mapPoiName) {
		this.mapPoiName = mapPoiName;
	}
	public String getMapPoiName( ) {
		return this.mapPoiName;
	}

	public void setMchntId(String mchntId) {
		this.mchntId = mchntId;
	}
	public String getMchntId( ) {
		return this.mchntId;
	}

	public void setOutParkingId(String outParkingId) {
		this.outParkingId = outParkingId;
	}
	public String getOutParkingId( ) {
		return this.outParkingId;
	}

	public void setParkingAddress(String parkingAddress) {
		this.parkingAddress = parkingAddress;
	}
	public String getParkingAddress( ) {
		return this.parkingAddress;
	}

	public void setParkingFeeDescription(String parkingFeeDescription) {
		this.parkingFeeDescription = parkingFeeDescription;
	}
	public String getParkingFeeDescription( ) {
		return this.parkingFeeDescription;
	}

	public void setParkingFeeDescriptionImg(String parkingFeeDescriptionImg) {
		this.parkingFeeDescriptionImg = parkingFeeDescriptionImg;
	}
	public String getParkingFeeDescriptionImg( ) {
		return this.parkingFeeDescriptionImg;
	}

	public void setParkingId(String parkingId) {
		this.parkingId = parkingId;
	}
	public String getParkingId( ) {
		return this.parkingId;
	}

	public void setParkingLatitude(String parkingLatitude) {
		this.parkingLatitude = parkingLatitude;
	}
	public String getParkingLatitude( ) {
		return this.parkingLatitude;
	}

	public void setParkingLongitude(String parkingLongitude) {
		this.parkingLongitude = parkingLongitude;
	}
	public String getParkingLongitude( ) {
		return this.parkingLongitude;
	}

	public void setParkingLotType(String parkingLotType) {
		this.parkingLotType = parkingLotType;
	}
	public String getParkingLotType( ) {
		return this.parkingLotType;
	}

	public void setParkingLotTypeCode(String parkingLotTypeCode) {
		this.parkingLotTypeCode = parkingLotTypeCode;
	}
	public String getParkingLotTypeCode( ) {
		return this.parkingLotTypeCode;
	}

	public void setParkingMobile(String parkingMobile) {
		this.parkingMobile = parkingMobile;
	}
	public String getParkingMobile( ) {
		return this.parkingMobile;
	}

	public void setParkingName(String parkingName) {
		this.parkingName = parkingName;
	}
	public String getParkingName( ) {
		return this.parkingName;
	}

	public void setParkingPoiid(String parkingPoiid) {
		this.parkingPoiid = parkingPoiid;
	}
	public String getParkingPoiid( ) {
		return this.parkingPoiid;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}
	public String getPayType( ) {
		return this.payType;
	}

	public void setProvinceId(String provinceId) {
		this.provinceId = provinceId;
	}
	public String getProvinceId( ) {
		return this.provinceId;
	}

	public void setSerivceUrl(String serivceUrl) {
		this.serivceUrl = serivceUrl;
	}
	public String getSerivceUrl( ) {
		return this.serivceUrl;
	}

	public void setServiceList(List<ParkingLotServiceInfo> serviceList) {
		this.serviceList = serviceList;
	}
	public List<ParkingLotServiceInfo> getServiceList( ) {
		return this.serviceList;
	}

	public void setShopingmallId(String shopingmallId) {
		this.shopingmallId = shopingmallId;
	}
	public String getShopingmallId( ) {
		return this.shopingmallId;
	}

	public void setTimeOut(String timeOut) {
		this.timeOut = timeOut;
	}
	public String getTimeOut( ) {
		return this.timeOut;
	}

}
