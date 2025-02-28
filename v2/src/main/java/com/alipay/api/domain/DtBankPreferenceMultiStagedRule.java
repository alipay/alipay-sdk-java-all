package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 多阶梯立减规则
 *
 * @author auto create
 * @since 1.0, 2024-11-22 14:11:56
 */
public class DtBankPreferenceMultiStagedRule extends AlipayObject {

	private static final long serialVersionUID = 5457939233881791492L;

	/**
	 * 所有区间内最大立减优惠金额值，单位:分
如果是减至场景，则最大立减优惠金额=门槛阈值最大值-减至金额值
	 */
	@ApiField("max_reduce_amount")
	private Long maxReduceAmount;

	/**
	 * 阶梯立减优惠类型下，多区间优惠配置列表
	 */
	@ApiListField("staged_discount_list")
	@ApiField("dt_bank_staged_threshold_info")
	private List<DtBankStagedThresholdInfo> stagedDiscountList;

	public Long getMaxReduceAmount() {
		return this.maxReduceAmount;
	}
	public void setMaxReduceAmount(Long maxReduceAmount) {
		this.maxReduceAmount = maxReduceAmount;
	}

	public List<DtBankStagedThresholdInfo> getStagedDiscountList() {
		return this.stagedDiscountList;
	}
	public void setStagedDiscountList(List<DtBankStagedThresholdInfo> stagedDiscountList) {
		this.stagedDiscountList = stagedDiscountList;
	}

}
