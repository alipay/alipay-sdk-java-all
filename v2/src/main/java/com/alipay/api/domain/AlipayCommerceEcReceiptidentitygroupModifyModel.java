package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 修改收单身份组
 *
 * @author auto create
 * @since 1.0, 2026-06-11 16:17:56
 */
public class AlipayCommerceEcReceiptidentitygroupModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7234414794979592947L;

	/**
	 * null
	 */
	@ApiListField("add_identity_list")
	@ApiField("receipt_identity_info")
	private List<ReceiptIdentityInfo> addIdentityList;

	/**
	 * null
	 */
	@ApiListField("delete_identity_list")
	@ApiField("receipt_identity_info")
	private List<ReceiptIdentityInfo> deleteIdentityList;

	/**
	 * 企业id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 收单身份组id
	 */
	@ApiField("identity_group_id")
	private String identityGroupId;

	/**
	 * 收单身份组名称
	 */
	@ApiField("identity_group_name")
	private String identityGroupName;

	public List<ReceiptIdentityInfo> getAddIdentityList() {
		return this.addIdentityList;
	}
	public void setAddIdentityList(List<ReceiptIdentityInfo> addIdentityList) {
		this.addIdentityList = addIdentityList;
	}

	public List<ReceiptIdentityInfo> getDeleteIdentityList() {
		return this.deleteIdentityList;
	}
	public void setDeleteIdentityList(List<ReceiptIdentityInfo> deleteIdentityList) {
		this.deleteIdentityList = deleteIdentityList;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getIdentityGroupId() {
		return this.identityGroupId;
	}
	public void setIdentityGroupId(String identityGroupId) {
		this.identityGroupId = identityGroupId;
	}

	public String getIdentityGroupName() {
		return this.identityGroupName;
	}
	public void setIdentityGroupName(String identityGroupName) {
		this.identityGroupName = identityGroupName;
	}

}
