package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 使用时段
 *
 * @author auto create
 * @since 1.0, 2024-08-01 16:50:52
 */
public class UseDuration extends AlipayObject {

	private static final long serialVersionUID = 2281943662411633243L;

	/**
	 * 金额卡的不可用时间范围
	 */
	@ApiListField("can_no_use_date_list")
	@ApiField("can_no_use_limit_day_info")
	private List<CanNoUseLimitDayInfo> canNoUseDateList;

	/**
	 * 金额卡的可用时间范围
	 */
	@ApiListField("can_use_date_list")
	@ApiField("limit_day_info")
	private List<LimitDayInfo> canUseDateList;

	/**
	 * 使用时段类型（任意时间可用、指定时段可用）
	 */
	@ApiField("use_time_type")
	private String useTimeType;

	public List<CanNoUseLimitDayInfo> getCanNoUseDateList() {
		return this.canNoUseDateList;
	}
	public void setCanNoUseDateList(List<CanNoUseLimitDayInfo> canNoUseDateList) {
		this.canNoUseDateList = canNoUseDateList;
	}

	public List<LimitDayInfo> getCanUseDateList() {
		return this.canUseDateList;
	}
	public void setCanUseDateList(List<LimitDayInfo> canUseDateList) {
		this.canUseDateList = canUseDateList;
	}

	public String getUseTimeType() {
		return this.useTimeType;
	}
	public void setUseTimeType(String useTimeType) {
		this.useTimeType = useTimeType;
	}

}
