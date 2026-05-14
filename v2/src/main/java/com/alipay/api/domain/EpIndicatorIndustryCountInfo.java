package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业指标行业汇总信息
 *
 * @author auto create
 * @since 1.0, 2026-02-04 17:44:37
 */
public class EpIndicatorIndustryCountInfo extends AlipayObject {

	private static final long serialVersionUID = 6489413739421527777L;

	/**
	 * 数量
	 */
	@ApiField("count")
	private Long count;

	/**
	 * 指标key
	 */
	@ApiField("key")
	private String key;

	public Long getCount() {
		return this.count;
	}
	public void setCount(Long count) {
		this.count = count;
	}

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

}
