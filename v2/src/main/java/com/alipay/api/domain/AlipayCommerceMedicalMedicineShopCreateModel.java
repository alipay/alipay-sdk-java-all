package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 医疗药品门店创建接口
 *
 * @author auto create
 * @since 1.0, 2024-06-12 16:03:03
 */
public class AlipayCommerceMedicalMedicineShopCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5215473253141344296L;

	/**
	 * 门店所在位置的详细地址，需精确到门牌号
	 */
	@ApiField("address")
	private String address;

	/**
	 * 门店营业状态
	 */
	@ApiField("business_status")
	private String businessStatus;

	/**
	 * 多个时间段按当天的从早到晚顺序，不能重叠、不能跨天；最多5个时间段
	 */
	@ApiListField("business_time")
	@ApiField("medical_shop_time_period")
	private List<MedicalShopTimePeriod> businessTime;

	/**
	 * 门店所在城市编码。按照<a href="https://mdn.alipayobjects.com/huamei_sm7gq8/afts/file/A*blT9RqSR9_gAAAAAAAAAAAAADuKQAQ/2022%E8%9A%82%E8%9A%81%E9%87%91%E6%9C%8D%E5%9C%B0%E5%8C%BA%E7%A0%81.xlsx" target="_blank">蚂蚁店铺地区码</a>填写
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 门店配送配置信息
	 */
	@ApiListField("delivery_info")
	@ApiField("medical_shop_delivery_info")
	private List<MedicalShopDeliveryInfo> deliveryInfo;

	/**
	 * 门店所在区县编码。按照<a href="https://mdn.alipayobjects.com/huamei_sm7gq8/afts/file/A*blT9RqSR9_gAAAAAAAAAAAAADuKQAQ/2022%E8%9A%82%E8%9A%81%E9%87%91%E6%9C%8D%E5%9C%B0%E5%8C%BA%E7%A0%81.xlsx" target="_blank">蚂蚁店铺地区码</a>填写
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 1. 门店所在位置纬度；精确到小数点后6位；
2. 采用火星坐标系标准，其他坐标系需提前转换；
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 1. 门店所在位置经度；精确到小数点后6位；
2. 采用火星坐标系标准，其他坐标系需提前转换；
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 营销活动列表，
同一活动类型下，最多6个营销活动,
同一店铺下，同一活动类型下，多个营销活动时间段不重叠，多个时间段按当天的从早到晚顺序，不能重叠、不能跨天
	 */
	@ApiListField("marketing_activity")
	@ApiField("medical_shop_marketing_activity")
	private List<MedicalShopMarketingActivity> marketingActivity;

	/**
	 * 国家医保局最新标准的定点医药机构编码
	 */
	@ApiField("medical_org_no")
	private String medicalOrgNo;

	/**
	 * 商家的门店唯一标识，需保证商户PID维度唯一
	 */
	@ApiField("out_store_id")
	private String outStoreId;

	/**
	 * 高德地图poiid
	 */
	@ApiField("poiid")
	private String poiid;

	/**
	 * 门店所在省份编码。按照<a href="https://mdn.alipayobjects.com/huamei_sm7gq8/afts/file/A*blT9RqSR9_gAAAAAAAAAAAAADuKQAQ/2022%E8%9A%82%E8%9A%81%E9%87%91%E6%9C%8D%E5%9C%B0%E5%8C%BA%E7%A0%81.xlsx" target="_blank">蚂蚁店铺地区码</a>填写
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 门店经营类目
	 */
	@ApiField("shop_category")
	private String shopCategory;

	/**
	 * 通过<a href="https://opendocs.alipay.com/mini/3fade898_alipay.marketing.image.enhance.upload" target="_blank">alipay.marketing.image.enhance.upload</a>接口上传图片后获取文件Id
	 */
	@ApiField("shop_logo")
	private String shopLogo;

	/**
	 * 门店名称。不要包含生僻字和特殊符号
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 门店标签，用于营销和展示
	 */
	@ApiListField("shop_tags")
	@ApiField("medical_shop_tag")
	private List<MedicalShopTag> shopTags;

	/**
	 * 店铺经营类型，01表示直营，02表示加盟
	 */
	@ApiField("shop_type")
	private String shopType;

	/**
	 * 支付宝小程序URL
	 */
	@ApiField("shop_url")
	private String shopUrl;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getBusinessStatus() {
		return this.businessStatus;
	}
	public void setBusinessStatus(String businessStatus) {
		this.businessStatus = businessStatus;
	}

	public List<MedicalShopTimePeriod> getBusinessTime() {
		return this.businessTime;
	}
	public void setBusinessTime(List<MedicalShopTimePeriod> businessTime) {
		this.businessTime = businessTime;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public List<MedicalShopDeliveryInfo> getDeliveryInfo() {
		return this.deliveryInfo;
	}
	public void setDeliveryInfo(List<MedicalShopDeliveryInfo> deliveryInfo) {
		this.deliveryInfo = deliveryInfo;
	}

	public String getDistrictCode() {
		return this.districtCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
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

	public List<MedicalShopMarketingActivity> getMarketingActivity() {
		return this.marketingActivity;
	}
	public void setMarketingActivity(List<MedicalShopMarketingActivity> marketingActivity) {
		this.marketingActivity = marketingActivity;
	}

	public String getMedicalOrgNo() {
		return this.medicalOrgNo;
	}
	public void setMedicalOrgNo(String medicalOrgNo) {
		this.medicalOrgNo = medicalOrgNo;
	}

	public String getOutStoreId() {
		return this.outStoreId;
	}
	public void setOutStoreId(String outStoreId) {
		this.outStoreId = outStoreId;
	}

	public String getPoiid() {
		return this.poiid;
	}
	public void setPoiid(String poiid) {
		this.poiid = poiid;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getShopCategory() {
		return this.shopCategory;
	}
	public void setShopCategory(String shopCategory) {
		this.shopCategory = shopCategory;
	}

	public String getShopLogo() {
		return this.shopLogo;
	}
	public void setShopLogo(String shopLogo) {
		this.shopLogo = shopLogo;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public List<MedicalShopTag> getShopTags() {
		return this.shopTags;
	}
	public void setShopTags(List<MedicalShopTag> shopTags) {
		this.shopTags = shopTags;
	}

	public String getShopType() {
		return this.shopType;
	}
	public void setShopType(String shopType) {
		this.shopType = shopType;
	}

	public String getShopUrl() {
		return this.shopUrl;
	}
	public void setShopUrl(String shopUrl) {
		this.shopUrl = shopUrl;
	}

}
