package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 品类区间范围信息
 *
 * @author auto create
 * @since 1.0, 2024-04-12 17:38:57
 */
public class CategoryRangeInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 8662322415761326416L;

	/**
	 * 最大值，对应0-100分
	 */
	@ApiField("high")
	private Long high;

	/**
	 * 最小值，对应0-100分
	 */
	@ApiField("low")
	private Long low;

	public Long getHigh() {
		return this.high;
	}
	public void setHigh(Long high) {
		this.high = high;
	}

	public Long getLow() {
		return this.low;
	}
	public void setLow(Long low) {
		this.low = low;
	}

}
