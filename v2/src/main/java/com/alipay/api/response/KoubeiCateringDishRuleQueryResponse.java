package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.KbdishRuleInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.dish.rule.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:36:27
 */
public class KoubeiCateringDishRuleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5532636125176611441L;

	/** 
	 * 规则的返回集合
	 */
	@ApiListField("kb_dish_rule_info_list")
	@ApiField("kbdish_rule_info")
	private List<KbdishRuleInfo> kbDishRuleInfoList;

	public void setKbDishRuleInfoList(List<KbdishRuleInfo> kbDishRuleInfoList) {
		this.kbDishRuleInfoList = kbDishRuleInfoList;
	}
	public List<KbdishRuleInfo> getKbDishRuleInfoList( ) {
		return this.kbDishRuleInfoList;
	}

}
