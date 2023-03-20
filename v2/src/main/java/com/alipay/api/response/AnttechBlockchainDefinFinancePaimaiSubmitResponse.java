package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BizResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.defin.finance.paimai.submit response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 06:56:42
 */
public class AnttechBlockchainDefinFinancePaimaiSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 6621238134455473564L;

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
