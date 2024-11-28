package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 使用规则
 *
 * @author auto create
 * @since 1.0, 2024-09-05 16:47:21
 */
public class RuleDefine extends AlipayObject {

	private static final long serialVersionUID = 5524362265213395475L;

	/**
	 * bizTid范围
	 */
	@ApiListField("biz_tids")
	@ApiField("string")
	private List<String> bizTids;

	public List<String> getBizTids() {
		return this.bizTids;
	}
	public void setBizTids(List<String> bizTids) {
		this.bizTids = bizTids;
	}

}
