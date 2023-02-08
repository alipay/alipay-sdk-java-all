package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 灰度用户分组信息
 *
 * @author auto create
 * @since 1.0, 2023-01-04 16:46:42
 */
public class MiniAppCustomGrayGroupDto extends AlipayObject {

	private static final long serialVersionUID = 3273413843354154337L;

	/**
	 * 名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 灰度code
	 */
	@ApiField("rule_code")
	private String ruleCode;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getRuleCode() {
		return this.ruleCode;
	}
	public void setRuleCode(String ruleCode) {
		this.ruleCode = ruleCode;
	}

}
