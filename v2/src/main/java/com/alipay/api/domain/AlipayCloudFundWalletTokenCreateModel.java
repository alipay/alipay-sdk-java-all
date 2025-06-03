package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 平台邀请商家开通钱包账户
 *
 * @author auto create
 * @since 1.0, 2024-07-15 18:14:17
 */
public class AlipayCloudFundWalletTokenCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8232759523727624348L;

	/**
	 * 格式必须为： https://开头域名链接地址 或者 alipays://开头的支付宝小程序链接。 2. 需要保证传入的 returnUrl 链接能够有效访问
	 */
	@ApiField("back_url")
	private String backUrl;

	/**
	 * 钱包场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 待邀请用户的支付宝账号：
identity_type是ALIPAY_USER_ID填支付宝会员账号；
是ALIPAY_LOGON_ID 填支付宝登录号（支持邮箱和手机号格式）
	 */
	@ApiField("identity")
	private String identity;

	/**
	 * 待邀请用户的支付宝账号：
identity_type是ALIPAY_USER_ID填支付宝会员账号；
是ALIPAY_LOGON_ID 填支付宝登录号（支持邮箱和手机号格式）
	 */
	@ApiField("identity_open_id")
	private String identityOpenId;

	/**
	 * 待邀请的用户支付宝账号类型，目前支持如下类型： 
1、ALIPAY_USER_ID 
支付宝的会员ID 
2、ALIPAY_LOGON_ID
支付宝登录号，支持邮箱和手机号格式
	 */
	@ApiField("identity_type")
	private String identityType;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 钱包产品code一般为FUND_TRUSTSHIP
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 如果账号类型是ALIPAY_LOGIN_ID，则必传用户真实姓名，进行信息校验
	 */
	@ApiField("real_name")
	private String realName;

	/**
	 * 是否跳过结果页,true为跳过，false为不跳过。默认不跳过
	 */
	@ApiField("skip_result")
	private Boolean skipResult;

	/**
	 * 钱包模板id
	 */
	@ApiField("wallet_template_id")
	private String walletTemplateId;

	public String getBackUrl() {
		return this.backUrl;
	}
	public void setBackUrl(String backUrl) {
		this.backUrl = backUrl;
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

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getRealName() {
		return this.realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}

	public Boolean getSkipResult() {
		return this.skipResult;
	}
	public void setSkipResult(Boolean skipResult) {
		this.skipResult = skipResult;
	}

	public String getWalletTemplateId() {
		return this.walletTemplateId;
	}
	public void setWalletTemplateId(String walletTemplateId) {
		this.walletTemplateId = walletTemplateId;
	}

}
