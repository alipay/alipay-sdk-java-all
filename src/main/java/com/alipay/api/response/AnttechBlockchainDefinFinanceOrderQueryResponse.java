package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BizResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.defin.finance.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-11-20 19:21:17
 */
public class AnttechBlockchainDefinFinanceOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7613651552374582973L;

	/** 
	 * 业务结果
	 */
	@ApiField("biz_result")
	private BizResult bizResult;

	public void setBizResult(BizResult bizResult) {
		this.bizResult = bizResult;
	}
	public BizResult getBizResult( ) {
		return this.bizResult;
	}

}
