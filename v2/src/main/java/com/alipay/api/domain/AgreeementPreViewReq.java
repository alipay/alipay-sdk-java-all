package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 协议预览请求
 *
 * @author auto create
 * @since 1.0, 2024-12-02 17:42:39
 */
public class AgreeementPreViewReq extends AlipayObject {

	private static final long serialVersionUID = 7731443986365549192L;

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
	 * 机构信息
	 */
	@ApiField("fund_supplier")
	private InstitutionVO fundSupplier;

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

	public InstitutionVO getFundSupplier() {
		return this.fundSupplier;
	}
	public void setFundSupplier(InstitutionVO fundSupplier) {
		this.fundSupplier = fundSupplier;
	}

}
