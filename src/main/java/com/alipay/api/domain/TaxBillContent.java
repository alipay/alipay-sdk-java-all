package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 增值税发票数据结构
 *
 * @author auto create
 * @since 1.0, 2019-01-25 17:14:39
 */
public class TaxBillContent extends AlipayObject {

	private static final long serialVersionUID = 2514962396938698384L;

	/**
	 * 校验码
	 */
	@ApiField("anti_fake_code")
	private String antiFakeCode;

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
