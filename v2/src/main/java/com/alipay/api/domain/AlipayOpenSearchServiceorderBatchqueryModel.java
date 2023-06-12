package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 搜索运营服务查询接口
 *
 * @author auto create
 * @since 1.0, 2023-05-11 11:32:44
 */
public class AlipayOpenSearchServiceorderBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3555579892156858132L;

	/**
	 * 服务搜索申请单分页入参
	 */
	@ApiField("biz_data")
	private SearchApplyPageQueryRequest bizData;

	/**
	 * 表示查询内容的类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 操作的类型，如query
	 */
	@ApiField("opt_type")
	private String optType;

	public SearchApplyPageQueryRequest getBizData() {
		return this.bizData;
	}
	public void setBizData(SearchApplyPageQueryRequest bizData) {
		this.bizData = bizData;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getOptType() {
		return this.optType;
	}
	public void setOptType(String optType) {
		this.optType = optType;
	}

}
