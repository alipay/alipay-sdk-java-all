package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.FundWalletBizOrderResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.wallet.pageoperation.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-21 15:27:45
 */
public class AlipayFundWalletPageoperationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2313359475257958124L;

	/** 
	 * 业务单据列表
	 */
	@ApiListField("fund_wallet_biz_order_response_list")
	@ApiField("fund_wallet_biz_order_response")
	private List<FundWalletBizOrderResponse> fundWalletBizOrderResponseList;

	public void setFundWalletBizOrderResponseList(List<FundWalletBizOrderResponse> fundWalletBizOrderResponseList) {
		this.fundWalletBizOrderResponseList = fundWalletBizOrderResponseList;
	}
	public List<FundWalletBizOrderResponse> getFundWalletBizOrderResponseList( ) {
		return this.fundWalletBizOrderResponseList;
	}

}
