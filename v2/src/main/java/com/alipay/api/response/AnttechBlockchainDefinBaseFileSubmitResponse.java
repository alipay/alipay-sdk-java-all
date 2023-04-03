package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BizResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.defin.base.file.submit response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 04:31:49
 */
public class AnttechBlockchainDefinBaseFileSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 2749526633918934535L;

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
