package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.risk.rtopobtsreg.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-11-19 14:11:52
 */
public class AlipayDataRiskRtopobtsregQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8545956878813979351L;

	/** 
	 * 查询后端ssdataprod应用的返回数据
	 */
	@ApiField("query_result")
	private String queryResult;

	/** 
	 * 调用是否成功标识
	 */
	@ApiField("success")
	private String success;

	/** 
	 * unqiue_id+业务唯一识别码traceId
	 */
	@ApiField("unique_id")
	private String uniqueId;

	public void setQueryResult(String queryResult) {
		this.queryResult = queryResult;
	}
	public String getQueryResult( ) {
		return this.queryResult;
	}

	public void setSuccess(String success) {
		this.success = success;
	}
	public String getSuccess( ) {
		return this.success;
	}

	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}
	public String getUniqueId( ) {
		return this.uniqueId;
	}

}
