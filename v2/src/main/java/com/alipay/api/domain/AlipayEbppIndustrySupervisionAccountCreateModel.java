package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 政务监管账户创建
 *
 * @author auto create
 * @since 1.0, 2024-05-30 10:14:53
 */
public class AlipayEbppIndustrySupervisionAccountCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8634833756149446573L;

	/**
	 * 业务场景 + 关联账户号 + 待开通子户类型。
三个唯一确定一个最终开通的子户账号
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
	 * 外部用户id，专款钱包场景下，根据当前字段创建对应专款钱包账户。
	 */
	@ApiField("out_user_id")
	private String outUserId;

	/**
	 * 待开子户对关联账户名
	 */
	@ApiField("parent_ext_account_name")
	private String parentExtAccountName;

	/**
	 * 待开子户的关联账户号。
驾校在网商申请的最终结算户。
	 */
	@ApiField("parent_ext_account_no")
	private String parentExtAccountNo;

	/**
	 * 专款钱包场景下钱包子户的收方客户类型，
对公账户需要填入收方账户联行号
	 */
	@ApiField("payee_account_type")
	private String payeeAccountType;

	/**
	 * 专款钱包场景下，当收方账户为对公账户，则需要填入收方账户联行号
	 */
	@ApiField("payee_contact_line")
	private String payeeContactLine;

	/**
	 * 专款钱包场景下钱包子户的收方账户ID
	 */
	@ApiField("payee_participant_id")
	private String payeeParticipantId;

	/**
	 * 收方账户名
	 */
	@ApiField("payee_participant_name")
	private String payeeParticipantName;

	/**
	 * 专款钱包场景下钱包子户的收方账户类型
	 */
	@ApiField("payee_participant_type")
	private String payeeParticipantType;

	/**
	 * 专款钱包场景下钱包子户的付方账户ID
	 */
	@ApiField("payer_participant_id")
	private String payerParticipantId;

	/**
	 * 专款钱包场景下钱包子户的付方账户名
	 */
	@ApiField("payer_participant_name")
	private String payerParticipantName;

	/**
	 * 专款钱包场景下钱包子户的付方账户类型
	 */
	@ApiField("payer_participant_type")
	private String payerParticipantType;

	/**
	 * 专款资金金额，整数，单位：分

资金划拨时根据本次输入金额进行划付校验
	 */
	@ApiField("special_funds_amount")
	private Long specialFundsAmount;

	/**
	 * 币种，默认 CNY。目前只支持CNY
	 */
	@ApiField("special_funds_currency")
	private String specialFundsCurrency;

	/**
	 * 业务场景+ 待开子户关联账户+待开通子户类型
biz_scene + parent_ext_account_no +sub_account_type 
最终申请出唯一的对应子户。
	 */
	@ApiField("sub_account_type")
	private String subAccountType;

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
