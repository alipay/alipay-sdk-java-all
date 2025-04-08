package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业查询借款申请记录
 *
 * @author auto create
 * @since 1.0, 2024-07-08 15:22:50
 */
public class AlipayCommerceEcCreditLoanQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1783593925972414419L;

	/**
	 * 共同账户ID 当前字段已废弃(历史兼容逻辑冗余字段增加了接口复杂性，统一移除)
	 */
	@ApiField("account_id")
	@Deprecated
	private String accountId;

	/**
	 * 授权签约协议号 当前字段已废弃(历史兼容逻辑冗余字段增加了接口复杂性，统一移除)
	 */
	@ApiField("agreement_no")
	@Deprecated
	private String agreementNo;

	/**
	 * 时间范围查询的结束时间，格式
yyyy-MM-dd
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 企业Id，企业入驻企业码时自动分配的用于唯一标识的编号
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
