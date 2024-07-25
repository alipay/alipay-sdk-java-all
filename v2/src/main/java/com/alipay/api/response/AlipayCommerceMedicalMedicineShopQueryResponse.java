package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MedicalShopTimePeriod;
import com.alipay.api.domain.MedicalShopDeliveryInfo;
import com.alipay.api.domain.MedicalShopMarketingActivity;
import com.alipay.api.domain.MedicalShopTag;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.medicine.shop.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-12 16:07:04
 */
public class AlipayCommerceMedicalMedicineShopQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5775786173455695794L;

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
	 * 门店所在城市编码。参考<a href="https://mdn.alipayobjects.com/huamei_sm7gq8/afts/file/A*blT9RqSR9_gAAAAAAAAAAAAADuKQAQ/2022%E8%9A%82%E8%9A%81%E9%87%91%E6%9C%8D%E5%9C%B0%E5%8C%BA%E7%A0%81.xlsx">蚂蚁店铺地区码</a>
	 */
	@ApiField("city_code")
	private String cityCode;

	/** 
	 * 门店配送配置信息；最多支持5个配送配置信息
	 */
	@ApiListField("delivery_info")
	@ApiField("medical_shop_delivery_info")
	private List<MedicalShopDeliveryInfo> deliveryInfo;

	/** 
	 * 门店所在区县编码。参考<a href="https://mdn.alipayobjects.com/huamei_sm7gq8/afts/file/A*blT9RqSR9_gAAAAAAAAAAAAADuKQAQ/2022%E8%9A%82%E8%9A%81%E9%87%91%E6%9C%8D%E5%9C%B0%E5%8C%BA%E7%A0%81.xlsx">蚂蚁店铺地区码</a>
	 */
	@ApiField("district_code")
	private String districtCode;

	/** 
	 * 火星坐标系标准
	 */
	@ApiField("latitude")
	private String latitude;

	/** 
	 * 火星坐标系标准
	 */
	@ApiField("longitude")
	private String longitude;

	/** 
	 * 门店营销活动
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
	 * 外部门店Id
	 */
	@ApiField("out_store_id")
	private String outStoreId;

	/** 
	 * 高德地图poiid
	 */
	@ApiField("poiid")
	private String poiid;

	/** 
	 * 门店所在省份编码。参考<a href="https://mdn.alipayobjects.com/huamei_sm7gq8/afts/file/A*blT9RqSR9_gAAAAAAAAAAAAADuKQAQ/2022%E8%9A%82%E8%9A%81%E9%87%91%E6%9C%8D%E5%9C%B0%E5%8C%BA%E7%A0%81.xlsx">蚂蚁店铺地区码</a>
	 */
	@ApiField("province_code")
	private String provinceCode;

	/** 
	 * 门店经营类目
	 */
	@ApiField("shop_category")
	private String shopCategory;

	/** 
	 * 支付宝门店Id
	 */
	@ApiField("shop_id")
	private String shopId;

	/** 
	 * 通过<a href="https://opendocs.alipay.com/mini/3fade898_alipay.marketing.image.enhance.upload">alipay.marketing.image.enhance.upload</a>接口上传图片后获取文件Id
	 */
	@ApiField("shop_logo")
	private String shopLogo;

	/** 
	 * 门店完整名称
	 */
	@ApiField("shop_name")
	private String shopName;

	/** 
	 * 门店标签列表
	 */
	@ApiListField("shop_tags")
	@ApiField("medical_shop_tag")
	private List<MedicalShopTag> shopTags;

	/** 
	 * 门店类型
	 */
	@ApiField("shop_type")
	private String shopType;

	/** 
	 * 支付宝小程序URL
	 */
	@ApiField("shop_url")
	private String shopUrl;

	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress( ) {
		return this.address;
	}

	public void setBusinessStatus(String businessStatus) {
		this.businessStatus = businessStatus;
	}
	public String getBusinessStatus( ) {
		return this.businessStatus;
	}

	public void setBusinessTime(List<MedicalShopTimePeriod> businessTime) {
		this.businessTime = businessTime;
	}
	public List<MedicalShopTimePeriod> getBusinessTime( ) {
		return this.businessTime;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	public String getCityCode( ) {
		return this.cityCode;
	}

	public void setDeliveryInfo(List<MedicalShopDeliveryInfo> deliveryInfo) {
		this.deliveryInfo = deliveryInfo;
	}
	public List<MedicalShopDeliveryInfo> getDeliveryInfo( ) {
		return this.deliveryInfo;
	}

	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}
	public String getDistrictCode( ) {
		return this.districtCode;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLatitude( ) {
		return this.latitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLongitude( ) {
		return this.longitude;
	}

	public void setMarketingActivity(List<MedicalShopMarketingActivity> marketingActivity) {
		this.marketingActivity = marketingActivity;
	}
	public List<MedicalShopMarketingActivity> getMarketingActivity( ) {
		return this.marketingActivity;
	}

	public void setMedicalOrgNo(String medicalOrgNo) {
		this.medicalOrgNo = medicalOrgNo;
	}
	public String getMedicalOrgNo( ) {
		return this.medicalOrgNo;
	}

	public void setOutStoreId(String outStoreId) {
		this.outStoreId = outStoreId;
	}
	public String getOutStoreId( ) {
		return this.outStoreId;
	}

	public void setPoiid(String poiid) {
		this.poiid = poiid;
	}
	public String getPoiid( ) {
		return this.poiid;
	}

	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}
	public String getProvinceCode( ) {
		return this.provinceCode;
	}

	public void setShopCategory(String shopCategory) {
		this.shopCategory = shopCategory;
	}
	public String getShopCategory( ) {
		return this.shopCategory;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public String getShopId( ) {
		return this.shopId;
	}

	public void setShopLogo(String shopLogo) {
		this.shopLogo = shopLogo;
	}
	public String getShopLogo( ) {
		return this.shopLogo;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getShopName( ) {
		return this.shopName;
	}

	public void setShopTags(List<MedicalShopTag> shopTags) {
		this.shopTags = shopTags;
	}
	public List<MedicalShopTag> getShopTags( ) {
		return this.shopTags;
	}

	public void setShopType(String shopType) {
		this.shopType = shopType;
	}
	public String getShopType( ) {
		return this.shopType;
	}

	public void setShopUrl(String shopUrl) {
		this.shopUrl = shopUrl;
	}
	public String getShopUrl( ) {
		return this.shopUrl;
	}

}
