package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险营销权益活动数据结构
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class InsMktCouponCampaignDTO extends AlipayObject {

	private static final long serialVersionUID = 4746131329557887162L;

	/**
	 * 活动核销截止时间
	 */
	@ApiField("campaign_end_time")
	private Date campaignEndTime;

	/**
	 * 活动Id
	 */
	@ApiField("campaign_id")
	private String campaignId;

	/**
	 * 活动备注
	 */
	@ApiField("campaign_memo")
	private String campaignMemo;

	/**
	 * 活动描述
	 */
	@ApiField("campaign_name")
	private String campaignName;

	/**
	 * 活动开始时间
	 */
	@ApiField("campaign_start_time")
	private Date campaignStartTime;

	/**
	 * 活动的权益类型描述
	 */
	@ApiField("coupon_type")
	private String couponType;

	/**
	 * 权益盖帽值，如1000元优惠券
	 */
	@ApiField("coupon_upper_value")
	private String couponUpperValue;

	/**
	 * 权益值，如500元优惠券
	 */
	@ApiField("coupon_value")
	private String couponValue;

	public Date getCampaignEndTime() {
		return this.campaignEndTime;
	}
	public void setCampaignEndTime(Date campaignEndTime) {
		this.campaignEndTime = campaignEndTime;
	}

	public String getCampaignId() {
		return this.campaignId;
	}
	public void setCampaignId(String campaignId) {
		this.campaignId = campaignId;
	}

	public String getCampaignMemo() {
		return this.campaignMemo;
	}
	public void setCampaignMemo(String campaignMemo) {
		this.campaignMemo = campaignMemo;
	}

	public String getCampaignName() {
		return this.campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public Date getCampaignStartTime() {
		return this.campaignStartTime;
	}
	public void setCampaignStartTime(Date campaignStartTime) {
		this.campaignStartTime = campaignStartTime;
	}

	public String getCouponType() {
		return this.couponType;
	}
	public void setCouponType(String couponType) {
		this.couponType = couponType;
	}

	public String getCouponUpperValue() {
		return this.couponUpperValue;
	}
	public void setCouponUpperValue(String couponUpperValue) {
		this.couponUpperValue = couponUpperValue;
	}

	public String getCouponValue() {
		return this.couponValue;
	}
	public void setCouponValue(String couponValue) {
		this.couponValue = couponValue;
	}

}
