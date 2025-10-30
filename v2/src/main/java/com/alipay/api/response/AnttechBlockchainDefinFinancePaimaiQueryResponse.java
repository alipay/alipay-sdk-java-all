package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BizResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.defin.finance.paimai.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 06:36:46
 */
public class AnttechBlockchainDefinFinancePaimaiQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5537768452568963542L;

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
