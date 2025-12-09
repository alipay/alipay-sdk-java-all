package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 历史规则
 *
 * @author auto create
 * @since 1.0, 2023-05-18 19:52:18
 */
public class HistoryRuleVO extends AlipayObject {

	private static final long serialVersionUID = 1431989379398393115L;

	/**
	 * 修改时间
	 */
	@ApiField("last_modified_time")
	private String lastModifiedTime;

	/**
	 * 模块code
	 */
	@ApiField("module_code")
	private String moduleCode;

	/**
	 * 对客产品code
	 */
	@ApiField("outer_product_code")
	private String outerProductCode;

	/**
	 * 规则子表达式
	 */
	@ApiField("rule_conditions")
	private String ruleConditions;

	/**
	 * 规则id
	 */
	@ApiField("rule_id")
	private String ruleId;

	public String getLastModifiedTime() {
		return this.lastModifiedTime;
	}
	public void setLastModifiedTime(String lastModifiedTime) {
		this.lastModifiedTime = lastModifiedTime;
	}

	public String getModuleCode() {
		return this.moduleCode;
	}
	public void setModuleCode(String moduleCode) {
		this.moduleCode = moduleCode;
	}

	public String getOuterProductCode() {
		return this.outerProductCode;
	}
	public void setOuterProductCode(String outerProductCode) {
		this.outerProductCode = outerProductCode;
	}

	public String getRuleConditions() {
		return this.ruleConditions;
	}
	public void setRuleConditions(String ruleConditions) {
		this.ruleConditions = ruleConditions;
	}

	public String getRuleId() {
		return this.ruleId;
	}
	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
	}

}
