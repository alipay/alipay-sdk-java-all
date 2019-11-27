package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人群分组规则人群数量统计
 *
 * @author auto create
 * @since 1.0, 2016-04-13 15:52:12
 */
public class AlipayDataDataserviceCrowdCountModel extends AlipayObject {

	private static final long serialVersionUID = 8794624827516726297L;

	/**
	 * 按Condition统计人数
	 */
	@ApiField("condition")
	private String condition;

	/**
	 * 传入condition_id则按照condition_id对应的rule来查询
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
