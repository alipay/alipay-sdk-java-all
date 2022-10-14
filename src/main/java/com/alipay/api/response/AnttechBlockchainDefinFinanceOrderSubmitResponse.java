package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BizResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.defin.finance.order.submit response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-10 18:46:56
 */
public class AnttechBlockchainDefinFinanceOrderSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 2731797296443965397L;

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
