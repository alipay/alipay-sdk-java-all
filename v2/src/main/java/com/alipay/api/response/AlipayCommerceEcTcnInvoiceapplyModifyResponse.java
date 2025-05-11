package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.tcn.invoiceapply.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-28 11:31:48
 */
public class AlipayCommerceEcTcnInvoiceapplyModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5581491848381515976L;

	/** 
	 * 开票申请ID
	 */
	@ApiField("apply_id")
	private String applyId;

	/** 
	 * 开票申请状态
	 */
	@ApiField("apply_status")
	private String applyStatus;

	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}
	public String getApplyId( ) {
		return this.applyId;
	}

	public void setApplyStatus(String applyStatus) {
		this.applyStatus = applyStatus;
	}
	public String getApplyStatus( ) {
		return this.applyStatus;
	}

}
