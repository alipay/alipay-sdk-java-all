package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 受邀者信息
 *
 * @author auto create
 * @since 1.0, 2021-09-01 15:18:48
 */
public class InviteMemberForm extends AlipayObject {

	private static final long serialVersionUID = 8653519317966526857L;

	/**
	 * 开户账号：<br>
-当identity_type是ALIPAY_USER_ID时填支付宝会员ID（2088开头）<br>
-当identity_type是ALIPAY_LOGON_ID 时填支付宝登录号<br>
-当identity_type是OUT_USER_ID时填外部平台的用户uid<br>
	 */
	@ApiField("identity")
	private String identity;

	/**
	 * 账号类型，目前支持如下类型： <br>
-ALIPAY_USER_ID 支付宝的会员ID<br>
-ALIPAY_LOGON_ID：支付宝登录号，支持邮箱和手机号格式<br>
-OUT_USER_ID：外部用户uid，如钉钉侧的钉钉会员uid
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
