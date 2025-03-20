package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 制度删除
 *
 * @author auto create
 * @since 1.0, 2024-06-28 16:32:40
 */
public class AlipayEbppInvoiceInstitutionDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 6876198831956161871L;

	/**
	 * 企业共同账户id（该字段将废弃，不建议使用，可用enterprise_id字段替换） 当前字段已废弃(该字段将废弃，不建议使用，可用enterprise_id字段替换)
	 */
	@ApiField("account_id")
	@Deprecated
	private String accountId;

	/**
	 * 授权签约协议号
（该字段将废弃，不建议使用，可用enterprise_id字段替换） 当前字段已废弃(该字段将废弃，不建议使用，可用enterprise_id字段替换)
	 */
	@ApiField("agreement_no")
	@Deprecated
	private String agreementNo;

	/**
	 * 企业id
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
