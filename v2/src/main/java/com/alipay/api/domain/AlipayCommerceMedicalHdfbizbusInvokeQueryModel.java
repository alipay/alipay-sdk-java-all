package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 好大夫域外请求服务类型
 *
 * @author auto create
 * @since 1.0, 2026-10-12 16:32:56
 */
public class AlipayCommerceMedicalHdfbizbusInvokeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1272127811435547318L;

	/**
	 * 入参
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
