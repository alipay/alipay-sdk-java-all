package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.data.deer.connector.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-01-06 16:28:20
 */
public class AlipayMarketingDataDeerConnectorQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7494535638926411838L;

	/** 
	 * 返回活动的流量数据
	 */
	@ApiField("result")
	private String result;

	/** 
	 * 请求业务处理是否成功
	 */
	@ApiField("success")
	private Boolean success;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
