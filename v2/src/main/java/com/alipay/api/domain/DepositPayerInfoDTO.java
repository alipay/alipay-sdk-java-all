package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 标准充值付款方模型
 *
 * @author auto create
 * @since 1.0, 2024-07-17 11:00:16
 */
public class DepositPayerInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 5826723359737989474L;

	/**
	 * 描述参与方信息的扩展属性，使用前请与支付宝工程师确认
	 */
	@ApiField("ext_info")
	private RepaymentParticipantExtInfo extInfo;

	/**
	 * 参与方的唯一标识。
	 */
	@ApiField("identity")
	private String identity;

	/**
	 * 参与方的标识类型，目前支持如下类型：
1、ALIPAY_USER_ID 支付宝的会员ID 
2、ALIPAY_LOGON_ID：支付宝登录号，支持邮箱和手机号格式 
3、ALIPAY_OPEN_ID：支付宝openid
	 */
	@ApiField("identity_type")
	private String identityType;

	/**
	 * 参与方真实姓名，如果非空，将校验收款支付宝账号姓名一致性。
	 */
	@ApiField("name")
	private String name;

	public RepaymentParticipantExtInfo getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(RepaymentParticipantExtInfo extInfo) {
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

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
