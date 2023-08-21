package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OpenVoucherTradeFundDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.voucher.transferdetail.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 09:51:58
 */
public class AlipayMarketingVoucherTransferdetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8697819257581451464L;

	/** 
	 * 券交易明细
	 */
	@ApiListField("open_voucher_trade_fund_details")
	@ApiField("open_voucher_trade_fund_detail")
	private List<OpenVoucherTradeFundDetail> openVoucherTradeFundDetails;

	public void setOpenVoucherTradeFundDetails(List<OpenVoucherTradeFundDetail> openVoucherTradeFundDetails) {
		this.openVoucherTradeFundDetails = openVoucherTradeFundDetails;
	}
	public List<OpenVoucherTradeFundDetail> getOpenVoucherTradeFundDetails( ) {
		return this.openVoucherTradeFundDetails;
	}

}
