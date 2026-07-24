package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.receiptidentitygroup.delete response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-11 16:12:55
 */
public class AlipayCommerceEcReceiptidentitygroupDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 7499459183766357647L;

	/** 
	 * 删除结果是否成功
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
