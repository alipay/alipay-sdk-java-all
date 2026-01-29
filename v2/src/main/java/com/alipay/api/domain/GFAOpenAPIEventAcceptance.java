package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业财事件受理模型
 *
 * @author auto create
 * @since 1.0, 2026-01-21 20:07:58
 */
public class GFAOpenAPIEventAcceptance extends AlipayObject {

	private static final long serialVersionUID = 2651782722854266568L;

	/**
	 * 代收付参与者信息
	 */
	@ApiField("agent_participant")
	private GFAOpenAPIParticipantInfo agentParticipant;

	/**
	 * 合约号
	 */
	@ApiField("ar_no")
	private String arNo;

	/**
	 * 应该付金额
	 */
	@ApiField("bill_amount")
	private String billAmount;

	/**
	 * 金额币种
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 受理的事件码
	 */
	@ApiField("event_code")
	private String eventCode;

	/**
	 * 业务的触发时间（毫秒时间戳）
	 */
	@ApiField("gmt_biz_trigger")
	private Date gmtBizTrigger;

	/**
	 * 高精度账单金额
	 */
	@ApiField("high_precision_bill_amount")
	private String highPrecisionBillAmount;

	/**
	 * 未付金额
	 */
	@ApiField("nonpayment_amount")
	private String nonpaymentAmount;

	/**
	 * 收款参与者信息
	 */
	@ApiField("payee_participant")
	private GFAOpenAPIParticipantInfo payeeParticipant;

	/**
	 * 付款参与者信息
	 */
	@ApiField("payer_participant")
	private GFAOpenAPIParticipantInfo payerParticipant;

	/**
	 * 业财事件受理参数
	 */
	@ApiField("properties")
	private String properties;

	/**
	 * 已付金额
	 */
	@ApiField("real_amount")
	private String realAmount;

	/**
	 * 服务量
	 */
	@ApiField("service_amount")
	private Long serviceAmount;

	/**
	 * 结算参与者信息
	 */
	@ApiField("settle_participant")
	private GFAOpenAPIParticipantInfo settleParticipant;

	/**
	 * 签约参与者信息
	 */
	@ApiField("sign_participant")
	private GFAOpenAPIParticipantInfo signParticipant;

	/**
	 * 来源系统
	 */
	@ApiField("system_origin")
	private String systemOrigin;

	/**
	 * 税收金额
	 */
	@ApiField("tax_amount")
	private String taxAmount;

	/**
	 * 事件触发模式，默认为SYN，长度必须小于等于16
	 */
	@ApiField("trigger_pattern")
	private String triggerPattern;

	public GFAOpenAPIParticipantInfo getAgentParticipant() {
		return this.agentParticipant;
	}
	public void setAgentParticipant(GFAOpenAPIParticipantInfo agentParticipant) {
		this.agentParticipant = agentParticipant;
	}

	public String getArNo() {
		return this.arNo;
	}
	public void setArNo(String arNo) {
		this.arNo = arNo;
	}

	public String getBillAmount() {
		return this.billAmount;
	}
	public void setBillAmount(String billAmount) {
		this.billAmount = billAmount;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getEventCode() {
		return this.eventCode;
	}
	public void setEventCode(String eventCode) {
		this.eventCode = eventCode;
	}

	public Date getGmtBizTrigger() {
		return this.gmtBizTrigger;
	}
	public void setGmtBizTrigger(Date gmtBizTrigger) {
		this.gmtBizTrigger = gmtBizTrigger;
	}

	public String getHighPrecisionBillAmount() {
		return this.highPrecisionBillAmount;
	}
	public void setHighPrecisionBillAmount(String highPrecisionBillAmount) {
		this.highPrecisionBillAmount = highPrecisionBillAmount;
	}

	public String getNonpaymentAmount() {
		return this.nonpaymentAmount;
	}
	public void setNonpaymentAmount(String nonpaymentAmount) {
		this.nonpaymentAmount = nonpaymentAmount;
	}

	public GFAOpenAPIParticipantInfo getPayeeParticipant() {
		return this.payeeParticipant;
	}
	public void setPayeeParticipant(GFAOpenAPIParticipantInfo payeeParticipant) {
		this.payeeParticipant = payeeParticipant;
	}

	public GFAOpenAPIParticipantInfo getPayerParticipant() {
		return this.payerParticipant;
	}
	public void setPayerParticipant(GFAOpenAPIParticipantInfo payerParticipant) {
		this.payerParticipant = payerParticipant;
	}

	public String getProperties() {
		return this.properties;
	}
	public void setProperties(String properties) {
		this.properties = properties;
	}

	public String getRealAmount() {
		return this.realAmount;
	}
	public void setRealAmount(String realAmount) {
		this.realAmount = realAmount;
	}

	public Long getServiceAmount() {
		return this.serviceAmount;
	}
	public void setServiceAmount(Long serviceAmount) {
		this.serviceAmount = serviceAmount;
	}

	public GFAOpenAPIParticipantInfo getSettleParticipant() {
		return this.settleParticipant;
	}
	public void setSettleParticipant(GFAOpenAPIParticipantInfo settleParticipant) {
		this.settleParticipant = settleParticipant;
	}

	public GFAOpenAPIParticipantInfo getSignParticipant() {
		return this.signParticipant;
	}
	public void setSignParticipant(GFAOpenAPIParticipantInfo signParticipant) {
		this.signParticipant = signParticipant;
	}

	public String getSystemOrigin() {
		return this.systemOrigin;
	}
	public void setSystemOrigin(String systemOrigin) {
		this.systemOrigin = systemOrigin;
	}

	public String getTaxAmount() {
		return this.taxAmount;
	}
	public void setTaxAmount(String taxAmount) {
		this.taxAmount = taxAmount;
	}

	public String getTriggerPattern() {
		return this.triggerPattern;
	}
	public void setTriggerPattern(String triggerPattern) {
		this.triggerPattern = triggerPattern;
	}

}
