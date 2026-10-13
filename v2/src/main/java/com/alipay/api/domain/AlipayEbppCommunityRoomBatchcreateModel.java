package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量同步房间信息
 *
 * @author auto create
 * @since 1.0, 2026-09-29 11:10:14
 */
public class AlipayEbppCommunityRoomBatchcreateModel extends AlipayObject {

	private static final long serialVersionUID = 5384897637279378472L;

	/**
	 * 小区名字拼音首字母大写+YYYYMMDD+防重位
	 */
	@ApiField("community_short_name")
	private String communityShortName;

	/**
	 * |隔开。例如: 1栋|2单元
	 */
	@ApiField("parent_value")
	private String parentValue;

	/**
	 * 房间集合
	 */
	@ApiListField("rooms")
	@ApiField("room_batch_create_item")
	private List<RoomBatchCreateItem> rooms;

	public String getCommunityShortName() {
		return this.communityShortName;
	}
	public void setCommunityShortName(String communityShortName) {
		this.communityShortName = communityShortName;
	}

	public String getParentValue() {
		return this.parentValue;
	}
	public void setParentValue(String parentValue) {
		this.parentValue = parentValue;
	}

	public List<RoomBatchCreateItem> getRooms() {
		return this.rooms;
	}
	public void setRooms(List<RoomBatchCreateItem> rooms) {
		this.rooms = rooms;
	}

}
