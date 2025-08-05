package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 随机金额立减区间信息
 *
 * @author auto create
 * @since 1.0, 2023-06-07 09:56:15
 */
public class DtBankRandomRangeInfo extends AlipayObject {

	private static final long serialVersionUID = 3381657229845286171L;

	/**
	 * 随机区间上限，单位分
	 */
	@ApiField("max_amount")
	private Long maxAmount;

	/**
	 * 随机区间下限，单位分
	 */
	@ApiField("min_amount")
	private Long minAmount;

	/**
	 * 随机区间占比，例如20表示此区间占比20%，取值范围(0, 100]
	 */
	@ApiField("percentage")
	private Long percentage;

	public Long getMaxAmount() {
		return this.maxAmount;
	}
	public void setMaxAmount(Long maxAmount) {
		this.maxAmount = maxAmount;
	}

	public Long getMinAmount() {
		return this.minAmount;
	}
	public void setMinAmount(Long minAmount) {
		this.minAmount = minAmount;
	}

	public Long getPercentage() {
		return this.percentage;
	}
	public void setPercentage(Long percentage) {
		this.percentage = percentage;
	}

}
