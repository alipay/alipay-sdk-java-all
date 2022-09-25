package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改项目基础信息
 *
 * @author auto create
 * @since 1.0, 2022-02-17 10:57:00
 */
public class AlipayEbppInvoiceExpenserulesProjectinfoModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4712288253827531636L;

	/**
	 * 企业ID
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 授权签约协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 有效期截止（yyyy-MM-dd HH:mm:ss）
特殊说明：
1）与起始时间必须同时传，且大于起始时间
2）不传则默认不修改
	 */
	@ApiField("effective_end_date")
	private String effectiveEndDate;

	/**
	 * 有效期起始（yyyy-MM-dd HH:mm:ss）
特殊说明：
1）与截止时间必须同时传，且小于截止时间
2）不传入则默认不修改
	 */
	@ApiField("effective_start_date")
	private String effectiveStartDate;

	/**
	 * 项目ID
	 */
	@ApiField("project_id")
	private String projectId;

	/**
	 * 项目名
特殊说明：不传入则默认不修改
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
