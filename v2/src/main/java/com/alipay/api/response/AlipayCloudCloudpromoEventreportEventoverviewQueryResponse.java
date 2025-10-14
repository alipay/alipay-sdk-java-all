package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OpenApiEventReportDataResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.eventreport.eventoverview.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-20 17:32:10
 */
public class AlipayCloudCloudpromoEventreportEventoverviewQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1195767669196556217L;

	/** 
	 * 自定义事件报表的数据返回结果
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
