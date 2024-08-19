package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 上传物业小区内部房屋信息.
 *
 * @author auto create
 * @since 1.0, 2021-11-09 14:33:30
 */
public class AlipayEcoCplifeRoominfoUploadModel extends AlipayObject {

	private static final long serialVersionUID = 4871414167451428585L;

	/**
	 * 请求批次号，由商户自定义，在商户系统内唯一标示一次业务请求。
	 */
	@ApiField("batch_id")
	private String batchId;

	/**
	 * 业主所在物业小区ID(支付宝平台唯一小区ID标示)
	 */
	@ApiField("community_id")
	private String communityId;

	/**
	 * 待上传的房屋信息列表，单次上传不超过200条.
	 */
	@ApiListField("room_info_set")
	@ApiField("cplife_room_info")
	private List<CplifeRoomInfo> roomInfoSet;

	public String getBatchId() {
		return this.batchId;
	}
	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public String getCommunityId() {
		return this.communityId;
	}
	public void setCommunityId(String communityId) {
		this.communityId = communityId;
	}

	public List<CplifeRoomInfo> getRoomInfoSet() {
		return this.roomInfoSet;
	}
	public void setRoomInfoSet(List<CplifeRoomInfo> roomInfoSet) {
		this.roomInfoSet = roomInfoSet;
	}

}
