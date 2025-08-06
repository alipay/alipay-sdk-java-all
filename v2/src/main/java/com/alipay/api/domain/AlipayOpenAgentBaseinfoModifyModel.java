package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 修改智能体基础信息
 *
 * @author auto create
 * @since 1.0, 2025-06-17 11:22:28
 */
public class AlipayOpenAgentBaseinfoModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3133145766944865727L;

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
	 * 智能体应用logo，建议上传像素为 200*200 ，小于200kb的图标。
	 */
	@ApiField("app_logo")
	private String appLogo;

	/**
	 * 智能体应用名称。名称长度为3-30个字符，一个中文字等于2个字符，名称可以由中文、数字、英文、下划线、+、-组成。
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 选择智能体的发音人
	 */
	@ApiField("app_tone")
	private String appTone;

	/**
	 * 对话页的背景图片，建议像素为750x1624，小于500kb的图片
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
	 * 推荐问题，当card_type为FUNCTIONAL_CARD是为必填
	 */
	@ApiField("card_recommend")
	private RecommendQuestion cardRecommend;

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
	 * 自定卡片内容，当card_type为CUSTOM_CARD时需要填写。
	 */
	@ApiField("custom_card")
	private CustomCard customCard;

	/**
	 * 自定义卡片body，选择自定义卡片时需要填写
	 */
	@ApiField("custom_card_body")
	private String customCardBody;

	/**
	 * 自定义卡片ID，选择自定义卡片时需要填写
	 */
	@ApiField("custom_card_id")
	private String customCardId;

	/**
	 * 默认问答模式，必须在support_qa_mode列表里面
	 */
	@ApiField("default_qa_mode")
	private String defaultQaMode;

	/**
	 * 引导问题，当card_type为LEADING_TEXT_DEFAULT_CARD(默认文本卡片)或EXPERT_CARD(专家智能体卡片)时支持修改引导语，最大支持3条。
	 */
	@ApiField("leading_questions")
	private String leadingQuestions;

	/**
	 * null
	 */
	@ApiListField("support_qa_mode")
	@ApiField("string")
	private List<String> supportQaMode;

	public String getAppDesc() {
		return this.appDesc;
	}
	public void setAppDesc(String appDesc) {
		this.appDesc = appDesc;
	}

	public List<String> getAppLabel() {
		return this.appLabel;
	}
	public void setAppLabel(List<String> appLabel) {
		this.appLabel = appLabel;
	}

	public String getAppLogo() {
		return this.appLogo;
	}
	public void setAppLogo(String appLogo) {
		this.appLogo = appLogo;
	}

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getAppTone() {
		return this.appTone;
	}
	public void setAppTone(String appTone) {
		this.appTone = appTone;
	}

	public String getBackground() {
		return this.background;
	}
	public void setBackground(String background) {
		this.background = background;
	}

	public String getCardBottom() {
		return this.cardBottom;
	}
	public void setCardBottom(String cardBottom) {
		this.cardBottom = cardBottom;
	}

	public String getCardGuide() {
		return this.cardGuide;
	}
	public void setCardGuide(String cardGuide) {
		this.cardGuide = cardGuide;
	}

	public RecommendQuestion getCardRecommend() {
		return this.cardRecommend;
	}
	public void setCardRecommend(RecommendQuestion cardRecommend) {
		this.cardRecommend = cardRecommend;
	}

	public String getCardType() {
		return this.cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public Boolean getContinueAsk() {
		return this.continueAsk;
	}
	public void setContinueAsk(Boolean continueAsk) {
		this.continueAsk = continueAsk;
	}

	public CustomCard getCustomCard() {
		return this.customCard;
	}
	public void setCustomCard(CustomCard customCard) {
		this.customCard = customCard;
	}

	public String getCustomCardBody() {
		return this.customCardBody;
	}
	public void setCustomCardBody(String customCardBody) {
		this.customCardBody = customCardBody;
	}

	public String getCustomCardId() {
		return this.customCardId;
	}
	public void setCustomCardId(String customCardId) {
		this.customCardId = customCardId;
	}

	public String getDefaultQaMode() {
		return this.defaultQaMode;
	}
	public void setDefaultQaMode(String defaultQaMode) {
		this.defaultQaMode = defaultQaMode;
	}

	public String getLeadingQuestions() {
		return this.leadingQuestions;
	}
	public void setLeadingQuestions(String leadingQuestions) {
		this.leadingQuestions = leadingQuestions;
	}

	public List<String> getSupportQaMode() {
		return this.supportQaMode;
	}
	public void setSupportQaMode(List<String> supportQaMode) {
		this.supportQaMode = supportQaMode;
	}

}
