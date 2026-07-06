package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付宝个人委托代买任务系统签约接口
 *
 * @author auto create
 * @since 1.0, 2026-03-26 17:26:07
 */
public class AlipayUserAgreementDelegationSignModel extends AlipayObject {

	private static final long serialVersionUID = 8129433266256292682L;

	/**
	 * AI支付协议号
	 */
	@ApiField("ai_pay_agreement_no")
	private String aiPayAgreementNo;

	/**
	 * null
	 */
	@ApiListField("conversation_history")
	@ApiField("conversation")
	private List<Conversation> conversationHistory;

	/**
	 * 对委托任务做总结描述
	 */
	@ApiField("delegation_desc")
	private String delegationDesc;

	/**
	 * 委托业务场景
	 */
	@ApiField("delegation_scene")
	private String delegationScene;

	/**
	 * 委托任务标签
	 */
	@ApiField("delegation_tag")
	private String delegationTag;

	/**
	 * 外部委托号
	 */
	@ApiField("external_delegation_id")
	private String externalDelegationId;

	/**
	 * 免密协议号
	 */
	@ApiField("no_pwd_agreement_no")
	private String noPwdAgreementNo;

	public String getAiPayAgreementNo() {
		return this.aiPayAgreementNo;
	}
	public void setAiPayAgreementNo(String aiPayAgreementNo) {
		this.aiPayAgreementNo = aiPayAgreementNo;
	}

	public List<Conversation> getConversationHistory() {
		return this.conversationHistory;
	}
	public void setConversationHistory(List<Conversation> conversationHistory) {
		this.conversationHistory = conversationHistory;
	}

	public String getDelegationDesc() {
		return this.delegationDesc;
	}
	public void setDelegationDesc(String delegationDesc) {
		this.delegationDesc = delegationDesc;
	}

	public String getDelegationScene() {
		return this.delegationScene;
	}
	public void setDelegationScene(String delegationScene) {
		this.delegationScene = delegationScene;
	}

	public String getDelegationTag() {
		return this.delegationTag;
	}
	public void setDelegationTag(String delegationTag) {
		this.delegationTag = delegationTag;
	}

	public String getExternalDelegationId() {
		return this.externalDelegationId;
	}
	public void setExternalDelegationId(String externalDelegationId) {
		this.externalDelegationId = externalDelegationId;
	}

	public String getNoPwdAgreementNo() {
		return this.noPwdAgreementNo;
	}
	public void setNoPwdAgreementNo(String noPwdAgreementNo) {
		this.noPwdAgreementNo = noPwdAgreementNo;
	}

}
