package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 品类区间范围信息
 *
 * @author auto create
 * @since 1.0, 2023-07-06 08:07:16
 */
public class CategoryRangeInfo extends AlipayObject {

	private static final long serialVersionUID = 1269156953183296837L;

	/**
	 * 最大值，对应0-100分
	 */
	@ApiField("hign")
	private Long hign;

	/**
	 * 最小值，对应0-100分
	 */
	@ApiField("low")
	private Long low;

	public Long getHign() {
		return this.hign;
	}
	public void setHign(Long hign) {
		this.hign = hign;
	}

	public Long getLow() {
		return this.low;
	}
	public void setLow(Long low) {
		this.low = low;
	}

}
