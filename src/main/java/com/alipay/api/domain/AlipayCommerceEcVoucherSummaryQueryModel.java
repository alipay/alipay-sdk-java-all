package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业码汇总发票详情查询
 *
 * @author auto create
 * @since 1.0, 2022-08-19 21:22:35
 */
public class AlipayCommerceEcVoucherSummaryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5259429779266961461L;

	/**
	 * 共同账户ID
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 授权签约协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 企业ID
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 汇总批次ID
	 */
	@ApiField("summary_id")
	private String summaryId;

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

	public String getSummaryId() {
		return this.summaryId;
	}
	public void setSummaryId(String summaryId) {
		this.summaryId = summaryId;
	}

}
