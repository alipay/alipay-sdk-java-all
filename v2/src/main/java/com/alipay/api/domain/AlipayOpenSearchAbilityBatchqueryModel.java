package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 运营列表分页查询
 *
 * @author auto create
 * @since 1.0, 2022-02-09 14:57:24
 */
public class AlipayOpenSearchAbilityBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2243821878982263549L;

	/**
	 * 搜索运营列表的查询request
	 */
	@ApiField("biz_data")
	private SearchOperPageQueryRequest bizData;

	/**
	 * 表示修改内容的业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 进行具体操作的类型比如：query
	 */
	@ApiField("opt_type")
	private String optType;

	public SearchOperPageQueryRequest getBizData() {
		return this.bizData;
	}
	public void setBizData(SearchOperPageQueryRequest bizData) {
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
