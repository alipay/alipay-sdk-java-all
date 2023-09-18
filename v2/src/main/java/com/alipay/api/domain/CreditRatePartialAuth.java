package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用等级部分授权场景
 *
 * @author auto create
 * @since 1.0, 2023-03-17 12:49:34
 */
public class CreditRatePartialAuth extends AlipayObject {

	private static final long serialVersionUID = 1325947859691177178L;

	/**
	 * 信用等级范围最大值，范围是1-12，是闭区间
	 */
	@ApiField("cr_max_rank")
	private Long crMaxRank;

	/**
	 * 信用等级范围最小值，范围是1-12，是闭区间
	 */
	@ApiField("cr_min_rank")
	private Long crMinRank;

	public Long getCrMaxRank() {
		return this.crMaxRank;
	}
	public void setCrMaxRank(Long crMaxRank) {
		this.crMaxRank = crMaxRank;
	}

	public Long getCrMinRank() {
		return this.crMinRank;
	}
	public void setCrMinRank(Long crMinRank) {
		this.crMinRank = crMinRank;
	}

}
