package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序云风险智能电话查询
 *
 * @author auto create
 * @since 1.0, 2024-11-25 17:40:41
 */
public class AlipayCloudCloudpromoMessageDeliveryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3427145735712894293L;

	/**
	 * 智能触达查询条件
	 */
	@ApiField("query_criteria")
	private QueryCriteria queryCriteria;

	/**
	 * 智能触达时记录ID，用于查询触达结果
	 */
	@ApiField("record_id")
	private String recordId;

	public QueryCriteria getQueryCriteria() {
		return this.queryCriteria;
	}
	public void setQueryCriteria(QueryCriteria queryCriteria) {
		this.queryCriteria = queryCriteria;
	}

	public String getRecordId() {
		return this.recordId;
	}
	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}

}
