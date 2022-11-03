package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 修改规则员工关系
 *
 * @author auto create
 * @since 1.0, 2022-08-18 15:34:56
 */
public class AlipayEbppInvoiceExpenserulesGroupemployeeModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8383749428257282359L;

	/**
	 * 企业ID
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 需要添加的员工UID列表
特殊说明：一次最多50个
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
	 * 需要移除的员工UID列表
特殊说明：一次最多50个
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

}
