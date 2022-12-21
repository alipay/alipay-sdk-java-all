package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.sceneprod.bill.sync response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 20:34:45
 */
public class MybankCreditSceneprodBillSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 1798432516357675617L;

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
