package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SnsTradeDataResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.order.snstrade.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-29 17:32:25
 */
public class AlipayMerchantOrderSnstradeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2734719262672979793L;

	/** 
	 * 动销数据
	 */
	@ApiListField("data_results")
	@ApiField("sns_trade_data_result")
	private List<SnsTradeDataResult> dataResults;

	public void setDataResults(List<SnsTradeDataResult> dataResults) {
		this.dataResults = dataResults;
	}
	public List<SnsTradeDataResult> getDataResults( ) {
		return this.dataResults;
	}

}
