package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序增长平台事件触发
 *
 * @author auto create
 * @since 1.0, 2024-07-23 20:18:41
 */
public class AlipayOpenMiniMgpEventTriggerModel extends AlipayObject {

	private static final long serialVersionUID = 6439438466331719117L;

	/**
	 * 业务类型，优先级低于event_code，如果同时传入event_code和biz_type则会优先使用event_code
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 事件码，优先级高于biz_type，如果同时传入event_code和biz_type则会优先使用event_code
	 */
	@ApiField("event_code")
	private String eventCode;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 唯一ID，自定义，用于进行幂等校验，如果不传则表示不进行幂等校验
	 */
	@ApiField("unique_id")
	private String uniqueId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getEventCode() {
		return this.eventCode;
	}
	public void setEventCode(String eventCode) {
		this.eventCode = eventCode;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUniqueId() {
		return this.uniqueId;
	}
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
