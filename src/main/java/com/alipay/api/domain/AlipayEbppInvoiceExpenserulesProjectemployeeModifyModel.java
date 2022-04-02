package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 修改项目员工关系
 *
 * @author auto create
 * @since 1.0, 2021-12-14 17:55:25
 */
public class AlipayEbppInvoiceExpenserulesProjectemployeeModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5725738875942986952L;

	/**
	 * 企业ID
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 需要添加的员工UID列表
约束：一次最多50个
	 */
	@ApiListField("add_employee_list")
	@ApiField("string")
	private List<String> addEmployeeList;

	/**
	 * 授权签约协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 项目ID
	 */
	@ApiField("project_id")
	private String projectId;

	/**
	 * 需要移除的员工UID列表
约束：一次最多50个
	 */
	@ApiListField("remove_employee_list")
	@ApiField("string")
	private List<String> removeEmployeeList;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public List<String> getAddEmployeeList() {
		return this.addEmployeeList;
	}
	public void setAddEmployeeList(List<String> addEmployeeList) {
		this.addEmployeeList = addEmployeeList;
	}

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getProjectId() {
		return this.projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public List<String> getRemoveEmployeeList() {
		return this.removeEmployeeList;
	}
	public void setRemoveEmployeeList(List<String> removeEmployeeList) {
		this.removeEmployeeList = removeEmployeeList;
	}

}
