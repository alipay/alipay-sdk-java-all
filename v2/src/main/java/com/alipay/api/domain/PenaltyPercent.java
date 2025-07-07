package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 百分比罚金
 *
 * @author auto create
 * @since 1.0, 2024-12-18 11:21:16
 */
public class PenaltyPercent extends AlipayObject {

	private static final long serialVersionUID = 8412893797428739374L;

	/**
	 * 罚金晚数
	 */
	@ApiField("nights")
	private Long nights;

	/**
	 * 罚金百分比
	 */
	@ApiField("percent")
	private String percent;

	public Long getNights() {
		return this.nights;
	}
	public void setNights(Long nights) {
		this.nights = nights;
	}

	public String getPercent() {
		return this.percent;
	}
	public void setPercent(String percent) {
		this.percent = percent;
	}

}
