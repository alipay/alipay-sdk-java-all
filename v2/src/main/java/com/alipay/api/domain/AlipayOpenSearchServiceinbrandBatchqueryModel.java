package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 品牌box创建
 *
 * @author auto create
 * @since 1.0, 2021-08-19 19:56:29
 */
public class AlipayOpenSearchServiceinbrandBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 8719378562187467636L;

	/**
	 * 查询品牌绑定的官方账号入参
	 */
	@ApiField("biz_data")
	private SearchQueryBoxExclusiveServiceInfoRequest bizData;

	/**
	 * 表示修改内容的业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 进行具体的业务操作类型，如：create、query、cancel
	 */
	@ApiField("opt_type")
	private String optType;

	public SearchQueryBoxExclusiveServiceInfoRequest getBizData() {
		return this.bizData;
	}
	public void setBizData(SearchQueryBoxExclusiveServiceInfoRequest bizData) {
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
