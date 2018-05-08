package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CplifeRoomInfoResp;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.cplife.roominfo.upload response.
 * 
 * @author auto create
 * @since 1.0, 2017-03-24 11:43:11
 */
public class AlipayEcoCplifeRoominfoUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 5356286618451831512L;

	/** 
	 * 业主所在物业小区ID(支付宝平台唯一小区ID标示)
	 */
	@ApiField("community_id")
	private String communityId;

	/** 
	 * 已经成功上传的房屋信息列表.
	 */
	@ApiListField("room_info_set")
	@ApiField("cplife_room_info_resp")
	private List<CplifeRoomInfoResp> roomInfoSet;

	public void setCommunityId(String communityId) {
		this.communityId = communityId;
	}
	public String getCommunityId( ) {
		return this.communityId;
	}

	public void setRoomInfoSet(List<CplifeRoomInfoResp> roomInfoSet) {
		this.roomInfoSet = roomInfoSet;
	}
	public List<CplifeRoomInfoResp> getRoomInfoSet( ) {
		return this.roomInfoSet;
	}

}
