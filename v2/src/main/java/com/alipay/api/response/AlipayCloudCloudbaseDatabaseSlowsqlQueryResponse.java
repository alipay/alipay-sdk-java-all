package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.database.slowsql.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-28 11:37:04
 */
public class AlipayCloudCloudbaseDatabaseSlowsqlQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7529334471751186831L;

	/** 
	 * 指标数据 （数据样例）{
   {
    "metrics": "{\"tags\":{},\"values\":[[1709636400000,\"1.0\"],[1709636940000,\"0.0\"],[1709637000000,\"0.0\"]]}"
}
tags 代表维度 values代表时间戳和监控值
	 */
	@ApiField("metrics")
	private String metrics;

	public void setMetrics(String metrics) {
		this.metrics = metrics;
	}
	public String getMetrics( ) {
		return this.metrics;
	}

}
