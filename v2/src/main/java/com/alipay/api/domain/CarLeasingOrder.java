package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 融租订单信息
 *
 * @author auto create
 * @since 1.0, 2026-01-04 15:36:07
 */
public class CarLeasingOrder extends AlipayObject {

	private static final long serialVersionUID = 8523923854183787899L;

	/**
	 * 身份证号（支持AES加密）
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 车辆合格证（Vehicle Certificate of Conformity）文件链接（支持AES加密）
	 */
	@ApiField("coc_file")
	private String cocFile;

	/**
	 * 企业名称（支持AES加密）
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 经销商企业名称（支持AES加密）
	 */
	@ApiField("dealer_company_name")
	private String dealerCompanyName;

	/**
	 * 首付比例
	 */
	@ApiField("down_payment_percent")
	private Long downPaymentPercent;

	/**
	 * 分期期数
	 */
	@ApiField("installment_periods")
	private Long installmentPeriods;

	/**
	 * 保险保单文件链接（支持AES加密）
	 */
	@ApiField("insurance_policy_file")
	private String insurancePolicyFile;

	/**
	 * 发票文件链接（支持AES加密）
	 */
	@ApiField("invoice_file")
	private String invoiceFile;

	/**
	 * 法人代表身份证号（支持AES加密）
	 */
	@ApiField("legal_representative_cert_no")
	private String legalRepresentativeCertNo;

	/**
	 * 法人代表姓名（支持AES加密）
	 */
	@ApiField("legal_representative_name")
	private String legalRepresentativeName;

	/**
	 * 放款金额（单位：元，精确到分）
	 */
	@ApiField("loan_amount")
	private String loanAmount;

	/**
	 * 手机号（支持AES加密）
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 姓名（支持AES加密）
	 */
	@ApiField("name")
	private String name;

	/**
	 * 备注信息
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 购销合同影像文件链接（支持AES加密）
	 */
	@ApiField("sales_contract_file")
	private String salesContractFile;

	/**
	 * 购销合同ID
	 */
	@ApiField("sales_contract_id")
	private String salesContractId;

	/**
	 * 统一社会信用代码（Unified Social Credit Code）（支持AES加密）
	 */
	@ApiField("uscc")
	private String uscc;

	/**
	 * 车型信息
	 */
	@ApiField("veh_model")
	private String vehModel;

	/**
	 * 车辆价格（单位：元，精确到分）
	 */
	@ApiField("veh_price")
	private String vehPrice;

	/**
	 * VIN码（支持AES加密）
	 */
	@ApiField("vin")
	private String vin;

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCocFile() {
		return this.cocFile;
	}
	public void setCocFile(String cocFile) {
		this.cocFile = cocFile;
	}

	public String getCompanyName() {
		return this.companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getDealerCompanyName() {
		return this.dealerCompanyName;
	}
	public void setDealerCompanyName(String dealerCompanyName) {
		this.dealerCompanyName = dealerCompanyName;
	}

	public Long getDownPaymentPercent() {
		return this.downPaymentPercent;
	}
	public void setDownPaymentPercent(Long downPaymentPercent) {
		this.downPaymentPercent = downPaymentPercent;
	}

	public Long getInstallmentPeriods() {
		return this.installmentPeriods;
	}
	public void setInstallmentPeriods(Long installmentPeriods) {
		this.installmentPeriods = installmentPeriods;
	}

	public String getInsurancePolicyFile() {
		return this.insurancePolicyFile;
	}
	public void setInsurancePolicyFile(String insurancePolicyFile) {
		this.insurancePolicyFile = insurancePolicyFile;
	}

	public String getInvoiceFile() {
		return this.invoiceFile;
	}
	public void setInvoiceFile(String invoiceFile) {
		this.invoiceFile = invoiceFile;
	}

	public String getLegalRepresentativeCertNo() {
		return this.legalRepresentativeCertNo;
	}
	public void setLegalRepresentativeCertNo(String legalRepresentativeCertNo) {
		this.legalRepresentativeCertNo = legalRepresentativeCertNo;
	}

	public String getLegalRepresentativeName() {
		return this.legalRepresentativeName;
	}
	public void setLegalRepresentativeName(String legalRepresentativeName) {
		this.legalRepresentativeName = legalRepresentativeName;
	}

	public String getLoanAmount() {
		return this.loanAmount;
	}
	public void setLoanAmount(String loanAmount) {
		this.loanAmount = loanAmount;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getSalesContractFile() {
		return this.salesContractFile;
	}
	public void setSalesContractFile(String salesContractFile) {
		this.salesContractFile = salesContractFile;
	}

	public String getSalesContractId() {
		return this.salesContractId;
	}
	public void setSalesContractId(String salesContractId) {
		this.salesContractId = salesContractId;
	}

	public String getUscc() {
		return this.uscc;
	}
	public void setUscc(String uscc) {
		this.uscc = uscc;
	}

	public String getVehModel() {
		return this.vehModel;
	}
	public void setVehModel(String vehModel) {
		this.vehModel = vehModel;
	}

	public String getVehPrice() {
		return this.vehPrice;
	}
	public void setVehPrice(String vehPrice) {
		this.vehPrice = vehPrice;
	}

	public String getVin() {
		return this.vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}

}
