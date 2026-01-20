package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.merchant.enterstatus.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:53
 */
public class AlipayEbppInvoiceMerchantEnterstatusQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7714614891424841881L;

	/** 
	 * 工单状态，审核中：AUDITING，验收中：ACCEPTING，成功：SUCCESS，失败：FAIL
	 */
	@ApiField("status")
	private String status;

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
