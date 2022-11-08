package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 出资扩展信息
 *
 * @author auto create
 * @since 1.0, 2022-06-06 20:06:23
 */
public class FundExtInfo extends AlipayObject {

	private static final long serialVersionUID = 8538977659498161527L;

	/**
	 * 出资主体账号，fund_identity_type是ALIPAY_USER_ID填支付宝会员ID（2088开头）；
是ALIPAY_LOGON_ID 填支付宝登录号
	 */
	@ApiField("fund_identity")
	private String fundIdentity;

	/**
	 * 出资主体账号类型，目前支持如下类型： 1、ALIPAY_USER_ID 支付宝的会员ID 2、ALIPAY_LOGON_ID：支付宝登录号，支持邮箱和手机号格式
	 */
	@ApiField("fund_identity_type")
	private String fundIdentityType;

	public String getFundIdentity() {
		return this.fundIdentity;
	}
	public void setFundIdentity(String fundIdentity) {
		this.fundIdentity = fundIdentity;
	}

	public String getFundIdentityType() {
		return this.fundIdentityType;
	}
	public void setFundIdentityType(String fundIdentityType) {
		this.fundIdentityType = fundIdentityType;
	}

}
