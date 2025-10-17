package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商家群自动回复触发规则
 *
 * @author auto create
 * @since 1.0, 2025-07-09 11:39:28
 */
public class GroupMsgAutoreplyTriggerRuleVO extends AlipayObject {

	private static final long serialVersionUID = 4766311448251523796L;

	/**
	 * 触发规则
	 */
	@ApiListField("keywords")
	@ApiField("string")
	private List<String> keywords;

	public List<String> getKeywords() {
		return this.keywords;
	}
	public void setKeywords(List<String> keywords) {
		this.keywords = keywords;
	}

}
