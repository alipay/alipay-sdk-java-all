package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-08-07 10:42:37
 */
public class LocationPointInfoVO extends AlipayObject {

	private static final long serialVersionUID = 7686167329884917351L;

	/**
	 * 绑定的线圈id
	 */
	@ApiField("binding_card_id")
	private String bindingCardId;

	/**
	 * 项目ID
	 */
	@ApiField("community_id")
	private String communityId;

	/**
	 * 所在楼层
	 */
	@ApiField("floor_num")
	private Long floorNum;

	/**
	 * 纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 点位描述
	 */
	@ApiField("location_desc")
	private String locationDesc;

	/**
	 * 点位名称
	 */
	@ApiField("location_name")
	private String locationName;

	/**
	 * 点位id
	 */
	@ApiField("location_point_id")
	private String locationPointId;

	/**
	 * 点位类型
巡检：PATROL
门禁：EC
	 */
	@ApiField("location_type")
	private String locationType;

	/**
	 * 经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 是否多层
是：Y
否：N（默认）
	 */
	@ApiField("muti_floor")
	private String mutiFloor;

	/**
	 * 外部点位id
	 */
	@ApiField("out_location_point_id")
	private String outLocationPointId;

	public String getBindingCardId() {
		return this.bindingCardId;
	}
	public void setBindingCardId(String bindingCardId) {
		this.bindingCardId = bindingCardId;
	}

	public String getCommunityId() {
		return this.communityId;
	}
	public void setCommunityId(String communityId) {
		this.communityId = communityId;
	}

	public Long getFloorNum() {
		return this.floorNum;
	}
	public void setFloorNum(Long floorNum) {
		this.floorNum = floorNum;
	}

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLocationDesc() {
		return this.locationDesc;
	}
	public void setLocationDesc(String locationDesc) {
		this.locationDesc = locationDesc;
	}

	public String getLocationName() {
		return this.locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getLocationPointId() {
		return this.locationPointId;
	}
	public void setLocationPointId(String locationPointId) {
		this.locationPointId = locationPointId;
	}

	public String getLocationType() {
		return this.locationType;
	}
	public void setLocationType(String locationType) {
		this.locationType = locationType;
	}

	public String getLongitude() {
		return this.longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getMutiFloor() {
		return this.mutiFloor;
	}
	public void setMutiFloor(String mutiFloor) {
		this.mutiFloor = mutiFloor;
	}

	public String getOutLocationPointId() {
		return this.outLocationPointId;
	}
	public void setOutLocationPointId(String outLocationPointId) {
		this.outLocationPointId = outLocationPointId;
	}

}
