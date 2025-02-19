package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能对话会话配置查询请求
 *
 * @author auto create
 * @since 1.0, 2024-08-12 20:34:13
 */
public class QueryAIChatSessionConfigRequest extends AlipayObject {

	private static final long serialVersionUID = 5352544334757441792L;

	/**
	 * 是否需要返回智能体内容
	 */
	@ApiField("need_agent_content")
	private Boolean needAgentContent;

	/**
	 * 是否需要返回智能体信息
	 */
	@ApiField("need_agent_info")
	private Boolean needAgentInfo;

	/**
	 * 是否查询用户使用习惯
	 */
	@ApiField("need_customer_like")
	private Boolean needCustomerLike;

	/**
	 * 是否需要查询猜你想问问题列表
	 */
	@ApiField("need_guess_question")
	private Boolean needGuessQuestion;

	/**
	 * 是否需要查询欢迎语
	 */
	@ApiField("need_welcome_message")
	private Boolean needWelcomeMessage;

	public Boolean getNeedAgentContent() {
		return this.needAgentContent;
	}
	public void setNeedAgentContent(Boolean needAgentContent) {
		this.needAgentContent = needAgentContent;
	}

	public Boolean getNeedAgentInfo() {
		return this.needAgentInfo;
	}
	public void setNeedAgentInfo(Boolean needAgentInfo) {
		this.needAgentInfo = needAgentInfo;
	}

	public Boolean getNeedCustomerLike() {
		return this.needCustomerLike;
	}
	public void setNeedCustomerLike(Boolean needCustomerLike) {
		this.needCustomerLike = needCustomerLike;
	}

	public Boolean getNeedGuessQuestion() {
		return this.needGuessQuestion;
	}
	public void setNeedGuessQuestion(Boolean needGuessQuestion) {
		this.needGuessQuestion = needGuessQuestion;
	}

	public Boolean getNeedWelcomeMessage() {
		return this.needWelcomeMessage;
	}
	public void setNeedWelcomeMessage(Boolean needWelcomeMessage) {
		this.needWelcomeMessage = needWelcomeMessage;
	}

}
