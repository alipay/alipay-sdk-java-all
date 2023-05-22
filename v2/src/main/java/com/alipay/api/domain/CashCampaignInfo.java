package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 现金活动信息
 *
 * @author auto create
 * @since 1.0, 2016-12-08 11:56:01
 */
public class CashCampaignInfo extends AlipayObject {

	private static final long serialVersionUID = 4851755441655366284L;

	/**
	 * 活动状态
	 */
	@ApiField("camp_status")
	private String campStatus;

	/**
	 * 现金红包名称
	 */
	@ApiField("coupon_name")
	private String couponName;

	/**
	 * 现金红包活动号
	 */
	@ApiField("crowd_no")
	private String crowdNo;

	/**
	 * 原始活动号,商户进行问题排查时提供
	 */
	@ApiField("origin_crowd_no")
	private String originCrowdNo;

	public String getCampStatus() {
		return this.campStatus;
	}
	public void setCampStatus(String campStatus) {
		this.campStatus = campStatus;
	}

	public String getCouponName() {
		return this.couponName;
	}
	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}

	public String getCrowdNo() {
		return this.crowdNo;
	}
	public void setCrowdNo(String crowdNo) {
		this.crowdNo = crowdNo;
	}

	public String getOriginCrowdNo() {
		return this.originCrowdNo;
	}
	public void setOriginCrowdNo(String originCrowdNo) {
		this.originCrowdNo = originCrowdNo;
	}

}
