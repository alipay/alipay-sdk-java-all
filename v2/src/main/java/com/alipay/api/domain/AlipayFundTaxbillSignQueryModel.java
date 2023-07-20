package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询用户签约结果信息
 *
 * @author auto create
 * @since 1.0, 2023-02-13 15:02:49
 */
public class AlipayFundTaxbillSignQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6352825739419515812L;

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

}
