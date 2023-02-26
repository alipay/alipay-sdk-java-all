package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 修改规则员工关系
 *
 * @author auto create
 * @since 1.0, 2022-11-18 23:34:16
 */
public class AlipayEbppInvoiceExpenserulesGroupemployeeModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2861973419397788929L;

	/**
	 * 企业共同账户id
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 未切换 open_id 时请使用此字段：
需要添加的员工UID列表
特殊说明：一次最多50个
	 */
	@ApiListField("add_employee_list")
	@ApiField("string")
	private List<String> addEmployeeList;

	/**
	 * 切换 open_id 后请使用此字段：
需要添加的open_id/企业码员工ID列表 特殊说明：一次最多50个
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
	 * 企业码企业id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 费控规则ID列表
	 */
	@ApiListField("group_id_list")
	@ApiField("string")
	private List<String> groupIdList;

	/**
	 * 未切换 open_id 时请使用此字段：
需要移除的员工UID列表
特殊说明：一次最多50个
	 */
	@ApiListField("remove_employee_list")
	@ApiField("string")
	private List<String> removeEmployeeList;

	/**
	 * 切换 open_id 后请使用此字段：
需要移除的open_id/企业码员工ID列表 特殊说明：一次最多50个
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

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public List<String> getGroupIdList() {
		return this.groupIdList;
	}
	public void setGroupIdList(List<String> groupIdList) {
		this.groupIdList = groupIdList;
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
