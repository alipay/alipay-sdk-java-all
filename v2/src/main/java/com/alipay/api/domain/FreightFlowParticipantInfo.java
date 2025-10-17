package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用于转账申请中承载付款方主体信息和收款方主体信息
 *
 * @author auto create
 * @since 1.0, 2025-05-07 10:08:50
 */
public class FreightFlowParticipantInfo extends AlipayObject {

	private static final long serialVersionUID = 1897224689276131983L;

	/**
	 * 参与者类型(外部银行卡场景必选) 
个人：INDIVIDUAL
企业：CORPORATION
	 */
	@ApiField("participant_customer_type")
	private String participantCustomerType;

	/**
	 * 网商活期：卡号 
子户：子户卡号 
外部银行卡：银行卡号 
支付宝账户：支付宝登录号
	 */
	@ApiField("participant_id")
	private String participantId;

	/**
	 * 参与者联联行号(对公账户必传)
	 */
	@ApiField("participant_inst_code")
	private String participantInstCode;

	/**
	 * 参与者名称(户名)
	 */
	@ApiField("participant_name")
	private String participantName;

	/**
	 * 参与者类型 
网商活期：CURRENT 
子户：SUB_ACCOUNT 
外部银行卡：EXTEND_BANK_CARD 
支付宝账户：ALIPAY_ACCOUNT
	 */
	@ApiField("participant_type")
	private String participantType;

	public String getParticipantCustomerType() {
		return this.participantCustomerType;
	}
	public void setParticipantCustomerType(String participantCustomerType) {
		this.participantCustomerType = participantCustomerType;
	}

	public String getParticipantId() {
		return this.participantId;
	}
	public void setParticipantId(String participantId) {
		this.participantId = participantId;
	}

	public String getParticipantInstCode() {
		return this.participantInstCode;
	}
	public void setParticipantInstCode(String participantInstCode) {
		this.participantInstCode = participantInstCode;
	}

	public String getParticipantName() {
		return this.participantName;
	}
	public void setParticipantName(String participantName) {
		this.participantName = participantName;
	}

	public String getParticipantType() {
		return this.participantType;
	}
	public void setParticipantType(String participantType) {
		this.participantType = participantType;
	}

}
