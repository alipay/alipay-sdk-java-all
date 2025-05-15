package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.housing.community.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-14 11:12:26
 */
public class AlipayCommerceHousingCommunityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2197214953979221246L;

	/** 
	 * null
	 */
	@ApiListField("apartment_facilities")
	@ApiField("string")
	private List<String> apartmentFacilities;

	/** 
	 * null
	 */
	@ApiListField("apartment_services")
	@ApiField("string")
	private List<String> apartmentServices;

	/** 
	 * 小区均价，单位，***元/平米
	 */
	@ApiField("avg_price")
	private String avgPrice;

	/** 
	 * 商圈
	 */
	@ApiField("business_district")
	private String businessDistrict;

	/** 
	 * 城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/** 
	 * 是否封闭
	 */
	@ApiField("closed_community")
	private String closedCommunity;

	/** 
	 * 小区地址
	 */
	@ApiField("community_address")
	private String communityAddress;

	/** 
	 * 小区别名
	 */
	@ApiField("community_alias")
	private String communityAlias;

	/** 
	 * 小区id
	 */
	@ApiField("community_id")
	private String communityId;

	/** 
	 * null
	 */
	@ApiListField("community_img")
	@ApiField("string")
	private List<String> communityImg;

	/** 
	 * null
	 */
	@ApiListField("community_label")
	@ApiField("string")
	private List<String> communityLabel;

	/** 
	 * 小区名称
	 */
	@ApiField("community_name")
	private String communityName;

	/** 
	 * 小区评价
	 */
	@ApiField("community_reviews")
	private String communityReviews;

	/** 
	 * 小区状态(生效：TAKE_EFFECT
失效：INVALID)
	 */
	@ApiField("community_status")
	private String communityStatus;

	/** 
	 * 小区类型
	 */
	@ApiField("community_type")
	private String communityType;

	/** 
	 * null
	 */
	@ApiListField("community_video")
	@ApiField("string")
	private List<String> communityVideo;

	/** 
	 * 建筑年代
	 */
	@ApiField("construction_year")
	private String constructionYear;

	/** 
	 * 关联联系人
	 */
	@ApiField("contact_person")
	private String contactPerson;

	/** 
	 * 关联联系人电话
	 */
	@ApiField("contact_person_phone")
	private String contactPersonPhone;

	/** 
	 * 开发公司
	 */
	@ApiField("development_company")
	private String developmentCompany;

	/** 
	 * 商圈
	 */
	@ApiField("district_code")
	private String districtCode;

	/** 
	 * 用电类型
	 */
	@ApiField("electricity_type")
	private String electricityType;

	/** 
	 * 外部小区编码
	 */
	@ApiField("external_id")
	private String externalId;

	/** 
	 * 容积率
	 */
	@ApiField("floor_area_ratio")
	private String floorAreaRatio;

	/** 
	 * 燃气费，单位：**元/立方米
	 */
	@ApiField("gas_fee")
	private String gasFee;

	/** 
	 * 绿化率
	 */
	@ApiField("greenery_ratio")
	private String greeneryRatio;

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
	 * 人车分流
	 */
	@ApiField("pedestrian_vehicle_separation")
	private String pedestrianVehicleSeparation;

	/** 
	 * 物业公司
	 */
	@ApiField("property_management_company")
	private String propertyManagementCompany;

	/** 
	 * 物业费，单位，**元/月/平米
	 */
	@ApiField("property_management_fee")
	private String propertyManagementFee;

	/** 
	 * 产权年限
	 */
	@ApiField("property_right_year")
	private String propertyRightYear;

	/** 
	 * 物业类型
	 */
	@ApiField("property_type")
	private String propertyType;

	/** 
	 * 城市编码
	 */
	@ApiField("province_code")
	private String provinceCode;

	/** 
	 * 总栋数
	 */
	@ApiField("sum_buildings")
	private String sumBuildings;

	/** 
	 * 总户数
	 */
	@ApiField("sum_units")
	private String sumUnits;

	/** 
	 * 供给公司
	 */
	@ApiField("supply_company")
	private String supplyCompany;

	/** 
	 * 车户比，单位：个
	 */
	@ApiField("vehicle_unit_ratio")
	private String vehicleUnitRatio;

	/** 
	 * 用水类型
	 */
	@ApiField("water_type")
	private String waterType;

	public void setApartmentFacilities(List<String> apartmentFacilities) {
		this.apartmentFacilities = apartmentFacilities;
	}
	public List<String> getApartmentFacilities( ) {
		return this.apartmentFacilities;
	}

	public void setApartmentServices(List<String> apartmentServices) {
		this.apartmentServices = apartmentServices;
	}
	public List<String> getApartmentServices( ) {
		return this.apartmentServices;
	}

	public void setAvgPrice(String avgPrice) {
		this.avgPrice = avgPrice;
	}
	public String getAvgPrice( ) {
		return this.avgPrice;
	}

	public void setBusinessDistrict(String businessDistrict) {
		this.businessDistrict = businessDistrict;
	}
	public String getBusinessDistrict( ) {
		return this.businessDistrict;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	public String getCityCode( ) {
		return this.cityCode;
	}

	public void setClosedCommunity(String closedCommunity) {
		this.closedCommunity = closedCommunity;
	}
	public String getClosedCommunity( ) {
		return this.closedCommunity;
	}

	public void setCommunityAddress(String communityAddress) {
		this.communityAddress = communityAddress;
	}
	public String getCommunityAddress( ) {
		return this.communityAddress;
	}

	public void setCommunityAlias(String communityAlias) {
		this.communityAlias = communityAlias;
	}
	public String getCommunityAlias( ) {
		return this.communityAlias;
	}

	public void setCommunityId(String communityId) {
		this.communityId = communityId;
	}
	public String getCommunityId( ) {
		return this.communityId;
	}

	public void setCommunityImg(List<String> communityImg) {
		this.communityImg = communityImg;
	}
	public List<String> getCommunityImg( ) {
		return this.communityImg;
	}

	public void setCommunityLabel(List<String> communityLabel) {
		this.communityLabel = communityLabel;
	}
	public List<String> getCommunityLabel( ) {
		return this.communityLabel;
	}

	public void setCommunityName(String communityName) {
		this.communityName = communityName;
	}
	public String getCommunityName( ) {
		return this.communityName;
	}

	public void setCommunityReviews(String communityReviews) {
		this.communityReviews = communityReviews;
	}
	public String getCommunityReviews( ) {
		return this.communityReviews;
	}

	public void setCommunityStatus(String communityStatus) {
		this.communityStatus = communityStatus;
	}
	public String getCommunityStatus( ) {
		return this.communityStatus;
	}

	public void setCommunityType(String communityType) {
		this.communityType = communityType;
	}
	public String getCommunityType( ) {
		return this.communityType;
	}

	public void setCommunityVideo(List<String> communityVideo) {
		this.communityVideo = communityVideo;
	}
	public List<String> getCommunityVideo( ) {
		return this.communityVideo;
	}

	public void setConstructionYear(String constructionYear) {
		this.constructionYear = constructionYear;
	}
	public String getConstructionYear( ) {
		return this.constructionYear;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}
	public String getContactPerson( ) {
		return this.contactPerson;
	}

	public void setContactPersonPhone(String contactPersonPhone) {
		this.contactPersonPhone = contactPersonPhone;
	}
	public String getContactPersonPhone( ) {
		return this.contactPersonPhone;
	}

	public void setDevelopmentCompany(String developmentCompany) {
		this.developmentCompany = developmentCompany;
	}
	public String getDevelopmentCompany( ) {
		return this.developmentCompany;
	}

	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}
	public String getDistrictCode( ) {
		return this.districtCode;
	}

	public void setElectricityType(String electricityType) {
		this.electricityType = electricityType;
	}
	public String getElectricityType( ) {
		return this.electricityType;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}
	public String getExternalId( ) {
		return this.externalId;
	}

	public void setFloorAreaRatio(String floorAreaRatio) {
		this.floorAreaRatio = floorAreaRatio;
	}
	public String getFloorAreaRatio( ) {
		return this.floorAreaRatio;
	}

	public void setGasFee(String gasFee) {
		this.gasFee = gasFee;
	}
	public String getGasFee( ) {
		return this.gasFee;
	}

	public void setGreeneryRatio(String greeneryRatio) {
		this.greeneryRatio = greeneryRatio;
	}
	public String getGreeneryRatio( ) {
		return this.greeneryRatio;
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

	public void setPedestrianVehicleSeparation(String pedestrianVehicleSeparation) {
		this.pedestrianVehicleSeparation = pedestrianVehicleSeparation;
	}
	public String getPedestrianVehicleSeparation( ) {
		return this.pedestrianVehicleSeparation;
	}

	public void setPropertyManagementCompany(String propertyManagementCompany) {
		this.propertyManagementCompany = propertyManagementCompany;
	}
	public String getPropertyManagementCompany( ) {
		return this.propertyManagementCompany;
	}

	public void setPropertyManagementFee(String propertyManagementFee) {
		this.propertyManagementFee = propertyManagementFee;
	}
	public String getPropertyManagementFee( ) {
		return this.propertyManagementFee;
	}

	public void setPropertyRightYear(String propertyRightYear) {
		this.propertyRightYear = propertyRightYear;
	}
	public String getPropertyRightYear( ) {
		return this.propertyRightYear;
	}

	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}
	public String getPropertyType( ) {
		return this.propertyType;
	}

	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}
	public String getProvinceCode( ) {
		return this.provinceCode;
	}

	public void setSumBuildings(String sumBuildings) {
		this.sumBuildings = sumBuildings;
	}
	public String getSumBuildings( ) {
		return this.sumBuildings;
	}

	public void setSumUnits(String sumUnits) {
		this.sumUnits = sumUnits;
	}
	public String getSumUnits( ) {
		return this.sumUnits;
	}

	public void setSupplyCompany(String supplyCompany) {
		this.supplyCompany = supplyCompany;
	}
	public String getSupplyCompany( ) {
		return this.supplyCompany;
	}

	public void setVehicleUnitRatio(String vehicleUnitRatio) {
		this.vehicleUnitRatio = vehicleUnitRatio;
	}
	public String getVehicleUnitRatio( ) {
		return this.vehicleUnitRatio;
	}

	public void setWaterType(String waterType) {
		this.waterType = waterType;
	}
	public String getWaterType( ) {
		return this.waterType;
	}

}
