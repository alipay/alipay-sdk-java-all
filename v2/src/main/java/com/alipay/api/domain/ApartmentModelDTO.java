package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 返回结果
 *
 * @author auto create
 * @since 1.0, 2025-04-14 11:17:28
 */
public class ApartmentModelDTO extends AlipayObject {

	private static final long serialVersionUID = 6528831359178874856L;

	/**
	 * null
	 */
	@ApiListField("accommodation")
	@ApiField("string")
	private List<String> accommodation;

	/**
	 * 公寓地址
	 */
	@ApiField("apartment_address")
	private String apartmentAddress;

	/**
	 * null
	 */
	@ApiListField("apartment_facilities")
	@ApiField("string")
	private List<String> apartmentFacilities;

	/**
	 * 房源唯一编码
	 */
	@ApiField("apartment_id")
	private String apartmentId;

	/**
	 * null
	 */
	@ApiListField("apartment_img")
	@ApiField("string")
	private List<String> apartmentImg;

	/**
	 * 泊寓**店，**安居集团**项目
	 */
	@ApiField("apartment_name")
	private String apartmentName;

	/**
	 * null
	 */
	@ApiListField("apartment_services")
	@ApiField("string")
	private List<String> apartmentServices;

	/**
	 * null
	 */
	@ApiListField("apartment_video")
	@ApiField("string")
	private List<String> apartmentVideo;

	/**
	 * 公寓vr地址
	 */
	@ApiField("apartment_vr")
	private String apartmentVr;

	/**
	 * 居室数量
	 */
	@ApiField("bed_room")
	private String bedRoom;

	/**
	 * 商圈名称
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
	 * 联系人备案照片(文件id)
	 */
	@ApiField("contact_persons_photo")
	private String contactPersonsPhoto;

	/**
	 * 区县编码
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 梯户比例，例：一梯两户
	 */
	@ApiField("elevator_to_unit_ratio")
	private String elevatorToUnitRatio;

	/**
	 * 外部房源ID
	 */
	@ApiField("external_id")
	private String externalId;

	/**
	 * 楼层区间-结束值,例：5-8层
	 */
	@ApiField("floor_end")
	private String floorEnd;

	/**
	 * 楼层区间-起始值,例：5-8层
	 */
	@ApiField("floor_start")
	private String floorStart;

	/**
	 * 对房源特色的简短描述
	 */
	@ApiField("house_label")
	private String houseLabel;

	/**
	 * 关联小程序ID
	 */
	@ApiField("house_program_id")
	private String houseProgramId;

	/**
	 * 房屋结构
	 */
	@ApiField("house_structure")
	private String houseStructure;

	/**
	 * 房源类型
	 */
	@ApiField("housing_type")
	private String housingType;

	/**
	 * 意向申请
	 */
	@ApiField("intentional_application")
	private String intentionalApplication;

	/**
	 * 朝向
	 */
	@ApiField("orientation")
	private String orientation;

	/**
	 * 其他信息
	 */
	@ApiField("other")
	private String other;

	/**
	 * 户型介绍
	 */
	@ApiField("property_description")
	private String propertyDescription;

	/**
	 * null
	 */
	@ApiListField("property_features")
	@ApiField("string")
	private List<String> propertyFeatures;

	/**
	 * 房源标题
	 */
	@ApiField("property_title")
	private String propertyTitle;

	/**
	 * 省编码
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 户籍等，描述文字
	 */
	@ApiField("qualification_requirements")
	private String qualificationRequirements;

	/**
	 * 租金区间段-结束值(元)
	 */
	@ApiField("rent_end")
	private String rentEnd;

	/**
	 * 租金区间段-起始值(元)
	 */
	@ApiField("rent_start")
	private String rentStart;

	/**
	 * 租金单位
	 */
	@ApiField("rent_unit")
	private String rentUnit;

	/**
	 * 房源所属平台，用于前端展示。
	 */
	@ApiField("source_company")
	private String sourceCompany;

	/**
	 * 公寓状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 使用面积区间段-结束值(平方米)
	 */
	@ApiField("usable_area_end")
	private String usableAreaEnd;

	/**
	 * 使用面积区间-起始值(平方米)
	 */
	@ApiField("usable_area_start")
	private String usableAreaStart;

	/**
	 * null
	 */
	@ApiListField("viewing_time")
	@ApiField("string")
	private List<String> viewingTime;

	public List<String> getAccommodation() {
		return this.accommodation;
	}
	public void setAccommodation(List<String> accommodation) {
		this.accommodation = accommodation;
	}

	public String getApartmentAddress() {
		return this.apartmentAddress;
	}
	public void setApartmentAddress(String apartmentAddress) {
		this.apartmentAddress = apartmentAddress;
	}

	public List<String> getApartmentFacilities() {
		return this.apartmentFacilities;
	}
	public void setApartmentFacilities(List<String> apartmentFacilities) {
		this.apartmentFacilities = apartmentFacilities;
	}

	public String getApartmentId() {
		return this.apartmentId;
	}
	public void setApartmentId(String apartmentId) {
		this.apartmentId = apartmentId;
	}

	public List<String> getApartmentImg() {
		return this.apartmentImg;
	}
	public void setApartmentImg(List<String> apartmentImg) {
		this.apartmentImg = apartmentImg;
	}

	public String getApartmentName() {
		return this.apartmentName;
	}
	public void setApartmentName(String apartmentName) {
		this.apartmentName = apartmentName;
	}

	public List<String> getApartmentServices() {
		return this.apartmentServices;
	}
	public void setApartmentServices(List<String> apartmentServices) {
		this.apartmentServices = apartmentServices;
	}

	public List<String> getApartmentVideo() {
		return this.apartmentVideo;
	}
	public void setApartmentVideo(List<String> apartmentVideo) {
		this.apartmentVideo = apartmentVideo;
	}

	public String getApartmentVr() {
		return this.apartmentVr;
	}
	public void setApartmentVr(String apartmentVr) {
		this.apartmentVr = apartmentVr;
	}

	public String getBedRoom() {
		return this.bedRoom;
	}
	public void setBedRoom(String bedRoom) {
		this.bedRoom = bedRoom;
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

	public String getContactPersonsPhoto() {
		return this.contactPersonsPhoto;
	}
	public void setContactPersonsPhoto(String contactPersonsPhoto) {
		this.contactPersonsPhoto = contactPersonsPhoto;
	}

	public String getDistrictCode() {
		return this.districtCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public String getElevatorToUnitRatio() {
		return this.elevatorToUnitRatio;
	}
	public void setElevatorToUnitRatio(String elevatorToUnitRatio) {
		this.elevatorToUnitRatio = elevatorToUnitRatio;
	}

	public String getExternalId() {
		return this.externalId;
	}
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public String getFloorEnd() {
		return this.floorEnd;
	}
	public void setFloorEnd(String floorEnd) {
		this.floorEnd = floorEnd;
	}

	public String getFloorStart() {
		return this.floorStart;
	}
	public void setFloorStart(String floorStart) {
		this.floorStart = floorStart;
	}

	public String getHouseLabel() {
		return this.houseLabel;
	}
	public void setHouseLabel(String houseLabel) {
		this.houseLabel = houseLabel;
	}

	public String getHouseProgramId() {
		return this.houseProgramId;
	}
	public void setHouseProgramId(String houseProgramId) {
		this.houseProgramId = houseProgramId;
	}

	public String getHouseStructure() {
		return this.houseStructure;
	}
	public void setHouseStructure(String houseStructure) {
		this.houseStructure = houseStructure;
	}

	public String getHousingType() {
		return this.housingType;
	}
	public void setHousingType(String housingType) {
		this.housingType = housingType;
	}

	public String getIntentionalApplication() {
		return this.intentionalApplication;
	}
	public void setIntentionalApplication(String intentionalApplication) {
		this.intentionalApplication = intentionalApplication;
	}

	public String getOrientation() {
		return this.orientation;
	}
	public void setOrientation(String orientation) {
		this.orientation = orientation;
	}

	public String getOther() {
		return this.other;
	}
	public void setOther(String other) {
		this.other = other;
	}

	public String getPropertyDescription() {
		return this.propertyDescription;
	}
	public void setPropertyDescription(String propertyDescription) {
		this.propertyDescription = propertyDescription;
	}

	public List<String> getPropertyFeatures() {
		return this.propertyFeatures;
	}
	public void setPropertyFeatures(List<String> propertyFeatures) {
		this.propertyFeatures = propertyFeatures;
	}

	public String getPropertyTitle() {
		return this.propertyTitle;
	}
	public void setPropertyTitle(String propertyTitle) {
		this.propertyTitle = propertyTitle;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getQualificationRequirements() {
		return this.qualificationRequirements;
	}
	public void setQualificationRequirements(String qualificationRequirements) {
		this.qualificationRequirements = qualificationRequirements;
	}

	public String getRentEnd() {
		return this.rentEnd;
	}
	public void setRentEnd(String rentEnd) {
		this.rentEnd = rentEnd;
	}

	public String getRentStart() {
		return this.rentStart;
	}
	public void setRentStart(String rentStart) {
		this.rentStart = rentStart;
	}

	public String getRentUnit() {
		return this.rentUnit;
	}
	public void setRentUnit(String rentUnit) {
		this.rentUnit = rentUnit;
	}

	public String getSourceCompany() {
		return this.sourceCompany;
	}
	public void setSourceCompany(String sourceCompany) {
		this.sourceCompany = sourceCompany;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getUsableAreaEnd() {
		return this.usableAreaEnd;
	}
	public void setUsableAreaEnd(String usableAreaEnd) {
		this.usableAreaEnd = usableAreaEnd;
	}

	public String getUsableAreaStart() {
		return this.usableAreaStart;
	}
	public void setUsableAreaStart(String usableAreaStart) {
		this.usableAreaStart = usableAreaStart;
	}

	public List<String> getViewingTime() {
		return this.viewingTime;
	}
	public void setViewingTime(List<String> viewingTime) {
		this.viewingTime = viewingTime;
	}

}
