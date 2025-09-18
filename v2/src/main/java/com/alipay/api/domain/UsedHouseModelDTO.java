package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-04-14 11:17:28
 */
public class UsedHouseModelDTO extends AlipayObject {

	private static final long serialVersionUID = 6219592216745112726L;

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
	 * 小区ID
	 */
	@ApiField("community_id")
	private String communityId;

	/**
	 * 建筑面积单位㎡，例：90.55
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
	 * 门牌号
	 */
	@ApiField("doorplate_number")
	private String doorplateNumber;

	/**
	 * 电梯，例：有、无
	 */
	@ApiField("elevator")
	private String elevator;

	/**
	 * 梯户比的描述
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
	 * 楼层区间，例举：低楼层、高楼层、中楼层
	 */
	@ApiField("floor_range")
	private String floorRange;

	/**
	 * 房屋年限的描述
	 */
	@ApiField("house_age")
	private String houseAge;

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
	 * 房源id
	 */
	@ApiField("housing_id")
	private String housingId;

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
	 * 厨房数量
	 */
	@ApiField("kitchen")
	private String kitchen;

	/**
	 * 挂牌时间
	 */
	@ApiField("listing_date")
	private String listingDate;

	/**
	 * 客厅数量，单位：个
	 */
	@ApiField("living_room")
	private String livingRoom;

	/**
	 * 朝向，例：南北，列举：东、南、西、北、东南、东北、西南、西北、南北、东西
	 */
	@ApiField("orientation")
	private String orientation;

	/**
	 * 其它信息
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
	 * 车位，是否带车位，列举：是，否
	 */
	@ApiField("parking_space")
	private String parkingSpace;

	/**
	 * 产权委托书：是否获得产权人委托（是/否）
	 */
	@ApiField("power_of_attorney")
	private String powerOfAttorney;

	/**
	 * 不动产产权号
	 */
	@ApiField("property_code")
	private String propertyCode;

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
	 * 产权年限
	 */
	@ApiField("property_right_year")
	private String propertyRightYear;

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
	 * 来源公司的描述
	 */
	@ApiField("source_company")
	private String sourceCompany;

	/**
	 * 房源状态，上架，下架
	 */
	@ApiField("status")
	private String status;

	/**
	 * 是否唯一住房，列举：是，否
	 */
	@ApiField("the_only_housing")
	private String theOnlyHousing;

	/**
	 * 总楼层，单位：层
	 */
	@ApiField("total_floors")
	private String totalFloors;

	/**
	 * 总价,单位万/套，例：501
	 */
	@ApiField("total_price")
	private String totalPrice;

	/**
	 * 单价，单位元/平米，例：85565.8
	 */
	@ApiField("unit_price")
	private String unitPrice;

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

	public String getHouseAge() {
		return this.houseAge;
	}
	public void setHouseAge(String houseAge) {
		this.houseAge = houseAge;
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

	public String getHousingId() {
		return this.housingId;
	}
	public void setHousingId(String housingId) {
		this.housingId = housingId;
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

	public String getPowerOfAttorney() {
		return this.powerOfAttorney;
	}
	public void setPowerOfAttorney(String powerOfAttorney) {
		this.powerOfAttorney = powerOfAttorney;
	}

	public String getPropertyCode() {
		return this.propertyCode;
	}
	public void setPropertyCode(String propertyCode) {
		this.propertyCode = propertyCode;
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

	public String getPropertyRightYear() {
		return this.propertyRightYear;
	}
	public void setPropertyRightYear(String propertyRightYear) {
		this.propertyRightYear = propertyRightYear;
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

	public String getTheOnlyHousing() {
		return this.theOnlyHousing;
	}
	public void setTheOnlyHousing(String theOnlyHousing) {
		this.theOnlyHousing = theOnlyHousing;
	}

	public String getTotalFloors() {
		return this.totalFloors;
	}
	public void setTotalFloors(String totalFloors) {
		this.totalFloors = totalFloors;
	}

	public String getTotalPrice() {
		return this.totalPrice;
	}
	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getUnitPrice() {
		return this.unitPrice;
	}
	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
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
