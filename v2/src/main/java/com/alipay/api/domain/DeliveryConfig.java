package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 投放配置
 *
 * @author auto create
 * @since 1.0, 2023-03-31 01:11:18
 */
public class DeliveryConfig extends AlipayObject {

	private static final long serialVersionUID = 1851392575541863677L;

	/**
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 展位码:boothCode表达的是具体渠道所属的展位码。例如：支付结果页PAYMENT_RESULT
	 */
	@ApiField("booth_code")
	private String boothCode;

	/**
	 * 可投放的渠道标识.
	 */
	@ApiField("channel")
	private String channel;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getBoothCode() {
		return this.boothCode;
	}
	public void setBoothCode(String boothCode) {
		this.boothCode = boothCode;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

}
