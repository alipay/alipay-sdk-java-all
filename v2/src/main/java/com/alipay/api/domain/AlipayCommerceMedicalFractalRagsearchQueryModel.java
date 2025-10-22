package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 健康管家RAG检索接口
 *
 * @author auto create
 * @since 1.0, 2025-07-10 17:01:24
 */
public class AlipayCommerceMedicalFractalRagsearchQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6851231344276777892L;

	/**
	 * 通行证code
	 */
	@ApiField("access_key")
	private String accessKey;

	/**
	 * 额外参数
	 */
	@ApiField("extra_params")
	private String extraParams;

	/**
	 * 最大结果数
	 */
	@ApiField("max_results")
	private String maxResults;

	/**
	 * 查询字符串
	 */
	@ApiField("query")
	private String query;

	public String getAccessKey() {
		return this.accessKey;
	}
	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public String getExtraParams() {
		return this.extraParams;
	}
	public void setExtraParams(String extraParams) {
		this.extraParams = extraParams;
	}

	public String getMaxResults() {
		return this.maxResults;
	}
	public void setMaxResults(String maxResults) {
		this.maxResults = maxResults;
	}

	public String getQuery() {
		return this.query;
	}
	public void setQuery(String query) {
		this.query = query;
	}

}
