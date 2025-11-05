package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创意模版规则限制枚举
 *
 * @author auto create
 * @since 1.0, 2025-05-12 16:14:59
 */
public class InfraTemplateEnumRuleResp extends AlipayObject {

	private static final long serialVersionUID = 6564457553336922886L;

	/**
	 * 元素可选值对象集合
	 */
	@ApiListField("options")
	@ApiField("infra_template_enum_rule_option_resp")
	private List<InfraTemplateEnumRuleOptionResp> options;

	public List<InfraTemplateEnumRuleOptionResp> getOptions() {
		return this.options;
	}
	public void setOptions(List<InfraTemplateEnumRuleOptionResp> options) {
		this.options = options;
	}

}
