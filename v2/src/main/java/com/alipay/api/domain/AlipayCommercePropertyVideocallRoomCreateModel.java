package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建视频房间
 *
 * @author auto create
 * @since 1.0, 2025-09-05 11:21:27
 */
public class AlipayCommercePropertyVideocallRoomCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8388745466675115754L;

	/**
	 * 如果typeList有天猫精灵，则deviceId必传
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 外部小区id,绿城天猫精灵模式必传
	 */
	@ApiField("out_community_id")
	private String outCommunityId;

	/**
	 * 如果typeList有三方跳转呼叫业主，则owner_id必传；
	 */
	@ApiField("owner_id")
	private String ownerId;

	/**
	 * 拨叫类型集合
消控室、
业主、
三方跳转呼叫业主、
三方跳转呼叫消控室、
天猫精灵
	 */
	@ApiListField("type_list")
	@ApiField("string")
	private List<String> typeList;

	/**
	 * 天猫精灵主叫端id
	 */
	@ApiField("visitor_id")
	private String visitorId;

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getOutCommunityId() {
		return this.outCommunityId;
	}
	public void setOutCommunityId(String outCommunityId) {
		this.outCommunityId = outCommunityId;
	}

	public String getOwnerId() {
		return this.ownerId;
	}
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public List<String> getTypeList() {
		return this.typeList;
	}
	public void setTypeList(List<String> typeList) {
		this.typeList = typeList;
	}

	public String getVisitorId() {
		return this.visitorId;
	}
	public void setVisitorId(String visitorId) {
		this.visitorId = visitorId;
	}

}
