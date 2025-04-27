package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BizResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.defin.finance.interbank.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:26
 */
public class AnttechBlockchainDefinFinanceInterbankQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1851662246965579498L;

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
