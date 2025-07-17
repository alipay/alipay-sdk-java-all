package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账务信息
 *
 * @author auto create
 * @since 1.0, 2024-12-02 11:04:53
 */
public class AccountInfoOpenApiOrder extends AlipayObject {

	private static final long serialVersionUID = 1575479224257888795L;

	/**
	 * 科目段编码
	 */
	@ApiField("account_code")
	private String accountCode;

	/**
	 * 科目段描述
	 */
	@ApiField("account_desc")
	private String accountDesc;

	/**
	 * 入帐日期，格式yyyyMMdd
	 */
	@ApiField("accounting_date")
	private String accountingDate;

	/**
	 * 会计期间,格式yyyyMM
	 */
	@ApiField("accounting_month")
	private String accountingMonth;

	/**
	 * 借贷类型编码
	 */
	@ApiField("accounting_type_code")
	private String accountingTypeCode;

	/**
	 * 原币发生额，单位为分
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 本位币发生额，单位为分
	 */
	@ApiField("amount_beq")
	private String amountBeq;

	/**
	 * 预算部门段编码
	 */
	@ApiField("budget_dept_code")
	private String budgetDeptCode;

	/**
	 * 预算部门段描述
	 */
	@ApiField("budget_dept_desc")
	private String budgetDeptDesc;

	/**
	 * 公司段
	 */
	@ApiField("company_code")
	private String companyCode;

	/**
	 * 公司段描述
	 */
	@ApiField("company_desc")
	private String companyDesc;

	/**
	 * 成本中心段编码
	 */
	@ApiField("cost_center_code")
	private String costCenterCode;

	/**
	 * 成本中心段描述
	 */
	@ApiField("cost_center_desc")
	private String costCenterDesc;

	/**
	 * 原币币种
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 本位币币种
	 */
	@ApiField("currency_beq")
	private String currencyBeq;

	/**
	 * 明细段编码
	 */
	@ApiField("detail_code")
	private String detailCode;

	/**
	 * 明细段描述
	 */
	@ApiField("detail_desc")
	private String detailDesc;

	/**
	 * 行业段编码
	 */
	@ApiField("industry_code")
	private String industryCode;

	/**
	 * 行业段描述
	 */
	@ApiField("industry_desc")
	private String industryDesc;

	/**
	 * 往来段编码
	 */
	@ApiField("inter_company_code")
	private String interCompanyCode;

	/**
	 * 往来段描述
	 */
	@ApiField("inter_company_desc")
	private String interCompanyDesc;

	/**
	 * 日记账行说明
	 */
	@ApiField("je_line_desc")
	private String jeLineDesc;

	/**
	 * 产品段编码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 产品段描述
	 */
	@ApiField("product_desc")
	private String productDesc;

	/**
	 * 项目段编码
	 */
	@ApiField("project_code")
	private String projectCode;

	/**
	 * 项目段描述
	 */
	@ApiField("project_desc")
	private String projectDesc;

	/**
	 * 区域段编码
	 */
	@ApiField("region_code")
	private String regionCode;

	/**
	 * 区域段描述
	 */
	@ApiField("region_desc")
	private String regionDesc;

	/**
	 * 备用段1
	 */
	@ApiField("spare_code_1")
	private String spareCode1;

	/**
	 * 备用段2编码
	 */
	@ApiField("spare_code_2")
	private String spareCode2;

	/**
	 * 备用段1描述
	 */
	@ApiField("spare_desc_1")
	private String spareDesc1;

	/**
	 * 备用段2描述
	 */
	@ApiField("spare_desc_2")
	private String spareDesc2;

	/**
	 * 凭证号
	 */
	@ApiField("voucher_no")
	private String voucherNo;

	public String getAccountCode() {
		return this.accountCode;
	}
	public void setAccountCode(String accountCode) {
		this.accountCode = accountCode;
	}

	public String getAccountDesc() {
		return this.accountDesc;
	}
	public void setAccountDesc(String accountDesc) {
		this.accountDesc = accountDesc;
	}

	public String getAccountingDate() {
		return this.accountingDate;
	}
	public void setAccountingDate(String accountingDate) {
		this.accountingDate = accountingDate;
	}

	public String getAccountingMonth() {
		return this.accountingMonth;
	}
	public void setAccountingMonth(String accountingMonth) {
		this.accountingMonth = accountingMonth;
	}

	public String getAccountingTypeCode() {
		return this.accountingTypeCode;
	}
	public void setAccountingTypeCode(String accountingTypeCode) {
		this.accountingTypeCode = accountingTypeCode;
	}

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getAmountBeq() {
		return this.amountBeq;
	}
	public void setAmountBeq(String amountBeq) {
		this.amountBeq = amountBeq;
	}

	public String getBudgetDeptCode() {
		return this.budgetDeptCode;
	}
	public void setBudgetDeptCode(String budgetDeptCode) {
		this.budgetDeptCode = budgetDeptCode;
	}

	public String getBudgetDeptDesc() {
		return this.budgetDeptDesc;
	}
	public void setBudgetDeptDesc(String budgetDeptDesc) {
		this.budgetDeptDesc = budgetDeptDesc;
	}

	public String getCompanyCode() {
		return this.companyCode;
	}
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getCompanyDesc() {
		return this.companyDesc;
	}
	public void setCompanyDesc(String companyDesc) {
		this.companyDesc = companyDesc;
	}

	public String getCostCenterCode() {
		return this.costCenterCode;
	}
	public void setCostCenterCode(String costCenterCode) {
		this.costCenterCode = costCenterCode;
	}

	public String getCostCenterDesc() {
		return this.costCenterDesc;
	}
	public void setCostCenterDesc(String costCenterDesc) {
		this.costCenterDesc = costCenterDesc;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getCurrencyBeq() {
		return this.currencyBeq;
	}
	public void setCurrencyBeq(String currencyBeq) {
		this.currencyBeq = currencyBeq;
	}

	public String getDetailCode() {
		return this.detailCode;
	}
	public void setDetailCode(String detailCode) {
		this.detailCode = detailCode;
	}

	public String getDetailDesc() {
		return this.detailDesc;
	}
	public void setDetailDesc(String detailDesc) {
		this.detailDesc = detailDesc;
	}

	public String getIndustryCode() {
		return this.industryCode;
	}
	public void setIndustryCode(String industryCode) {
		this.industryCode = industryCode;
	}

	public String getIndustryDesc() {
		return this.industryDesc;
	}
	public void setIndustryDesc(String industryDesc) {
		this.industryDesc = industryDesc;
	}

	public String getInterCompanyCode() {
		return this.interCompanyCode;
	}
	public void setInterCompanyCode(String interCompanyCode) {
		this.interCompanyCode = interCompanyCode;
	}

	public String getInterCompanyDesc() {
		return this.interCompanyDesc;
	}
	public void setInterCompanyDesc(String interCompanyDesc) {
		this.interCompanyDesc = interCompanyDesc;
	}

	public String getJeLineDesc() {
		return this.jeLineDesc;
	}
	public void setJeLineDesc(String jeLineDesc) {
		this.jeLineDesc = jeLineDesc;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductDesc() {
		return this.productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public String getProjectCode() {
		return this.projectCode;
	}
	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}

	public String getProjectDesc() {
		return this.projectDesc;
	}
	public void setProjectDesc(String projectDesc) {
		this.projectDesc = projectDesc;
	}

	public String getRegionCode() {
		return this.regionCode;
	}
	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}

	public String getRegionDesc() {
		return this.regionDesc;
	}
	public void setRegionDesc(String regionDesc) {
		this.regionDesc = regionDesc;
	}

	public String getSpareCode1() {
		return this.spareCode1;
	}
	public void setSpareCode1(String spareCode1) {
		this.spareCode1 = spareCode1;
	}

	public String getSpareCode2() {
		return this.spareCode2;
	}
	public void setSpareCode2(String spareCode2) {
		this.spareCode2 = spareCode2;
	}

	public String getSpareDesc1() {
		return this.spareDesc1;
	}
	public void setSpareDesc1(String spareDesc1) {
		this.spareDesc1 = spareDesc1;
	}

	public String getSpareDesc2() {
		return this.spareDesc2;
	}
	public void setSpareDesc2(String spareDesc2) {
		this.spareDesc2 = spareDesc2;
	}

	public String getVoucherNo() {
		return this.voucherNo;
	}
	public void setVoucherNo(String voucherNo) {
		this.voucherNo = voucherNo;
	}

}
