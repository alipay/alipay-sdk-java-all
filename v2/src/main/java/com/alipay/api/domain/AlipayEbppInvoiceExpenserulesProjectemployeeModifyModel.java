package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 修改项目员工关系
 *
 * @author auto create
 * @since 1.0, 2023-02-27 20:04:06
 */
public class AlipayEbppInvoiceExpenserulesProjectemployeeModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4426156774917889619L;

	/**
	 * 共同账户ID
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 切换open_id前使用此字段：
需要添加的员工UID列表
约束：一次最多50个
	 */
	@ApiListField("add_employee_list")
	@ApiField("string")
	private List<String> addEmployeeList;

	/**
	 * 切换open_id后使用此字段：
需要添加的员工open_id列表
约束：一次最多50个
	 */
	@ApiListField("add_employee_open_id_list")
	@ApiField("string")
	private List<String> addEmployeeOpenIdList;

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
	 * 切换open_id前使用此字段：
需要移除的员工UID列表
约束：一次最多50个
	 */
	@ApiListField("remove_employee_list")
	@ApiField("string")
	private List<String> removeEmployeeList;

	/**
	 * 切换open_id后前使用此字段： 需要移除的员工open_id列表 约束：一次最多50个
	 */
	@ApiListField("remove_employee_open_id_list")
	@ApiField("string")
	private List<String> removeEmployeeOpenIdList;

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

	public List<String> getAddEmployeeOpenIdList() {
		return this.addEmployeeOpenIdList;
	}
	public void setAddEmployeeOpenIdList(List<String> addEmployeeOpenIdList) {
		this.addEmployeeOpenIdList = addEmployeeOpenIdList;
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

	public List<String> getRemoveEmployeeOpenIdList() {
		return this.removeEmployeeOpenIdList;
	}
	public void setRemoveEmployeeOpenIdList(List<String> removeEmployeeOpenIdList) {
		this.removeEmployeeOpenIdList = removeEmployeeOpenIdList;
	}

}
