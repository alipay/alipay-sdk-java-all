package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁融资扩展信息
 *
 * @author auto create
 * @since 1.0, 2025-04-18 17:40:56
 */
public class RentFinancingExtInfo extends AlipayObject {

	private static final long serialVersionUID = 3562398752721492465L;

	/**
	 * 收款银行卡账户
	 */
	@ApiField("beneficiary_account_number")
	private String beneficiaryAccountNumber;

	/**
	 * 收款支行名称
	 */
	@ApiField("beneficiary_bank_name")
	private String beneficiaryBankName;

	/**
	 * 收款户名
	 */
	@ApiField("beneficiary_name")
	private String beneficiaryName;

	/**
	 * 买断金融资金额，单位：元
	 */
	@ApiField("buyout_financing_amount")
	private String buyoutFinancingAmount;

	/**
	 * 买断金还款方式
	 */
	@ApiField("buyout_repayment_type")
	private String buyoutRepaymentType;

	/**
	 * 需要融资的金额，币种：人民币
	 */
	@ApiField("financing_amount")
	private String financingAmount;

	/**
	 * 融资期数
	 */
	@ApiField("financing_period")
	private RentPeriod financingPeriod;

	/**
	 * 融资的利率(年化利率)，例如年化利率0.2%，字段值设置时为：0.2
	 */
	@ApiField("financing_rate")
	private String financingRate;

	/**
	 * 融资租赁协议，例如：张三爱租机租赁协议
	 */
	@ApiField("financing_rent_protocol")
	private RentFile financingRentProtocol;

	/**
	 * 融资人的ID，取值：为支付宝的PID
	 */
	@ApiField("fundraiser_id")
	private String fundraiserId;

	/**
	 * 融资人的名称，一般为融资公司的名称
	 */
	@ApiField("fundraiser_name")
	private String fundraiserName;

	/**
	 * 融资人的OpenId，取值参考：openApi开发网关接入文档
	 */
	@ApiField("fundraiser_open_id")
	private String fundraiserOpenId;

	/**
	 * 资方的支付宝PID，取值：请联系资方获取
	 */
	@ApiField("invest_id")
	private String investId;

	/**
	 * 资方的支付宝PID，取值：请联系资方获取
	 */
	@ApiField("invest_open_id")
	private String investOpenId;

	/**
	 * 融资人收款账户，取值：企业支付宝的账号PID
	 */
	@ApiField("payee_account")
	private String payeeAccount;

	/**
	 * 融资人收款账户openId，取值参考：openApi开发网关接入文档
	 */
	@ApiField("payee_account_open_id")
	private String payeeAccountOpenId;

	/**
	 * 收款备注说明，示例：融资放款
	 */
	@ApiField("payee_memo")
	private String payeeMemo;

	/**
	 * 租金融资金额，单位：元
	 */
	@ApiField("rent_financing_amount")
	private String rentFinancingAmount;

	/**
	 * 租金还款的方式，例如：等额本息/等额本差
	 */
	@ApiField("repayment_type")
	private String repaymentType;

	public String getBeneficiaryAccountNumber() {
		return this.beneficiaryAccountNumber;
	}
	public void setBeneficiaryAccountNumber(String beneficiaryAccountNumber) {
		this.beneficiaryAccountNumber = beneficiaryAccountNumber;
	}

	public String getBeneficiaryBankName() {
		return this.beneficiaryBankName;
	}
	public void setBeneficiaryBankName(String beneficiaryBankName) {
		this.beneficiaryBankName = beneficiaryBankName;
	}

	public String getBeneficiaryName() {
		return this.beneficiaryName;
	}
	public void setBeneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
	}

	public String getBuyoutFinancingAmount() {
		return this.buyoutFinancingAmount;
	}
	public void setBuyoutFinancingAmount(String buyoutFinancingAmount) {
		this.buyoutFinancingAmount = buyoutFinancingAmount;
	}

	public String getBuyoutRepaymentType() {
		return this.buyoutRepaymentType;
	}
	public void setBuyoutRepaymentType(String buyoutRepaymentType) {
		this.buyoutRepaymentType = buyoutRepaymentType;
	}

	public String getFinancingAmount() {
		return this.financingAmount;
	}
	public void setFinancingAmount(String financingAmount) {
		this.financingAmount = financingAmount;
	}

	public RentPeriod getFinancingPeriod() {
		return this.financingPeriod;
	}
	public void setFinancingPeriod(RentPeriod financingPeriod) {
		this.financingPeriod = financingPeriod;
	}

	public String getFinancingRate() {
		return this.financingRate;
	}
	public void setFinancingRate(String financingRate) {
		this.financingRate = financingRate;
	}

	public RentFile getFinancingRentProtocol() {
		return this.financingRentProtocol;
	}
	public void setFinancingRentProtocol(RentFile financingRentProtocol) {
		this.financingRentProtocol = financingRentProtocol;
	}

	public String getFundraiserId() {
		return this.fundraiserId;
	}
	public void setFundraiserId(String fundraiserId) {
		this.fundraiserId = fundraiserId;
	}

	public String getFundraiserName() {
		return this.fundraiserName;
	}
	public void setFundraiserName(String fundraiserName) {
		this.fundraiserName = fundraiserName;
	}

	public String getFundraiserOpenId() {
		return this.fundraiserOpenId;
	}
	public void setFundraiserOpenId(String fundraiserOpenId) {
		this.fundraiserOpenId = fundraiserOpenId;
	}

	public String getInvestId() {
		return this.investId;
	}
	public void setInvestId(String investId) {
		this.investId = investId;
	}

	public String getInvestOpenId() {
		return this.investOpenId;
	}
	public void setInvestOpenId(String investOpenId) {
		this.investOpenId = investOpenId;
	}

	public String getPayeeAccount() {
		return this.payeeAccount;
	}
	public void setPayeeAccount(String payeeAccount) {
		this.payeeAccount = payeeAccount;
	}

	public String getPayeeAccountOpenId() {
		return this.payeeAccountOpenId;
	}
	public void setPayeeAccountOpenId(String payeeAccountOpenId) {
		this.payeeAccountOpenId = payeeAccountOpenId;
	}

	public String getPayeeMemo() {
		return this.payeeMemo;
	}
	public void setPayeeMemo(String payeeMemo) {
		this.payeeMemo = payeeMemo;
	}

	public String getRentFinancingAmount() {
		return this.rentFinancingAmount;
	}
	public void setRentFinancingAmount(String rentFinancingAmount) {
		this.rentFinancingAmount = rentFinancingAmount;
	}

	public String getRepaymentType() {
		return this.repaymentType;
	}
	public void setRepaymentType(String repaymentType) {
		this.repaymentType = repaymentType;
	}

}
