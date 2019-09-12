package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业务下拉列表API
 *
 * @author auto create
 * @since 1.0, 2018-04-26 13:56:16
 */
public class AlipayEbppProdmodeDropdataQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7497389538956551229L;

	/**
	 * 参数为：缴费业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 参数包含：业务类型、子业务类型、产品模式等
	 */
	@ApiField("search_type")
	private String searchType;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getSearchType() {
		return this.searchType;
	}
	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}

}
