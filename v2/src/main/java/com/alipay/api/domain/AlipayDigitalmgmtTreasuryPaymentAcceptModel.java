package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 财资TMS对外付款受理
 *
 * @author auto create
 * @since 1.0, 2025-11-04 11:22:40
 */
public class AlipayDigitalmgmtTreasuryPaymentAcceptModel extends AlipayObject {

	private static final long serialVersionUID = 2321384214761451648L;

	/**
	 * 主动/被动；ACTIVE/PASSIVE
	 */
	@ApiField("active_or_passive")
	private String activeOrPassive;

	/**
	 * 收款行本地清算行号
	 */
	@ApiField("bank_code")
	private String bankCode;

	/**
	 * 收款行本地清算分支行号
	 */
	@ApiField("branch_code")
	private String branchCode;

	/**
	 * 收款渠道为银行且为收款方为境外国家/地区，且传递的付款账号的情况下必填的必填
	 */
	@ApiField("charge_bearer")
	private String chargeBearer;

	/**
	 * 创建人
	 */
	@ApiField("creator")
	private String creator;

	/**
	 * 银行/支付宝；BANK/ALIPAY
	 */
	@ApiField("creditor_account_inner_type")
	private String creditorAccountInnerType;

	/**
	 * 收款方账户名
	 */
	@ApiField("creditor_account_name")
	private String creditorAccountName;

	/**
	 * 非空，付款方账号
	 */
	@ApiField("creditor_account_no")
	private String creditorAccountNo;

	/**
	 * 收款渠道为银行且收款方为境外国家/地区必填，收款方地址
	 */
	@ApiField("creditor_address")
	private String creditorAddress;

	/**
	 * 收款行swiftcode，境内可空，境外/跨境非空
	 */
	@ApiField("creditor_bic")
	private String creditorBic;

	/**
	 * 收款人邮箱
	 */
	@ApiField("creditor_contact_email")
	private String creditorContactEmail;

	/**
	 * 收款方联系人名称
	 */
	@ApiField("creditor_contact_name")
	private String creditorContactName;

	/**
	 * 收款渠道为银行且收款方为境外国家/地区必填，收款方电话
	 */
	@ApiField("creditor_contact_phone_number")
	private String creditorContactPhoneNumber;

	/**
	 * 有尽量传；收款渠道为银行收款方为境外国家/地区必填的必填，收款方两位国家代码
	 */
	@ApiField("creditor_country")
	private String creditorCountry;

	/**
	 * 收方币种，英文
	 */
	@ApiField("creditor_currency")
	private String creditorCurrency;

	/**
	 * 收款方财务机构ID，如：Z64、Z77
	 */
	@ApiField("creditor_fin_inst_id")
	private String creditorFinInstId;

	/**
	 * 可空，欧盟非空
	 */
	@ApiField("creditor_iban")
	private String creditorIban;

	/**
	 * 收款行机构简称
	 */
	@ApiField("creditor_inst_abbr")
	private String creditorInstAbbr;

	/**
	 * 收款银行两位国家代码；收款渠道为银行必填
	 */
	@ApiField("creditor_inst_country_code")
	private String creditorInstCountryCode;

	/**
	 * 收款方银行名称
	 */
	@ApiField("creditor_inst_name")
	private String creditorInstName;

	/**
	 * 收款人邮编
	 */
	@ApiField("creditor_post_code")
	private String creditorPostCode;

	/**
	 * 收款渠道为银行，收款方为境外有洲的国家/地区对应的城市，如：Henderson(美国内华达州东南克拉克县（Clark）的一个城市)
	 */
	@ApiField("creditor_town_name")
	private String creditorTownName;

	/**
	 * B：对公，C：对私
	 */
	@ApiField("creditor_type")
	private String creditorType;

	/**
	 * 付款方财务机构ID，如：Z50、Z51
	 */
	@ApiField("debtor_fin_inst_id")
	private String debtorFinInstId;

	/**
	 * 非空，使用该字段区分报销、采购等业务，bizCode
	 */
	@ApiField("event_code")
	private String eventCode;

	/**
	 * 期望付款时间
	 */
	@ApiField("expect_payment_date")
	private Date expectPaymentDate;

	/**
	 * 银行渠道中国资金出境需要填写的 国际收支平衡表
	 */
	@ApiField("open_api_bop_transaction_code")
	private String openApiBopTransactionCode;

	/**
	 * 境外收支交易编码说明
	 */
	@ApiField("open_api_bop_transaction_code_remark")
	private String openApiBopTransactionCodeRemark;

	/**
	 * 收款金额，具体单位'元'
	 */
	@ApiField("open_api_instructed_amount")
	private String openApiInstructedAmount;

	/**
	 * 收款金额币种值，例如：人民币对应CNY
	 */
	@ApiField("open_api_instructed_amount_currency_code")
	private String openApiInstructedAmountCurrencyCode;

	/**
	 * 业务参考号，必填
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 付款目的，收款币种为 KRW、TWD、MYR时必填，如：返佣服务费
	 */
	@ApiField("payment_purpose")
	private String paymentPurpose;

	/**
	 * 非空，使用该字段区分报销、采购等业务，bizCode
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 来源，一般为系统名称
	 */
	@ApiField("source")
	private String source;

	/**
	 * 租户id，必传
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	/**
	 * 贷/借；CREDIT/DEBIT
	 */
	@ApiField("trans_direction")
	private String transDirection;

	/**
	 * 中转行-swiftcode；境外可传
	 */
	@ApiField("transmitting_bank")
	private String transmittingBank;

	/**
	 * 附言
	 */
	@ApiField("unstructured")
	private String unstructured;

	public String getActiveOrPassive() {
		return this.activeOrPassive;
	}
	public void setActiveOrPassive(String activeOrPassive) {
		this.activeOrPassive = activeOrPassive;
	}

	public String getBankCode() {
		return this.bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getBranchCode() {
		return this.branchCode;
	}
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public String getChargeBearer() {
		return this.chargeBearer;
	}
	public void setChargeBearer(String chargeBearer) {
		this.chargeBearer = chargeBearer;
	}

	public String getCreator() {
		return this.creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getCreditorAccountInnerType() {
		return this.creditorAccountInnerType;
	}
	public void setCreditorAccountInnerType(String creditorAccountInnerType) {
		this.creditorAccountInnerType = creditorAccountInnerType;
	}

	public String getCreditorAccountName() {
		return this.creditorAccountName;
	}
	public void setCreditorAccountName(String creditorAccountName) {
		this.creditorAccountName = creditorAccountName;
	}

	public String getCreditorAccountNo() {
		return this.creditorAccountNo;
	}
	public void setCreditorAccountNo(String creditorAccountNo) {
		this.creditorAccountNo = creditorAccountNo;
	}

	public String getCreditorAddress() {
		return this.creditorAddress;
	}
	public void setCreditorAddress(String creditorAddress) {
		this.creditorAddress = creditorAddress;
	}

	public String getCreditorBic() {
		return this.creditorBic;
	}
	public void setCreditorBic(String creditorBic) {
		this.creditorBic = creditorBic;
	}

	public String getCreditorContactEmail() {
		return this.creditorContactEmail;
	}
	public void setCreditorContactEmail(String creditorContactEmail) {
		this.creditorContactEmail = creditorContactEmail;
	}

	public String getCreditorContactName() {
		return this.creditorContactName;
	}
	public void setCreditorContactName(String creditorContactName) {
		this.creditorContactName = creditorContactName;
	}

	public String getCreditorContactPhoneNumber() {
		return this.creditorContactPhoneNumber;
	}
	public void setCreditorContactPhoneNumber(String creditorContactPhoneNumber) {
		this.creditorContactPhoneNumber = creditorContactPhoneNumber;
	}

	public String getCreditorCountry() {
		return this.creditorCountry;
	}
	public void setCreditorCountry(String creditorCountry) {
		this.creditorCountry = creditorCountry;
	}

	public String getCreditorCurrency() {
		return this.creditorCurrency;
	}
	public void setCreditorCurrency(String creditorCurrency) {
		this.creditorCurrency = creditorCurrency;
	}

	public String getCreditorFinInstId() {
		return this.creditorFinInstId;
	}
	public void setCreditorFinInstId(String creditorFinInstId) {
		this.creditorFinInstId = creditorFinInstId;
	}

	public String getCreditorIban() {
		return this.creditorIban;
	}
	public void setCreditorIban(String creditorIban) {
		this.creditorIban = creditorIban;
	}

	public String getCreditorInstAbbr() {
		return this.creditorInstAbbr;
	}
	public void setCreditorInstAbbr(String creditorInstAbbr) {
		this.creditorInstAbbr = creditorInstAbbr;
	}

	public String getCreditorInstCountryCode() {
		return this.creditorInstCountryCode;
	}
	public void setCreditorInstCountryCode(String creditorInstCountryCode) {
		this.creditorInstCountryCode = creditorInstCountryCode;
	}

	public String getCreditorInstName() {
		return this.creditorInstName;
	}
	public void setCreditorInstName(String creditorInstName) {
		this.creditorInstName = creditorInstName;
	}

	public String getCreditorPostCode() {
		return this.creditorPostCode;
	}
	public void setCreditorPostCode(String creditorPostCode) {
		this.creditorPostCode = creditorPostCode;
	}

	public String getCreditorTownName() {
		return this.creditorTownName;
	}
	public void setCreditorTownName(String creditorTownName) {
		this.creditorTownName = creditorTownName;
	}

	public String getCreditorType() {
		return this.creditorType;
	}
	public void setCreditorType(String creditorType) {
		this.creditorType = creditorType;
	}

	public String getDebtorFinInstId() {
		return this.debtorFinInstId;
	}
	public void setDebtorFinInstId(String debtorFinInstId) {
		this.debtorFinInstId = debtorFinInstId;
	}

	public String getEventCode() {
		return this.eventCode;
	}
	public void setEventCode(String eventCode) {
		this.eventCode = eventCode;
	}

	public Date getExpectPaymentDate() {
		return this.expectPaymentDate;
	}
	public void setExpectPaymentDate(Date expectPaymentDate) {
		this.expectPaymentDate = expectPaymentDate;
	}

	public String getOpenApiBopTransactionCode() {
		return this.openApiBopTransactionCode;
	}
	public void setOpenApiBopTransactionCode(String openApiBopTransactionCode) {
		this.openApiBopTransactionCode = openApiBopTransactionCode;
	}

	public String getOpenApiBopTransactionCodeRemark() {
		return this.openApiBopTransactionCodeRemark;
	}
	public void setOpenApiBopTransactionCodeRemark(String openApiBopTransactionCodeRemark) {
		this.openApiBopTransactionCodeRemark = openApiBopTransactionCodeRemark;
	}

	public String getOpenApiInstructedAmount() {
		return this.openApiInstructedAmount;
	}
	public void setOpenApiInstructedAmount(String openApiInstructedAmount) {
		this.openApiInstructedAmount = openApiInstructedAmount;
	}

	public String getOpenApiInstructedAmountCurrencyCode() {
		return this.openApiInstructedAmountCurrencyCode;
	}
	public void setOpenApiInstructedAmountCurrencyCode(String openApiInstructedAmountCurrencyCode) {
		this.openApiInstructedAmountCurrencyCode = openApiInstructedAmountCurrencyCode;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPaymentPurpose() {
		return this.paymentPurpose;
	}
	public void setPaymentPurpose(String paymentPurpose) {
		this.paymentPurpose = paymentPurpose;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

	public String getTransDirection() {
		return this.transDirection;
	}
	public void setTransDirection(String transDirection) {
		this.transDirection = transDirection;
	}

	public String getTransmittingBank() {
		return this.transmittingBank;
	}
	public void setTransmittingBank(String transmittingBank) {
		this.transmittingBank = transmittingBank;
	}

	public String getUnstructured() {
		return this.unstructured;
	}
	public void setUnstructured(String unstructured) {
		this.unstructured = unstructured;
	}

}
