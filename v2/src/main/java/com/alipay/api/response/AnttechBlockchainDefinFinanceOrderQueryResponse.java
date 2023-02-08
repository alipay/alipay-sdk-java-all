package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BizResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.defin.finance.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 01:51:40
 */
public class AnttechBlockchainDefinFinanceOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1232918498865961165L;

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
