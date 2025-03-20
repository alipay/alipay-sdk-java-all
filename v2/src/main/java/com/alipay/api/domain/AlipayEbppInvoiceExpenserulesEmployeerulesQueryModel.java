package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询指定企业员工已绑定的所有费控规则
 *
 * @author auto create
 * @since 1.0, 2024-01-30 21:05:47
 */
public class AlipayEbppInvoiceExpenserulesEmployeerulesQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5146657339646438234L;

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
	 * 未切换open_id时使用此字段：员工ID
	 */
	@ApiField("employee_id")
	private String employeeId;

	/**
	 * 切换open_id后使用此字段：员工的open_id
	 */
	@ApiField("employee_open_id")
	private String employeeOpenId;

	/**
	 * 页码，默认值为1
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页行数，默认值为20
	 */
	@ApiField("page_size")
	private Long pageSize;

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

}
