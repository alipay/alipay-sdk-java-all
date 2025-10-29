package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付宝Poi查询结果
 *
 * @author auto create
 * @since 1.0, 2019-11-07 13:45:42
 */
public class PoiQueryResult extends AlipayObject {

	private static final long serialVersionUID = 8474329176981443965L;

	/**
	 * 地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 英文地址
	 */
	@ApiField("address_en")
	private String addressEn;

	/**
	 * 当地地址
	 */
	@ApiField("address_local")
	private String addressLocal;

	/**
	 * 备用号码
	 */
	@ApiField("alternative_phone")
	private String alternativePhone;

	/**
	 * 简介
	 */
	@ApiField("bios")
	private String bios;

	/**
	 * 品牌信息
	 */
	@ApiField("brand_info")
	private StructureBrandInfo brandInfo;

	/**
	 * 服务时间
	 */
	@ApiField("business_hour")
	private String businessHour;

	/**
	 * 类目
	 */
	@ApiField("category")
	private String category;

	/**
	 * 城市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 商圈
	 */
	@ApiField("commercial_circle")
	private String commercialCircle;

	/**
	 * 人均消费
	 */
	@ApiField("consumption")
	private String consumption;

	/**
	 * 国家码
	 */
	@ApiField("country_code")
	private String countryCode;

	/**
	 * 国家
	 */
	@ApiField("country_name")
	private String countryName;

	/**
	 * 描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 扩展信息
	 */
	@ApiField("extend_map")
	private String extendMap;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/**
	 * 更新时间
	 */
	@ApiField("gmt_modified")
	private String gmtModified;

	/**
	 * 纬度
	 */
	@ApiField("lat")
	private String lat;

	/**
	 * 经度
	 */
	@ApiField("lng")
	private String lng;

	/**
	 * 当地语言
	 */
	@ApiField("local_language")
	private String localLanguage;

	/**
	 * 本地名
	 */
	@ApiField("local_name")
	private String localName;

	/**
	 * 电话
	 */
	@ApiField("main_phone")
	private String mainPhone;

	/**
	 * 地名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 别名
	 */
	@ApiField("name_alias")
	private String nameAlias;

	/**
	 * 英文名
	 */
	@ApiField("name_en")
	private String nameEn;

	/**
	 * 下线详细原因
	 */
	@ApiField("offline_reason_detail")
	private String offlineReasonDetail;

	/**
	 * poi状态
	 */
	@ApiField("open_status")
	private Long openStatus;

	/**
	 * 开放时间
	 */
	@ApiField("open_time")
	private String openTime;

	/**
	 * 操作类型(0:新增 1:更新)
	 */
	@ApiField("operator_type")
	private Long operatorType;

	/**
	 * 图片地址(,分隔多张)
	 */
	@ApiListField("photo_urls")
	@ApiField("string")
	private List<String> photoUrls;

	/**
	 * poiId(飞猪端poiId)
	 */
	@ApiField("poi_id")
	private Long poiId;

	/**
	 * 邮编
	 */
	@ApiField("postal_code")
	private String postalCode;

	/**
	 * 省
	 */
	@ApiField("province")
	private String province;

	/**
	 * 推荐信息
	 */
	@ApiField("recommend_infos")
	private String recommendInfos;

	/**
	 * 认领主账号id
	 */
	@ApiField("seller_id")
	private Long sellerId;

	/**
	 * 服务详情
	 */
	@ApiField("service_info")
	private StructureServiceInfo serviceInfo;

	/**
	 * 支付宝店铺id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 店铺类型
	 */
	@ApiField("shop_type")
	private String shopType;

	/**
	 * 外部源唯一id
	 */
	@ApiField("source_biz_id")
	private String sourceBizId;

	/**
	 * 中台门店id
	 */
	@ApiField("store_id")
	private Long storeId;

	/**
	 * 子账号id
	 */
	@ApiField("sub_seller_id")
	private Long subSellerId;

	/**
	 * 手机号
	 */
	@ApiField("telephone")
	private String telephone;

	/**
	 * 交通
	 */
	@ApiField("transport")
	private String transport;

	/**
	 * 类型
	 */
	@ApiField("type")
	private Long type;

	/**
	 * 视频url
	 */
	@ApiField("video_url")
	private String videoUrl;

	/**
	 * 外部url
	 */
	@ApiField("web_site_url")
	private String webSiteUrl;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddressEn() {
		return this.addressEn;
	}
	public void setAddressEn(String addressEn) {
		this.addressEn = addressEn;
	}

	public String getAddressLocal() {
		return this.addressLocal;
	}
	public void setAddressLocal(String addressLocal) {
		this.addressLocal = addressLocal;
	}

	public String getAlternativePhone() {
		return this.alternativePhone;
	}
	public void setAlternativePhone(String alternativePhone) {
		this.alternativePhone = alternativePhone;
	}

	public String getBios() {
		return this.bios;
	}
	public void setBios(String bios) {
		this.bios = bios;
	}

	public StructureBrandInfo getBrandInfo() {
		return this.brandInfo;
	}
	public void setBrandInfo(StructureBrandInfo brandInfo) {
		this.brandInfo = brandInfo;
	}

	public String getBusinessHour() {
		return this.businessHour;
	}
	public void setBusinessHour(String businessHour) {
		this.businessHour = businessHour;
	}

	public String getCategory() {
		return this.category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getCommercialCircle() {
		return this.commercialCircle;
	}
	public void setCommercialCircle(String commercialCircle) {
		this.commercialCircle = commercialCircle;
	}

	public String getConsumption() {
		return this.consumption;
	}
	public void setConsumption(String consumption) {
		this.consumption = consumption;
	}

	public String getCountryCode() {
		return this.countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCountryName() {
		return this.countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getExtendMap() {
		return this.extendMap;
	}
	public void setExtendMap(String extendMap) {
		this.extendMap = extendMap;
	}

	public String getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getLat() {
		return this.lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLng() {
		return this.lng;
	}
	public void setLng(String lng) {
		this.lng = lng;
	}

	public String getLocalLanguage() {
		return this.localLanguage;
	}
	public void setLocalLanguage(String localLanguage) {
		this.localLanguage = localLanguage;
	}

	public String getLocalName() {
		return this.localName;
	}
	public void setLocalName(String localName) {
		this.localName = localName;
	}

	public String getMainPhone() {
		return this.mainPhone;
	}
	public void setMainPhone(String mainPhone) {
		this.mainPhone = mainPhone;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getNameAlias() {
		return this.nameAlias;
	}
	public void setNameAlias(String nameAlias) {
		this.nameAlias = nameAlias;
	}

	public String getNameEn() {
		return this.nameEn;
	}
	public void setNameEn(String nameEn) {
		this.nameEn = nameEn;
	}

	public String getOfflineReasonDetail() {
		return this.offlineReasonDetail;
	}
	public void setOfflineReasonDetail(String offlineReasonDetail) {
		this.offlineReasonDetail = offlineReasonDetail;
	}

	public Long getOpenStatus() {
		return this.openStatus;
	}
	public void setOpenStatus(Long openStatus) {
		this.openStatus = openStatus;
	}

	public String getOpenTime() {
		return this.openTime;
	}
	public void setOpenTime(String openTime) {
		this.openTime = openTime;
	}

	public Long getOperatorType() {
		return this.operatorType;
	}
	public void setOperatorType(Long operatorType) {
		this.operatorType = operatorType;
	}

	public List<String> getPhotoUrls() {
		return this.photoUrls;
	}
	public void setPhotoUrls(List<String> photoUrls) {
		this.photoUrls = photoUrls;
	}

	public Long getPoiId() {
		return this.poiId;
	}
	public void setPoiId(Long poiId) {
		this.poiId = poiId;
	}

	public String getPostalCode() {
		return this.postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

	public String getRecommendInfos() {
		return this.recommendInfos;
	}
	public void setRecommendInfos(String recommendInfos) {
		this.recommendInfos = recommendInfos;
	}

	public Long getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(Long sellerId) {
		this.sellerId = sellerId;
	}

	public StructureServiceInfo getServiceInfo() {
		return this.serviceInfo;
	}
	public void setServiceInfo(StructureServiceInfo serviceInfo) {
		this.serviceInfo = serviceInfo;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getShopType() {
		return this.shopType;
	}
	public void setShopType(String shopType) {
		this.shopType = shopType;
	}

	public String getSourceBizId() {
		return this.sourceBizId;
	}
	public void setSourceBizId(String sourceBizId) {
		this.sourceBizId = sourceBizId;
	}

	public Long getStoreId() {
		return this.storeId;
	}
	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}

	public Long getSubSellerId() {
		return this.subSellerId;
	}
	public void setSubSellerId(Long subSellerId) {
		this.subSellerId = subSellerId;
	}

	public String getTelephone() {
		return this.telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getTransport() {
		return this.transport;
	}
	public void setTransport(String transport) {
		this.transport = transport;
	}

	public Long getType() {
		return this.type;
	}
	public void setType(Long type) {
		this.type = type;
	}

	public String getVideoUrl() {
		return this.videoUrl;
	}
	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}

	public String getWebSiteUrl() {
		return this.webSiteUrl;
	}
	public void setWebSiteUrl(String webSiteUrl) {
		this.webSiteUrl = webSiteUrl;
	}

}
