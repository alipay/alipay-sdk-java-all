package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.sceneprod.data.upload response.
 * 
 * @author auto create
 * @since 1.0, 2019-05-27 09:55:01
 */
public class MybankCreditSceneprodDataUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 1628886652385379283L;

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
