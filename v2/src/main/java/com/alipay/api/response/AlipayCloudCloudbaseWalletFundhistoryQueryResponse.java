package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.FundHistory;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.wallet.fundhistory.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 14:40:35
 */
public class AlipayCloudCloudbaseWalletFundhistoryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6665732393155981446L;

	/** 
	 * 充值记录列表
	 */
	@ApiListField("fund_histories")
	@ApiField("fund_history")
	private List<FundHistory> fundHistories;

	public void setFundHistories(List<FundHistory> fundHistories) {
		this.fundHistories = fundHistories;
	}
	public List<FundHistory> getFundHistories( ) {
		return this.fundHistories;
	}

}
