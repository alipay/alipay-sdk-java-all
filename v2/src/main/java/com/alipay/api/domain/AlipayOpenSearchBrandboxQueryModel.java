package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 品牌box查询
 *
 * @author auto create
 * @since 1.0, 2021-08-19 19:56:45
 */
public class AlipayOpenSearchBrandboxQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2718334522367852353L;

	/**
	 * 品牌box详情查询入参
	 */
	@ApiField("biz_data")
	private SearchBrandBoxRequest bizData;

	/**
	 * 表示修改内容的业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 进行具体的操作类型，如creat、mod、query
	 */
	@ApiField("opt_type")
	private String optType;

	public SearchBrandBoxRequest getBizData() {
		return this.bizData;
	}
	public void setBizData(SearchBrandBoxRequest bizData) {
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
