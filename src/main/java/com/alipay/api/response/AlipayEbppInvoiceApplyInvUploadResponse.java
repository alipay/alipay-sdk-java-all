package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.apply.inv.upload response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-08 13:21:34
 */
public class AlipayEbppInvoiceApplyInvUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 6381184275187573857L;

	/** 
	 * 处理是否成功
	 */
	@ApiField("is_success")
	private Boolean isSuccess;

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public Boolean getIsSuccess( ) {
		return this.isSuccess;
	}

}
