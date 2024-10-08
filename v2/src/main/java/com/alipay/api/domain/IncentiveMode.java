package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 激励模型
 *
 * @author auto create
 * @since 1.0, 2024-09-13 15:20:19
 */
public class IncentiveMode extends AlipayObject {

	private static final long serialVersionUID = 3268662357362822211L;

	/**
	 * 完成次数
	 */
	@ApiField("finish_num")
	private Long finishNum;

	/**
	 * 每周获取金币数
	 */
	@ApiField("per_incentive_point")
	private Long perIncentivePoint;

	/**
	 * 每周打卡次数
	 */
	@ApiField("per_week_check_times")
	private Long perWeekCheckTimes;

	/**
	 * 总次数
	 */
	@ApiField("total_num")
	private Long totalNum;

	public Long getFinishNum() {
		return this.finishNum;
	}
	public void setFinishNum(Long finishNum) {
		this.finishNum = finishNum;
	}

	public Long getPerIncentivePoint() {
		return this.perIncentivePoint;
	}
	public void setPerIncentivePoint(Long perIncentivePoint) {
		this.perIncentivePoint = perIncentivePoint;
	}

	public Long getPerWeekCheckTimes() {
		return this.perWeekCheckTimes;
	}
	public void setPerWeekCheckTimes(Long perWeekCheckTimes) {
		this.perWeekCheckTimes = perWeekCheckTimes;
	}

	public Long getTotalNum() {
		return this.totalNum;
	}
	public void setTotalNum(Long totalNum) {
		this.totalNum = totalNum;
	}

}
