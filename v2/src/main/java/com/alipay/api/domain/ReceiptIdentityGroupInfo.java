package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-07-17 13:57:53
 */
public class ReceiptIdentityGroupInfo extends AlipayObject {

	private static final long serialVersionUID = 6744868287761313428L;

	/**
	 * 收单身份组id，通过创建收单身份组接口返回获取
	 */
	@ApiField("identity_group_id")
	private String identityGroupId;

	/**
	 * 收单身份组名称
	 */
	@ApiField("identity_group_name")
	private String identityGroupName;

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
