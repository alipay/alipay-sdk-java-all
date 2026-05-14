package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * SaaS履约单批量查询
 *
 * @author auto create
 * @since 1.0, 2026-04-20 17:07:45
 */
public class AlipayCommerceMedicalFulfillmentListQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6391323975413337571L;

	/**
	 * null
	 */
	@ApiListField("query_data")
	@ApiField("query_data")
	private List<QueryData> queryData;

	public List<QueryData> getQueryData() {
		return this.queryData;
	}
	public void setQueryData(List<QueryData> queryData) {
		this.queryData = queryData;
	}

}
