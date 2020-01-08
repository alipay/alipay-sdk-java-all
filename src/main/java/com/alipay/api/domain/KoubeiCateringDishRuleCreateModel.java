package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 规则创建模型
 *
 * @author auto create
 * @since 1.0, 2019-10-18 16:54:01
 */
public class KoubeiCateringDishRuleCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1313263856361412327L;

	/**
	 * 菜品规则通用模型
	 */
	@ApiField("kb_dish_rule_info")
	private KbdishRuleInfo kbDishRuleInfo;

	public KbdishRuleInfo getKbDishRuleInfo() {
		return this.kbDishRuleInfo;
	}
	public void setKbDishRuleInfo(KbdishRuleInfo kbDishRuleInfo) {
		this.kbDishRuleInfo = kbDishRuleInfo;
	}

}
