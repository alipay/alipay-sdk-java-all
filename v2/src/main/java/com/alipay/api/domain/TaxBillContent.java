package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 增值税发票数据结构
 *
 * @author auto create
 * @since 1.0, 2019-09-05 10:17:52
 */
public class TaxBillContent extends AlipayObject {

	private static final long serialVersionUID = 8491178316684945318L;

	/**
	 * 校验码
	 */
	@ApiField("anti_fake_code")
	private String antiFakeCode;

	/**
	 * 复审
	 */
	@ApiField("checker")
	private String checker;

	/**
	 * 开票人
	 */
	@ApiField("clerk")
	private String clerk;

	/**
	 * 总金额
	 */
	@ApiField("einv_amount")
	private String einvAmount;

	/**
	 * 发票代码
	 */
	@ApiField("einv_code")
	private String einvCode;

	/**
	 * 开票日期
	 */
	@ApiField("einv_date")
	private String einvDate;

	/**
	 * 发票号码
	 */
	@ApiField("einv_no")
	private String einvNo;

	/**
	 * 收款人
	 */
	@ApiField("payee")
	private String payee;

	/**
	 * 卖方地址、电话
	 */
	@ApiField("payee_address")
	private String payeeAddress;

	/**
	 * 卖方开户行
	 */
	@ApiField("payee_bank_name")
	private String payeeBankName;

	/**
	 * 卖方名称
	 */
	@ApiField("payee_name")
	private String payeeName;

	/**
	 * 卖方纳税人识别号
	 */
	@ApiField("payee_register_no")
	private String payeeRegisterNo;

	/**
	 * 买方地址、电话
	 */
	@ApiField("payer_address")
	private String payerAddress;

	/**
	 * 买方开户行
	 */
	@ApiField("payer_bank_name")
	private String payerBankName;

	/**
	 * 买方名称
	 */
	@ApiField("payer_name")
	private String payerName;

	/**
	 * 买方纳税人识别号
	 */
	@ApiField("payer_register_no")
	private String payerRegisterNo;

	/**
	 * 价税合计（大写）
	 */
	@ApiField("sum_amount")
	private String sumAmount;

	/**
	 * 税额
	 */
	@ApiField("tax_amount")
	private String taxAmount;

	/**
	 * 不含税金额
	 */
	@ApiField("without_tax_amount")
	private String withoutTaxAmount;

	public String getAntiFakeCode() {
		return this.antiFakeCode;
	}
	public void setAntiFakeCode(String antiFakeCode) {
		this.antiFakeCode = antiFakeCode;
	}

	public String getChecker() {
		return this.checker;
	}
	public void setChecker(String checker) {
		this.checker = checker;
	}

	public String getClerk() {
		return this.clerk;
	}
	public void setClerk(String clerk) {
		this.clerk = clerk;
	}

	public String getEinvAmount() {
		return this.einvAmount;
	}
	public void setEinvAmount(String einvAmount) {
		this.einvAmount = einvAmount;
	}

	public String getEinvCode() {
		return this.einvCode;
	}
	public void setEinvCode(String einvCode) {
		this.einvCode = einvCode;
	}

	public String getEinvDate() {
		return this.einvDate;
	}
	public void setEinvDate(String einvDate) {
		this.einvDate = einvDate;
	}

	public String getEinvNo() {
		return this.einvNo;
	}
	public void setEinvNo(String einvNo) {
		this.einvNo = einvNo;
	}

	public String getPayee() {
		return this.payee;
	}
	public void setPayee(String payee) {
		this.payee = payee;
	}

	public String getPayeeAddress() {
		return this.payeeAddress;
	}
	public void setPayeeAddress(String payeeAddress) {
		this.payeeAddress = payeeAddress;
	}

	public String getPayeeBankName() {
		return this.payeeBankName;
	}
	public void setPayeeBankName(String payeeBankName) {
		this.payeeBankName = payeeBankName;
	}

	public String getPayeeName() {
		return this.payeeName;
	}
	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}

	public String getPayeeRegisterNo() {
		return this.payeeRegisterNo;
	}
	public void setPayeeRegisterNo(String payeeRegisterNo) {
		this.payeeRegisterNo = payeeRegisterNo;
	}

	public String getPayerAddress() {
		return this.payerAddress;
	}
	public void setPayerAddress(String payerAddress) {
		this.payerAddress = payerAddress;
	}

	public String getPayerBankName() {
		return this.payerBankName;
	}
	public void setPayerBankName(String payerBankName) {
		this.payerBankName = payerBankName;
	}

	public String getPayerName() {
		return this.payerName;
	}
	public void setPayerName(String payerName) {
		this.payerName = payerName;
	}

	public String getPayerRegisterNo() {
		return this.payerRegisterNo;
	}
	public void setPayerRegisterNo(String payerRegisterNo) {
		this.payerRegisterNo = payerRegisterNo;
	}

	public String getSumAmount() {
		return this.sumAmount;
	}
	public void setSumAmount(String sumAmount) {
		this.sumAmount = sumAmount;
	}

	public String getTaxAmount() {
		return this.taxAmount;
	}
	public void setTaxAmount(String taxAmount) {
		this.taxAmount = taxAmount;
	}

	public String getWithoutTaxAmount() {
		return this.withoutTaxAmount;
	}
	public void setWithoutTaxAmount(String withoutTaxAmount) {
		this.withoutTaxAmount = withoutTaxAmount;
	}

}
