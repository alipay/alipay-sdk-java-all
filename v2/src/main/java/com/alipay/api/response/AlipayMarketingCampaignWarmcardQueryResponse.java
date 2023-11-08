package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.warmcard.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 01:12:30
 */
public class AlipayMarketingCampaignWarmcardQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7595341591542924342L;

	/** 
	 * 是否领过暖心卡
	 */
	@ApiField("has_receive")
	private Boolean hasReceive;

	/** 
	 * 暖心卡优惠券对应是否有剩余金额标识
	 */
	@ApiField("voucher_type_remain_info")
	private String voucherTypeRemainInfo;

	public void setHasReceive(Boolean hasReceive) {
		this.hasReceive = hasReceive;
	}
	public Boolean getHasReceive( ) {
		return this.hasReceive;
	}

	public void setVoucherTypeRemainInfo(String voucherTypeRemainInfo) {
		this.voucherTypeRemainInfo = voucherTypeRemainInfo;
	}
	public String getVoucherTypeRemainInfo( ) {
		return this.voucherTypeRemainInfo;
	}

}
