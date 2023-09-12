package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.devops.base.use response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-30 20:51:43
 */
public class AlipayCloudDevopsBaseUseResponse extends AlipayResponse {

	private static final long serialVersionUID = 3728176292462968191L;

	/** 
	 * 通过
	 */
	@ApiField("biz_result")
	private String bizResult;

	/** 
	 * 闪退列表
	 */
	@ApiField("service_code")
	private String serviceCode;

	public void setBizResult(String bizResult) {
		this.bizResult = bizResult;
	}
	public String getBizResult( ) {
		return this.bizResult;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}
	public String getServiceCode( ) {
		return this.serviceCode;
	}

}
