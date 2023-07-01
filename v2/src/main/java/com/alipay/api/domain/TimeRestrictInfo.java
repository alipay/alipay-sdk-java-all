package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 券核销时间限制
 *
 * @author auto create
 * @since 1.0, 2023-06-28 17:40:23
 */
public class TimeRestrictInfo extends AlipayObject {

	private static final long serialVersionUID = 8749958958687986755L;

	/**
	 * 不可用时间段
	 */
	@ApiListField("disable_period_info")
	@ApiField("voucher_use_time_rule_info")
	private List<VoucherUseTimeRuleInfo> disablePeriodInfo;

	/**
	 * 可用时间段
	 */
	@ApiListField("usable_period_info")
	@ApiField("voucher_use_time_rule_info")
	private List<VoucherUseTimeRuleInfo> usablePeriodInfo;

	public List<VoucherUseTimeRuleInfo> getDisablePeriodInfo() {
		return this.disablePeriodInfo;
	}
	public void setDisablePeriodInfo(List<VoucherUseTimeRuleInfo> disablePeriodInfo) {
		this.disablePeriodInfo = disablePeriodInfo;
	}

	public List<VoucherUseTimeRuleInfo> getUsablePeriodInfo() {
		return this.usablePeriodInfo;
	}
	public void setUsablePeriodInfo(List<VoucherUseTimeRuleInfo> usablePeriodInfo) {
		this.usablePeriodInfo = usablePeriodInfo;
	}

}
