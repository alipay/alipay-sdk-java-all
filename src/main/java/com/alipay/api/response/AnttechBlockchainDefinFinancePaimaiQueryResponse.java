package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BizResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.defin.finance.paimai.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-11-20 19:21:23
 */
public class AnttechBlockchainDefinFinancePaimaiQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3751924385669675735L;

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
