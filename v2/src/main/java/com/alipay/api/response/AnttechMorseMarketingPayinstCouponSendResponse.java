package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.morse.marketing.payinst.coupon.send response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-19 12:02:42
 */
public class AnttechMorseMarketingPayinstCouponSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 3252656828283666722L;

	/** 
	 * 同入参的活动id
	 */
	@ApiField("campaign_id")
	private String campaignId;

	/** 
	 * 券码id
	 */
	@ApiField("coupon_id")
	private String couponId;

	/** 
	 * 发券的投放凭证号，唯一id。
	 */
	@ApiField("out_biz_id")
	private String outBizId;

	/** 
	 * 券发放状态
	 */
	@ApiField("send_status")
	private String sendStatus;

	public void setCampaignId(String campaignId) {
		this.campaignId = campaignId;
	}
	public String getCampaignId( ) {
		return this.campaignId;
	}

	public void setCouponId(String couponId) {
		this.couponId = couponId;
	}
	public String getCouponId( ) {
		return this.couponId;
	}

	public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
	}
	public String getOutBizId( ) {
		return this.outBizId;
	}

	public void setSendStatus(String sendStatus) {
		this.sendStatus = sendStatus;
	}
	public String getSendStatus( ) {
		return this.sendStatus;
	}

}
