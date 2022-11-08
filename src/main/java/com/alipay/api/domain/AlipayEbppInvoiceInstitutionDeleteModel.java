package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 制度删除
 *
 * @author auto create
 * @since 1.0, 2022-10-10 14:29:52
 */
public class AlipayEbppInvoiceInstitutionDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 8751691534742131111L;

	/**
	 * 企业共同账户id（条件必填）
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 授权签约协议号（条件必填）
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 企业id（条件必填）
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 制度id
	 */
	@ApiField("institution_id")
	private String institutionId;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getInstitutionId() {
		return this.institutionId;
	}
	public void setInstitutionId(String institutionId) {
		this.institutionId = institutionId;
	}

}
