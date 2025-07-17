package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 智能应用特性设置
 *
 * @author auto create
 * @since 1.0, 2025-05-12 14:12:27
 */
public class ChatSpecifications extends AlipayObject {

	private static final long serialVersionUID = 6452748783821426987L;

	/**
	 * null
	 */
	@ApiListField("choice_tools")
	@ApiField("choice_tools")
	private List<ChoiceTools> choiceTools;

	/**
	 * 支持思维链输出
	 */
	@ApiField("reasoning")
	private Boolean reasoning;

	public List<ChoiceTools> getChoiceTools() {
		return this.choiceTools;
	}
	public void setChoiceTools(List<ChoiceTools> choiceTools) {
		this.choiceTools = choiceTools;
	}

	public Boolean getReasoning() {
		return this.reasoning;
	}
	public void setReasoning(Boolean reasoning) {
		this.reasoning = reasoning;
	}

}
