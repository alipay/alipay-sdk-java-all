package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ssdata.dataservice.risk.rtop.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class SsdataDataserviceRiskRtopQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3571415741839878568L;

	/** 
	 * 查询结果+蚁盾风控大脑，监管科技平台查询后端ssdataprod应用的返回数据
	 */
	@ApiField("query_result")
	private String queryResult;

	/** 
	 * 调用是否成功标识
	 */
	@ApiField("success")
	private Boolean success;

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
