package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.marketing.campaign.prize.send response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:55
 */
public class AlipayInsMarketingCampaignPrizeSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 7728327311576968185L;

	/** 
	 * 资产Id，如单品券权益类型，则对应的资产Id即为券Id
	 */
	@ApiField("asset_id")
	private String assetId;

	/** 
	 * 活动Id
	 */
	@ApiField("compaign_id")
	private String compaignId;

	/** 
	 * 用户权益Id
	 */
	@ApiField("coupon_id")
	private String couponId;

	/** 
	 * 权益类型：
single_voucher：单品券
full_jfb：集分宝
	 */
	@ApiField("coupon_type")
	private String couponType;

	/** 
	 * 权益值，如优惠券则表示金额
	 */
	@ApiField("coupon_value")
	private String couponValue;

	/** 
	 * 发奖流水Id
	 */
	@ApiField("flow_id")
	private String flowId;

	public void setAssetId(String assetId) {
		this.assetId = assetId;
	}
	public String getAssetId( ) {
		return this.assetId;
	}

	public void setCompaignId(String compaignId) {
		this.compaignId = compaignId;
	}
	public String getCompaignId( ) {
		return this.compaignId;
	}

	public void setCouponId(String couponId) {
		this.couponId = couponId;
	}
	public String getCouponId( ) {
		return this.couponId;
	}

	public void setCouponType(String couponType) {
		this.couponType = couponType;
	}
	public String getCouponType( ) {
		return this.couponType;
	}

	public void setCouponValue(String couponValue) {
		this.couponValue = couponValue;
	}
	public String getCouponValue( ) {
		return this.couponValue;
	}

	public void setFlowId(String flowId) {
		this.flowId = flowId;
	}
	public String getFlowId( ) {
		return this.flowId;
	}

}
