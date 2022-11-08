package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * Nimitz 专用范围模型
 *
 * @author auto create
 * @since 1.0, 2022-06-10 15:34:16
 */
public class NimitzRange extends AlipayObject {

	private static final long serialVersionUID = 1883853611295581769L;

	/**
	 * 范围的最大值
	 */
	@ApiField("max")
	private String max;

	/**
	 * true: < max
false: <= max
	 */
	@ApiField("max_exclude")
	private Boolean maxExclude;

	/**
	 * 范围的最小值
	 */
	@ApiField("min")
	private String min;

	/**
	 * true: > min
false: >= min
	 */
	@ApiField("min_exclude")
	private Boolean minExclude;

	public String getMax() {
		return this.max;
	}
	public void setMax(String max) {
		this.max = max;
	}

	public Boolean getMaxExclude() {
		return this.maxExclude;
	}
	public void setMaxExclude(Boolean maxExclude) {
		this.maxExclude = maxExclude;
	}

	public String getMin() {
		return this.min;
	}
	public void setMin(String min) {
		this.min = min;
	}

	public Boolean getMinExclude() {
		return this.minExclude;
	}
	public void setMinExclude(Boolean minExclude) {
		this.minExclude = minExclude;
	}

}
