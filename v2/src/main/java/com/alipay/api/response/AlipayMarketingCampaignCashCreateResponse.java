package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.cash.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 22:53:24
 */
public class AlipayMarketingCampaignCashCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6229718115683712974L;

	/** 
	 * 生成的现金红包活动号
	 */
	@ApiField("crowd_no")
	private String crowdNo;

	/** 
	 * 原始活动号,商户排查问题时提供的活动依据
	 */
	@ApiField("origin_crowd_no")
	private String originCrowdNo;

	/** 
	 * 活动创建后的付款链接，返回的是urlencode编码后的字符串。需要先进行urldecode解码，然后在浏览器中进行访问，会先进行支付宝登录引导，然后商户进行付款，付款有效期24小时。
	 */
	@ApiField("pay_url")
	private String payUrl;

	public void setCrowdNo(String crowdNo) {
		this.crowdNo = crowdNo;
	}
	public String getCrowdNo( ) {
		return this.crowdNo;
	}

	public void setOriginCrowdNo(String originCrowdNo) {
		this.originCrowdNo = originCrowdNo;
	}
	public String getOriginCrowdNo( ) {
		return this.originCrowdNo;
	}

	public void setPayUrl(String payUrl) {
		this.payUrl = payUrl;
	}
	public String getPayUrl( ) {
		return this.payUrl;
	}

}
