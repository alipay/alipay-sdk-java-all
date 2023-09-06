package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.apply.inv.upload response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 02:26:47
 */
public class AlipayEbppInvoiceApplyInvUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 5838881551452223672L;

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
