package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询费控规则
 *
 * @author auto create
 * @since 1.0, 2024-01-30 21:05:03
 */
public class AlipayEbppInvoiceExpenserulesProjectruleQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6376413335959291684L;

	/**
	 * 共同账号ID
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 授权签约协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 员工UID（可空）
	 */
	@ApiField("employee_id")
	private String employeeId;

	/**
	 * 切换open_id后请使用：员工open_id（可空）
	 */
	@ApiField("employee_open_id")
	private String employeeOpenId;

	/**
	 * 页数
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 项目id（可空）
	 */
	@ApiField("project_id")
	private String projectId;

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

	public String getEmployeeId() {
		return this.employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeOpenId() {
		return this.employeeOpenId;
	}
	public void setEmployeeOpenId(String employeeOpenId) {
		this.employeeOpenId = employeeOpenId;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getProjectId() {
		return this.projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

}
