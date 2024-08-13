package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.risk.httpproxy.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-24 22:21:22
 */
public class AnttechBlockchainRiskHttpproxyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3637425739431294834L;

	/** 
	 * 返回接口数据，例如mps模型，只有标签和评分，无个人敏感信息
	 */
	@ApiField("response")
	private String response;

	/** 
	 * 响应成功与否
	 */
	@ApiField("success")
	private Boolean success;

	/** 
	 * 业务唯一识别码traceId
	 */
	@ApiField("unique_id")
	private String uniqueId;

	public void setResponse(String response) {
		this.response = response;
	}
	public String getResponse( ) {
		return this.response;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}
	public String getUniqueId( ) {
		return this.uniqueId;
	}

}
