package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BizResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.defin.finance.paimai.submit response.
 * 
 * @author auto create
 * @since 1.0, 2021-11-20 19:20:48
 */
public class AnttechBlockchainDefinFinancePaimaiSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 7897535878911525965L;

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
