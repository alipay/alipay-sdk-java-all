package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 修改制度下适配范围
 *
 * @author auto create
 * @since 1.0, 2022-08-18 15:34:29
 */
public class AlipayEbppInvoiceInstitutionScopeModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3397765554953715835L;

	/**
	 * 企业共同账户id
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 制度适配范围类型
	 */
	@ApiField("adapter_type")
	private String adapterType;

	/**
	 * adapterType为EMPLOYEE_ALL时，无需填写；adapterType为EMPLOYEE_SELECT时，填写员工id（可通过设置owner_type来指定id类型，支持员工支付宝id，员工企业码id和员工手机号）;
adapterType为EMPLOYEE_DEPARTMENT时，填写部门id
	 */
	@ApiListField("add_owner_id_list")
	@ApiField("string")
	private List<String> addOwnerIdList;

	/**
	 * 授权签约协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 企业id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 制度id
	 */
	@ApiField("institution_id")
	private String institutionId;

	/**
	 * 当adapterType为指定员工时，通过该字段指定操作的owner_id类型
	 */
	@ApiField("owner_type")
	private String ownerType;

	/**
	 * adapterType为EMPLOYEE_ALL时，无需填写；adapterType为EMPLOYEE_SELECT时，填写员工id（可通过设置owner_type来指定id类型，支持员工支付宝id，员工企业码id和员工手机号）; adapterType为EMPLOYEE_DEPARTMENT时，填写部门id
	 */
	@ApiListField("remove_owner_id_list")
	@ApiField("string")
	private List<String> removeOwnerIdList;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAdapterType() {
		return this.adapterType;
	}
	public void setAdapterType(String adapterType) {
		this.adapterType = adapterType;
	}

	public List<String> getAddOwnerIdList() {
		return this.addOwnerIdList;
	}
	public void setAddOwnerIdList(List<String> addOwnerIdList) {
		this.addOwnerIdList = addOwnerIdList;
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

	public String getInstitutionId() {
		return this.institutionId;
	}
	public void setInstitutionId(String institutionId) {
		this.institutionId = institutionId;
	}

	public String getOwnerType() {
		return this.ownerType;
	}
	public void setOwnerType(String ownerType) {
		this.ownerType = ownerType;
	}

	public List<String> getRemoveOwnerIdList() {
		return this.removeOwnerIdList;
	}
	public void setRemoveOwnerIdList(List<String> removeOwnerIdList) {
		this.removeOwnerIdList = removeOwnerIdList;
	}

}
