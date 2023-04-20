package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.user.voucher.receive response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 14:47:15
 */
public class AlipayMarketingCampaignUserVoucherReceiveResponse extends AlipayResponse {

	private static final long serialVersionUID = 6716932398558876674L;

	/** 
	 * 券id：领取成功时返回
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}
	public String getVoucherId( ) {
		return this.voucherId;
	}

}
