package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.receiptidentitygroup.modify response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-11 16:17:56
 */
public class AlipayCommerceEcReceiptidentitygroupModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5533122523726665432L;

	/** 
	 * 修改结果是否成功
	 */
	@ApiField("result")
	private Boolean result;

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

}
