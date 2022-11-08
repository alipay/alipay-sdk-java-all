package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 场馆修改（新）
 *
 * @author auto create
 * @since 1.0, 2022-03-04 16:16:08
 */
public class AlipayCommerceSportsVenueSimpleModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8489162916724598191L;

	/**
	 * 具体地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 入场要求
	 */
	@ApiField("admission_requirement")
	private String admissionRequirement;

	/**
	 * 公告
	 */
	@ApiField("announcement")
	private String announcement;

	/**
	 * 区域code
	 */
	@ApiField("area_code")
	private String areaCode;

	/**
	 * 是否为“测试场馆”。如果上传的场馆为想要进行测试的非正式场馆，则填写“Y”。如上传正式场馆，则不传或填写为N
	 */
	@ApiField("bookable")
	private String bookable;

	/**
	 * 城市code
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 场馆描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 器材租赁信息
	 */
	@ApiField("equipment_rental")
	private String equipmentRental;

	/**
	 * 场馆更多服务链接：可从文体场馆页跳转进此链接，进入服务商的该场馆页面
	 */
	@ApiField("extra_service_url")
	private String extraServiceUrl;

	/**
	 * 场馆设置（传数字）：1地板、2灯光、3淋浴、4餐饮、5WiFi 、6更衣室、7充电宝、8停车场、9休息区
	 */
	@ApiListField("facility_list")
	@ApiField("number")
	private List<Long> facilityList;

	/**
	 * 接入方式： center = 中心化 (场馆走文体中心统一规范）； half_center = 半中心化 （场馆走服务商的跳转链接）。 半中心化场馆如修改为中心化场馆，请注意数据补全
	 */
	@ApiField("join_type")
	private String joinType;

	/**
	 * 纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 场馆名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 营业时间 开始时间 - 结束时间； (注：全英文符号）
	 */
	@ApiField("opening_hours")
	private String openingHours;

	/**
	 * 主场馆在服务商的id，不可变更
	 */
	@ApiField("out_venue_id")
	private String outVenueId;

	/**
	 * （半中心化场馆）不填; （中心化场馆）收款方支付宝账户，当payment_method为空或account时必传
	 */
	@ApiField("payee_account")
	private String payeeAccount;

	/**
	 * 收款方式 空值/account：通过支付宝账号收款； smid：通过smid收款
	 */
	@ApiField("payment_method")
	private String paymentMethod;

	/**
	 * （半中心化场馆）不填; （中心化场馆）收款类型 （indirect=间连/direct=直连） 直连：收款方为商户/场馆 间连：收款方为服务商
	 */
	@ApiField("payment_type")
	private String paymentType;

	/**
	 * 联系电话，多个逗号隔开
	 */
	@ApiListField("phone")
	@ApiField("string")
	private List<String> phone;

	/**
	 * 场馆图片编码列表 最多5张，逗号隔开 图片要求参考场馆主图
	 */
	@ApiListField("picture_list")
	@ApiField("string")
	private List<String> pictureList;

	/**
	 * POI
	 */
	@ApiField("poi")
	private String poi;

	/**
	 * 场馆主图海报图片的Base64编码（注：1.图片的格式必须是jpg的；2.图片大小不超过125KB；3.非Data URI格式，请直接填写原文件的base64编码）
	 */
	@ApiField("poster")
	private String poster;

	/**
	 * 场馆售卖产品类型集合 calendar：价格日历 ticket：票券 course: 课程。 （注：中心化场馆必填，半中心化场馆不用填）
	 */
	@ApiListField("product_type_list")
	@ApiField("string")
	private List<String> productTypeList;

	/**
	 * 促销信息
	 */
	@ApiField("promotion")
	private String promotion;

	/**
	 * 省份code
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 场馆维度的推荐价格
	 */
	@ApiField("rec_price")
	private String recPrice;

	/**
	 * 变更状态，online/offline
	 */
	@ApiField("status")
	private String status;

	/**
	 * 子场馆pid（payment_method为smid时必传）
	 */
	@ApiField("sub_venue_pid")
	private String subVenuePid;

	/**
	 * 子场馆商户二级smid（payment_method为smid时必传）
	 */
	@ApiField("sub_venue_smid")
	private String subVenueSmid;

	/**
	 * 标签列表
	 */
	@ApiListField("tag_list")
	@ApiField("string")
	private List<String> tagList;

	/**
	 * 交通信息
	 */
	@ApiField("traffic")
	private String traffic;

	/**
	 * 培训信息
	 */
	@ApiField("training")
	private String training;

	/**
	 * 支付宝主场馆ID，不可变更
	 */
	@ApiField("venue_id")
	private String venueId;

	/**
	 * 场馆商户pid
	 */
	@ApiField("venue_pid")
	private String venuePid;

	/**
	 * 场馆类型， 01足球；02篮球；03乒乓球；04羽毛球；05台球；06射箭；07哒哒球；08游泳；09网球；10攀岩；11空手道；12跆拳道；14瑜伽；15搏击；16舞蹈；17艺术体操；18太极；19击剑；20水上运动；21冰雪（滑冰、滑雪）；22健身；23轮滑；24排球；25门球；00其他运动
	 */
	@ApiListField("venue_type")
	@ApiField("string")
	private List<String> venueType;

	/**
	 * 会员卡信息
	 */
	@ApiField("vip")
	private String vip;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getAdmissionRequirement() {
		return this.admissionRequirement;
	}
	public void setAdmissionRequirement(String admissionRequirement) {
		this.admissionRequirement = admissionRequirement;
	}

	public String getAnnouncement() {
		return this.announcement;
	}
	public void setAnnouncement(String announcement) {
		this.announcement = announcement;
	}

	public String getAreaCode() {
		return this.areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getBookable() {
		return this.bookable;
	}
	public void setBookable(String bookable) {
		this.bookable = bookable;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getEquipmentRental() {
		return this.equipmentRental;
	}
	public void setEquipmentRental(String equipmentRental) {
		this.equipmentRental = equipmentRental;
	}

	public String getExtraServiceUrl() {
		return this.extraServiceUrl;
	}
	public void setExtraServiceUrl(String extraServiceUrl) {
		this.extraServiceUrl = extraServiceUrl;
	}

	public List<Long> getFacilityList() {
		return this.facilityList;
	}
	public void setFacilityList(List<Long> facilityList) {
		this.facilityList = facilityList;
	}

	public String getJoinType() {
		return this.joinType;
	}
	public void setJoinType(String joinType) {
		this.joinType = joinType;
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

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOpeningHours() {
		return this.openingHours;
	}
	public void setOpeningHours(String openingHours) {
		this.openingHours = openingHours;
	}

	public String getOutVenueId() {
		return this.outVenueId;
	}
	public void setOutVenueId(String outVenueId) {
		this.outVenueId = outVenueId;
	}

	public String getPayeeAccount() {
		return this.payeeAccount;
	}
	public void setPayeeAccount(String payeeAccount) {
		this.payeeAccount = payeeAccount;
	}

	public String getPaymentMethod() {
		return this.paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getPaymentType() {
		return this.paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public List<String> getPhone() {
		return this.phone;
	}
	public void setPhone(List<String> phone) {
		this.phone = phone;
	}

	public List<String> getPictureList() {
		return this.pictureList;
	}
	public void setPictureList(List<String> pictureList) {
		this.pictureList = pictureList;
	}

	public String getPoi() {
		return this.poi;
	}
	public void setPoi(String poi) {
		this.poi = poi;
	}

	public String getPoster() {
		return this.poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}

	public List<String> getProductTypeList() {
		return this.productTypeList;
	}
	public void setProductTypeList(List<String> productTypeList) {
		this.productTypeList = productTypeList;
	}

	public String getPromotion() {
		return this.promotion;
	}
	public void setPromotion(String promotion) {
		this.promotion = promotion;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getRecPrice() {
		return this.recPrice;
	}
	public void setRecPrice(String recPrice) {
		this.recPrice = recPrice;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getSubVenuePid() {
		return this.subVenuePid;
	}
	public void setSubVenuePid(String subVenuePid) {
		this.subVenuePid = subVenuePid;
	}

	public String getSubVenueSmid() {
		return this.subVenueSmid;
	}
	public void setSubVenueSmid(String subVenueSmid) {
		this.subVenueSmid = subVenueSmid;
	}

	public List<String> getTagList() {
		return this.tagList;
	}
	public void setTagList(List<String> tagList) {
		this.tagList = tagList;
	}

	public String getTraffic() {
		return this.traffic;
	}
	public void setTraffic(String traffic) {
		this.traffic = traffic;
	}

	public String getTraining() {
		return this.training;
	}
	public void setTraining(String training) {
		this.training = training;
	}

	public String getVenueId() {
		return this.venueId;
	}
	public void setVenueId(String venueId) {
		this.venueId = venueId;
	}

	public String getVenuePid() {
		return this.venuePid;
	}
	public void setVenuePid(String venuePid) {
		this.venuePid = venuePid;
	}

	public List<String> getVenueType() {
		return this.venueType;
	}
	public void setVenueType(List<String> venueType) {
		this.venueType = venueType;
	}

	public String getVip() {
		return this.vip;
	}
	public void setVip(String vip) {
		this.vip = vip;
	}

}
