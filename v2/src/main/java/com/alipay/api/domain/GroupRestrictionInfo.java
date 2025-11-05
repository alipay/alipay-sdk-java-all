package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品分组选择限制
 *
 * @author auto create
 * @since 1.0, 2025-01-06 19:03:47
 */
public class GroupRestrictionInfo extends AlipayObject {

	private static final long serialVersionUID = 7181445214471393461L;

	/**
	 * 商品该做法最大选择份数
	 */
	@ApiField("max")
	private Long max;

	/**
	 * 商品该做法最少选择份数
	 */
	@ApiField("min")
	private Long min;

	public Long getMax() {
		return this.max;
	}
	public void setMax(Long max) {
		this.max = max;
	}

	public Long getMin() {
		return this.min;
	}
	public void setMin(Long min) {
		this.min = min;
	}

}
