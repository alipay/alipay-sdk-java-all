package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 货运企业支付授权模式下转账申请
 *
 * @author auto create
 * @since 1.0, 2025-07-02 19:14:49
 */
public class AlipayCommerceLogisticsFreightflowAuthorizetransferApplyModel extends AlipayObject {

	private static final long serialVersionUID = 8321439923638878973L;

	/**
	 * 委托授权合约号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 转账金额，单位分
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 业务幂等号,格式标准：需要在尾部添加时间戳，格式为yyyyMMdd。
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 币种编码（如CNY）
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 物流公司编码
	 */
	@ApiField("logistics_code")
	private String logisticsCode;

	/**
	 * 备注（可填写订单描述信息）
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 银行管理模式。
本期：
ANT_MYBANK(网商银行模式)
	 */
	@ApiField("mode")
	private String mode;

	/**
	 * 网商银行应用id,当mode为ANT_MYBANK时由网商提供给商户
	 */
	@ApiField("mybank_app_id")
	private String mybankAppId;

	/**
	 * 网商银行解决方案CODE,当mode为ANT_MYBANK时由网商提供给商户
	 */
	@ApiField("mybank_scene_code")
	private String mybankSceneCode;

	/**
	 * 如果mode为网商银行，则为网商银行分配
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 收款方信息
	 */
	@ApiField("payee_participant")
	private FreightFlowParticipantInfo payeeParticipant;

	/**
	 * 付款方信息
	 */
	@ApiField("payer_participant")
	private FreightFlowParticipantInfo payerParticipant;

	/**
	 * 交易请求时间 标准格式：yyyyMMddHHmmss
	 */
	@ApiField("request_time")
	private String requestTime;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getLogisticsCode() {
		return this.logisticsCode;
	}
	public void setLogisticsCode(String logisticsCode) {
		this.logisticsCode = logisticsCode;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getMode() {
		return this.mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getMybankAppId() {
		return this.mybankAppId;
	}
	public void setMybankAppId(String mybankAppId) {
		this.mybankAppId = mybankAppId;
	}

	public String getMybankSceneCode() {
		return this.mybankSceneCode;
	}
	public void setMybankSceneCode(String mybankSceneCode) {
		this.mybankSceneCode = mybankSceneCode;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public FreightFlowParticipantInfo getPayeeParticipant() {
		return this.payeeParticipant;
	}
	public void setPayeeParticipant(FreightFlowParticipantInfo payeeParticipant) {
		this.payeeParticipant = payeeParticipant;
	}

	public FreightFlowParticipantInfo getPayerParticipant() {
		return this.payerParticipant;
	}
	public void setPayerParticipant(FreightFlowParticipantInfo payerParticipant) {
		this.payerParticipant = payerParticipant;
	}

	public String getRequestTime() {
		return this.requestTime;
	}
	public void setRequestTime(String requestTime) {
		this.requestTime = requestTime;
	}

}
