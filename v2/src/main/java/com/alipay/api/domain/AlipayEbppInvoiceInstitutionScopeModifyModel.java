package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 修改制度下适配范围
 *
 * @author auto create
 * @since 1.0, 2024-01-30 21:02:12
 */
public class AlipayEbppInvoiceInstitutionScopeModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7397319495952839354L;

	/**
	 * 企业共同账户id
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 制度适用范围类型
	 */
	@ApiField("adapter_type")
	private String adapterType;

	/**
	 * 增加适配id列表
	 */
	@ApiListField("add_owner_id_list")
	@ApiField("string")
	private List<String> addOwnerIdList;

	/**
	 * 增加适配开放id列表
	 */
	@ApiListField("add_owner_open_id_list")
	@ApiField("string")
	private List<String> addOwnerOpenIdList;

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
	 * 归属类型
	 */
	@ApiField("owner_type")
	private String ownerType;

	/**
	 * 删除适配id列表
	 */
	@ApiListField("remove_owner_id_list")
	@ApiField("string")
	private List<String> removeOwnerIdList;

	/**
	 * 删除适配开放id列表
	 */
	@ApiListField("remove_owner_open_id_list")
	@ApiField("string")
	private List<String> removeOwnerOpenIdList;

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

	public List<String> getAddOwnerOpenIdList() {
		return this.addOwnerOpenIdList;
	}
	public void setAddOwnerOpenIdList(List<String> addOwnerOpenIdList) {
		this.addOwnerOpenIdList = addOwnerOpenIdList;
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

	public List<String> getRemoveOwnerOpenIdList() {
		return this.removeOwnerOpenIdList;
	}
	public void setRemoveOwnerOpenIdList(List<String> removeOwnerOpenIdList) {
		this.removeOwnerOpenIdList = removeOwnerOpenIdList;
	}

}
