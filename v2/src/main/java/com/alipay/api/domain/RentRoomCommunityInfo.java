package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商户提报小区信息时用于描述小区信息的模型，包含小区信息、小区基本信息、小区图片信息、小区地址信息、小区设施、小区介绍。
 *
 * @author auto create
 * @since 1.0, 2024-10-30 11:48:42
 */
public class RentRoomCommunityInfo extends AlipayObject {

	private static final long serialVersionUID = 8689293676159467227L;

	/**
	 * 包含小区的位置信息，经纬度、省市区编码、详情地址。
	 */
	@ApiField("area_address_info")
	private AreaAddressInfo areaAddressInfo;

	/**
	 * 用于补充小区的一些基本信息。
	 */
	@ApiField("community_basic_info")
	private CommunityBasicInfo communityBasicInfo;

	/**
	 * 小区内的设施
	 */
	@ApiListField("community_equipment_info")
	@ApiField("string")
	private List<String> communityEquipmentInfo;

	/**
	 * 小区的基本介绍
	 */
	@ApiField("community_introduce")
	private String communityIntroduce;

	/**
	 * 小区的名称
	 */
	@ApiField("community_name")
	private String communityName;

	/**
	 * 包含小区的各类图片信息，大门图片、内部环境图片、停车设施图片、娱乐活动图片。
	 */
	@ApiField("community_pic_info")
	private CommunityPicInfo communityPicInfo;

	public AreaAddressInfo getAreaAddressInfo() {
		return this.areaAddressInfo;
	}
	public void setAreaAddressInfo(AreaAddressInfo areaAddressInfo) {
		this.areaAddressInfo = areaAddressInfo;
	}

	public CommunityBasicInfo getCommunityBasicInfo() {
		return this.communityBasicInfo;
	}
	public void setCommunityBasicInfo(CommunityBasicInfo communityBasicInfo) {
		this.communityBasicInfo = communityBasicInfo;
	}

	public List<String> getCommunityEquipmentInfo() {
		return this.communityEquipmentInfo;
	}
	public void setCommunityEquipmentInfo(List<String> communityEquipmentInfo) {
		this.communityEquipmentInfo = communityEquipmentInfo;
	}

	public String getCommunityIntroduce() {
		return this.communityIntroduce;
	}
	public void setCommunityIntroduce(String communityIntroduce) {
		this.communityIntroduce = communityIntroduce;
	}

	public String getCommunityName() {
		return this.communityName;
	}
	public void setCommunityName(String communityName) {
		this.communityName = communityName;
	}

	public CommunityPicInfo getCommunityPicInfo() {
		return this.communityPicInfo;
	}
	public void setCommunityPicInfo(CommunityPicInfo communityPicInfo) {
		this.communityPicInfo = communityPicInfo;
	}

}
