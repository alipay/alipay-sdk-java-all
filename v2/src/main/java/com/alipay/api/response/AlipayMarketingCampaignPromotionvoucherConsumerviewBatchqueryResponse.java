package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.VoucherDetailVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.promotionvoucher.consumerview.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 00:34:24
 */
public class AlipayMarketingCampaignPromotionvoucherConsumerviewBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3646317368866213482L;

	/** 
	 * 券详情列表
	 */
	@ApiListField("vouchers")
	@ApiField("voucher_detail_v_o")
	private List<VoucherDetailVO> vouchers;

	public void setVouchers(List<VoucherDetailVO> vouchers) {
		this.vouchers = vouchers;
	}
	public List<VoucherDetailVO> getVouchers( ) {
		return this.vouchers;
	}

}
