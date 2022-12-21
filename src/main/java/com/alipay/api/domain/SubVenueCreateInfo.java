package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 子场馆入驻详情信息
 *
 * @author auto create
 * @since 1.0, 2022-12-06 14:18:05
 */
public class SubVenueCreateInfo extends AlipayObject {

	private static final long serialVersionUID = 5482786275274168778L;

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
	 * 是否可预定 Y/N  （不传值默认为可预定）
	 */
	@ApiField("bookable")
	private String bookable;

	/**
	 * 场馆介绍
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 器材租赁信息
	 */
	@ApiField("equipment_rental")
	private String equipmentRental;

	/**
	 * 场馆设置（传数字）：1地板、2灯光、3淋浴、4餐饮、5WiFi、6更衣室、7充电宝、8停车场、9休息区
	 */
	@ApiListField("facility_list")
	@ApiField("number")
	private List<Long> facilityList;

	/**
	 * 场馆名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 营业时间，不传以主场馆营业时间为准.
开始时间 - 结束时间
	 */
	@ApiField("opening_hours")
	private String openingHours;

	/**
	 * 子场馆在服务商的ID
	 */
	@ApiField("out_sub_venue_id")
	private String outSubVenueId;

	/**
	 * （半中心化场馆）不填
（中心化场馆）收款方支付宝账户，当payment_method为空或account时必传
	 */
	@ApiField("payee_account")
	private String payeeAccount;

	/**
	 * 收款方式
空值/account：通过支付宝账号收款
smid：通过smid收款
	 */
	@ApiField("payment_method")
	private String paymentMethod;

	/**
	 * （半中心化场馆）不填，
（中心化场馆）收款类型
（indirect=间连/direct=直连）
直连：收款方为商户/场馆
间连：收款方为服务商
	 */
	@ApiField("payment_type")
	private String paymentType;

	/**
	 * 联系电话
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
	 * 场馆主图海报图片的Base64编码 （注：1.图片的格式必须是jpg的；2.图片大小不超过125KB；3.非Data URI格式，请直接填写原文件的base64编码）
	 */
	@ApiField("poster")
	private String poster;

	/**
	 * （半中心化场馆）不填
（中心化场馆） 场馆售卖产品类型集合
calendar：价格日历
ticket：票券
course: 课程
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
	 * 场馆维度的推荐价格
	 */
	@ApiField("rec_price")
	private String recPrice;

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
	 * 培训信息
	 */
	@ApiField("training")
	private String training;

	/**
	 * 场馆类型，
01足球；02篮球；03乒乓球；04羽毛球；05台球；06射箭；07哒哒球；08游泳；09网球；10攀岩；11空手道；12跆拳道；14瑜伽；15搏击；16舞蹈；17艺术体操；18太极；19击剑；20水上运动；21滑雪；22健身；23滑冰；24排球；25门球；26轮滑；00其他运动
	 */
	@ApiField("venue_type")
	private String venueType;

	/**
	 * 会员卡信息
	 */
	@ApiField("vip")
	private String vip;

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

	public String getBookable() {
		return this.bookable;
	}
	public void setBookable(String bookable) {
		this.bookable = bookable;
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

	public List<Long> getFacilityList() {
		return this.facilityList;
	}
	public void setFacilityList(List<Long> facilityList) {
		this.facilityList = facilityList;
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

	public String getOutSubVenueId() {
		return this.outSubVenueId;
	}
	public void setOutSubVenueId(String outSubVenueId) {
		this.outSubVenueId = outSubVenueId;
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

	public String getRecPrice() {
		return this.recPrice;
	}
	public void setRecPrice(String recPrice) {
		this.recPrice = recPrice;
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

	public String getTraining() {
		return this.training;
	}
	public void setTraining(String training) {
		this.training = training;
	}

	public String getVenueType() {
		return this.venueType;
	}
	public void setVenueType(String venueType) {
		this.venueType = venueType;
	}

	public String getVip() {
		return this.vip;
	}
	public void setVip(String vip) {
		this.vip = vip;
	}

}
