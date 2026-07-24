package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 运营商行业三方机构用户行为同步
 *
 * @author auto create
 * @since 1.0, 2026-06-02 10:57:52
 */
public class AlipayCommerceAcommunicationUserBehaviorSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3512754162262167694L;

	/**
	 * 用户操作时间
	 */
	@ApiField("action_time")
	private Date actionTime;

	/**
	 * 用户操作类型
	 */
	@ApiField("action_type")
	private String actionType;

	/**
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 操作唯一标识
	 */
	@ApiField("event_id")
	private String eventId;

	/**
	 * 支付宝用户id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

	public Date getActionTime() {
		return this.actionTime;
	}
	public void setActionTime(Date actionTime) {
		this.actionTime = actionTime;
	}

	public String getActionType() {
		return this.actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getEventId() {
		return this.eventId;
	}
	public void setEventId(String eventId) {
		this.eventId = eventId;
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
