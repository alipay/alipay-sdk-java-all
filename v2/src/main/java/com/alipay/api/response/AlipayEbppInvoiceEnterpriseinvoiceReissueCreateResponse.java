package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.enterpriseinvoice.reissue.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-20 16:12:58
 */
public class AlipayEbppInvoiceEnterpriseinvoiceReissueCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7327656964597825595L;

	/** 
	 * 申请流水ID
	 */
	@ApiField("apply_flow_id")
	private String applyFlowId;

	/** 
	 * SUCCESS: 换开成功
ING: 换开中
	 */
	@ApiField("apply_status")
	private String applyStatus;

	public void setApplyFlowId(String applyFlowId) {
		this.applyFlowId = applyFlowId;
	}
	public String getApplyFlowId( ) {
		return this.applyFlowId;
	}

	public void setApplyStatus(String applyStatus) {
		this.applyStatus = applyStatus;
	}
	public String getApplyStatus( ) {
		return this.applyStatus;
	}

}
