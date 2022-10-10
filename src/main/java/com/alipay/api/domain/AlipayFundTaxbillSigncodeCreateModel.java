package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建签约吱口令
 *
 * @author auto create
 * @since 1.0, 2022-08-01 10:44:49
 */
public class AlipayFundTaxbillSigncodeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4341857432956721723L;

	/**
	 * 签约完成之后用户点击签约完成的回跳url，自定义提供，只支持支付宝端内的小程序跳转和H5跳转，不支持APP间跳转。入无特殊需要，可忽略此字段。
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
	 * 注意：过时字段，建议使用identity+identity_type字段。用户的签约支付宝账号，指定只有登录号匹配的支付宝用户才能进行签约。
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
	 * 用户在用工企业的唯一性身份标识，用户单位自定义参数，用于用工单位识别雇员身份，签约完成后的异步通知回回传此参数。
	 */
	@ApiField("identification_in_belonging_employer")
	private String identificationInBelongingEmployer;

	/**
	 * 参与方的唯一标识，用于指定签约的支付宝账户，默认必输。如提供，则参与方的标识类型（identity_type)也不能为空。
	 */
	@ApiField("identity")
	private String identity;

	/**
	 * 参与方的标识类型，默认必输。值为有限枚举，用于指定identity字段类型，如提供，参与方的唯一标识（identity)也不能为空，目前支持如下类型：
1.ALIPAY_ACCOUNT_NO（支付宝账号）
2.ALIPAY_USER_ID（支付宝ID）
	 */
	@ApiField("identity_type")
	private String identityType;

	/**
	 * 产品码，固定值：TAX_BILL_PLATFORM
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 签约码类型，有限枚举，指定sign_code的类型，默认为SHARE_CODE，支持：
1.SHARE_CODE    （吱口令）
2.SHORT_URL   （短链接）
	 */
	@ApiField("sign_code_type")
	private String signCodeType;

	/**
	 * 税优模式，有限枚举，实际传递的值依赖具体业务情况。1.TEMPORARY_TAX_REGISTRATION（临时税务登记 ）2. NATURAL_PERSON_LEVIED（自然人代征）
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

	public String getIdentity() {
		return this.identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public String getIdentityType() {
		return this.identityType;
	}
	public void setIdentityType(String identityType) {
		this.identityType = identityType;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getSignCodeType() {
		return this.signCodeType;
	}
	public void setSignCodeType(String signCodeType) {
		this.signCodeType = signCodeType;
	}

	public String getTaxOptimizationMode() {
		return this.taxOptimizationMode;
	}
	public void setTaxOptimizationMode(String taxOptimizationMode) {
		this.taxOptimizationMode = taxOptimizationMode;
	}

}
