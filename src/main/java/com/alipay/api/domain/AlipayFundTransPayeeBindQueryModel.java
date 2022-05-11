package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资金收款账号绑定关系查询
 *
 * @author auto create
 * @since 1.0, 2021-07-30 16:59:41
 */
public class AlipayFundTransPayeeBindQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2416414631757629532L;

	/**
	 * 证件号
	 */
	@ApiField("identity")
	private String identity;

	/**
	 * 证件类型,暂仅支持 IDENTITY_CARD （身份证）
	 */
	@ApiField("identity_type")
	private String identityType;

	public String getIdentity() {
		return this.identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public String getIdentityType() {
		return this.identityType;
	}
	public void setIdentityType(String identityType) {
		this.identityType = identityType;
	}

}
