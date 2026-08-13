package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EpAssistantServiceSubtitleSegment;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.assistant.servicecard.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-27 10:12:55
 */
public class ZhimaCreditEpAssistantServicecardQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5188872747359391751L;

	/** 
	 * 角标跳转链接
	 */
	@ApiField("badge_jump_url")
	private String badgeJumpUrl;

	/** 
	 * 角标通知分类
	 */
	@ApiField("badge_notify_type")
	private String badgeNotifyType;

	/** 
	 * 角标文案
	 */
	@ApiField("badge_text")
	private String badgeText;

	/** 
	 * 角标类型
	 */
	@ApiField("badge_type")
	private String badgeType;

	/** 
	 * 服务按钮文案
	 */
	@ApiField("button_text")
	private String buttonText;

	/** 
	 * 服务卡片跳转链接，用户引导对应服务落地页
	 */
	@ApiField("card_jump_url")
	private String cardJumpUrl;

	/** 
	 * 服务卡片通知数据记录ID，用于回传标记通知已读
	 */
	@ApiField("card_notification_id")
	private String cardNotificationId;

	/** 
	 * 服务卡片通知类型
	 */
	@ApiField("card_notify_type")
	private String cardNotifyType;

	/** 
	 * null
	 */
	@ApiListField("card_subtitle")
	@ApiField("ep_assistant_service_subtitle_segment")
	private List<EpAssistantServiceSubtitleSegment> cardSubtitle;

	/** 
	 * 服务卡片主标题
	 */
	@ApiField("card_title")
	private String cardTitle;

	/** 
	 * 功能引流场景，如 找客户/查企业/盘线索
	 */
	@ApiField("guide_scene")
	private String guideScene;

	/** 
	 * null
	 */
	@ApiListField("potential_benefits")
	@ApiField("string")
	private List<String> potentialBenefits;

	public void setBadgeJumpUrl(String badgeJumpUrl) {
		this.badgeJumpUrl = badgeJumpUrl;
	}
	public String getBadgeJumpUrl( ) {
		return this.badgeJumpUrl;
	}

	public void setBadgeNotifyType(String badgeNotifyType) {
		this.badgeNotifyType = badgeNotifyType;
	}
	public String getBadgeNotifyType( ) {
		return this.badgeNotifyType;
	}

	public void setBadgeText(String badgeText) {
		this.badgeText = badgeText;
	}
	public String getBadgeText( ) {
		return this.badgeText;
	}

	public void setBadgeType(String badgeType) {
		this.badgeType = badgeType;
	}
	public String getBadgeType( ) {
		return this.badgeType;
	}

	public void setButtonText(String buttonText) {
		this.buttonText = buttonText;
	}
	public String getButtonText( ) {
		return this.buttonText;
	}

	public void setCardJumpUrl(String cardJumpUrl) {
		this.cardJumpUrl = cardJumpUrl;
	}
	public String getCardJumpUrl( ) {
		return this.cardJumpUrl;
	}

	public void setCardNotificationId(String cardNotificationId) {
		this.cardNotificationId = cardNotificationId;
	}
	public String getCardNotificationId( ) {
		return this.cardNotificationId;
	}

	public void setCardNotifyType(String cardNotifyType) {
		this.cardNotifyType = cardNotifyType;
	}
	public String getCardNotifyType( ) {
		return this.cardNotifyType;
	}

	public void setCardSubtitle(List<EpAssistantServiceSubtitleSegment> cardSubtitle) {
		this.cardSubtitle = cardSubtitle;
	}
	public List<EpAssistantServiceSubtitleSegment> getCardSubtitle( ) {
		return this.cardSubtitle;
	}

	public void setCardTitle(String cardTitle) {
		this.cardTitle = cardTitle;
	}
	public String getCardTitle( ) {
		return this.cardTitle;
	}

	public void setGuideScene(String guideScene) {
		this.guideScene = guideScene;
	}
	public String getGuideScene( ) {
		return this.guideScene;
	}

	public void setPotentialBenefits(List<String> potentialBenefits) {
		this.potentialBenefits = potentialBenefits;
	}
	public List<String> getPotentialBenefits( ) {
		return this.potentialBenefits;
	}

}
