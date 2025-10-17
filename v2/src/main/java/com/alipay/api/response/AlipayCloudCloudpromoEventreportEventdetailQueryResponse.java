package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OpenApiEventReportDataResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.eventreport.eventdetail.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-20 17:32:10
 */
public class AlipayCloudCloudpromoEventreportEventdetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8224938585215723553L;

	/** 
	 * 数据结果， 包含响应的参数和响应的具体事件分析数据
	 */
	@ApiField("result")
	private OpenApiEventReportDataResult result;

	public void setResult(OpenApiEventReportDataResult result) {
		this.result = result;
	}
	public OpenApiEventReportDataResult getResult( ) {
		return this.result;
	}

}
