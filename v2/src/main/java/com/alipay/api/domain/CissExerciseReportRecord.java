package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 体科所-自测数据-项目记录
 *
 * @author auto create
 * @since 1.0, 2023-12-15 15:29:28
 */
public class CissExerciseReportRecord extends AlipayObject {

	private static final long serialVersionUID = 6364451317713121465L;

	/**
	 * 测试项评估
	 */
	@ApiField("evaluate")
	private String evaluate;

	/**
	 * 测试项级别
	 */
	@ApiField("grade")
	private String grade;

	/**
	 * id
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 项目code，100表示总分
	 */
	@ApiField("item_code")
	private Long itemCode;

	/**
	 * 项目名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 测试项得分
	 */
	@ApiField("score")
	private String score;

	/**
	 * 测试项结果
	 */
	@ApiField("test_value")
	private String testValue;

	/**
	 * 测试值单位
	 */
	@ApiField("unit")
	private String unit;

	public String getEvaluate() {
		return this.evaluate;
	}
	public void setEvaluate(String evaluate) {
		this.evaluate = evaluate;
	}

	public String getGrade() {
		return this.grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public Long getItemCode() {
		return this.itemCode;
	}
	public void setItemCode(Long itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getScore() {
		return this.score;
	}
	public void setScore(String score) {
		this.score = score;
	}

	public String getTestValue() {
		return this.testValue;
	}
	public void setTestValue(String testValue) {
		this.testValue = testValue;
	}

	public String getUnit() {
		return this.unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}

}
