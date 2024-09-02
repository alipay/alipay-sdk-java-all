package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 政务监管账户创建
 *
 * @author auto create
 * @since 1.0, 2024-08-21 15:24:52
 */
public class AlipayEbppIndustrySupervisionAccountCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2474487914411893696L;

	/**
	 * 1:  支持异名打款 自动退  0: 不支持 。 默认为 1
	 */
	@ApiField("auto_refund")
	private String autoRefund;

	/**
	 * 不同的业务场景走不同业务规则
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 企业支付宝账户uid 对应open_id
用于获取企业账户信息，创建对应的监管子户
	 */
	@ApiField("merchant_alipay_open_id")
	private String merchantAlipayOpenId;

	/**
	 * 企业支付宝账户uid。用于获取企业账户信息，创建对应的监管子户
	 */
	@ApiField("merchant_alipay_uid")
	private String merchantAlipayUid;

	/**
	 * 外部用户id。专款钱包场景下，根据当前字段创建对应唯一的子户账户户号。根据业务诉求，可以传入调用方自己维护的冻资订单单号或者调用方自己维护的用户id
	 */
	@ApiField("out_user_id")
	private String outUserId;

	/**
	 * 协会、商户在银行侧自行创建的结算户账户户名，创建子户时由服务商调用接口传入
	 */
	@ApiField("parent_ext_account_name")
	private String parentExtAccountName;

	/**
	 * 协会、商户在银行侧自行创建的结算户账户户号
	 */
	@ApiField("parent_ext_account_no")
	private String parentExtAccountNo;

	/**
	 * 业务场景为专款钱包 SPECIAL_FUNDS 场景下，收款方客户类型对公账户需要填入收款方账户联行号
	 */
	@ApiField("payee_account_type")
	private String payeeAccountType;

	/**
	 * 业务场景为专款钱包 SPECIAL_FUNDS 场景下，当收款方账户为对公账户，则需要填入收款方账户联行号
	 */
	@ApiField("payee_contact_line")
	private String payeeContactLine;

	/**
	 * 业务场景为专款钱包 SPECIAL_FUNDS 场景下。转入子户时的收款方账户户号
	 */
	@ApiField("payee_participant_id")
	private String payeeParticipantId;

	/**
	 * 业务场景为专款钱包 SPECIAL_FUNDS 场景下。子户转出时的收款方账户户名。
	 */
	@ApiField("payee_participant_name")
	private String payeeParticipantName;

	/**
	 * 业务场景为专款钱包 SPECIAL_FUNDS 场景下。子户转出时的收款方账户类型
	 */
	@ApiField("payee_participant_type")
	private String payeeParticipantType;

	/**
	 * 业务场景为专款钱包 SPECIAL_FUNDS 场景下。后续资金转入子户时的付款方账户户号
	 */
	@ApiField("payer_participant_id")
	private String payerParticipantId;

	/**
	 * 业务场景为专款钱包 SPECIAL_FUNDS 场景下。转入子户时的付款方账户户名,在后续资金划拨请求中会校验资金划拨请求中的收方账户户名是否是本次开户请求的收款方账户户名或者是付款方账户户名
	 */
	@ApiField("payer_participant_name")
	private String payerParticipantName;

	/**
	 * 业务场景为专款钱包 SPECIAL_FUNDS 场景下。转入子户时的付款方账户类型
	 */
	@ApiField("payer_participant_type")
	private String payerParticipantType;

	/**
	 * 专款资金金额，整数，单位：分
	 */
	@ApiField("special_funds_amount")
	private Long specialFundsAmount;

	/**
	 * 币种，默认 CNY。目前只支持CNY
	 */
	@ApiField("special_funds_currency")
	private String specialFundsCurrency;

	/**
	 * 本次在银行侧创建的子户账户类型。根据业务诉求选择对应账户类型
	 */
	@ApiField("sub_account_type")
	private String subAccountType;

	public String getAutoRefund() {
		return this.autoRefund;
	}
	public void setAutoRefund(String autoRefund) {
		this.autoRefund = autoRefund;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getMerchantAlipayOpenId() {
		return this.merchantAlipayOpenId;
	}
	public void setMerchantAlipayOpenId(String merchantAlipayOpenId) {
		this.merchantAlipayOpenId = merchantAlipayOpenId;
	}

	public String getMerchantAlipayUid() {
		return this.merchantAlipayUid;
	}
	public void setMerchantAlipayUid(String merchantAlipayUid) {
		this.merchantAlipayUid = merchantAlipayUid;
	}

	public String getOutUserId() {
		return this.outUserId;
	}
	public void setOutUserId(String outUserId) {
		this.outUserId = outUserId;
	}

	public String getParentExtAccountName() {
		return this.parentExtAccountName;
	}
	public void setParentExtAccountName(String parentExtAccountName) {
		this.parentExtAccountName = parentExtAccountName;
	}

	public String getParentExtAccountNo() {
		return this.parentExtAccountNo;
	}
	public void setParentExtAccountNo(String parentExtAccountNo) {
		this.parentExtAccountNo = parentExtAccountNo;
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

	public String getPayerParticipantName() {
		return this.payerParticipantName;
	}
	public void setPayerParticipantName(String payerParticipantName) {
		this.payerParticipantName = payerParticipantName;
	}

	public String getPayerParticipantType() {
		return this.payerParticipantType;
	}
	public void setPayerParticipantType(String payerParticipantType) {
		this.payerParticipantType = payerParticipantType;
	}

	public Long getSpecialFundsAmount() {
		return this.specialFundsAmount;
	}
	public void setSpecialFundsAmount(Long specialFundsAmount) {
		this.specialFundsAmount = specialFundsAmount;
	}

	public String getSpecialFundsCurrency() {
		return this.specialFundsCurrency;
	}
	public void setSpecialFundsCurrency(String specialFundsCurrency) {
		this.specialFundsCurrency = specialFundsCurrency;
	}

	public String getSubAccountType() {
		return this.subAccountType;
	}
	public void setSubAccountType(String subAccountType) {
		this.subAccountType = subAccountType;
	}

}
