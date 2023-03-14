package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BizResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.defin.finance.interbank.submit response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 06:54:51
 */
public class AnttechBlockchainDefinFinanceInterbankSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 6148538431531292484L;

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
