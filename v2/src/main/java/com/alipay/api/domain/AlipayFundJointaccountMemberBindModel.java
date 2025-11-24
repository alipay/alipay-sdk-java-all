package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 因公付邀请员工
 *
 * @author auto create
 * @since 1.0, 2025-07-22 11:13:56
 */
public class AlipayFundJointaccountMemberBindModel extends AlipayObject {

	private static final long serialVersionUID = 1489661256225638856L;

	/**
	 * 账本ID
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 额度模型
	 */
	@ApiField("account_quota")
	private JointAccountQuotaDTO accountQuota;

	/**
	 * 授权签约协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 关联代扣协议签约串
	 */
	@ApiField("agreement_sign_info")
	private String agreementSignInfo;

	/**
	 * 业务场景，联系支付宝分配
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 成员邀请接口扩展字段
	 */
	@ApiField("business_params")
	private InviteMemberBusinessParamsDTO businessParams;

	/**
	 * 该字段为被邀请方账号ID：
当identity_type为ALIPAY_USER_ID时，需要填支付宝ID；当identity_type为ALIPAY_LOGON_ID时，需要填支付宝登录号；当identity_type为ALIPAY_OPEN_ID时，需要填支付宝openId
	 */
	@ApiField("identity")
	private String identity;

	/**
	 * 账号类型，目前支持如下类型：
1、ALIPAY_USER_ID 支付宝的会员ID 
2、ALIPAY_LOGON_ID：支付宝登录号，支持邮箱和手机号格式
3、ALIPAY_OPEN_ID：支付宝openId
	 */
	@ApiField("identity_type")
	private String identityType;

	/**
	 * 被邀请人的身份信息
	 */
	@ApiField("identity_verified_info")
	private IdentityVerifiedInfoDTO identityVerifiedInfo;

	/**
	 * 成员姓名，账号类型为ALIPAY_LOGON_ID时必填
	 */
	@ApiField("name")
	private String name;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public JointAccountQuotaDTO getAccountQuota() {
		return this.accountQuota;
	}
	public void setAccountQuota(JointAccountQuotaDTO accountQuota) {
		this.accountQuota = accountQuota;
	}

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getAgreementSignInfo() {
		return this.agreementSignInfo;
	}
	public void setAgreementSignInfo(String agreementSignInfo) {
		this.agreementSignInfo = agreementSignInfo;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public InviteMemberBusinessParamsDTO getBusinessParams() {
		return this.businessParams;
	}
	public void setBusinessParams(InviteMemberBusinessParamsDTO businessParams) {
		this.businessParams = businessParams;
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

	public IdentityVerifiedInfoDTO getIdentityVerifiedInfo() {
		return this.identityVerifiedInfo;
	}
	public void setIdentityVerifiedInfo(IdentityVerifiedInfoDTO identityVerifiedInfo) {
		this.identityVerifiedInfo = identityVerifiedInfo;
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

}
