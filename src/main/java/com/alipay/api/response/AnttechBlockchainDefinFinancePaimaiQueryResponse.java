package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BizResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.defin.finance.paimai.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-10 12:51:49
 */
public class AnttechBlockchainDefinFinancePaimaiQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8657358931563653375L;

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
