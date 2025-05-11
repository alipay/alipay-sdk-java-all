package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 租房新增
 *
 * @author auto create
 * @since 1.0, 2025-04-14 11:17:28
 */
public class AlipayCommerceHousingHouseRentalAddModel extends AlipayObject {

	private static final long serialVersionUID = 8789132586571297867L;

	/**
	 * null
	 */
	@ApiListField("accommodation")
	@ApiField("string")
	private List<String> accommodation;

	/**
	 * 卫生间数量，单位：个
	 */
	@ApiField("bath_room")
	private String bathRoom;

	/**
	 * 卧室数量，单位：个
	 */
	@ApiField("bed_room")
	private String bedRoom;

	/**
	 * 建筑的描述
	 */
	@ApiField("building_category")
	private String buildingCategory;

	/**
	 * 入住时间
	 */
	@ApiField("check_in_time")
	private String checkInTime;

	/**
	 * 小区ID(内部)
	 */
	@ApiField("community_id")
	private String communityId;

	/**
	 * 建筑面积，单位㎡，例：90.55
	 */
	@ApiField("constructed_area")
	private String constructedArea;

	/**
	 * 建筑年代
	 */
	@ApiField("construction_year")
	private String constructionYear;

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
	 * 联系人备案照片
	 */
	@ApiField("contact_persons_photo")
	private String contactPersonsPhoto;

	/**
	 * 房屋现状
	 */
	@ApiField("current_condition_house")
	private String currentConditionHouse;

	/**
	 * 押金，单位：元
	 */
	@ApiField("deposit")
	private String deposit;

	/**
	 * 门牌号
	 */
	@ApiField("doorplate_number")
	private String doorplateNumber;

	/**
	 * 电梯
	 */
	@ApiField("elevator")
	private String elevator;

	/**
	 * 梯户比，例：一梯两户
	 */
	@ApiField("elevator_to_unit_ratio")
	private String elevatorToUnitRatio;

	/**
	 * 外部房源ID
	 */
	@ApiField("external_id")
	private String externalId;

	/**
	 * 所在楼层
	 */
	@ApiField("floor_level")
	private String floorLevel;

	/**
	 * 楼层区间，单位默认层
	 */
	@ApiField("floor_range")
	private String floorRange;

	/**
	 * 是否独卫
	 */
	@ApiField("has_private_bathroom")
	private String hasPrivateBathroom;

	/**
	 * null
	 */
	@ApiListField("house_label")
	@ApiField("string")
	private List<String> houseLabel;

	/**
	 * null
	 */
	@ApiListField("house_pic")
	@ApiField("string")
	private List<String> housePic;

	/**
	 * 关联小程序ID
	 */
	@ApiField("house_program_id")
	private String houseProgramId;

	/**
	 * 房屋的描述
	 */
	@ApiField("house_structure")
	private String houseStructure;

	/**
	 * null
	 */
	@ApiListField("house_video")
	@ApiField("string")
	private List<String> houseVideo;

	/**
	 * 房源VR链接
	 */
	@ApiField("house_vr_url")
	private String houseVrUrl;

	/**
	 * 房源类型
	 */
	@ApiField("housing_type")
	private String housingType;

	/**
	 * 套内面积，单位㎡，例：70.23
	 */
	@ApiField("internal_area")
	private String internalArea;

	/**
	 * 厨房数量，单位：个
	 */
	@ApiField("kitchen")
	private String kitchen;

	/**
	 * 挂牌时间，时间格式如下：2023-10-01
	 */
	@ApiField("listing_date")
	private String listingDate;

	/**
	 * 客厅数量，单位：个
	 */
	@ApiField("living_room")
	private String livingRoom;

	/**
	 * 朝向
	 */
	@ApiField("orientation")
	private String orientation;

	/**
	 * 其他
	 */
	@ApiField("other")
	private String other;

	/**
	 * 所有者身份证
	 */
	@ApiField("owner_id")
	private String ownerId;

	/**
	 * 所有者姓名
	 */
	@ApiField("owner_name")
	private String ownerName;

	/**
	 * 车位
	 */
	@ApiField("parking_space")
	private String parkingSpace;

	/**
	 * 付款方式
	 */
	@ApiField("payment_method")
	private String paymentMethod;

	/**
	 * 产权委托书
	 */
	@ApiField("power_of_attorney")
	private String powerOfAttorney;

	/**
	 * 房源描述
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
	 * 产权
	 */
	@ApiField("property_rights")
	private String propertyRights;

	/**
	 * 房源标题
	 */
	@ApiField("property_title")
	private String propertyTitle;

	/**
	 * 装修情况
	 */
	@ApiField("renovation")
	private String renovation;

	/**
	 * 单位元/月，例：5000
	 */
	@ApiField("rent")
	private String rent;

	/**
	 * 租金单位，月，周，季度，年
	 */
	@ApiField("rent_unit")
	private String rentUnit;

	/**
	 * null
	 */
	@ApiListField("rental_requirements")
	@ApiField("string")
	private List<String> rentalRequirements;

	/**
	 * 出租房间描述
	 */
	@ApiField("rented_room")
	private String rentedRoom;

	/**
	 * 租金类型
	 */
	@ApiField("renting_type")
	private String rentingType;

	/**
	 * 来源公司的描述
	 */
	@ApiField("source_company")
	private String sourceCompany;

	/**
	 * 房源状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 总楼层
	 */
	@ApiField("total_floors")
	private String totalFloors;

	/**
	 * 校验码
	 */
	@ApiField("verification_code")
	private String verificationCode;

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

	public String getBathRoom() {
		return this.bathRoom;
	}
	public void setBathRoom(String bathRoom) {
		this.bathRoom = bathRoom;
	}

	public String getBedRoom() {
		return this.bedRoom;
	}
	public void setBedRoom(String bedRoom) {
		this.bedRoom = bedRoom;
	}

	public String getBuildingCategory() {
		return this.buildingCategory;
	}
	public void setBuildingCategory(String buildingCategory) {
		this.buildingCategory = buildingCategory;
	}

	public String getCheckInTime() {
		return this.checkInTime;
	}
	public void setCheckInTime(String checkInTime) {
		this.checkInTime = checkInTime;
	}

	public String getCommunityId() {
		return this.communityId;
	}
	public void setCommunityId(String communityId) {
		this.communityId = communityId;
	}

	public String getConstructedArea() {
		return this.constructedArea;
	}
	public void setConstructedArea(String constructedArea) {
		this.constructedArea = constructedArea;
	}

	public String getConstructionYear() {
		return this.constructionYear;
	}
	public void setConstructionYear(String constructionYear) {
		this.constructionYear = constructionYear;
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

	public String getCurrentConditionHouse() {
		return this.currentConditionHouse;
	}
	public void setCurrentConditionHouse(String currentConditionHouse) {
		this.currentConditionHouse = currentConditionHouse;
	}

	public String getDeposit() {
		return this.deposit;
	}
	public void setDeposit(String deposit) {
		this.deposit = deposit;
	}

	public String getDoorplateNumber() {
		return this.doorplateNumber;
	}
	public void setDoorplateNumber(String doorplateNumber) {
		this.doorplateNumber = doorplateNumber;
	}

	public String getElevator() {
		return this.elevator;
	}
	public void setElevator(String elevator) {
		this.elevator = elevator;
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

	public String getFloorLevel() {
		return this.floorLevel;
	}
	public void setFloorLevel(String floorLevel) {
		this.floorLevel = floorLevel;
	}

	public String getFloorRange() {
		return this.floorRange;
	}
	public void setFloorRange(String floorRange) {
		this.floorRange = floorRange;
	}

	public String getHasPrivateBathroom() {
		return this.hasPrivateBathroom;
	}
	public void setHasPrivateBathroom(String hasPrivateBathroom) {
		this.hasPrivateBathroom = hasPrivateBathroom;
	}

	public List<String> getHouseLabel() {
		return this.houseLabel;
	}
	public void setHouseLabel(List<String> houseLabel) {
		this.houseLabel = houseLabel;
	}

	public List<String> getHousePic() {
		return this.housePic;
	}
	public void setHousePic(List<String> housePic) {
		this.housePic = housePic;
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

	public List<String> getHouseVideo() {
		return this.houseVideo;
	}
	public void setHouseVideo(List<String> houseVideo) {
		this.houseVideo = houseVideo;
	}

	public String getHouseVrUrl() {
		return this.houseVrUrl;
	}
	public void setHouseVrUrl(String houseVrUrl) {
		this.houseVrUrl = houseVrUrl;
	}

	public String getHousingType() {
		return this.housingType;
	}
	public void setHousingType(String housingType) {
		this.housingType = housingType;
	}

	public String getInternalArea() {
		return this.internalArea;
	}
	public void setInternalArea(String internalArea) {
		this.internalArea = internalArea;
	}

	public String getKitchen() {
		return this.kitchen;
	}
	public void setKitchen(String kitchen) {
		this.kitchen = kitchen;
	}

	public String getListingDate() {
		return this.listingDate;
	}
	public void setListingDate(String listingDate) {
		this.listingDate = listingDate;
	}

	public String getLivingRoom() {
		return this.livingRoom;
	}
	public void setLivingRoom(String livingRoom) {
		this.livingRoom = livingRoom;
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

	public String getOwnerId() {
		return this.ownerId;
	}
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public String getOwnerName() {
		return this.ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getParkingSpace() {
		return this.parkingSpace;
	}
	public void setParkingSpace(String parkingSpace) {
		this.parkingSpace = parkingSpace;
	}

	public String getPaymentMethod() {
		return this.paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getPowerOfAttorney() {
		return this.powerOfAttorney;
	}
	public void setPowerOfAttorney(String powerOfAttorney) {
		this.powerOfAttorney = powerOfAttorney;
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

	public String getPropertyRights() {
		return this.propertyRights;
	}
	public void setPropertyRights(String propertyRights) {
		this.propertyRights = propertyRights;
	}

	public String getPropertyTitle() {
		return this.propertyTitle;
	}
	public void setPropertyTitle(String propertyTitle) {
		this.propertyTitle = propertyTitle;
	}

	public String getRenovation() {
		return this.renovation;
	}
	public void setRenovation(String renovation) {
		this.renovation = renovation;
	}

	public String getRent() {
		return this.rent;
	}
	public void setRent(String rent) {
		this.rent = rent;
	}

	public String getRentUnit() {
		return this.rentUnit;
	}
	public void setRentUnit(String rentUnit) {
		this.rentUnit = rentUnit;
	}

	public List<String> getRentalRequirements() {
		return this.rentalRequirements;
	}
	public void setRentalRequirements(List<String> rentalRequirements) {
		this.rentalRequirements = rentalRequirements;
	}

	public String getRentedRoom() {
		return this.rentedRoom;
	}
	public void setRentedRoom(String rentedRoom) {
		this.rentedRoom = rentedRoom;
	}

	public String getRentingType() {
		return this.rentingType;
	}
	public void setRentingType(String rentingType) {
		this.rentingType = rentingType;
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

	public String getTotalFloors() {
		return this.totalFloors;
	}
	public void setTotalFloors(String totalFloors) {
		this.totalFloors = totalFloors;
	}

	public String getVerificationCode() {
		return this.verificationCode;
	}
	public void setVerificationCode(String verificationCode) {
		this.verificationCode = verificationCode;
	}

	public List<String> getViewingTime() {
		return this.viewingTime;
	}
	public void setViewingTime(List<String> viewingTime) {
		this.viewingTime = viewingTime;
	}

}
