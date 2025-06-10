package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 触发对应乐园奖励
 *
 * @author auto create
 * @since 1.0, 2025-05-08 23:37:17
 */
public class AlipaySocialGamecenterGamerightsTriggerModel extends AlipayObject {

	private static final long serialVersionUID = 2357148972294823569L;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 触发权益数量，数量为个
	 */
	@ApiField("trigger_right_num")
	private Long triggerRightNum;

	/**
	 * 触发权益类型
	 */
	@ApiField("trigger_right_type")
	private String triggerRightType;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Long getTriggerRightNum() {
		return this.triggerRightNum;
	}
	public void setTriggerRightNum(Long triggerRightNum) {
		this.triggerRightNum = triggerRightNum;
	}

	public String getTriggerRightType() {
		return this.triggerRightType;
	}
	public void setTriggerRightType(String triggerRightType) {
		this.triggerRightType = triggerRightType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
