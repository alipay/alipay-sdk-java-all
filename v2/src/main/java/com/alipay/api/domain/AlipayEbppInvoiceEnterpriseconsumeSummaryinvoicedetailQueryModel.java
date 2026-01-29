package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 汇总发票详情查询接口
 *
 * @author auto create
 * @since 1.0, 2023-04-19 16:15:09
 */
public class AlipayEbppInvoiceEnterpriseconsumeSummaryinvoicedetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8596117575148642173L;

	/**
	 * 企业 ID
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 授权签约协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 开票批次 ID
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

	public String getSummaryId() {
		return this.summaryId;
	}
	public void setSummaryId(String summaryId) {
		this.summaryId = summaryId;
	}

}
