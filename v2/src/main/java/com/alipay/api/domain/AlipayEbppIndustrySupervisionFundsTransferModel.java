package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 政务监管资金划拨
 *
 * @author auto create
 * @since 1.0, 2025-08-18 16:36:13
 */
public class AlipayEbppIndustrySupervisionFundsTransferModel extends AlipayObject {

	private static final long serialVersionUID = 4566798473342181198L;

	/**
	 * 协议签约通知返回的授权合约号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 资金划拨的金额。单位：分
	 */
	@ApiField("amount")
	private Long amount;

	/**
	 * 不同的业务场景下对应不同的业务规则
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 资金划拨币种
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 商户内部生成的本次资金划拨请求的请求流水号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 表示收款方账户是对公账户还是对私账户
	 */
	@ApiField("payee_account_type")
	private String payeeAccountType;

	/**
	 * 部分资金划拨场景，且收款方为对公账户时，对应收方账户所在行的联行号
	 */
	@ApiField("payee_contact_line")
	private String payeeContactLine;

	/**
	 * 收款方账户户号
	 */
	@ApiField("payee_participant_id")
	private String payeeParticipantId;

	/**
	 * 资金划拨请求中的收方账户户名
	 */
	@ApiField("payee_participant_name")
	private String payeeParticipantName;

	/**
	 * 收款方账户类型
	 */
	@ApiField("payee_participant_type")
	private String payeeParticipantType;

	/**
	 * 付款方账户户号
	 */
	@ApiField("payer_participant_id")
	private String payerParticipantId;

	/**
	 * 付款方账户类型
	 */
	@ApiField("payer_participant_type")
	private String payerParticipantType;

	/**
	 * 特定资金划拨场景下，中间过渡户的账户户号 
保证金退保至支付宝ACS账户时需要经过监管子户过桥。该场景下，当前字段需要填写 监管子户户号
	 */
	@ApiField("relate_participant_id")
	private String relateParticipantId;

	/**
	 * 资金划拨过程中，中间涉及到的过渡户的账户类型 
在保证金退回场景下，需要有监管子户过桥。 当前字段必填且为「监管子户 CUSTODY_SUB_ACCOUNT 」
	 */
	@ApiField("relate_participant_type")
	private String relateParticipantType;

	/**
	 * 资金划拨请求备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 资金划拨场景
	 */
	@ApiField("scene")
	private String scene;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public Long getAmount() {
		return this.amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getPayeeAccountType() {
		return this.payeeAccountType;
	}
	public void setPayeeAccountType(String payeeAccountType) {
		this.payeeAccountType = payeeAccountType;
	}

	public String getPayeeContactLine() {
		return this.payeeContactLine;
	}
	public void setPayeeContactLine(String payeeContactLine) {
		this.payeeContactLine = payeeContactLine;
	}

	public String getPayeeParticipantId() {
		return this.payeeParticipantId;
	}
	public void setPayeeParticipantId(String payeeParticipantId) {
		this.payeeParticipantId = payeeParticipantId;
	}

	public String getPayeeParticipantName() {
		return this.payeeParticipantName;
	}
	public void setPayeeParticipantName(String payeeParticipantName) {
		this.payeeParticipantName = payeeParticipantName;
	}

	public String getPayeeParticipantType() {
		return this.payeeParticipantType;
	}
	public void setPayeeParticipantType(String payeeParticipantType) {
		this.payeeParticipantType = payeeParticipantType;
	}

	public String getPayerParticipantId() {
		return this.payerParticipantId;
	}
	public void setPayerParticipantId(String payerParticipantId) {
		this.payerParticipantId = payerParticipantId;
	}

	public String getPayerParticipantType() {
		return this.payerParticipantType;
	}
	public void setPayerParticipantType(String payerParticipantType) {
		this.payerParticipantType = payerParticipantType;
	}

	public String getRelateParticipantId() {
		return this.relateParticipantId;
	}
	public void setRelateParticipantId(String relateParticipantId) {
		this.relateParticipantId = relateParticipantId;
	}

	public String getRelateParticipantType() {
		return this.relateParticipantType;
	}
	public void setRelateParticipantType(String relateParticipantType) {
		this.relateParticipantType = relateParticipantType;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

}
