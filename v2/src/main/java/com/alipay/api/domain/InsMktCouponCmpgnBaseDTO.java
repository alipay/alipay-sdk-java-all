package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险营销权益活动基础信息DTO
 *
 * @author auto create
 * @since 1.0, 2017-07-19 16:56:59
 */
public class InsMktCouponCmpgnBaseDTO extends AlipayObject {

	private static final long serialVersionUID = 1158924245555815991L;

	/**
	 * 活动id
	 */
	@ApiField("campaign_id")
	private String campaignId;

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

	public String getCampaignId() {
		return this.campaignId;
	}
	public void setCampaignId(String campaignId) {
		this.campaignId = campaignId;
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
