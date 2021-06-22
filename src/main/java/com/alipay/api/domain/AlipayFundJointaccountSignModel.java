package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业跳端签约
 *
 * @author auto create
 * @since 1.0, 2021-03-31 11:21:41
 */
public class AlipayFundJointaccountSignModel extends AlipayObject {

	private static final long serialVersionUID = 5243142528455574932L;

	/**
	 * 账本名称，传空采用默认规则命名，使用公司名称
	 */
	@ApiField("account_name")
	private String accountName;

	/**
	 * 账户初始额度
未设置额度的账本无法进行支付
	 */
	@ApiListField("account_quota")
	@ApiField("joint_account_quota_d_t_o")
	private List<JointAccountQuotaDTO> accountQuota;

	/**
	 * 授权商户列表
	 */
	@ApiListField("authorized_detail_list")
	@ApiField("authorize_detail_d_t_o")
	private List<AuthorizeDetailDTO> authorizedDetailList;

	/**
	 * 交易授权信息
指定收单商户
	 */
	@ApiField("authorized_rule")
	private AuthorizedRuleDTO authorizedRule;

	/**
	 * 业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 开户账号：
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
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	public String getAccountName() {
		return this.accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public List<JointAccountQuotaDTO> getAccountQuota() {
		return this.accountQuota;
	}
	public void setAccountQuota(List<JointAccountQuotaDTO> accountQuota) {
		this.accountQuota = accountQuota;
	}

	public List<AuthorizeDetailDTO> getAuthorizedDetailList() {
		return this.authorizedDetailList;
	}
	public void setAuthorizedDetailList(List<AuthorizeDetailDTO> authorizedDetailList) {
		this.authorizedDetailList = authorizedDetailList;
	}

	public AuthorizedRuleDTO getAuthorizedRule() {
		return this.authorizedRule;
	}
	public void setAuthorizedRule(AuthorizedRuleDTO authorizedRule) {
		this.authorizedRule = authorizedRule;
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

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
