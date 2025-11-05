package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BizResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.defin.finance.ar.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 22:57:02
 */
public class AnttechBlockchainDefinFinanceArQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4462613988472459267L;

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
