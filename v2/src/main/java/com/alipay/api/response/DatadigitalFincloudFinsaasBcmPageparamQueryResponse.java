package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.finsaas.bcm.pageparam.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 02:36:43
 */
public class DatadigitalFincloudFinsaasBcmPageparamQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7687992143417725465L;

	/** 
	 * 页面阶段所需的参数
	 */
	@ApiField("page_param_json")
	private String pageParamJson;

	public void setPageParamJson(String pageParamJson) {
		this.pageParamJson = pageParamJson;
	}
	public String getPageParamJson( ) {
		return this.pageParamJson;
	}

}
