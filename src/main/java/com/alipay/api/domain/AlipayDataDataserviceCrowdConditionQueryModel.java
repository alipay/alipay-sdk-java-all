package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人群分组规则根据ID查询
 *
 * @author auto create
 * @since 1.0, 2016-04-13 14:28:05
 */
public class AlipayDataDataserviceCrowdConditionQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1174753163658911447L;

	/**
	 * 通过规则组ID返回规则组信息
	 */
	@ApiField("condition_id")
	private String conditionId;

	public String getConditionId() {
		return this.conditionId;
	}
	public void setConditionId(String conditionId) {
		this.conditionId = conditionId;
	}

}
