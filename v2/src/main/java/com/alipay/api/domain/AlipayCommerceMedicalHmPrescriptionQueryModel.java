package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 家空间健康管理处方查询
 *
 * @author auto create
 * @since 1.0, 2026-07-28 19:07:34
 */
public class AlipayCommerceMedicalHmPrescriptionQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5258531533889481697L;

	/**
	 * 不传则查用户当前有效活动
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * null
	 */
	@ApiListField("channels")
	@ApiField("string")
	private List<String> channels;

	/**
	 * 用户支付宝 UID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 用户支付宝 UID
	 */
	@ApiField("user_uid")
	private String userUid;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public List<String> getChannels() {
		return this.channels;
	}
	public void setChannels(List<String> channels) {
		this.channels = channels;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserUid() {
		return this.userUid;
	}
	public void setUserUid(String userUid) {
		this.userUid = userUid;
	}

}
