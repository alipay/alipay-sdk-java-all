package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 单个聚合结果
 *
 * @author auto create
 * @since 1.0, 2021-12-22 17:28:08
 */
public class NewsAggregationValue extends AlipayObject {

	private static final long serialVersionUID = 4828672393341762635L;

	/**
	 * 聚合结果数量
	 */
	@ApiField("doc_count")
	private String docCount;

	/**
	 * 聚合结果名称
	 */
	@ApiField("key")
	private String key;

	public String getDocCount() {
		return this.docCount;
	}
	public void setDocCount(String docCount) {
		this.docCount = docCount;
	}

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

}
