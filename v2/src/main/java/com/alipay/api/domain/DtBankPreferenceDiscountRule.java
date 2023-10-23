package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 折扣立减规则
 *
 * @author auto create
 * @since 1.0, 2023-06-07 09:56:15
 */
public class DtBankPreferenceDiscountRule extends AlipayObject {

	private static final long serialVersionUID = 4273248151591342478L;

	/**
	 * 折扣立减最大优惠金额，单位分
	 */
	@ApiField("max_amount")
	private Long maxAmount;

	/**
	 * 折扣，例如85表示85折优惠，50表示5折优惠，5表示0.5折优惠，取值范围(0,100)。
	 */
	@ApiField("ratio")
	private Long ratio;

	public Long getMaxAmount() {
		return this.maxAmount;
	}
	public void setMaxAmount(Long maxAmount) {
		this.maxAmount = maxAmount;
	}

	public Long getRatio() {
		return this.ratio;
	}
	public void setRatio(Long ratio) {
		this.ratio = ratio;
	}

}
