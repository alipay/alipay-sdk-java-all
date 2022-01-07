package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建签约吱口令
 *
 * @author auto create
 * @since 1.0, 2022-01-04 11:08:35
 */
public class AlipayFundTaxbillSigncodeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6472845928764543535L;

	/**
	 * 回跳url
	 */
	@ApiField("back_url")
	private String backUrl;

	/**
	 * 场景码，固定值：SIGN
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 税筹服务商在平台的唯一性身份标识，入驻平台成功后由平台方提供
	 */
	@ApiField("contractor_code")
	private String contractorCode;

	/**
	 * 用户的签约支付宝账号，可选传递。如传递，则只有登录号匹配的用户才能进行签约
	 */
	@ApiField("employee_alipay_logon_id")
	private String employeeAlipayLogonId;

	/**
	 * 雇员的证件编号，如提供，雇员证件姓名（employee_name)也不能为空。当提供了雇员的实名信息，则签约时会校验签约时的用户实名信息，如不匹配则签约会被拦截
	 */
	@ApiField("employee_id_card_no")
	private String employeeIdCardNo;

	/**
	 * 雇员真实姓名，如提供，雇员证件号码（employee_id_card_no)也不能为空
	 */
	@ApiField("employee_name")
	private String employeeName;

	/**
	 * 用工企业在平台的唯一性身份标识，入驻平台成功后由平台方提供
	 */
	@ApiField("employer_code")
	private String employerCode;

	/**
	 * 用户在用工企业的唯一性身份标识，用户单位自定义参数，用于用工单位识别雇员身份
	 */
	@ApiField("identification_in_belonging_employer")
	private String identificationInBelongingEmployer;

	/**
	 * 产品码，固定值：TAX_BILL_PLATFORM
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 税优模式，有限枚举。1.TEMPORARY_TAX_REGISTRATION（临时税务登记 ）2. NATURAL_PERSON_LEVIED（自然人代征）
	 */
	@ApiField("tax_optimization_mode")
	private String taxOptimizationMode;

	public String getBackUrl() {
		return this.backUrl;
	}
	public void setBackUrl(String backUrl) {
		this.backUrl = backUrl;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getContractorCode() {
		return this.contractorCode;
	}
	public void setContractorCode(String contractorCode) {
		this.contractorCode = contractorCode;
	}

	public String getEmployeeAlipayLogonId() {
		return this.employeeAlipayLogonId;
	}
	public void setEmployeeAlipayLogonId(String employeeAlipayLogonId) {
		this.employeeAlipayLogonId = employeeAlipayLogonId;
	}

	public String getEmployeeIdCardNo() {
		return this.employeeIdCardNo;
	}
	public void setEmployeeIdCardNo(String employeeIdCardNo) {
		this.employeeIdCardNo = employeeIdCardNo;
	}

	public String getEmployeeName() {
		return this.employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployerCode() {
		return this.employerCode;
	}
	public void setEmployerCode(String employerCode) {
		this.employerCode = employerCode;
	}

	public String getIdentificationInBelongingEmployer() {
		return this.identificationInBelongingEmployer;
	}
	public void setIdentificationInBelongingEmployer(String identificationInBelongingEmployer) {
		this.identificationInBelongingEmployer = identificationInBelongingEmployer;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getTaxOptimizationMode() {
		return this.taxOptimizationMode;
	}
	public void setTaxOptimizationMode(String taxOptimizationMode) {
		this.taxOptimizationMode = taxOptimizationMode;
	}

}
