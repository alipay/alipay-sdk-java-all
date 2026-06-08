package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.doctoragentapproval.approve response.
 * 
 * @author auto create
 * @since 1.0, 2026-02-26 16:27:43
 */
public class AlipayCommerceMedicalDoctoragentapprovalApproveResponse extends AlipayResponse {

	private static final long serialVersionUID = 1653371493467461596L;

	/** 
	 * 处理结果
	 */
	@ApiField("data")
	private String data;

	public void setData(String data) {
		this.data = data;
	}
	public String getData( ) {
		return this.data;
	}

}
