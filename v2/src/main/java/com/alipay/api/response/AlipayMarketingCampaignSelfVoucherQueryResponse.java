package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.VoucherItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.self.voucher.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:41:16
 */
public class AlipayMarketingCampaignSelfVoucherQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4586153787471421631L;

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
