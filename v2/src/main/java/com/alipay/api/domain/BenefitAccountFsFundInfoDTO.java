package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益账户资金明细
 *
 * @author auto create
 * @since 1.0, 2025-08-29 11:05:36
 */
public class BenefitAccountFsFundInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 6165228147273148374L;

	/**
	 * 账户查询时为出资金额；提现时为该出资方提现金额；单位：元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 可核销金额，提现时不需要传，单位：元
	 */
	@ApiField("current_amount")
	private String currentAmount;

	/**
	 * 出资主体
	 */
	@ApiField("fund_principal")
	private String fundPrincipal;

	/**
	 * 商户出资
	 */
	@ApiField("fund_provider")
	private String fundProvider;

	/**
	 * 出资资金类型，目前仅支持BALANCE
	 */
	@ApiField("fund_type")
	private String fundType;

	/**
	 * 出资方的用户ID
	 */
	@ApiField("fund_user_id")
	private String fundUserId;

	/**
	 * 还款账号信息
	 */
	@ApiField("repay_bank_info")
	private BenefitAccountRepayBankInfoDTO repayBankInfo;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getCurrentAmount() {
		return this.currentAmount;
	}
	public void setCurrentAmount(String currentAmount) {
		this.currentAmount = currentAmount;
	}

	public String getFundPrincipal() {
		return this.fundPrincipal;
	}
	public void setFundPrincipal(String fundPrincipal) {
		this.fundPrincipal = fundPrincipal;
	}

	public String getFundProvider() {
		return this.fundProvider;
	}
	public void setFundProvider(String fundProvider) {
		this.fundProvider = fundProvider;
	}

	public String getFundType() {
		return this.fundType;
	}
	public void setFundType(String fundType) {
		this.fundType = fundType;
	}

	public String getFundUserId() {
		return this.fundUserId;
	}
	public void setFundUserId(String fundUserId) {
		this.fundUserId = fundUserId;
	}

	public BenefitAccountRepayBankInfoDTO getRepayBankInfo() {
		return this.repayBankInfo;
	}
	public void setRepayBankInfo(BenefitAccountRepayBankInfoDTO repayBankInfo) {
		this.repayBankInfo = repayBankInfo;
	}

}
