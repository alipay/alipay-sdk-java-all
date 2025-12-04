package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 病情描述
 *
 * @author auto create
 * @since 1.0, 2025-11-03 15:32:13
 */
public class HDFConditiondesc extends AlipayObject {

	private static final long serialVersionUID = 8323663467884162987L;

	/**
	 * 病情描述
	 */
	@ApiField("condition_desc")
	private String conditionDesc;

	public String getConditionDesc() {
		return this.conditionDesc;
	}
	public void setConditionDesc(String conditionDesc) {
		this.conditionDesc = conditionDesc;
	}

}
