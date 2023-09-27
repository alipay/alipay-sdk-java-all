package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.community.room.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 21:58:50
 */
public class AlipayEbppCommunityRoomCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1448898145671623352L;

	/** 
	 * 在支付宝app中，该房间的跳转地址
	 */
	@ApiField("community_room_url")
	private String communityRoomUrl;

	/** 
	 * 内部房间ID, 对应外部房间ID, 全局唯一, 当房屋信息为叶子节点时不为空, 也是缴费OBJECT_ID
yyyyMMddHHmmssSSS+hash(ISV_ID,2)+(COMMUNITY_PROPERTY_ID%100)+hash(COMMUNITY,2)+hash(OUT_ROOM_ID,4)+00000(预留)
32位
	 */
	@ApiField("room_id")
	private String roomId;

	public void setCommunityRoomUrl(String communityRoomUrl) {
		this.communityRoomUrl = communityRoomUrl;
	}
	public String getCommunityRoomUrl( ) {
		return this.communityRoomUrl;
	}

	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}
	public String getRoomId( ) {
		return this.roomId;
	}

}
