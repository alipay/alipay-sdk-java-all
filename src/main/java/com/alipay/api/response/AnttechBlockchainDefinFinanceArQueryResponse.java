package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BizResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.defin.finance.ar.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-06-02 16:20:10
 */
public class AnttechBlockchainDefinFinanceArQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2263772148849459362L;

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
