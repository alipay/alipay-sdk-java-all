package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.offlinevars.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-20 16:39:39
 */
public class AlipaySecurityRiskOfflinevarsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1771588551647111441L;

	/** 
	 * 查询结果，包含所有维度的结果数据，两层json格式
	 */
	@ApiField("query_result")
	private String queryResult;

	/** 
	 * 调用是否成功标识
	 */
	@ApiField("success")
	private Boolean success;

	/** 
	 * 业务唯一识别码
	 */
	@ApiField("unique_id")
	private String uniqueId;

	public void setQueryResult(String queryResult) {
		this.queryResult = queryResult;
	}
	public String getQueryResult( ) {
		return this.queryResult;
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
