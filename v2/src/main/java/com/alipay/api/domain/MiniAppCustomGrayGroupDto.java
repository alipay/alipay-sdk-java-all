package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 灰度用户分组信息
 *
 * @author auto create
 * @since 1.0, 2023-02-15 11:44:47
 */
public class MiniAppCustomGrayGroupDto extends AlipayObject {

	private static final long serialVersionUID = 2326949472627878483L;

	/**
	 * 灰度分组id
	 */
	@ApiField("id")
	private Long id;

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

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

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
