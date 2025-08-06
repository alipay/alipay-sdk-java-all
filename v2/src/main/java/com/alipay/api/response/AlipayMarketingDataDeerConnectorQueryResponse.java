package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.data.deer.connector.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:41:16
 */
public class AlipayMarketingDataDeerConnectorQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5669299467768227199L;

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
