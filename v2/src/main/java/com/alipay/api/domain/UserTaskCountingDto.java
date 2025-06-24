package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户任务计数信息
 *
 * @author auto create
 * @since 1.0, 2023-07-11 19:39:35
 */
public class UserTaskCountingDto extends AlipayObject {

	private static final long serialVersionUID = 1311619133966582646L;

	/**
	 * 周期之内的最大累计计数
	 */
	@ApiField("cycle_acc_count")
	private Long cycleAccCount;

	/**
	 * 周期之间的连续计数
	 */
	@ApiField("total_consecutive_count")
	private Long totalConsecutiveCount;

	public Long getCycleAccCount() {
		return this.cycleAccCount;
	}
	public void setCycleAccCount(Long cycleAccCount) {
		this.cycleAccCount = cycleAccCount;
	}

	public Long getTotalConsecutiveCount() {
		return this.totalConsecutiveCount;
	}
	public void setTotalConsecutiveCount(Long totalConsecutiveCount) {
		this.totalConsecutiveCount = totalConsecutiveCount;
	}

}
