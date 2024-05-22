package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 模块
 *
 * @author auto create
 * @since 1.0, 2023-05-18 19:52:43
 */
public class ModuleVO extends AlipayObject {

	private static final long serialVersionUID = 6476967756936324167L;

	/**
	 * 模块code
	 */
	@ApiField("module_code")
	private String moduleCode;

	/**
	 * 模块名称
	 */
	@ApiField("module_name")
	private String moduleName;

	/**
	 * 模块值
	 */
	@ApiListField("module_value_items")
	@ApiField("module_value_v_o")
	private List<ModuleValueVO> moduleValueItems;

	/**
	 * 规则子表达式
	 */
	@ApiField("rule_conditions")
	private String ruleConditions;

	public String getModuleCode() {
		return this.moduleCode;
	}
	public void setModuleCode(String moduleCode) {
		this.moduleCode = moduleCode;
	}

	public String getModuleName() {
		return this.moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public List<ModuleValueVO> getModuleValueItems() {
		return this.moduleValueItems;
	}
	public void setModuleValueItems(List<ModuleValueVO> moduleValueItems) {
		this.moduleValueItems = moduleValueItems;
	}

	public String getRuleConditions() {
		return this.ruleConditions;
	}
	public void setRuleConditions(String ruleConditions) {
		this.ruleConditions = ruleConditions;
	}

}
