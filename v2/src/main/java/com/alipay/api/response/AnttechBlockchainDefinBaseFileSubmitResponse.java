package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BizResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.defin.base.file.submit response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 06:21:48
 */
public class AnttechBlockchainDefinBaseFileSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 3311177455618544685L;

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
