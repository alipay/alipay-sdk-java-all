package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 多阶梯立减规则
 *
 * @author auto create
 * @since 1.0, 2023-06-26 09:58:16
 */
public class DtBankPreferenceMultiStagedRule extends AlipayObject {

	private static final long serialVersionUID = 7668849735428956885L;

	/**
	 * 所有区间内最大立减优惠金额值，单位:分
如果是减至场景，则最大立减优惠金额=门槛阈值最大值-减至金额值
	 */
	@ApiField("max_reduce_amount")
	private Long maxReduceAmount;

	/**
	 * 阶梯立减优惠类型下，多区间优惠配置列表
	 */
	@ApiField("staged_discount_list")
	private DtBankStagedThresholdInfo stagedDiscountList;

	public Long getMaxReduceAmount() {
		return this.maxReduceAmount;
	}
	public void setMaxReduceAmount(Long maxReduceAmount) {
		this.maxReduceAmount = maxReduceAmount;
	}

	public DtBankStagedThresholdInfo getStagedDiscountList() {
		return this.stagedDiscountList;
	}
	public void setStagedDiscountList(DtBankStagedThresholdInfo stagedDiscountList) {
		this.stagedDiscountList = stagedDiscountList;
	}

}
