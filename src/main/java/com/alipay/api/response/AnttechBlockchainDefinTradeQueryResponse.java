package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BizResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.defin.trade.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-05-27 11:40:10
 */
public class AnttechBlockchainDefinTradeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8862558422155179263L;

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
