package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BizResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.defin.finance.interbank.submit response.
 * 
 * @author auto create
 * @since 1.0, 2020-08-04 11:11:17
 */
public class AnttechBlockchainDefinFinanceInterbankSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 4453144699334887324L;

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
