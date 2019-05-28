package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 自定义数据报表删除接口
 *
 * @author auto create
 * @since 1.0, 2018-07-26 14:04:26
 */
public class KoubeiMarketingDataCustomreportDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 3548228984381967294L;

	/**
	 * 自定义报表规则的KEY
	 */
	@ApiField("condition_key")
	private String conditionKey;

	public String getConditionKey() {
		return this.conditionKey;
	}
	public void setConditionKey(String conditionKey) {
		this.conditionKey = conditionKey;
	}

}
