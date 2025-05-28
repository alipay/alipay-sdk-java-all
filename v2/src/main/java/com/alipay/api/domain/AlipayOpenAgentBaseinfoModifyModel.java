package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 修改智能体基础信息
 *
 * @author auto create
 * @since 1.0, 2025-04-22 10:57:29
 */
public class AlipayOpenAgentBaseinfoModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2259949588164944892L;

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
	 * 智能体应用名称
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
	 * 自定义卡片body
	 */
	@ApiField("custom_card_body")
	private String customCardBody;

	/**
	 * 自定义卡片ID
	 */
	@ApiField("custom_card_id")
	private String customCardId;

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

	public List<String> getSupportQaMode() {
		return this.supportQaMode;
	}
	public void setSupportQaMode(List<String> supportQaMode) {
		this.supportQaMode = supportQaMode;
	}

}
