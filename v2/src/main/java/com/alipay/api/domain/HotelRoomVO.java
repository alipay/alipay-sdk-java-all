package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 酒店房间信息
 *
 * @author auto create
 * @since 1.0, 2026-02-10 17:36:19
 */
public class HotelRoomVO extends AlipayObject {

	private static final long serialVersionUID = 4538189428221766327L;

	/**
	 * 楼栋
	 */
	@ApiField("build")
	private String build;

	/**
	 * 特色标签标签数量最多8，单标签字数最多4例：安静，海景
	 */
	@ApiListField("feature_tag_list")
	@ApiField("string")
	private List<String> featureTagList;

	/**
	 * 楼层
	 */
	@ApiField("floor")
	private String floor;

	/**
	 * 房间大小，单位 平米
	 */
	@ApiField("room_area")
	private String roomArea;

	/**
	 * 房间号
	 */
	@ApiField("room_no")
	private String roomNo;

	public String getBuild() {
		return this.build;
	}
	public void setBuild(String build) {
		this.build = build;
	}

	public List<String> getFeatureTagList() {
		return this.featureTagList;
	}
	public void setFeatureTagList(List<String> featureTagList) {
		this.featureTagList = featureTagList;
	}

	public String getFloor() {
		return this.floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}

	public String getRoomArea() {
		return this.roomArea;
	}
	public void setRoomArea(String roomArea) {
		this.roomArea = roomArea;
	}

	public String getRoomNo() {
		return this.roomNo;
	}
	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}

}
