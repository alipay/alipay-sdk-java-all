package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取扫码付动态二维码信息
 *
 * @author auto create
 * @since 1.0, 2019-09-23 15:40:16
 */
public class MybankCreditLoanapplyQrcodeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7287553825827797629L;

	/**
	 * 银行账户的类型，1 : 对私账户 2：对公账户
	 */
	@ApiField("bank_card_category")
	private String bankCardCategory;

	/**
	 * 收款账户的银行卡卡号
	 */
	@ApiField("beneficiary_account")
	private String beneficiaryAccount;

	/**
	 * 银行账户的名称
	 */
	@ApiField("beneficiary_name")
	private String beneficiaryName;

	/**
	 * 支行名称
	 */
	@ApiField("deposit_bank")
	private String depositBank;

	/**
	 * 开户行的联行号
	 */
	@ApiField("deposit_bank_cnaps_code")
	private String depositBankCnapsCode;

	/**
	 * 总行联行号
	 */
	@ApiField("head_bank_cnaps_code")
	private String headBankCnapsCode;

	/**
	 * 二维码失效的时间
	 */
	@ApiField("invalid_date")
	private String invalidDate;

	/**
	 * 订单金额字符串，必须为整数（单位：元）
	 */
	@ApiField("order_amt")
	private String orderAmt;

	/**
	 * 调用方生成的订单编号
	 */
	@ApiField("order_no")
	private String orderNo;

	public String getBankCardCategory() {
		return this.bankCardCategory;
	}
	public void setBankCardCategory(String bankCardCategory) {
		this.bankCardCategory = bankCardCategory;
	}

	public String getBeneficiaryAccount() {
		return this.beneficiaryAccount;
	}
	public void setBeneficiaryAccount(String beneficiaryAccount) {
		this.beneficiaryAccount = beneficiaryAccount;
	}

	public String getBeneficiaryName() {
		return this.beneficiaryName;
	}
	public void setBeneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
	}

	public String getDepositBank() {
		return this.depositBank;
	}
	public void setDepositBank(String depositBank) {
		this.depositBank = depositBank;
	}

	public String getDepositBankCnapsCode() {
		return this.depositBankCnapsCode;
	}
	public void setDepositBankCnapsCode(String depositBankCnapsCode) {
		this.depositBankCnapsCode = depositBankCnapsCode;
	}

	public String getHeadBankCnapsCode() {
		return this.headBankCnapsCode;
	}
	public void setHeadBankCnapsCode(String headBankCnapsCode) {
		this.headBankCnapsCode = headBankCnapsCode;
	}

	public String getInvalidDate() {
		return this.invalidDate;
	}
	public void setInvalidDate(String invalidDate) {
		this.invalidDate = invalidDate;
	}

	public String getOrderAmt() {
		return this.orderAmt;
	}
	public void setOrderAmt(String orderAmt) {
		this.orderAmt = orderAmt;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

}
