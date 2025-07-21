package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.agent.baseinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-17 11:27:30
 */
public class AlipayOpenAgentBaseinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3535983797874631998L;

	/** 
	 * 智能体应用描述
	 */
	@ApiField("app_desc")
	private String appDesc;

	/** 
	 * null
	 */
	@ApiListField("app_label")
	@ApiField("string")
	private List<String> appLabel;

	/** 
	 * 智能体应用logo
	 */
	@ApiField("app_logo")
	private String appLogo;

	/** 
	 * 智能体应用名称，要求名称长度为3-30个字符，一个中文字等于2个字符；名称可以由中文、数字、英文、下划线、+、-组成。
	 */
	@ApiField("app_name")
	private String appName;

	/** 
	 * 选择智能体的发音人
	 */
	@ApiField("app_tone")
	private String appTone;

	/** 
	 * 对话页的背景图片
	 */
	@ApiField("background")
	private String background;

	/** 
	 * 底部输入框指引
	 */
	@ApiField("card_bottom")
	private String cardBottom;

	/** 
	 * 进入智能体的开场白
	 */
	@ApiField("card_guide")
	private String cardGuide;

	/** 
	 * 选择智能体开场展现的类型
	 */
	@ApiField("card_type")
	private String cardType;

	/** 
	 * 是否开启继续问
	 */
	@ApiField("continue_ask")
	private Boolean continueAsk;

	/** 
	 * 自定义卡片配置信息
	 */
	@ApiField("custom_card_body")
	private String customCardBody;

	/** 
	 * 自定卡片ID
	 */
	@ApiField("custom_card_id")
	private String customCardId;

	/** 
	 * 默认问答模式
	 */
	@ApiField("default_qa_mode")
	private String defaultQaMode;

	/** 
	 * null
	 */
	@ApiListField("leading_questions")
	@ApiField("string")
	private List<String> leadingQuestions;

	/** 
	 * null
	 */
	@ApiListField("support_qa_mode")
	@ApiField("string")
	private List<String> supportQaMode;

	public void setAppDesc(String appDesc) {
		this.appDesc = appDesc;
	}
	public String getAppDesc( ) {
		return this.appDesc;
	}

	public void setAppLabel(List<String> appLabel) {
		this.appLabel = appLabel;
	}
	public List<String> getAppLabel( ) {
		return this.appLabel;
	}

	public void setAppLogo(String appLogo) {
		this.appLogo = appLogo;
	}
	public String getAppLogo( ) {
		return this.appLogo;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getAppName( ) {
		return this.appName;
	}

	public void setAppTone(String appTone) {
		this.appTone = appTone;
	}
	public String getAppTone( ) {
		return this.appTone;
	}

	public void setBackground(String background) {
		this.background = background;
	}
	public String getBackground( ) {
		return this.background;
	}

	public void setCardBottom(String cardBottom) {
		this.cardBottom = cardBottom;
	}
	public String getCardBottom( ) {
		return this.cardBottom;
	}

	public void setCardGuide(String cardGuide) {
		this.cardGuide = cardGuide;
	}
	public String getCardGuide( ) {
		return this.cardGuide;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getCardType( ) {
		return this.cardType;
	}

	public void setContinueAsk(Boolean continueAsk) {
		this.continueAsk = continueAsk;
	}
	public Boolean getContinueAsk( ) {
		return this.continueAsk;
	}

	public void setCustomCardBody(String customCardBody) {
		this.customCardBody = customCardBody;
	}
	public String getCustomCardBody( ) {
		return this.customCardBody;
	}

	public void setCustomCardId(String customCardId) {
		this.customCardId = customCardId;
	}
	public String getCustomCardId( ) {
		return this.customCardId;
	}

	public void setDefaultQaMode(String defaultQaMode) {
		this.defaultQaMode = defaultQaMode;
	}
	public String getDefaultQaMode( ) {
		return this.defaultQaMode;
	}

	public void setLeadingQuestions(List<String> leadingQuestions) {
		this.leadingQuestions = leadingQuestions;
	}
	public List<String> getLeadingQuestions( ) {
		return this.leadingQuestions;
	}

	public void setSupportQaMode(List<String> supportQaMode) {
		this.supportQaMode = supportQaMode;
	}
	public List<String> getSupportQaMode( ) {
		return this.supportQaMode;
	}

}
