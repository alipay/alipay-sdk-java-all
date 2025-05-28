package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户信息，包含identity、identity_type、identity_name三个字段
 *
 * @author auto create
 * @since 1.0, 2023-06-12 10:01:01
 */
public class IdentityInfo extends AlipayObject {

	private static final long serialVersionUID = 2121631895846913233L;

	/**
	 * 用户信息，longid或者openId
	 */
	@ApiField("identity")
	private String identity;

	/**
	 * 用户姓名。当identity_type是ALIPAY_LOGON_ID时，需要传
	 */
	@ApiField("identity_name")
	private String identityName;

	/**
	 * 用户身份类型；当type为ALIPAY_LOGON_ID时，需要传入identity_name；当type是ALIPAY_OPEN_ID时，不需要传identity_name
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
