package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 健身记录
 *
 * @author auto create
 * @since 1.0, 2019-01-03 10:32:54
 */
public class ExerciseRecordOpenModel extends AlipayObject {

	private static final long serialVersionUID = 2712726434432667471L;

	/**
	 * 运动计划类型。枚举：运动项目(ITEM),或课程(COURSE)
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 课程列表。当biz_type=COURSE时必填
	 */
	@ApiField("course_list")
	private ExerciseCourseOpenModel courseList;

	/**
	 * 单日进度汇总列表
	 */
	@ApiListField("daily_summary")
	@ApiField("exercise_daily_summary_open_model")
	private List<ExerciseDailySummaryOpenModel> dailySummary;

	/**
	 * 一级健身项目列表。当biz_type=ITEM时必填
	 */
	@ApiListField("item_list")
	@ApiField("exercise_item_open_model")
	private List<ExerciseItemOpenModel> itemList;

	/**
	 * 运动建议列表
	 */
	@ApiListField("proposal_list")
	@ApiField("string")
	private List<String> proposalList;

	/**
	 * 时间维度类型。健身日志只支持终生类型。枚举：LIFE("终生")
	 */
	@ApiField("time_dimension_type")
	private String timeDimensionType;

	/**
	 * 维度所所对应的值。LIFE时为yyyy-MM-dd格式的日期。日志同步接口只支持传一个时间维度值
	 */
	@ApiField("values")
	private String values;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public ExerciseCourseOpenModel getCourseList() {
		return this.courseList;
	}
	public void setCourseList(ExerciseCourseOpenModel courseList) {
		this.courseList = courseList;
	}

	public List<ExerciseDailySummaryOpenModel> getDailySummary() {
		return this.dailySummary;
	}
	public void setDailySummary(List<ExerciseDailySummaryOpenModel> dailySummary) {
		this.dailySummary = dailySummary;
	}

	public List<ExerciseItemOpenModel> getItemList() {
		return this.itemList;
	}
	public void setItemList(List<ExerciseItemOpenModel> itemList) {
		this.itemList = itemList;
	}

	public List<String> getProposalList() {
		return this.proposalList;
	}
	public void setProposalList(List<String> proposalList) {
		this.proposalList = proposalList;
	}

	public String getTimeDimensionType() {
		return this.timeDimensionType;
	}
	public void setTimeDimensionType(String timeDimensionType) {
		this.timeDimensionType = timeDimensionType;
	}

	public String getValues() {
		return this.values;
	}
	public void setValues(String values) {
		this.values = values;
	}

}
