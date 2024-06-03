package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 投放信息
 *
 * @author auto create
 * @since 1.0, 2023-06-29 12:26:09
 */
public class PromoDeliveryInfo extends AlipayObject {

	private static final long serialVersionUID = 1117115568291145462L;

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

	/**
	 * 渠道名称
	 */
	@ApiField("channel_name")
	private String channelName;

	/**
	 * 投放状态。
	 */
	@ApiField("delivery_status")
	private String deliveryStatus;

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

	public String getChannelName() {
		return this.channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public String getDeliveryStatus() {
		return this.deliveryStatus;
	}
	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

}
