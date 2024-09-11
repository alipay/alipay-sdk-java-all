package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险营销预营销活动DTO
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class InsMktPreUseCampaignDTO extends AlipayObject {

	private static final long serialVersionUID = 7224199844367666143L;

	/**
	 * 活动Id
	 */
	@ApiField("campaign_id")
	private String campaignId;

	/**
	 * 活动名称
	 */
	@ApiField("campaign_name")
	private String campaignName;

	/**
	 * 权益类型
	 */
	@ApiField("coupon_type")
	private String couponType;

	/**
	 * 权益盖帽值
	 */
	@ApiField("coupon_upper_value")
	private String couponUpperValue;

	/**
	 * 权益值
	 */
	@ApiField("coupon_value")
	private String couponValue;

	/**
	 * 是否预核销通过
	 */
	@ApiField("pre_use")
	private Boolean preUse;

	/**
	 * 预核销失败原因
	 */
	@ApiField("reason")
	private String reason;

	public String getCampaignId() {
		return this.campaignId;
	}
	public void setCampaignId(String campaignId) {
		this.campaignId = campaignId;
	}

	public String getCampaignName() {
		return this.campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
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

	public Boolean getPreUse() {
		return this.preUse;
	}
	public void setPreUse(Boolean preUse) {
		this.preUse = preUse;
	}

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

}
