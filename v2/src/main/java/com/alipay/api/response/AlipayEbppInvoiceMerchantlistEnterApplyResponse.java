package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.merchantlist.enter.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-12 19:02:36
 */
public class AlipayEbppInvoiceMerchantlistEnterApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1497775452121399286L;

	/** 
	 * 工单流水号，支付开票PID模式当前不会返回流水号。
	 */
	@ApiField("process_id")
	private String processId;

	public void setProcessId(String processId) {
		this.processId = processId;
	}
	public String getProcessId( ) {
		return this.processId;
	}

}
