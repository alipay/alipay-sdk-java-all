package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.gfsettleprod.nobillinvoice.apply response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-22 09:38:31
 */
public class AlipayBossFncGfsettleprodNobillinvoiceApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2388473634487493397L;

	/** 
	 * 发票申请单的申请单号
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 流程平台的流程id
	 */
	@ApiField("process_id")
	private String processId;

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setProcessId(String processId) {
		this.processId = processId;
	}
	public String getProcessId( ) {
		return this.processId;
	}

}
