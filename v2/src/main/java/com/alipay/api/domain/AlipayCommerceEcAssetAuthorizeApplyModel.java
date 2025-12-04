package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业码授信资产授权申请
 *
 * @author auto create
 * @since 1.0, 2024-07-08 14:33:51
 */
public class AlipayCommerceEcAssetAuthorizeApplyModel extends AlipayObject {

	private static final long serialVersionUID = 1233768185125567619L;

	/**
	 * 共同账户ID 当前字段已废弃(account_id及agreement_no兼容字段不再需要)
	 */
	@ApiField("account_id")
	@Deprecated
	private String accountId;

	/**
	 * 授权签约协议号 当前字段已废弃(account_id及agreement_no兼容字段不再需要)
	 */
	@ApiField("agreement_no")
	@Deprecated
	private String agreementNo;

	/**
	 * 资产类型，每个类型都有对应的一组签约操作，关联关系如下：
a. 企业余额：因公付签约（ENT_PAY_SIGN）；
b. 上海华瑞银行授信：华瑞银行授信申请（ENT_SHRB_CREDIT）-> 因公付签约（ENT_PAY_SIGN）；
	 */
	@ApiField("asset_type")
	private String assetType;

	/**
	 * 签约类型
	 */
	@ApiField("auth_type")
	private String authType;

	/**
	 * 企业法人支付宝登录账号，资产申请人在法人授信申请流程填写，系统会对其进行有效性校验 当前字段已废弃(资产类型"法人信用卡"不支持，其流程需要的法人账号信息也不再需要)
	 */
	@ApiField("ebe_alipay_logon_id")
	@Deprecated
	private String ebeAlipayLogonId;

	/**
	 * 企业支付宝登录账号
	 */
	@ApiField("ent_alipay_logon_id")
	private String entAlipayLogonId;

	/**
	 * 企业Id，企业入驻企业码时自动分配的企业身份唯一标识
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 外部业务编号，调用方生成的用于唯一标识授信申请的单据号
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
