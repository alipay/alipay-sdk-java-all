package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 多维授权查询
 *
 * @author auto create
 * @since 1.0, 2023-10-07 15:21:49
 */
public class AlipayBossBaseAntauthorizeMultiQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4821547474974176736L;

	/**
	 * 基于多维度授权查询的参数
	 */
	@ApiField("query")
	private MultiDimAuthAmountQuery query;

	/**
	 * 接口查询信息，包含调用接口的系统、人的域账号、调用类型
	 */
	@ApiField("query_info")
	private QueryInfo queryInfo;

	public MultiDimAuthAmountQuery getQuery() {
		return this.query;
	}
	public void setQuery(MultiDimAuthAmountQuery query) {
		this.query = query;
	}

	public QueryInfo getQueryInfo() {
		return this.queryInfo;
	}
	public void setQueryInfo(QueryInfo queryInfo) {
		this.queryInfo = queryInfo;
	}

}
