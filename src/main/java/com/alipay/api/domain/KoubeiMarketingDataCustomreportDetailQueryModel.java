package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 自定义数据报表规则详情查询接口
 *
 * @author auto create
 * @since 1.0, 2020-08-31 10:35:21
 */
public class KoubeiMarketingDataCustomreportDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1715755947689225686L;

	/**
	 * 自定义报表的规则KEY
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
