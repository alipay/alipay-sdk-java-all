package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 欢迎页卡片
 *
 * @author auto create
 * @since 1.0, 2024-10-10 19:18:47
 */
public class AgentWelcomeCardDTO extends AlipayObject {

	private static final long serialVersionUID = 1115416372935968287L;

	/**
	 * 智能体名称
	 */
	@ApiField("agent_name")
	private String agentName;

	/**
	 * 图标
	 */
	@ApiField("card_icon")
	private String cardIcon;

	/**
	 * 口号
	 */
	@ApiField("card_slogan")
	private String cardSlogan;

	/**
	 * 介绍
	 */
	@ApiField("intro_desc")
	private String introDesc;

	/**
	 * 标题
	 */
	@ApiField("intro_title")
	private String introTitle;

	/**
	 * 推荐问题
	 */
	@ApiListField("pre_question")
	@ApiField("string")
	private List<String> preQuestion;

	public String getAgentName() {
		return this.agentName;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public String getCardIcon() {
		return this.cardIcon;
	}
	public void setCardIcon(String cardIcon) {
		this.cardIcon = cardIcon;
	}

	public String getCardSlogan() {
		return this.cardSlogan;
	}
	public void setCardSlogan(String cardSlogan) {
		this.cardSlogan = cardSlogan;
	}

	public String getIntroDesc() {
		return this.introDesc;
	}
	public void setIntroDesc(String introDesc) {
		this.introDesc = introDesc;
	}

	public String getIntroTitle() {
		return this.introTitle;
	}
	public void setIntroTitle(String introTitle) {
		this.introTitle = introTitle;
	}

	public List<String> getPreQuestion() {
		return this.preQuestion;
	}
	public void setPreQuestion(List<String> preQuestion) {
		this.preQuestion = preQuestion;
	}

}
