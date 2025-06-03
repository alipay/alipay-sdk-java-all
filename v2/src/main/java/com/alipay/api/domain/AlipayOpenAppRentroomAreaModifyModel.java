package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户小区信息修改
 *
 * @author auto create
 * @since 1.0, 2025-04-28 17:33:38
 */
public class AlipayOpenAppRentroomAreaModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8542683197923212513L;

	/**
	 * 修改的公寓信息
	 */
	@ApiField("apartment_info")
	private RentRoomApartmentInfo apartmentInfo;

	/**
	 * 平台生成的小区ID，在小区信息提报接口返回
	 */
	@ApiField("area_id")
	private String areaId;

	/**
	 * 用于区分小区类型
	 */
	@ApiField("area_type")
	private String areaType;

	/**
	 * 修改的小区信息
	 */
	@ApiField("community_info")
	private RentRoomCommunityInfo communityInfo;

	/**
	 * 商户侧自定义小区ID,用于校验小区信息是否唯一。
	 */
	@ApiField("out_area_id")
	private String outAreaId;

	public RentRoomApartmentInfo getApartmentInfo() {
		return this.apartmentInfo;
	}
	public void setApartmentInfo(RentRoomApartmentInfo apartmentInfo) {
		this.apartmentInfo = apartmentInfo;
	}

	public String getAreaId() {
		return this.areaId;
	}
	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}

	public String getAreaType() {
		return this.areaType;
	}
	public void setAreaType(String areaType) {
		this.areaType = areaType;
	}

	public RentRoomCommunityInfo getCommunityInfo() {
		return this.communityInfo;
	}
	public void setCommunityInfo(RentRoomCommunityInfo communityInfo) {
		this.communityInfo = communityInfo;
	}

	public String getOutAreaId() {
		return this.outAreaId;
	}
	public void setOutAreaId(String outAreaId) {
		this.outAreaId = outAreaId;
	}

}
