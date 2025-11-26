package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 场馆修改
 *
 * @author auto create
 * @since 1.0, 2025-04-14 11:51:06
 */
public class AlipayCommerceSportsVenueModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3246166923574251346L;

	/**
	 * 变更具体位置
	 */
	@ApiField("address")
	private String address;

	/**
	 * 变更区域code
	 */
	@ApiField("area_code")
	private String areaCode;

	/**
	 * 是否可预定 Y/N  （不传默认为可预定）
	 */
	@ApiField("bookable")
	private String bookable;

	/**
	 * 变更城市code
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 变更场馆介绍
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 场馆更多服务链接：可从文体场馆页跳转进此链接，进入服务商的该场馆页面
	 */
	@ApiField("extra_service_url")
	private String extraServiceUrl;

	/**
	 * 接入方式： center = 中心化 (场馆走文体中心统一规范）； half_center = 半中心化 （场馆走服务商的跳转链接）。
半中心化场馆如修改为中心化场馆，请注意数据补全
	 */
	@ApiField("join_type")
	private String joinType;

	/**
	 * 变更纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 变更经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 变更场馆名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 变更营业时间
开始时间 - 结束时间
	 */
	@ApiField("opening_hours")
	private String openingHours;

	/**
	 * 主场馆在服务商的id，不可变更
	 */
	@ApiField("out_venue_id")
	private String outVenueId;

	/**
	 * 变更联系电话
	 */
	@ApiListField("phone")
	@ApiField("string")
	private List<String> phone;

	/**
	 * 变更场馆图片Base64编码列表 最多5张图片。要求参见场馆主图
	 */
	@ApiListField("picture_list")
	@ApiField("string")
	private List<String> pictureList;

	/**
	 * poi
	 */
	@ApiField("poi")
	private String poi;

	/**
	 * 变更场馆主图海报图片的Base64编码 （注：1.图片的格式必须是jpg的；2.图片大小不超过125KB；3.非Data URI格式，请直接填写原文件的base64编码）
	 */
	@ApiField("poster")
	private String poster;

	/**
	 * 场馆售卖产品类型集合，逗号隔开
calendar：价格日历
ticket：票券
course: 课程
	 */
	@ApiListField("product_type_list")
	@ApiField("string")
	private List<String> productTypeList;

	/**
	 * 变更省份code
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 变更状态，online/offline
	 */
	@ApiField("status")
	private String status;

	/**
	 * 子场馆列表
	 */
	@ApiListField("sub_venue_list")
	@ApiField("sub_venue_modify_info")
	private List<SubVenueModifyInfo> subVenueList;

	/**
	 * 变更标签列表
	 */
	@ApiListField("tag_list")
	@ApiField("string")
	private List<String> tagList;

	/**
	 * 变更交通信息
	 */
	@ApiField("traffic")
	private String traffic;

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
	 * 场馆类型，
01足球；02篮球；03乒乓球；04羽毛球；05台球；06射箭；07哒哒球；08游泳；09网球；10攀岩；11空手道；12跆拳道；14瑜伽；15搏击；16舞蹈；17艺术体操；18太极；19击剑；20水上运动；21滑雪；22健身；23轮滑；24排球；25门球；00其他运动
	 */
	@ApiListField("venue_type")
	@ApiField("string")
	private List<String> venueType;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
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

	public String getExtraServiceUrl() {
		return this.extraServiceUrl;
	}
	public void setExtraServiceUrl(String extraServiceUrl) {
		this.extraServiceUrl = extraServiceUrl;
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

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public List<SubVenueModifyInfo> getSubVenueList() {
		return this.subVenueList;
	}
	public void setSubVenueList(List<SubVenueModifyInfo> subVenueList) {
		this.subVenueList = subVenueList;
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

}
