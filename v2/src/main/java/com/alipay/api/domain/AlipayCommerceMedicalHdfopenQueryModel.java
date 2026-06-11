package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 好大夫合作方查询
 *
 * @author auto create
 * @since 1.0, 2026-06-04 10:57:51
 */
public class AlipayCommerceMedicalHdfopenQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6123796129623271235L;

	/**
	 * 请求参数
	 */
	@ApiField("query")
	private String query;

	public String getQuery() {
		return this.query;
	}
	public void setQuery(String query) {
		this.query = query;
	}

}
