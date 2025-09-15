package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租房小区信息提报
 *
 * @author auto create
 * @since 1.0, 2025-07-14 11:04:33
 */
public class AlipayOpenAppRentroomAreaCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8235235425181174841L;

	/**
	 * 提报的公寓信息
	 */
	@ApiField("apartment_info")
	private RentRoomApartmentInfo apartmentInfo;

	/**
	 * 用于区分提报的小区类型
	 */
	@ApiField("area_type")
	private String areaType;

	/**
	 * 提报的小区信息
	 */
	@ApiField("community_info")
	private RentRoomCommunityInfo communityInfo;

	/**
	 * 商户侧自定义小区ID,用于校验提报小区信息是否唯一。
	 */
	@ApiField("out_area_id")
	private String outAreaId;

	public RentRoomApartmentInfo getApartmentInfo() {
		return this.apartmentInfo;
	}
	public void setApartmentInfo(RentRoomApartmentInfo apartmentInfo) {
		this.apartmentInfo = apartmentInfo;
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
