package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业解约
 *
 * @author auto create
 * @since 1.0, 2022-09-06 16:50:07
 */
public class AlipayCommerceEcEnterpriseUnsignModel extends AlipayObject {

	private static final long serialVersionUID = 5116259199795155987L;

	/**
	 * 共同账户id和企业id二选一必填
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 签约协议号，account_id不为空则该字段必填
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 企业id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

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

}
