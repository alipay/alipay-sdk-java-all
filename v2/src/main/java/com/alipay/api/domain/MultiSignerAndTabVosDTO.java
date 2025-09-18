package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 签署组件信息
 *
 * @author auto create
 * @since 1.0, 2024-12-27 10:25:16
 */
public class MultiSignerAndTabVosDTO extends AlipayObject {

	private static final long serialVersionUID = 8893871749884239352L;

	/**
	 * ture表示自动签署，false表示手动签署。不传默认false
	 */
	@ApiField("auto")
	private Boolean auto;

	/**
	 * 电子邮件主题 最大99个字
	 */
	@ApiField("email_body")
	private String emailBody;

	/**
	 * 电子邮件消息 最大1000个字
	 */
	@ApiField("email_subject")
	private String emailSubject;

	/**
	 * 是否需要Docusign邮件通知，默认true
	 */
	@ApiField("need_emai_notice")
	private Boolean needEmaiNotice;

	/**
	 * 签约顺序 1~10 不同的人请保持不一致
	 */
	@ApiField("order")
	private Long order;

	/**
	 * 标记唯一的签字人id （必传）
	 */
	@ApiField("recipient_id")
	private String recipientId;

	/**
	 * 区分内部外部人员，默认内部
	 */
	@ApiField("side")
	private String side;

	/**
	 * 签署人邮箱(外部)
	 */
	@ApiField("signer_email")
	private String signerEmail;

	/**
	 * 签署人姓名
	 */
	@ApiField("signer_name")
	private String signerName;

	/**
	 * 签署人工号（内部）
	 */
	@ApiField("signer_num")
	private String signerNum;

	/**
	 * 电子邮件语言：无特殊要求请使用en
	 */
	@ApiField("supported_language")
	private String supportedLanguage;

	/**
	 * 签署组件信息
	 */
	@ApiListField("tabs")
	@ApiField("seal_tabs_v_o")
	private List<SealTabsVO> tabs;

	public Boolean getAuto() {
		return this.auto;
	}
	public void setAuto(Boolean auto) {
		this.auto = auto;
	}

	public String getEmailBody() {
		return this.emailBody;
	}
	public void setEmailBody(String emailBody) {
		this.emailBody = emailBody;
	}

	public String getEmailSubject() {
		return this.emailSubject;
	}
	public void setEmailSubject(String emailSubject) {
		this.emailSubject = emailSubject;
	}

	public Boolean getNeedEmaiNotice() {
		return this.needEmaiNotice;
	}
	public void setNeedEmaiNotice(Boolean needEmaiNotice) {
		this.needEmaiNotice = needEmaiNotice;
	}

	public Long getOrder() {
		return this.order;
	}
	public void setOrder(Long order) {
		this.order = order;
	}

	public String getRecipientId() {
		return this.recipientId;
	}
	public void setRecipientId(String recipientId) {
		this.recipientId = recipientId;
	}

	public String getSide() {
		return this.side;
	}
	public void setSide(String side) {
		this.side = side;
	}

	public String getSignerEmail() {
		return this.signerEmail;
	}
	public void setSignerEmail(String signerEmail) {
		this.signerEmail = signerEmail;
	}

	public String getSignerName() {
		return this.signerName;
	}
	public void setSignerName(String signerName) {
		this.signerName = signerName;
	}

	public String getSignerNum() {
		return this.signerNum;
	}
	public void setSignerNum(String signerNum) {
		this.signerNum = signerNum;
	}

	public String getSupportedLanguage() {
		return this.supportedLanguage;
	}
	public void setSupportedLanguage(String supportedLanguage) {
		this.supportedLanguage = supportedLanguage;
	}

	public List<SealTabsVO> getTabs() {
		return this.tabs;
	}
	public void setTabs(List<SealTabsVO> tabs) {
		this.tabs = tabs;
	}

}
