package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.invoice.reverse response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-20 10:22:30
 */
public class AnttechOceanbaseInvoiceReverseResponse extends AlipayResponse {

	private static final long serialVersionUID = 3137876627993724441L;

	/** 
	 * 红冲申请单id
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
