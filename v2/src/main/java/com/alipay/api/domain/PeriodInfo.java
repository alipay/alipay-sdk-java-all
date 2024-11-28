package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 周期模型
 *
 * @author auto create
 * @since 1.0, 2018-08-22 11:32:33
 */
public class PeriodInfo extends AlipayObject {

	private static final long serialVersionUID = 7765367161184328966L;

	/**
	 * 单位
	 */
	@ApiField("dimension")
	private String dimension;

	/**
	 * 周期值
	 */
	@ApiField("value")
	private Long value;

	public String getDimension() {
		return this.dimension;
	}
	public void setDimension(String dimension) {
		this.dimension = dimension;
	}

	public Long getValue() {
		return this.value;
	}
	public void setValue(Long value) {
		this.value = value;
	}

}
