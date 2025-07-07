package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 点位新增或更新接口
 *
 * @author auto create
 * @since 1.0, 2025-06-19 20:02:26
 */
public class AlipayCommercePropertyPointSaveModel extends AlipayObject {

	private static final long serialVersionUID = 2429831823228273388L;

	/**
	 * 执行动作
新增：ADD
更新：UPDATE
	 */
	@ApiField("action")
	private String action;

	/**
	 * 项目ID
	 */
	@ApiField("community_id")
	private String communityId;

	/**
	 * null
	 */
	@ApiListField("device_ids")
	@ApiField("string")
	private List<String> deviceIds;

	/**
	 * 所在楼层
	 */
	@ApiField("floor_num")
	private Long floorNum;

	/**
	 * null
	 */
	@ApiListField("job_ids")
	@ApiField("string")
	private List<String> jobIds;

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
	 * 新增时非必填，更新时与外部点位id二选一
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
	 * null
	 */
	@ApiListField("out_device_ids")
	@ApiField("string")
	private List<String> outDeviceIds;

	/**
	 * 新增时必填，更新时与点位id二选一
	 */
	@ApiField("out_location_point_id")
	private String outLocationPointId;

	/**
	 * 新增不传入。需要解绑线圈时，在更新时可以传入，解绑成功返回
	 */
	@ApiField("unbind_card")
	private Boolean unbindCard;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String getCommunityId() {
		return this.communityId;
	}
	public void setCommunityId(String communityId) {
		this.communityId = communityId;
	}

	public List<String> getDeviceIds() {
		return this.deviceIds;
	}
	public void setDeviceIds(List<String> deviceIds) {
		this.deviceIds = deviceIds;
	}

	public Long getFloorNum() {
		return this.floorNum;
	}
	public void setFloorNum(Long floorNum) {
		this.floorNum = floorNum;
	}

	public List<String> getJobIds() {
		return this.jobIds;
	}
	public void setJobIds(List<String> jobIds) {
		this.jobIds = jobIds;
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

	public List<String> getOutDeviceIds() {
		return this.outDeviceIds;
	}
	public void setOutDeviceIds(List<String> outDeviceIds) {
		this.outDeviceIds = outDeviceIds;
	}

	public String getOutLocationPointId() {
		return this.outLocationPointId;
	}
	public void setOutLocationPointId(String outLocationPointId) {
		this.outLocationPointId = outLocationPointId;
	}

	public Boolean getUnbindCard() {
		return this.unbindCard;
	}
	public void setUnbindCard(Boolean unbindCard) {
		this.unbindCard = unbindCard;
	}

}
