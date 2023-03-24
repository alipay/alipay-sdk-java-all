package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车险权益频次规则详情，为空表示没有频次规则限制
 *
 * @author auto create
 * @since 1.0, 2020-01-08 19:54:36
 */
public class FrequencyRuleDetail extends AlipayObject {

	private static final long serialVersionUID = 2446327191219758399L;

	/**
	 * 频次单位数量，2月1次，则frequencyDuration为2，totalTimes为1，frequencyType为MONTH
	 */
	@ApiField("frequency_duration")
	private String frequencyDuration;

	/**
	 * 频次类型：DAY-自然日频次，MONTH-自然月频次，INFINITE-永久频次
	 */
	@ApiField("frequency_type")
	private String frequencyType;

	/**
	 * 总次数
	 */
	@ApiField("total_times")
	private Long totalTimes;

	/**
	 * 已使用次数
	 */
	@ApiField("used_times")
	private Long usedTimes;

	public String getFrequencyDuration() {
		return this.frequencyDuration;
	}
	public void setFrequencyDuration(String frequencyDuration) {
		this.frequencyDuration = frequencyDuration;
	}

	public String getFrequencyType() {
		return this.frequencyType;
	}
	public void setFrequencyType(String frequencyType) {
		this.frequencyType = frequencyType;
	}

	public Long getTotalTimes() {
		return this.totalTimes;
	}
	public void setTotalTimes(Long totalTimes) {
		this.totalTimes = totalTimes;
	}

	public Long getUsedTimes() {
		return this.usedTimes;
	}
	public void setUsedTimes(Long usedTimes) {
		this.usedTimes = usedTimes;
	}

}
