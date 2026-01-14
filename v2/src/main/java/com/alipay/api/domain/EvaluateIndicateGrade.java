package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 评估指标评分模型
 *
 * @author auto create
 * @since 1.0, 2024-03-07 18:07:55
 */
public class EvaluateIndicateGrade extends AlipayObject {

	private static final long serialVersionUID = 2276966865777527811L;

	/**
	 * 得分单位
详见枚举列表
	 */
	@ApiField("grade_unit")
	private String gradeUnit;

	/**
	 * 得分值内容
	 */
	@ApiField("grade_value")
	private String gradeValue;

	/**
	 * 满分值
	 */
	@ApiField("perfect_value")
	private String perfectValue;

	public String getGradeUnit() {
		return this.gradeUnit;
	}
	public void setGradeUnit(String gradeUnit) {
		this.gradeUnit = gradeUnit;
	}

	public String getGradeValue() {
		return this.gradeValue;
	}
	public void setGradeValue(String gradeValue) {
		this.gradeValue = gradeValue;
	}

	public String getPerfectValue() {
		return this.perfectValue;
	}
	public void setPerfectValue(String perfectValue) {
		this.perfectValue = perfectValue;
	}

}
