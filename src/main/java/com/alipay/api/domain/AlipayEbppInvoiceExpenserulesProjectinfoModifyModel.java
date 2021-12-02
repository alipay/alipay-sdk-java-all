package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改项目基础信息
 *
 * @author auto create
 * @since 1.0, 2021-07-12 15:47:16
 */
public class AlipayEbppInvoiceExpenserulesProjectinfoModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3853881759772666649L;

	/**
	 * 企业id-共同账号ID
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 授权签约协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 有效期截止（yyyy-MM-dd HH:mm:ss，与起始时间必须同时传，且大于起始时间，不传则不修改）
	 */
	@ApiField("effective_end_date")
	private String effectiveEndDate;

	/**
	 * 有效期起始（yyyy-MM-dd HH:mm:ss，与截止时间必须同时传，且小于截止时间，不传则不修改）
	 */
	@ApiField("effective_start_date")
	private String effectiveStartDate;

	/**
	 * 项目id
	 */
	@ApiField("project_id")
	private String projectId;

	/**
	 * 项目名（不传则不修改）
	 */
	@ApiField("project_name")
	private String projectName;

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

	public String getEffectiveEndDate() {
		return this.effectiveEndDate;
	}
	public void setEffectiveEndDate(String effectiveEndDate) {
		this.effectiveEndDate = effectiveEndDate;
	}

	public String getEffectiveStartDate() {
		return this.effectiveStartDate;
	}
	public void setEffectiveStartDate(String effectiveStartDate) {
		this.effectiveStartDate = effectiveStartDate;
	}

	public String getProjectId() {
		return this.projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return this.projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

}
