package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用于转账申请中承载付款方主体信息和收款方主体信息
 *
 * @author auto create
 * @since 1.0, 2026-04-13 17:14:59
 */
public class FreightFlowParticipantInfo extends AlipayObject {

	private static final long serialVersionUID = 6597183163292863739L;

	/**
	 * 银行名
	 */
	@ApiField("participant_bank_name")
	private String participantBankName;

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
	 * 网商参与者类型： 
网商活期：CURRENT 
子户：SUB_ACCOUNT 
外部银行卡：EXTEND_BANK_CARD 
支付宝账户：ALIPAY_ACCOUNT

浦发参与者类型：
虚拟子户:VIRTUAL_SUB_ACCOUNT
银行卡:BANK_CARD_NO
支付宝钱包:ALIPAY_WALLET
支付宝余额:ALIPAY_BALANCE
	 */
	@ApiField("participant_type")
	private String participantType;

	public String getParticipantBankName() {
		return this.participantBankName;
	}
	public void setParticipantBankName(String participantBankName) {
		this.participantBankName = participantBankName;
	}

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
