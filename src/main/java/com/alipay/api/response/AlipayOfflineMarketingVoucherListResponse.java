package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.VoucherCampaignToolInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.marketing.voucher.list response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOfflineMarketingVoucherListResponse extends AlipayResponse {

	private static final long serialVersionUID = 2833461727121162934L;

	/** 
	 * 券工具信息
	 */
	@ApiListField("voucher_campaign_tool_infos")
	@ApiField("voucher_campaign_tool_info")
	private List<VoucherCampaignToolInfo> voucherCampaignToolInfos;

	public void setVoucherCampaignToolInfos(List<VoucherCampaignToolInfo> voucherCampaignToolInfos) {
		this.voucherCampaignToolInfos = voucherCampaignToolInfos;
	}
	public List<VoucherCampaignToolInfo> getVoucherCampaignToolInfos( ) {
		return this.voucherCampaignToolInfos;
	}

}
