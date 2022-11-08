package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻GO模板的拓展配置
 *
 * @author auto create
 * @since 1.0, 2022-08-26 10:00:21
 */
public class ZMGOExtConfig extends AlipayObject {

	private static final long serialVersionUID = 7714347678996169587L;

	/**
	 * 文本内容填充规则ID
	 */
	@ApiField("text_content_fill_rule_id")
	private String textContentFillRuleId;

	/**
	 * 文本内容填充变量，变量key由运营同学提供
	 */
	@ApiField("text_content_fill_variable")
	private String textContentFillVariable;

	public String getTextContentFillRuleId() {
		return this.textContentFillRuleId;
	}
	public void setTextContentFillRuleId(String textContentFillRuleId) {
		this.textContentFillRuleId = textContentFillRuleId;
	}

	public String getTextContentFillVariable() {
		return this.textContentFillVariable;
	}
	public void setTextContentFillVariable(String textContentFillVariable) {
		this.textContentFillVariable = textContentFillVariable;
	}

}
