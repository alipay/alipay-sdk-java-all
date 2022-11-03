package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 房间信息修改接口
 *
 * @author auto create
 * @since 1.0, 2021-11-19 14:13:43
 */
public class AlipayEbppCommunityRoomModifyModel extends AlipayObject {

	private static final long serialVersionUID = 6641888537157598216L;

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
	 * 户主手机
	 */
	@ApiField("owner_mobile")
	private String ownerMobile;

	/**
	 * 户主姓名
	 */
	@ApiField("owner_name")
	private String ownerName;

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

	public String getOwnerMobile() {
		return this.ownerMobile;
	}
	public void setOwnerMobile(String ownerMobile) {
		this.ownerMobile = ownerMobile;
	}

	public String getOwnerName() {
		return this.ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getRoomId() {
		return this.roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

}
