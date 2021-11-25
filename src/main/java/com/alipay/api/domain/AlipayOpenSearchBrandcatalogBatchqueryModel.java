package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询品牌下可以使用的类目
 *
 * @author auto create
 * @since 1.0, 2021-08-19 19:57:10
 */
public class AlipayOpenSearchBrandcatalogBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 8871937297561498888L;

	/**
	 * 品牌id
	 */
	@ApiField("biz_data")
	private SearchBrandboxQueryCatalogRequest bizData;

	/**
	 * 表示修改内容的业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 操作的具体类型
	 */
	@ApiField("opt_type")
	private String optType;

	public SearchBrandboxQueryCatalogRequest getBizData() {
		return this.bizData;
	}
	public void setBizData(SearchBrandboxQueryCatalogRequest bizData) {
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
