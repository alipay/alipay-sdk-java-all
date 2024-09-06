package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 洞察分布数据
 *
 * @author auto create
 * @since 1.0, 2024-06-03 11:00:04
 */
public class InsightDistItem extends AlipayObject {

	private static final long serialVersionUID = 7215162581123535673L;

	/**
	 * 分布区间的名字，比如男女，年龄段等
	 */
	@ApiField("name")
	private String name;

	/**
	 * 分布区间的值，代表百分比
	 */
	@ApiField("value")
	private String value;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
