package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RentRoomApartmentInfo;
import com.alipay.api.domain.RentRoomCommunityInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.rentroom.area.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-30 11:22:22
 */
public class AlipayOpenAppRentroomAreaQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3165422973777824178L;

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

	public void setApartmentInfo(RentRoomApartmentInfo apartmentInfo) {
		this.apartmentInfo = apartmentInfo;
	}
	public RentRoomApartmentInfo getApartmentInfo( ) {
		return this.apartmentInfo;
	}

	public void setAreaType(String areaType) {
		this.areaType = areaType;
	}
	public String getAreaType( ) {
		return this.areaType;
	}

	public void setCommunityInfo(RentRoomCommunityInfo communityInfo) {
		this.communityInfo = communityInfo;
	}
	public RentRoomCommunityInfo getCommunityInfo( ) {
		return this.communityInfo;
	}

}
