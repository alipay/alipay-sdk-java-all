package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 编辑更新物业小区房屋信息
 *
 * @author auto create
 * @since 1.0, 2016-11-04 15:30:12
 */
public class AlipayEcoCplifeRoominfoUpdateModel extends AlipayObject {

	private static final long serialVersionUID = 4573447472248675884L;

	/**
	 * 业主所在物业小区ID(支付宝平台唯一小区ID标示)
	 */
	@ApiField("community_id")
	private String communityId;

	/**
	 * 更新后的房屋信息详情
	 */
	@ApiField("room_info")
	private CplifeRoomDetail roomInfo;

	public String getCommunityId() {
		return this.communityId;
	}
	public void setCommunityId(String communityId) {
		this.communityId = communityId;
	}

	public CplifeRoomDetail getRoomInfo() {
		return this.roomInfo;
	}
	public void setRoomInfo(CplifeRoomDetail roomInfo) {
		this.roomInfo = roomInfo;
	}

}
