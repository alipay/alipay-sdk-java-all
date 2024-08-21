package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 入群有礼模型
 *
 * @author auto create
 * @since 1.0, 2024-07-30 14:28:50
 */
public class GroupGiftVO extends AlipayObject {

	private static final long serialVersionUID = 6255787248422184173L;

	/**
	 * 营销活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 活动名称
	 */
	@ApiField("activity_name")
	private String activityName;

	/**
	 * 入群有礼渠道枚举。默认渠道:"DEFAULT"，用户从任何渠道入群都将展示该福利。目前所有渠道有以下：支付有礼（支付宝支付后推荐的主渠道）、小程序快窗（小程序快窗可投放入群）、小程序组件（商家小程序可嵌入入群官方组件）。
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 渠道名称
	 */
	@ApiField("channel_name")
	private String channelName;

	/**
	 * 入群有礼结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 入群有礼状态。valid：生效中，suspend：已暂停，init：未生效，invalid：已失效，expire：已过期。
	 */
	@ApiField("gift_status")
	private String giftStatus;

	/**
	 * 入群有礼开始时间。
	 */
	@ApiField("start_time")
	private Date startTime;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getActivityName() {
		return this.activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
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

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getGiftStatus() {
		return this.giftStatus;
	}
	public void setGiftStatus(String giftStatus) {
		this.giftStatus = giftStatus;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

}
