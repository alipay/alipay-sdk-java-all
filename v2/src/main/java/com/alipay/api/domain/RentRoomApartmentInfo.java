package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 租房公寓信息
 *
 * @author auto create
 * @since 1.0, 2024-10-16 19:47:19
 */
public class RentRoomApartmentInfo extends AlipayObject {

	private static final long serialVersionUID = 4114967771191643518L;

	/**
	 * 公寓的设施列表
	 */
	@ApiListField("apartment_equipment_info")
	@ApiField("string")
	private List<String> apartmentEquipmentInfo;

	/**
	 * 公寓的介绍
	 */
	@ApiField("apartment_introduce")
	private String apartmentIntroduce;

	/**
	 * 公寓名称
	 */
	@ApiField("apartment_name")
	private String apartmentName;

	/**
	 * 公寓相关的图片信息
	 */
	@ApiField("apartment_pic_info")
	private ApartmentPicInfo apartmentPicInfo;

	/**
	 * 公寓的地址信息
	 */
	@ApiField("area_address_info")
	private AreaAddressInfo areaAddressInfo;

	/**
	 * 公寓联系人信息
	 */
	@ApiListField("contact_info_list")
	@ApiField("apartment_contact_info")
	private List<ApartmentContactInfo> contactInfoList;

	public List<String> getApartmentEquipmentInfo() {
		return this.apartmentEquipmentInfo;
	}
	public void setApartmentEquipmentInfo(List<String> apartmentEquipmentInfo) {
		this.apartmentEquipmentInfo = apartmentEquipmentInfo;
	}

	public String getApartmentIntroduce() {
		return this.apartmentIntroduce;
	}
	public void setApartmentIntroduce(String apartmentIntroduce) {
		this.apartmentIntroduce = apartmentIntroduce;
	}

	public String getApartmentName() {
		return this.apartmentName;
	}
	public void setApartmentName(String apartmentName) {
		this.apartmentName = apartmentName;
	}

	public ApartmentPicInfo getApartmentPicInfo() {
		return this.apartmentPicInfo;
	}
	public void setApartmentPicInfo(ApartmentPicInfo apartmentPicInfo) {
		this.apartmentPicInfo = apartmentPicInfo;
	}

	public AreaAddressInfo getAreaAddressInfo() {
		return this.areaAddressInfo;
	}
	public void setAreaAddressInfo(AreaAddressInfo areaAddressInfo) {
		this.areaAddressInfo = areaAddressInfo;
	}

	public List<ApartmentContactInfo> getContactInfoList() {
		return this.contactInfoList;
	}
	public void setContactInfoList(List<ApartmentContactInfo> contactInfoList) {
		this.contactInfoList = contactInfoList;
	}

}
