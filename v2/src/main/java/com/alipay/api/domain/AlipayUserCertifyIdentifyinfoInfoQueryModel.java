package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 身份信息查询接口
 *
 * @author auto create
 * @since 1.0, 2024-08-01 11:23:30
 */
public class AlipayUserCertifyIdentifyinfoInfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5539879295565918688L;

	/**
	 * 查询类型
	 */
	@ApiField("query_type")
	private String queryType;

	/**
	 * 查询的值
	 */
	@ApiField("query_value")
	private String queryValue;

	public String getQueryType() {
		return this.queryType;
	}
	public void setQueryType(String queryType) {
		this.queryType = queryType;
	}

	public String getQueryValue() {
		return this.queryValue;
	}
	public void setQueryValue(String queryValue) {
		this.queryValue = queryValue;
	}

}
