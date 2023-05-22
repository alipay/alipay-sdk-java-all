package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.VoucherItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.self.voucher.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 04:47:55
 */
public class AlipayMarketingCampaignSelfVoucherQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5499828139586733676L;

	/** 
	 * 券列表
	 */
	@ApiField("voucher_item")
	private VoucherItem voucherItem;

	public void setVoucherItem(VoucherItem voucherItem) {
		this.voucherItem = voucherItem;
	}
	public VoucherItem getVoucherItem( ) {
		return this.voucherItem;
	}

}
