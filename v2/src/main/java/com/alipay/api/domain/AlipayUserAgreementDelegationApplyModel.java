package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付宝个人委托代买任务申请接口
 *
 * @author auto create
 * @since 1.0, 2026-03-26 17:26:13
 */
public class AlipayUserAgreementDelegationApplyModel extends AlipayObject {

	private static final long serialVersionUID = 6385867995971848755L;

	/**
	 * 【描述】请按当前接入的方式进行填充，且输入值必须为文档中的参数取值范围。
	 */
	@ApiField("access_params")
	private AccessParams accessParams;

	/**
	 * 智能体id
	 */
	@ApiField("agent_id")
	private String agentId;

	/**
	 * null
	 */
	@ApiListField("conversation_history")
	@ApiField("conversation")
	private List<Conversation> conversationHistory;

	/**
	 * AI付代买委托信息
	 */
	@ApiField("delegation_params")
	private DelegationParams delegationParams;

	/**
	 * 商户签约号，代扣协议中标示用户的唯一签约号（确保在商户系统中唯一）。 格式规则：支持大写小写字母和数字，最长32位。 商户系统按需自定义传入，用于区分用户在同一产品码、同一签约场景下，签订的多份代扣协议。
	 */
	@ApiField("external_agreement_no")
	private String externalAgreementNo;

	/**
	 * 个人签约产品码，商户和支付宝签约时确定，商户可咨询技术支持。
	 */
	@ApiField("personal_product_code")
	private String personalProductCode;

	public AccessParams getAccessParams() {
		return this.accessParams;
	}
	public void setAccessParams(AccessParams accessParams) {
		this.accessParams = accessParams;
	}

	public String getAgentId() {
		return this.agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public List<Conversation> getConversationHistory() {
		return this.conversationHistory;
	}
	public void setConversationHistory(List<Conversation> conversationHistory) {
		this.conversationHistory = conversationHistory;
	}

	public DelegationParams getDelegationParams() {
		return this.delegationParams;
	}
	public void setDelegationParams(DelegationParams delegationParams) {
		this.delegationParams = delegationParams;
	}

	public String getExternalAgreementNo() {
		return this.externalAgreementNo;
	}
	public void setExternalAgreementNo(String externalAgreementNo) {
		this.externalAgreementNo = externalAgreementNo;
	}

	public String getPersonalProductCode() {
		return this.personalProductCode;
	}
	public void setPersonalProductCode(String personalProductCode) {
		this.personalProductCode = personalProductCode;
	}

}
