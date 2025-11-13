package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 返回结果
 *
 * @author auto create
 * @since 1.0, 2025-05-19 10:42:31
 */
public class NewHouseProject extends AlipayObject {

	private static final long serialVersionUID = 8817565787627692632L;

	/**
	 * 楼盘地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 楼盘别名
	 */
	@ApiField("alias")
	private String alias;

	/**
	 * 楼盘均价(元/平米)
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
	 * 联系人
	 */
	@ApiField("contact_person")
	private String contactPerson;

	/**
	 * 联系人电话
	 */
	@ApiField("contact_person_phone")
	private String contactPersonPhone;

	/**
	 * 占地面积(平方米)
	 */
	@ApiField("cover_area")
	private String coverArea;

	/**
	 * 开发公司
	 */
	@ApiField("development_company")
	private String developmentCompany;

	/**
	 * 区县编码
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 楼盘id
	 */
	@ApiField("estate_project_id")
	private String estateProjectId;

	/**
	 * 楼盘图片
	 */
	@ApiField("estate_project_img")
	private String estateProjectImg;

	/**
	 * 房源标签
	 */
	@ApiField("estate_project_label")
	private String estateProjectLabel;

	/**
	 * 楼盘视频
	 */
	@ApiField("estate_project_video")
	private String estateProjectVideo;

	/**
	 * 外部楼盘id
	 */
	@ApiField("external_id")
	private String externalId;

	/**
	 * 容积率
	 */
	@ApiField("floor_area_ratio")
	private String floorAreaRatio;

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
	 * 名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 预售证
	 */
	@ApiField("presale_certificate")
	private String presaleCertificate;

	/**
	 * 物业费(元/月)
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
	 * 省编码
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 装修
	 */
	@ApiField("renovation")
	private String renovation;

	/**
	 * 售楼处地址
	 */
	@ApiField("sale_address")
	private String saleAddress;

	/**
	 * 房源状态
	 */
	@ApiField("status")
	private String status;

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

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getAlias() {
		return this.alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getAvgPrice() {
		return this.avgPrice;
	}
	public void setAvgPrice(String avgPrice) {
		this.avgPrice = avgPrice;
	}

	public String getBusinessDistrict() {
		return this.businessDistrict;
	}
	public void setBusinessDistrict(String businessDistrict) {
		this.businessDistrict = businessDistrict;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getContactPerson() {
		return this.contactPerson;
	}
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public String getContactPersonPhone() {
		return this.contactPersonPhone;
	}
	public void setContactPersonPhone(String contactPersonPhone) {
		this.contactPersonPhone = contactPersonPhone;
	}

	public String getCoverArea() {
		return this.coverArea;
	}
	public void setCoverArea(String coverArea) {
		this.coverArea = coverArea;
	}

	public String getDevelopmentCompany() {
		return this.developmentCompany;
	}
	public void setDevelopmentCompany(String developmentCompany) {
		this.developmentCompany = developmentCompany;
	}

	public String getDistrictCode() {
		return this.districtCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public String getEstateProjectId() {
		return this.estateProjectId;
	}
	public void setEstateProjectId(String estateProjectId) {
		this.estateProjectId = estateProjectId;
	}

	public String getEstateProjectImg() {
		return this.estateProjectImg;
	}
	public void setEstateProjectImg(String estateProjectImg) {
		this.estateProjectImg = estateProjectImg;
	}

	public String getEstateProjectLabel() {
		return this.estateProjectLabel;
	}
	public void setEstateProjectLabel(String estateProjectLabel) {
		this.estateProjectLabel = estateProjectLabel;
	}

	public String getEstateProjectVideo() {
		return this.estateProjectVideo;
	}
	public void setEstateProjectVideo(String estateProjectVideo) {
		this.estateProjectVideo = estateProjectVideo;
	}

	public String getExternalId() {
		return this.externalId;
	}
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public String getFloorAreaRatio() {
		return this.floorAreaRatio;
	}
	public void setFloorAreaRatio(String floorAreaRatio) {
		this.floorAreaRatio = floorAreaRatio;
	}

	public String getGreeneryRatio() {
		return this.greeneryRatio;
	}
	public void setGreeneryRatio(String greeneryRatio) {
		this.greeneryRatio = greeneryRatio;
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

	public String getPresaleCertificate() {
		return this.presaleCertificate;
	}
	public void setPresaleCertificate(String presaleCertificate) {
		this.presaleCertificate = presaleCertificate;
	}

	public String getPropertyManagementFee() {
		return this.propertyManagementFee;
	}
	public void setPropertyManagementFee(String propertyManagementFee) {
		this.propertyManagementFee = propertyManagementFee;
	}

	public String getPropertyRightYear() {
		return this.propertyRightYear;
	}
	public void setPropertyRightYear(String propertyRightYear) {
		this.propertyRightYear = propertyRightYear;
	}

	public String getPropertyType() {
		return this.propertyType;
	}
	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getRenovation() {
		return this.renovation;
	}
	public void setRenovation(String renovation) {
		this.renovation = renovation;
	}

	public String getSaleAddress() {
		return this.saleAddress;
	}
	public void setSaleAddress(String saleAddress) {
		this.saleAddress = saleAddress;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getSumBuildings() {
		return this.sumBuildings;
	}
	public void setSumBuildings(String sumBuildings) {
		this.sumBuildings = sumBuildings;
	}

	public String getSumUnits() {
		return this.sumUnits;
	}
	public void setSumUnits(String sumUnits) {
		this.sumUnits = sumUnits;
	}

	public String getSupplyCompany() {
		return this.supplyCompany;
	}
	public void setSupplyCompany(String supplyCompany) {
		this.supplyCompany = supplyCompany;
	}

	public String getVehicleUnitRatio() {
		return this.vehicleUnitRatio;
	}
	public void setVehicleUnitRatio(String vehicleUnitRatio) {
		this.vehicleUnitRatio = vehicleUnitRatio;
	}

}
