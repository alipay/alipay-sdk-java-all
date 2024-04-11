package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业码授信资产授权申请
 *
 * @author auto create
 * @since 1.0, 2023-10-10 14:45:52
 */
public class AlipayCommerceEcAssetAuthorizeApplyModel extends AlipayObject {

	private static final long serialVersionUID = 3847443387687146871L;

	/**
	 * 共同账户ID
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 授权签约协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 签约类型
	 */
	@ApiField("asset_type")
	private String assetType;

	/**
	 * 签约类型
	 */
	@ApiField("auth_type")
	private String authType;

	/**
	 * 法人支付宝登录账号
	 */
	@ApiField("ebe_alipay_logon_id")
	private String ebeAlipayLogonId;

	/**
	 * 企业支付宝登录账号
	 */
	@ApiField("ent_alipay_logon_id")
	private String entAlipayLogonId;

	/**
	 * 企业ID
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 签约终端类型，默认MOBILE
	 */
	@ApiField("sign_terminal")
	private String signTerminal;

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

	public String getAssetType() {
		return this.assetType;
	}
	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

	public String getAuthType() {
		return this.authType;
	}
	public void setAuthType(String authType) {
		this.authType = authType;
	}

	public String getEbeAlipayLogonId() {
		return this.ebeAlipayLogonId;
	}
	public void setEbeAlipayLogonId(String ebeAlipayLogonId) {
		this.ebeAlipayLogonId = ebeAlipayLogonId;
	}

	public String getEntAlipayLogonId() {
		return this.entAlipayLogonId;
	}
	public void setEntAlipayLogonId(String entAlipayLogonId) {
		this.entAlipayLogonId = entAlipayLogonId;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getSignTerminal() {
		return this.signTerminal;
	}
	public void setSignTerminal(String signTerminal) {
		this.signTerminal = signTerminal;
	}

}
