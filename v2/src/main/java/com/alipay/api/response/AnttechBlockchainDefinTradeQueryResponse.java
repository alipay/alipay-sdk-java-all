package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BizResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.defin.trade.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:12
 */
public class AnttechBlockchainDefinTradeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7315854254132956161L;

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
