package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业入驻
 *
 * @author auto create
 * @since 1.0, 2024-07-22 17:41:11
 */
public class AlipayCommerceEcEnterpriseCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5823877554874553299L;

	/**
	 * 用于区分资金因公付协议、以及收银台文案等差异；
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 是否设置管理员支付宝为企业出资账户
	 */
	@ApiField("create_fund_account")
	private Boolean createFundAccount;

	/**
	 * 是否创建企业人脸库，适用于对接团餐刷脸付、门禁刷脸通行等场景
	 */
	@ApiField("create_iot_group")
	private Boolean createIotGroup;

	/**
	 * 企业简称
	 */
	@ApiField("enterprise_alias")
	private String enterpriseAlias;

	/**
	 * 企业名称
	 */
	@ApiField("enterprise_name")
	private String enterpriseName;

	/**
	 * 订购【一脸通行开通插件】的小程序appId
	 */
	@ApiField("group_app_id")
	private String groupAppId;

	/**
	 * 管理员身份标识
	 */
	@ApiField("identity")
	private String identity;

	/**
	 * 管理员姓名
	 */
	@ApiField("identity_name")
	private String identityName;

	/**
	 * 管理员身份openId
	 */
	@ApiField("identity_open_id")
	private String identityOpenId;

	/**
	 * 管理员身份类型
	 */
	@ApiField("identity_type")
	private String identityType;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 企业码签约后回跳地址。不传默认为空，签约后停留在当前页。
	 */
	@ApiField("sign_return_url")
	private String signReturnUrl;

	/**
	 * 管理员签约终端类型 当前字段已废弃(字段已废弃，不需要服务商传入)
	 */
	@ApiField("sign_terminal")
	@Deprecated
	private String signTerminal;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public Boolean getCreateFundAccount() {
		return this.createFundAccount;
	}
	public void setCreateFundAccount(Boolean createFundAccount) {
		this.createFundAccount = createFundAccount;
	}

	public Boolean getCreateIotGroup() {
		return this.createIotGroup;
	}
	public void setCreateIotGroup(Boolean createIotGroup) {
		this.createIotGroup = createIotGroup;
	}

	public String getEnterpriseAlias() {
		return this.enterpriseAlias;
	}
	public void setEnterpriseAlias(String enterpriseAlias) {
		this.enterpriseAlias = enterpriseAlias;
	}

	public String getEnterpriseName() {
		return this.enterpriseName;
	}
	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}

	public String getGroupAppId() {
		return this.groupAppId;
	}
	public void setGroupAppId(String groupAppId) {
		this.groupAppId = groupAppId;
	}

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

	public String getIdentityOpenId() {
		return this.identityOpenId;
	}
	public void setIdentityOpenId(String identityOpenId) {
		this.identityOpenId = identityOpenId;
	}

	public String getIdentityType() {
		return this.identityType;
	}
	public void setIdentityType(String identityType) {
		this.identityType = identityType;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getSignReturnUrl() {
		return this.signReturnUrl;
	}
	public void setSignReturnUrl(String signReturnUrl) {
		this.signReturnUrl = signReturnUrl;
	}

	public String getSignTerminal() {
		return this.signTerminal;
	}
	public void setSignTerminal(String signTerminal) {
		this.signTerminal = signTerminal;
	}

}
