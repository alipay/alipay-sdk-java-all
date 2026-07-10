package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * SaaS履约单批量查询
 *
 * @author auto create
 * @since 1.0, 2026-07-10 11:37:55
 */
public class AlipayCommerceMedicalFulfillmentListQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1249459312574289541L;

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
