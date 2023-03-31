package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业删除员工
 *
 * @author auto create
 * @since 1.0, 2023-03-13 14:02:59
 */
public class AlipayFundJointaccountMemberUnbindModel extends AlipayObject {

	private static final long serialVersionUID = 4575784816225455268L;

	/**
	 * 账本id
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 授权协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 成员账号：
identity_type是ALIPAY_USER_ID填支付宝会员ID（2088开头）；
是ALIPAY_LOGON_ID 填支付宝登录号
	 */
	@ApiField("identity")
	private String identity;

	/**
	 * 账号类型，目前支持如下类型： 1、ALIPAY_USER_ID 支付宝的会员ID 2、ALIPAY_LOGON_ID：支付宝登录号，支持邮箱和手机号格式
	 */
	@ApiField("identity_type")
	private String identityType;

	/**
	 * 姓名，账号类型为ALIPAY_LOGON_ID时必填
	 */
	@ApiField("name")
	private String name;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 成员当前状态：
邀请中（PROCESSING）、正常（NORMAL）
	 */
	@ApiField("status")
	private String status;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
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

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
