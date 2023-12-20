package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 政务监管资金划拨
 *
 * @author auto create
 * @since 1.0, 2023-03-28 13:51:08
 */
public class AlipayEbppIndustrySupervisionFundsTransferModel extends AlipayObject {

	private static final long serialVersionUID = 5455838931471486123L;

	/**
	 * 资金划拨的金额（单位分）
	 */
	@ApiField("amount")
	private Long amount;

	/**
	 * 业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 资金划拨币种
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 外部流水号确保每一笔资金划拨请求幂等。
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 保证金退款场景下，填收方账户类型，本次写02，代表对公户
	 */
	@ApiField("payee_account_type")
	private String payeeAccountType;

	/**
	 * 保证金退款场景下，填收方账户所在行的联行号，本次为支付宝联行号
	 */
	@ApiField("payee_contact_line")
	private String payeeContactLine;

	/**
	 * 收方参与者ID
	 */
	@ApiField("payee_participant_id")
	private String payeeParticipantId;

	/**
	 * 保证金退款场景下，收方户名必填
	 */
	@ApiField("payee_participant_name")
	private String payeeParticipantName;

	/**
	 * 收方参与者类型
	 */
	@ApiField("payee_participant_type")
	private String payeeParticipantType;

	/**
	 * 付方参与者ID
	 */
	@ApiField("payer_participant_id")
	private String payerParticipantId;

	/**
	 * 监管子户：CUSTODY_SUB_ACCOUNT
保证金户：DEPOSIT_ACCOUNT
	 */
	@ApiField("payer_participant_type")
	private String payerParticipantType;

	/**
	 * 保证金退保至支付宝ACS账户时需要经过监管子户过桥。该场景下，当前字段需要填写驾校监管子户号
	 */
	@ApiField("relate_participant_id")
	private String relateParticipantId;

	/**
	 * 在保证金退回场景下，需要有监管子户过桥。
当前字段必填且为驾校监管子户
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
