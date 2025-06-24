package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 领取限制规则
 *
 * @author auto create
 * @since 1.0, 2022-11-14 15:53:25
 */
public class CollectLimitRuleDTO extends AlipayObject {

	private static final long serialVersionUID = 1737939564326886466L;

	/**
	 * 1  就是一次
	 */
	@ApiField("count")
	private Long count;

	/**
	 * DAY ： 天;WEEK ：周;MONTH ： 月;YEAR ： 年;LIFE_TIME ： 终生
	 */
	@ApiField("limit_time_type")
	private String limitTimeType;

	public Long getCount() {
		return this.count;
	}
	public void setCount(Long count) {
		this.count = count;
	}

	public String getLimitTimeType() {
		return this.limitTimeType;
	}
	public void setLimitTimeType(String limitTimeType) {
		this.limitTimeType = limitTimeType;
	}

}
