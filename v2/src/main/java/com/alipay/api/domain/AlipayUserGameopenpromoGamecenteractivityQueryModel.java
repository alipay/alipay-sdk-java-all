package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 游戏中心平台活动查询
 *
 * @author auto create
 * @since 1.0, 2026-05-14 15:17:58
 */
public class AlipayUserGameopenpromoGamecenteractivityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3451926279388376428L;

	/**
	 * 平台活动id，通过线下沟通提前约定好活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 从小游戏链接中直接获取到的渠道参数
	 */
	@ApiField("ch_info")
	private String chInfo;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getChInfo() {
		return this.chInfo;
	}
	public void setChInfo(String chInfo) {
		this.chInfo = chInfo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
