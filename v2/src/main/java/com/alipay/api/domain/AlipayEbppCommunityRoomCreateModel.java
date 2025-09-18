package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 房间创建
 *
 * @author auto create
 * @since 1.0, 2021-11-09 14:30:07
 */
public class AlipayEbppCommunityRoomCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1561221556488713868L;

	/**
	 * 小区短名, 创建小区时生成
	 */
	@ApiField("community_short_name")
	private String communityShortName;

	/**
	 * ISV外部房间号
	 */
	@ApiField("out_room_id")
	private String outRoomId;

	/**
	 * 户主 手机
	 */
	@ApiField("owner_mobile")
	private String ownerMobile;

	/**
	 * 户主姓名
	 */
	@ApiField("owner_name")
	private String ownerName;

	/**
	 * 房间结构化描述信息，|隔开。例如：区|栋|单元|室
	 */
	@ApiField("room_desc")
	private String roomDesc;

	/**
	 * 房间结构化数据信息，|隔开。例如：南|1|2|202
	 */
	@ApiField("room_value")
	private String roomValue;

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

	public String getRoomDesc() {
		return this.roomDesc;
	}
	public void setRoomDesc(String roomDesc) {
		this.roomDesc = roomDesc;
	}

	public String getRoomValue() {
		return this.roomValue;
	}
	public void setRoomValue(String roomValue) {
		this.roomValue = roomValue;
	}

}
