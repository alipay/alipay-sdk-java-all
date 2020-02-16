package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 自建盒子中菜品做法的模型
 *
 * @author auto create
 * @since 1.0, 2018-12-20 11:37:52
 */
public class PosDishPracticeModel extends AlipayObject {

	private static final long serialVersionUID = 3518862845817498357L;

	/**
	 * 加价类型 add 加法
如果有做法，必传
	 */
	@ApiField("increase_mode")
	private String increaseMode;

	/**
	 * 加价价格，如果有做法必传
	 */
	@ApiField("increase_price")
	private String increasePrice;

	/**
	 * 做法的ID，如果有做法，必传
	 */
	@ApiField("practice_id")
	private String practiceId;

	/**
	 * 做法的名字
	 */
	@ApiField("practice_name")
	private String practiceName;

	/**
	 * 做法的排序字段
	 */
	@ApiField("sort")
	private Long sort;

	public String getIncreaseMode() {
		return this.increaseMode;
	}
	public void setIncreaseMode(String increaseMode) {
		this.increaseMode = increaseMode;
	}

	public String getIncreasePrice() {
		return this.increasePrice;
	}
	public void setIncreasePrice(String increasePrice) {
		this.increasePrice = increasePrice;
	}

	public String getPracticeId() {
		return this.practiceId;
	}
	public void setPracticeId(String practiceId) {
		this.practiceId = practiceId;
	}

	public String getPracticeName() {
		return this.practiceName;
	}
	public void setPracticeName(String practiceName) {
		this.practiceName = practiceName;
	}

	public Long getSort() {
		return this.sort;
	}
	public void setSort(Long sort) {
		this.sort = sort;
	}

}
