package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业入驻
 *
 * @author auto create
 * @since 1.0, 2022-08-13 00:13:25
 */
public class AlipayCommerceEcEnterpriseCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3767256284268682719L;

	/**
	 * 企业名称
	 */
	@ApiField("enterprise_name")
	private String enterpriseName;

	/**
	 * 身份，对应身份类型进行传参，例如：
企业支付宝登录账号(支持手机号或者邮箱)或企业支付宝会员id(对应2088开头的支付宝会员id)
	 */
	@ApiField("identity")
	private String identity;

	/**
	 * 身份类型,目前支持传参如下：
ALIPAY_LOGON_ID(企业支付宝登录账号)
ALIPAY_USER_ID(企业支付宝会员id)
	 */
	@ApiField("identity_type")
	private String identityType;

	public String getEnterpriseName() {
		return this.enterpriseName;
	}
	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}

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
