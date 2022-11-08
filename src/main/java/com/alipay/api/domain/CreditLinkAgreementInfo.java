package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业可信链接协议信息
 *
 * @author auto create
 * @since 1.0, 2022-03-30 10:11:33
 */
public class CreditLinkAgreementInfo extends AlipayObject {

	private static final long serialVersionUID = 4313823698651194183L;

	/**
	 * 协议路径
	 */
	@ApiField("agreement_path")
	private String agreementPath;

	/**
	 * 协议类型
	 */
	@ApiField("agreement_type")
	private String agreementType;

	/**
	 * 是否盖章
	 */
	@ApiField("seal_flag")
	private Boolean sealFlag;

	public String getAgreementPath() {
		return this.agreementPath;
	}
	public void setAgreementPath(String agreementPath) {
		this.agreementPath = agreementPath;
	}

	public String getAgreementType() {
		return this.agreementType;
	}
	public void setAgreementType(String agreementType) {
		this.agreementType = agreementType;
	}

	public Boolean getSealFlag() {
		return this.sealFlag;
	}
	public void setSealFlag(Boolean sealFlag) {
		this.sealFlag = sealFlag;
	}

}
