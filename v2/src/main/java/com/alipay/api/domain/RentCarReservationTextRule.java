package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付宝租车预定规则
 *
 * @author auto create
 * @since 1.0, 2023-12-05 10:17:34
 */
public class RentCarReservationTextRule extends AlipayObject {

	private static final long serialVersionUID = 6856786894322747449L;

	/**
	 * 规则文案列表
	 */
	@ApiListField("rule_text_list")
	@ApiField("string")
	private List<String> ruleTextList;

	/**
	 * 标题
	 */
	@ApiField("title")
	private String title;

	public List<String> getRuleTextList() {
		return this.ruleTextList;
	}
	public void setRuleTextList(List<String> ruleTextList) {
		this.ruleTextList = ruleTextList;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
