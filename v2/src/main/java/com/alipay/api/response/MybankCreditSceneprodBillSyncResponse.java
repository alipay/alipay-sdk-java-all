package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.sceneprod.bill.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:27:00
 */
public class MybankCreditSceneprodBillSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5623531562462225361L;

	/** 
	 * 网商traceId，便于查询日志内容
	 */
	@ApiField("trace_id")
	private String traceId;

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}
	public String getTraceId( ) {
		return this.traceId;
	}

}
