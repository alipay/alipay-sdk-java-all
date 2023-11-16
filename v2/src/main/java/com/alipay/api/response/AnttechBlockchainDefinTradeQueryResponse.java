package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BizResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.defin.trade.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-23 20:50:10
 */
public class AnttechBlockchainDefinTradeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1265539566627716627L;

	/** 
	 * biz_result
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
