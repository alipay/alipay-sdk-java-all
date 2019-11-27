package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 肌群锻炼情况
 *
 * @author auto create
 * @since 1.0, 2019-01-03 14:01:42
 */
public class ExerciseCategoryOpenModel extends AlipayObject {

	private static final long serialVersionUID = 5413935297713858618L;

	/**
	 * 肌群部位：cardio(有氧),SHOULDERS("肩部"), back(背部),chests(胸部),ARMS("臂部"),ABDOMEN("腹部"),GLUTES("臀部"),LEGS("腿部")
	 */
	@ApiField("category")
	private String category;

	/**
	 * 锻炼情况
	 */
	@ApiField("score")
	private String score;

	public String getCategory() {
		return this.category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public String getScore() {
		return this.score;
	}
	public void setScore(String score) {
		this.score = score;
	}

}
