package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人群分组规则的删除
 *
 * @author auto create
 * @since 1.0, 2016-04-13 16:19:19
 */
public class AlipayDataDataserviceConditionRemoveModel extends AlipayObject {

	private static final long serialVersionUID = 5392925719683116731L;

	/**
	 * 删除圈人规则组
	 */
	@ApiField("condition_id")
	private Long conditionId;

	public Long getConditionId() {
		return this.conditionId;
	}
	public void setConditionId(Long conditionId) {
		this.conditionId = conditionId;
	}

}
