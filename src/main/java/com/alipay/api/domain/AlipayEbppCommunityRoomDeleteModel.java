package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小区房间删除
 *
 * @author auto create
 * @since 1.0, 2021-11-09 14:33:09
 */
public class AlipayEbppCommunityRoomDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 3125686896188323188L;

	/**
	 * 小区短名, 创建小区时生成
	 */
	@ApiField("community_short_name")
	private String communityShortName;

	/**
	 * ISV外部房间号,创建后以支付宝内部房间号为准
	 */
	@ApiField("out_room_id")
	private String outRoomId;

	/**
	 * 支付宝房间id
	 */
	@ApiField("room_id")
	private String roomId;

	public String getCommunityShortName() {
		return this.communityShortName;
	}
	public void setCommunityShortName(String communityShortName) {
		this.communityShortName = communityShortName;
	}

	public String getOutRoomId() {
		return this.outRoomId;
	}
	public void setOutRoomId(String outRoomId) {
		this.outRoomId = outRoomId;
	}

	public String getRoomId() {
		return this.roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

}
