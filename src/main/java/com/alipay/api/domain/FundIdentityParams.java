package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户实名信息参数
 *
 * @author auto create
 * @since 1.0, 2020-12-17 16:52:26
 */
public class FundIdentityParams extends AlipayObject {

	private static final long serialVersionUID = 3655481861292974994L;

	/**
	 * 参与方的唯一标识
	 */
	@ApiField("identity")
	private String identity;

	/**
	 * 用户实名信息hash值
	 */
	@ApiField("identity_hash")
	private String identityHash;

	/**
	 * 参与方的标识类型，目前支持如下类型： 1、ALIPAY_USER_ID 支付宝的会员ID 2、ALIPAY_LOGON_ID：支付宝登录号，支持邮箱和手机号格式
	 */
	@ApiField("identity_type")
	private String identityType;

	/**
	 * 参与方真实姓名，如果非空，将校验收款支付宝账号姓名一致性。当identity_type=ALIPAY_LOGON_ID时，本字段必填。
	 */
	@ApiField("name")
	private String name;

	/**
	 * 手机号
	 */
	@ApiField("phone")
	private String phone;

	public String getIdentity() {
		return this.identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public String getIdentityHash() {
		return this.identityHash;
	}
	public void setIdentityHash(String identityHash) {
		this.identityHash = identityHash;
	}

	public String getIdentityType() {
		return this.identityType;
	}
	public void setIdentityType(String identityType) {
		this.identityType = identityType;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
