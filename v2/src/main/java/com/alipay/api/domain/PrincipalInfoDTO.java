package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签约开通商户主体信息
 *
 * @author auto create
 * @since 1.0, 2023-03-24 20:29:09
 */
public class PrincipalInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 8315699381191973869L;

	/**
	 * 签约开通商户主体
	 */
	@ApiField("identity")
	private String identity;

	/**
	 * 签约开通商户主体名称
	 */
	@ApiField("identity_name")
	private String identityName;

	/**
	 * 签约开通商户主体类型
	 */
	@ApiField("identity_type")
	private String identityType;

	public String getIdentity() {
		return this.identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public String getIdentityName() {
		return this.identityName;
	}
	public void setIdentityName(String identityName) {
		this.identityName = identityName;
	}

	public String getIdentityType() {
		return this.identityType;
	}
	public void setIdentityType(String identityType) {
		this.identityType = identityType;
	}

}
