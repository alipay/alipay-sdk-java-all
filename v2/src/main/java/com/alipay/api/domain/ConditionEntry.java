package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 多维查询条件
 *
 * @author auto create
 * @since 1.0, 2023-09-07 15:21:05
 */
public class ConditionEntry extends AlipayObject {

	private static final long serialVersionUID = 8229592458231799197L;

	/**
	 * 纬度的具体key值如workNo ,level
	 */
	@ApiField("dim_key")
	private String dimKey;

	/**
	 * 如维度值是workNo 工号，对应的维度具体信息为具体工号
	 */
	@ApiField("value")
	private String value;

	public String getDimKey() {
		return this.dimKey;
	}
	public void setDimKey(String dimKey) {
		this.dimKey = dimKey;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
