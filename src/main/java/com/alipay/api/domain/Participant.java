package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 转账的收、付款参与方
 *
 * @author auto create
 * @since 1.0, 2022-01-10 14:33:37
 */
public class Participant extends AlipayObject {

	private static final long serialVersionUID = 1237548461566624349L;

	/**
	 * 如果identity_type为BANKCARD_NO需传递该参数，涉及属性如下：
inst_name 银行卡卡开户银行
inst_province 银行所在省份
inst_city 银行所在市
inst_branch_name 收款银行所属支行
bank_code 银行卡支行联行号
account_type 银行卡账户类型 1:对公 2：对私
	 */
	@ApiField("bankcard_ext_info")
	private BankcardExtInfo bankcardExtInfo;

	/**
	 * 描述参与方信息的扩展属性，使用前请与支付宝工程师确认
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 参与方的唯一标识
	 */
	@ApiField("identity")
	private String identity;

	/**
	 * 参与方的标识类型，目前支持如下类型：
1、ALIPAY_USER_ID 支付宝的会员ID
2、ALIPAY_LOGON_ID：支付宝登录号，支持邮箱和手机号格式
	 */
	@ApiField("identity_type")
	private String identityType;

	/**
	 * 商户端的用户信息描述，目前可指定如下属性：
merchant_user_id：商户端的用户唯一ID
merchant_user_name：商户端的用户名
merchant_user_nickname：商户端的用户昵称
merchant_user_mobile：商户端的手机号
	 */
	@ApiField("merchant_user_info")
	private String merchantUserInfo;

	/**
	 * 参与方真实姓名，如果非空，将校验收款支付宝账号姓名一致性。当identity_type=ALIPAY_LOGON_ID时，本字段必填。
	 */
	@ApiField("name")
	private String name;

	public BankcardExtInfo getBankcardExtInfo() {
		return this.bankcardExtInfo;
	}
	public void setBankcardExtInfo(BankcardExtInfo bankcardExtInfo) {
		this.bankcardExtInfo = bankcardExtInfo;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
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

	public String getMerchantUserInfo() {
		return this.merchantUserInfo;
	}
	public void setMerchantUserInfo(String merchantUserInfo) {
		this.merchantUserInfo = merchantUserInfo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
