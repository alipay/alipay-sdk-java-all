package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.common.transfer.sign response.
 * 
 * @author auto create
 * @since 1.0, 2023-12-05 14:31:55
 */
public class AlipayCommerceCommonTransferSignResponse extends AlipayResponse {

	private static final long serialVersionUID = 4424494232892134535L;

	/** 
	 * 用于授权操作商户余额账户资金
	 */
	@ApiField("operation_url")
	private String operationUrl;

	public void setOperationUrl(String operationUrl) {
		this.operationUrl = operationUrl;
	}
	public String getOperationUrl( ) {
		return this.operationUrl;
	}

}
