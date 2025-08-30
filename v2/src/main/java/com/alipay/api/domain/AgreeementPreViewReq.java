package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 协议预览请求
 *
 * @author auto create
 * @since 1.0, 2025-03-19 16:59:24
 */
public class AgreeementPreViewReq extends AlipayObject {

	private static final long serialVersionUID = 2114825499441796251L;

	/**
	 * 协议状态枚举值(INIT/ENABLE/FREEZE/DISABLE)
	 */
	@ApiField("agreement_status")
	private String agreementStatus;

	/**
	 * 合同模板code带版本号
	 */
	@ApiField("agreement_version")
	private String agreementVersion;

	/**
	 * 协议类型Code
	 */
	@ApiField("code")
	private String code;

	/**
	 * 合同编号
	 */
	@ApiField("contract_no")
	private String contractNo;

	/**
	 * 机构信息
	 */
	@ApiField("fund_supplier")
	private InstitutionVO fundSupplier;

	public String getAgreementStatus() {
		return this.agreementStatus;
	}
	public void setAgreementStatus(String agreementStatus) {
		this.agreementStatus = agreementStatus;
	}

	public String getAgreementVersion() {
		return this.agreementVersion;
	}
	public void setAgreementVersion(String agreementVersion) {
		this.agreementVersion = agreementVersion;
	}

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getContractNo() {
		return this.contractNo;
	}
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public InstitutionVO getFundSupplier() {
		return this.fundSupplier;
	}
	public void setFundSupplier(InstitutionVO fundSupplier) {
		this.fundSupplier = fundSupplier;
	}

}
