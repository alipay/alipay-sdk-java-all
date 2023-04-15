package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BizResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.defin.finance.paimai.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 17:16:47
 */
public class AnttechBlockchainDefinFinancePaimaiQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4794457455655594313L;

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
