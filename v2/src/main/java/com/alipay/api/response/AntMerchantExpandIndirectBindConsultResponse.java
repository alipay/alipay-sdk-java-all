package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.indirect.bind.consult response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 00:55:38
 */
public class AntMerchantExpandIndirectBindConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 4534415249424442595L;

	/** 
	 * 解绑结果
	 */
	@ApiField("handle_result")
	private String handleResult;

	public void setHandleResult(String handleResult) {
		this.handleResult = handleResult;
	}
	public String getHandleResult( ) {
		return this.handleResult;
	}

}
