package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人群分组规则的创建
 *
 * @author auto create
 * @since 1.0, 2016-10-26 18:05:19
 */
public class AlipayDataDataserviceCrowdConditionStoreModel extends AlipayObject {

	private static final long serialVersionUID = 8826672725291775871L;

	/**
	 * 规则组的操作符
	 */
	@ApiField("condition")
	private String condition;

	/**
	 * 如果Condition_id 不为空则为update操作
	 */
	@ApiField("condition_id")
	private Long conditionId;

	public String getCondition() {
		return this.condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}

	public Long getConditionId() {
		return this.conditionId;
	}
	public void setConditionId(Long conditionId) {
		this.conditionId = conditionId;
	}

}
