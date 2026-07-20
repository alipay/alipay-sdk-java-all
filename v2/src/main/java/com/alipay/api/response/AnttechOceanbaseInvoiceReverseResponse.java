package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.invoice.reverse response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-18 10:34:00
 */
public class AnttechOceanbaseInvoiceReverseResponse extends AlipayResponse {

	private static final long serialVersionUID = 4318576744243717834L;

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
