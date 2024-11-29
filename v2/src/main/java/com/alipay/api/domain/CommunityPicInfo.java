package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 包含小区的各类图片信息，大门图片、内部环境图片、停车设施图片、娱乐活动图片。
 *
 * @author auto create
 * @since 1.0, 2024-10-30 11:48:42
 */
public class CommunityPicInfo extends AlipayObject {

	private static final long serialVersionUID = 2873225124181365579L;

	/**
	 * 小区的活动娱乐设施图片
	 */
	@ApiListField("activity_pic_list")
	@ApiField("string")
	private List<String> activityPicList;

	/**
	 * 小区大门图片的地址列表
	 */
	@ApiListField("gate_pic_list")
	@ApiField("string")
	private List<String> gatePicList;

	/**
	 * 小区内部环境图片列表
	 */
	@ApiListField("inner_env_pic_list")
	@ApiField("string")
	private List<String> innerEnvPicList;

	/**
	 * 小区的停车设施图片
	 */
	@ApiListField("parking_pic_list")
	@ApiField("string")
	private List<String> parkingPicList;

	public List<String> getActivityPicList() {
		return this.activityPicList;
	}
	public void setActivityPicList(List<String> activityPicList) {
		this.activityPicList = activityPicList;
	}

	public List<String> getGatePicList() {
		return this.gatePicList;
	}
	public void setGatePicList(List<String> gatePicList) {
		this.gatePicList = gatePicList;
	}

	public List<String> getInnerEnvPicList() {
		return this.innerEnvPicList;
	}
	public void setInnerEnvPicList(List<String> innerEnvPicList) {
		this.innerEnvPicList = innerEnvPicList;
	}

	public List<String> getParkingPicList() {
		return this.parkingPicList;
	}
	public void setParkingPicList(List<String> parkingPicList) {
		this.parkingPicList = parkingPicList;
	}

}
