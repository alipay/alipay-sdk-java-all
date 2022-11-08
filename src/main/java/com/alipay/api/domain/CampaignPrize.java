package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 活动奖品对象，包含活动渠道、优惠金额、优惠门槛、活动文案等等信息
 *
 * @author auto create
 * @since 1.0, 2022-09-06 20:07:57
 */
public class CampaignPrize extends AlipayObject {

	private static final long serialVersionUID = 1641618317917121817L;

	/**
	 * 优惠渠道描述优惠来源信息
	 */
	@ApiField("campaign_channel")
	private String campaignChannel;

	/**
	 * 活动渠道码信息，用于标识活动渠道，主要是简称
	 */
	@ApiField("campaign_channel_code")
	private String campaignChannelCode;

	/**
	 * 活动id描述本次查询命中的活动标识
	 */
	@ApiField("campaign_id")
	private String campaignId;

	/**
	 * 创意文案信息标识命中活动露出的创意文案信息，可以通过管理平台配置并露出给调用方，自定义信息，一般是json格式，配置自定义创意时必选
	 */
	@ApiField("idea_content")
	private String ideaContent;

	/**
	 * 创意类型标识外部展示采用的方式，摩斯平台配置，配置自定义创意时必选
	 */
	@ApiField("idea_type")
	private String ideaType;

	/**
	 * 命中后返回的跳转链接，配置跳转链接时必选
	 */
	@ApiField("link")
	private String link;

	/**
	 * 最大优惠金额用于标识咨询活动可以享受的最大优惠金额，配置权益时必选
	 */
	@ApiField("max_amount")
	private String maxAmount;

	/**
	 * 最小优惠金额用于标识咨询活动可以享受的最小优惠金额，配置权益时必选
	 */
	@ApiField("min_amount")
	private String minAmount;

	/**
	 * 优惠门槛金额类型，标识订单金额需要满此金额才能享受优惠，配置权益时必选
	 */
	@ApiField("threshold")
	private String threshold;

	public String getCampaignChannel() {
		return this.campaignChannel;
	}
	public void setCampaignChannel(String campaignChannel) {
		this.campaignChannel = campaignChannel;
	}

	public String getCampaignChannelCode() {
		return this.campaignChannelCode;
	}
	public void setCampaignChannelCode(String campaignChannelCode) {
		this.campaignChannelCode = campaignChannelCode;
	}

	public String getCampaignId() {
		return this.campaignId;
	}
	public void setCampaignId(String campaignId) {
		this.campaignId = campaignId;
	}

	public String getIdeaContent() {
		return this.ideaContent;
	}
	public void setIdeaContent(String ideaContent) {
		this.ideaContent = ideaContent;
	}

	public String getIdeaType() {
		return this.ideaType;
	}
	public void setIdeaType(String ideaType) {
		this.ideaType = ideaType;
	}

	public String getLink() {
		return this.link;
	}
	public void setLink(String link) {
		this.link = link;
	}

	public String getMaxAmount() {
		return this.maxAmount;
	}
	public void setMaxAmount(String maxAmount) {
		this.maxAmount = maxAmount;
	}

	public String getMinAmount() {
		return this.minAmount;
	}
	public void setMinAmount(String minAmount) {
		this.minAmount = minAmount;
	}

	public String getThreshold() {
		return this.threshold;
	}
	public void setThreshold(String threshold) {
		this.threshold = threshold;
	}

}
