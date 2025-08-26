package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 解除三方协议
 *
 * @author auto create
 * @since 1.0, 2022-02-16 11:22:57
 */
public class AlipayFundTaxbillSignUnsignModel extends AlipayObject {

	private static final long serialVersionUID = 8563841681268399278L;

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
