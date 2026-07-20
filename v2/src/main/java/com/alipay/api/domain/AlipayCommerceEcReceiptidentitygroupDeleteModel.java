package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除收单身份组
 *
 * @author auto create
 * @since 1.0, 2026-06-11 16:12:55
 */
public class AlipayCommerceEcReceiptidentitygroupDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 3319197891929968314L;

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

}
