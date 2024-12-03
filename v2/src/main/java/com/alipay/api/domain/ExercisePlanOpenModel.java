package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 运动计划开放模型
 *
 * @author auto create
 * @since 1.0, 2019-01-03 10:33:00
 */
public class ExercisePlanOpenModel extends AlipayObject {

	private static final long serialVersionUID = 2286336218215439982L;

	/**
	 * 运动计划类型。枚举：运动项目(ITEM),或课程(COURSE)
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 课程列表。当biz_type=COURSE时必填
	 */
	@ApiListField("course_list")
	@ApiField("exercise_course_open_model")
	private List<ExerciseCourseOpenModel> courseList;

	/**
	 * 一级健身项目列表。当biz_type=ITEM时必填
	 */
	@ApiListField("item_list")
	@ApiField("exercise_item_open_model")
	private List<ExerciseItemOpenModel> itemList;

	/**
	 * 时间维度类型。枚举：DAY("日"),WEEK("周"),MONTH("月"),LIFE("终生")
	 */
	@ApiField("time_dimension_type")
	private String timeDimensionType;

	/**
	 * 维度所所对应的值。用英文逗号,分割。DAY时留空，WEEK时取值范围1-7，MONTH时取值范围1-31，LIFE时为yyyy-MM-dd格式的日期
	 */
	@ApiField("values")
	private String values;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public List<ExerciseCourseOpenModel> getCourseList() {
		return this.courseList;
	}
	public void setCourseList(List<ExerciseCourseOpenModel> courseList) {
		this.courseList = courseList;
	}

	public List<ExerciseItemOpenModel> getItemList() {
		return this.itemList;
	}
	public void setItemList(List<ExerciseItemOpenModel> itemList) {
		this.itemList = itemList;
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
