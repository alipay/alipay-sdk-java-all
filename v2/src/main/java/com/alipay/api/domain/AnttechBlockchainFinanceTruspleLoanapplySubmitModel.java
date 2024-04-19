package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 贸易金融支取申请
 *
 * @author auto create
 * @since 1.0, 2022-10-10 13:48:50
 */
public class AnttechBlockchainFinanceTruspleLoanapplySubmitModel extends AlipayObject {

	private static final long serialVersionUID = 4118479261461591579L;

	/**
	 * 实控人信息
	 */
	@ApiListField("actual_controllers")
	@ApiField("beneficial_entity")
	private List<BeneficialEntity> actualControllers;

	/**
	 * 资料附件列表
	 */
	@ApiListField("attachments")
	@ApiField("fin_attachment")
	private List<FinAttachment> attachments;

	/**
	 * 受益人信息
	 */
	@ApiListField("beneficiaries")
	@ApiField("beneficial_entity")
	private List<BeneficialEntity> beneficiaries;

	/**
	 * 借款人类型,COMPANY 企业对公贷款
LEGAL_PERSON 法人个人贷款
	 */
	@ApiField("borrower_type")
	private String borrowerType;

	/**
	 * 外部合作伙伴的授信申请编号
	 */
	@ApiField("external_credit_grant_id")
	private String externalCreditGrantId;

	/**
	 * 外部合作伙伴的贷款合同编号
	 */
	@ApiField("external_loan_id")
	private String externalLoanId;

	/**
	 * 外部合作伙伴的支用申请号
	 */
	@ApiField("external_loan_request_id")
	private String externalLoanRequestId;

	/**
	 * 外部产品码
	 */
	@ApiField("external_product_code")
	private String externalProductCode;

	/**
	 * 外部用户唯一标识
	 */
	@ApiField("external_user_id")
	private String externalUserId;

	/**
	 * 机构代码
	 */
	@ApiField("inst_code")
	private String instCode;

	/**
	 * 贷款利率,精确到小数点后6位，如0.001585表示0.1585%
	 */
	@ApiField("interest_rate")
	private String interestRate;

	/**
	 * 贷款金额，币种最小单位，如果是CNY，则单位分
	 */
	@ApiField("loan_amount")
	private Long loanAmount;

	/**
	 * 贷款金额币种
	 */
	@ApiField("loan_amount_currency")
	private String loanAmountCurrency;

	/**
	 * 支付账号类型:ALIPAY  支付宝,OUT_BANK  银行
	 */
	@ApiField("loan_payment_account_type")
	private String loanPaymentAccountType;

	/**
	 * 支付方式:自主支付,受托支付（定向支付）
	 */
	@ApiField("loan_payment_method")
	private String loanPaymentMethod;

	/**
	 * 贷款用途
	 */
	@ApiField("loan_purpose")
	private String loanPurpose;

	/**
	 * 额度类型：CREDIT - 信用，ORDER - 订单，MORTGAGE - 抵押
	 */
	@ApiField("loan_quota_type")
	private String loanQuotaType;

	/**
	 * 贷款期限,分期的期数,一次性到期还本付息则传1
	 */
	@ApiField("loan_term")
	private Long loanTerm;

	/**
	 * 贷款期限单位
	 */
	@ApiField("loan_term_unit")
	private String loanTermUnit;

	/**
	 * 罚息利率,精确到小数点后6位，如0.004585表示0.4585%
	 */
	@ApiField("penalty_rate")
	private String penaltyRate;

	/**
	 * 利率单位,ANNUAL 年化利率,DAILY 日利率
	 */
	@ApiField("rate_unit")
	private String rateUnit;

	/**
	 * 收款账户信息
	 */
	@ApiField("receive_account")
	private BankAccount receiveAccount;

	/**
	 * 固定还款日
	 */
	@ApiField("regular_repay_day")
	private Long regularRepayDay;

	/**
	 * 还款日类型,FIXED_MONTH_INTERVAL 放款日对月对日
,FIXED_DATE 固定还款日
	 */
	@ApiField("repay_day_type")
	private String repayDayType;

	/**
	 * 还款方式,REPAY_OUTRIGHT 到期一次性还本付息
BALLOON_MORTGAGE  按期付息，到期还本
	 */
	@ApiField("repay_mode")
	private String repayMode;

	/**
	 * 订单贷贸易信息
	 */
	@ApiField("trade_info")
	private TradeInformation tradeInfo;

	public List<BeneficialEntity> getActualControllers() {
		return this.actualControllers;
	}
	public void setActualControllers(List<BeneficialEntity> actualControllers) {
		this.actualControllers = actualControllers;
	}

	public List<FinAttachment> getAttachments() {
		return this.attachments;
	}
	public void setAttachments(List<FinAttachment> attachments) {
		this.attachments = attachments;
	}

	public List<BeneficialEntity> getBeneficiaries() {
		return this.beneficiaries;
	}
	public void setBeneficiaries(List<BeneficialEntity> beneficiaries) {
		this.beneficiaries = beneficiaries;
	}

	public String getBorrowerType() {
		return this.borrowerType;
	}
	public void setBorrowerType(String borrowerType) {
		this.borrowerType = borrowerType;
	}

	public String getExternalCreditGrantId() {
		return this.externalCreditGrantId;
	}
	public void setExternalCreditGrantId(String externalCreditGrantId) {
		this.externalCreditGrantId = externalCreditGrantId;
	}

	public String getExternalLoanId() {
		return this.externalLoanId;
	}
	public void setExternalLoanId(String externalLoanId) {
		this.externalLoanId = externalLoanId;
	}

	public String getExternalLoanRequestId() {
		return this.externalLoanRequestId;
	}
	public void setExternalLoanRequestId(String externalLoanRequestId) {
		this.externalLoanRequestId = externalLoanRequestId;
	}

	public String getExternalProductCode() {
		return this.externalProductCode;
	}
	public void setExternalProductCode(String externalProductCode) {
		this.externalProductCode = externalProductCode;
	}

	public String getExternalUserId() {
		return this.externalUserId;
	}
	public void setExternalUserId(String externalUserId) {
		this.externalUserId = externalUserId;
	}

	public String getInstCode() {
		return this.instCode;
	}
	public void setInstCode(String instCode) {
		this.instCode = instCode;
	}

	public String getInterestRate() {
		return this.interestRate;
	}
	public void setInterestRate(String interestRate) {
		this.interestRate = interestRate;
	}

	public Long getLoanAmount() {
		return this.loanAmount;
	}
	public void setLoanAmount(Long loanAmount) {
		this.loanAmount = loanAmount;
	}

	public String getLoanAmountCurrency() {
		return this.loanAmountCurrency;
	}
	public void setLoanAmountCurrency(String loanAmountCurrency) {
		this.loanAmountCurrency = loanAmountCurrency;
	}

	public String getLoanPaymentAccountType() {
		return this.loanPaymentAccountType;
	}
	public void setLoanPaymentAccountType(String loanPaymentAccountType) {
		this.loanPaymentAccountType = loanPaymentAccountType;
	}

	public String getLoanPaymentMethod() {
		return this.loanPaymentMethod;
	}
	public void setLoanPaymentMethod(String loanPaymentMethod) {
		this.loanPaymentMethod = loanPaymentMethod;
	}

	public String getLoanPurpose() {
		return this.loanPurpose;
	}
	public void setLoanPurpose(String loanPurpose) {
		this.loanPurpose = loanPurpose;
	}

	public String getLoanQuotaType() {
		return this.loanQuotaType;
	}
	public void setLoanQuotaType(String loanQuotaType) {
		this.loanQuotaType = loanQuotaType;
	}

	public Long getLoanTerm() {
		return this.loanTerm;
	}
	public void setLoanTerm(Long loanTerm) {
		this.loanTerm = loanTerm;
	}

	public String getLoanTermUnit() {
		return this.loanTermUnit;
	}
	public void setLoanTermUnit(String loanTermUnit) {
		this.loanTermUnit = loanTermUnit;
	}

	public String getPenaltyRate() {
		return this.penaltyRate;
	}
	public void setPenaltyRate(String penaltyRate) {
		this.penaltyRate = penaltyRate;
	}

	public String getRateUnit() {
		return this.rateUnit;
	}
	public void setRateUnit(String rateUnit) {
		this.rateUnit = rateUnit;
	}

	public BankAccount getReceiveAccount() {
		return this.receiveAccount;
	}
	public void setReceiveAccount(BankAccount receiveAccount) {
		this.receiveAccount = receiveAccount;
	}

	public Long getRegularRepayDay() {
		return this.regularRepayDay;
	}
	public void setRegularRepayDay(Long regularRepayDay) {
		this.regularRepayDay = regularRepayDay;
	}

	public String getRepayDayType() {
		return this.repayDayType;
	}
	public void setRepayDayType(String repayDayType) {
		this.repayDayType = repayDayType;
	}

	public String getRepayMode() {
		return this.repayMode;
	}
	public void setRepayMode(String repayMode) {
		this.repayMode = repayMode;
	}

	public TradeInformation getTradeInfo() {
		return this.tradeInfo;
	}
	public void setTradeInfo(TradeInformation tradeInfo) {
		this.tradeInfo = tradeInfo;
	}

}
