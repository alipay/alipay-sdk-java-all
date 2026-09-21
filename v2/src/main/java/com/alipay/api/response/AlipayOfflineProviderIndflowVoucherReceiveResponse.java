package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AdVoucherPrizeDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.indflow.voucher.receive response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-10 10:12:57
 */
public class AlipayOfflineProviderIndflowVoucherReceiveResponse extends AlipayResponse {

	private static final long serialVersionUID = 3256647854332765599L;

	/** 
	 * null
	 */
	@ApiListField("prize_details")
	@ApiField("ad_voucher_prize_detail")
	private List<AdVoucherPrizeDetail> prizeDetails;

	public void setPrizeDetails(List<AdVoucherPrizeDetail> prizeDetails) {
		this.prizeDetails = prizeDetails;
	}
	public List<AdVoucherPrizeDetail> getPrizeDetails( ) {
		return this.prizeDetails;
	}

}
