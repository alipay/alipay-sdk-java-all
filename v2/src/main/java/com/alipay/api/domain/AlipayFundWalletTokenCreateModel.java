package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户绑定申请token
 *
 * @author auto create
 * @since 1.0, 2024-11-27 18:49:51
 */
public class AlipayFundWalletTokenCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6555782255496827745L;

	/**
	 * alipay.user.agreement.page.sign返回的代扣签约串
	 */
	@ApiField("agreement_pay_sign")
	private String agreementPaySign;

	/**
	 * 结果页的跳转地址。
1. 跳转类型为dont_back_app，back_url就不做跳端，back_url格式必须为： https://开头域名链接地址或者 alipays://开头的支付宝小程序链接
2、跳转类型为back_app，back_url就做跳端，不做格式校验
	 */
	@ApiField("back_url")
	private String backUrl;

	/**
	 * 用于开户完成之后的地址跳转（目前有跳端、不跳端）
1、类型为back_app，代表back_url按照跳端方式拼接
2、类型为dont_back_app，back_url就不跳端
	 */
	@ApiField("back_url_type")
	private String backUrlType;

	/**
	 * 业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 如果是ALIPAY_USER_ID，则传用户账号；如果是ALIPAY_LOGON_ID，则传手机号
	 */
	@ApiField("identity")
	private String identity;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("identity_open_id")
	private String identityOpenId;

	/**
	 * 登陆类型
	 */
	@ApiField("identity_type")
	private String identityType;

	/**
	 * 是否校验主体身份信息
	 */
	@ApiField("need_check_identity")
	private Boolean needCheckIdentity;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 销售产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 如果账号类型是ALIPAY_LOGON_ID，则必传用户真实姓名，进行信息校验
	 */
	@ApiField("real_name")
	private String realName;

	/**
	 * 是否跳过结果页,true为跳过，false为不跳过。默认不跳过
	 */
	@ApiField("skip_result")
	private Boolean skipResult;

	/**
	 * 场景钱包模版id
	 */
	@ApiField("wallet_template_id")
	private String walletTemplateId;

	/**
	 * 用户主体身份信息
	 */
	@ApiField("wallet_user_identity_info")
	private WalletUserIdentityInfo walletUserIdentityInfo;

	public String getAgreementPaySign() {
		return this.agreementPaySign;
	}
	public void setAgreementPaySign(String agreementPaySign) {
		this.agreementPaySign = agreementPaySign;
	}

	public String getBackUrl() {
		return this.backUrl;
	}
	public void setBackUrl(String backUrl) {
		this.backUrl = backUrl;
	}

	public String getBackUrlType() {
		return this.backUrlType;
	}
	public void setBackUrlType(String backUrlType) {
		this.backUrlType = backUrlType;
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

	public Boolean getNeedCheckIdentity() {
		return this.needCheckIdentity;
	}
	public void setNeedCheckIdentity(Boolean needCheckIdentity) {
		this.needCheckIdentity = needCheckIdentity;
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

	public WalletUserIdentityInfo getWalletUserIdentityInfo() {
		return this.walletUserIdentityInfo;
	}
	public void setWalletUserIdentityInfo(WalletUserIdentityInfo walletUserIdentityInfo) {
		this.walletUserIdentityInfo = walletUserIdentityInfo;
	}

}
