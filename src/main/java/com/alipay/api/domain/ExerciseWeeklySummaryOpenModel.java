package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 一周小结
 *
 * @author auto create
 * @since 1.0, 2019-01-03 14:29:06
 */
public class ExerciseWeeklySummaryOpenModel extends AlipayObject {

	private static final long serialVersionUID = 3815863565146882682L;

	/**
	 * 一周的截止日期（周日日期）
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 一周小结建议列表
	 */
	@ApiListField("proposal_list")
	@ApiField("string")
	private List<String> proposalList;

	/**
	 * 一周的起始日期（周一日期）
	 */
	@ApiField("start_date")
	private String startDate;

	/**
	 * 一周统计数据
	 */
	@ApiListField("statistic_list")
	@ApiField("exercise_weekly_statistic_open_model")
	private List<ExerciseWeeklyStatisticOpenModel> statisticList;

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public List<String> getProposalList() {
		return this.proposalList;
	}
	public void setProposalList(List<String> proposalList) {
		this.proposalList = proposalList;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public List<ExerciseWeeklyStatisticOpenModel> getStatisticList() {
		return this.statisticList;
	}
	public void setStatisticList(List<ExerciseWeeklyStatisticOpenModel> statisticList) {
		this.statisticList = statisticList;
	}

}
