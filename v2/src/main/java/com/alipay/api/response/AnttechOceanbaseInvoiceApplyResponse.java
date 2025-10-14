package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.invoice.apply response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-12 16:17:37
 */
public class AnttechOceanbaseInvoiceApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8668779458981948867L;

	/** 
	 * 申请单业务主键
	 */
	@ApiField("apply_id")
	private String applyId;

	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}
	public String getApplyId( ) {
		return this.applyId;
	}

}
