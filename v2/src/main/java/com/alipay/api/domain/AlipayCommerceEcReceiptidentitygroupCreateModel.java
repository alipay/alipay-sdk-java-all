package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 新增收单身份组
 *
 * @author auto create
 * @since 1.0, 2026-06-11 16:17:55
 */
public class AlipayCommerceEcReceiptidentitygroupCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1764971247828833214L;

	/**
	 * 企业id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 收单身份组名称
	 */
	@ApiField("identity_group_name")
	private String identityGroupName;

	/**
	 * null
	 */
	@ApiListField("identity_list")
	@ApiField("receipt_identity_info")
	private List<ReceiptIdentityInfo> identityList;

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getIdentityGroupName() {
		return this.identityGroupName;
	}
	public void setIdentityGroupName(String identityGroupName) {
		this.identityGroupName = identityGroupName;
	}

	public List<ReceiptIdentityInfo> getIdentityList() {
		return this.identityList;
	}
	public void setIdentityList(List<ReceiptIdentityInfo> identityList) {
		this.identityList = identityList;
	}

}
