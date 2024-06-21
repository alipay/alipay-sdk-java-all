package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业查询借款申请记录
 *
 * @author auto create
 * @since 1.0, 2024-05-20 14:03:24
 */
public class AlipayCommerceEcCreditLoanQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8156426583627982271L;

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
	 * 时间范围查询的结束时间，格式
yyyy-MM-dd
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 企业ID
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 借款申请状态
	 */
	@ApiField("loan_status")
	private String loanStatus;

	/**
	 * 时间范围查询的开始时间，格式
yyyy-MM-dd
	 */
	@ApiField("start_date")
	private String startDate;

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

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getLoanStatus() {
		return this.loanStatus;
	}
	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

}
