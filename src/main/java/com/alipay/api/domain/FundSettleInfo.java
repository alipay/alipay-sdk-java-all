package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 次卡资金结算信息
 *
 * @author auto create
 * @since 1.0, 2022-05-17 19:53:24
 */
public class FundSettleInfo extends AlipayObject {

	private static final long serialVersionUID = 6297559636553429247L;

	/**
	 * 银行卡id
	 */
	@ApiField("bank_code")
	private String bankCode;

	/**
	 * 计算方式
	 */
	@ApiField("cacl_type")
	private String caclType;

	/**
	 * 结算方式
	 */
	@ApiField("clearing_model")
	private String clearingModel;

	/**
	 * 三方银行：THIRD_BANK
网商：ANTBANK
	 */
	@ApiField("fund_type")
	private String fundType;

	/**
	 * 三方银行：third_bank
网商：mybank
	 */
	@ApiField("sign_principal")
	private String signPrincipal;

	public String getBankCode() {
		return this.bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getCaclType() {
		return this.caclType;
	}
	public void setCaclType(String caclType) {
		this.caclType = caclType;
	}

	public String getClearingModel() {
		return this.clearingModel;
	}
	public void setClearingModel(String clearingModel) {
		this.clearingModel = clearingModel;
	}

	public String getFundType() {
		return this.fundType;
	}
	public void setFundType(String fundType) {
		this.fundType = fundType;
	}

	public String getSignPrincipal() {
		return this.signPrincipal;
	}
	public void setSignPrincipal(String signPrincipal) {
		this.signPrincipal = signPrincipal;
	}

}
