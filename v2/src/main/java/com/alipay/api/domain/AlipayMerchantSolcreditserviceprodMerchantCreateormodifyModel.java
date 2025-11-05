package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商户编辑
 *
 * @author auto create
 * @since 1.0, 2024-11-14 19:52:19
 */
public class AlipayMerchantSolcreditserviceprodMerchantCreateormodifyModel extends AlipayObject {

	private static final long serialVersionUID = 3289281428413793536L;

	/**
	 * 用户支付金额结算账户
填入支付宝账户（手机号或邮箱）
	 */
	@ApiField("alipay_settlement_account")
	private String alipaySettlementAccount;

	/**
	 * 不传则默认小程序首页
	 */
	@ApiField("app_jump_link")
	private String appJumpLink;

	/**
	 * 商户邮箱
	 */
	@ApiField("contact_email")
	private String contactEmail;

	/**
	 * 座机或手机
	 */
	@ApiField("contact_number")
	private String contactNumber;

	/**
	 * 服务商抽成比例（百分比）
	 */
	@ApiField("isv_separate_ledger_rate")
	private String isvSeparateLedgerRate;

	/**
	 * 需要使用通用图片上传接口返回的链接
	 */
	@ApiField("logo_url")
	private String logoUrl;

	/**
	 * 商户使用的小程序ID
	 */
	@ApiField("merchant_app_id")
	private String merchantAppId;

	/**
	 * 商户名称，商家自定义
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 其余分账账户信息
	 */
	@ApiListField("other_settle_account_list")
	@ApiField("other_settle_account_d_t_o")
	private List<OtherSettleAccountDTO> otherSettleAccountList;

	/**
	 * 信用服务守护配置，为必传字段。此字段为复杂模型，其中商户服务电话为必传属性。
	 */
	@ApiField("promise_config")
	private PromiseConfigDTO promiseConfig;

	/**
	 * 信用服务风控配置
	 */
	@ApiField("risk_config")
	private RiskConfigDTO riskConfig;

	/**
	 * 对应使用场景
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 二级商户 ID，直付通进件
	 */
	@ApiField("smid")
	private String smid;

	public String getAlipaySettlementAccount() {
		return this.alipaySettlementAccount;
	}
	public void setAlipaySettlementAccount(String alipaySettlementAccount) {
		this.alipaySettlementAccount = alipaySettlementAccount;
	}

	public String getAppJumpLink() {
		return this.appJumpLink;
	}
	public void setAppJumpLink(String appJumpLink) {
		this.appJumpLink = appJumpLink;
	}

	public String getContactEmail() {
		return this.contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getContactNumber() {
		return this.contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getIsvSeparateLedgerRate() {
		return this.isvSeparateLedgerRate;
	}
	public void setIsvSeparateLedgerRate(String isvSeparateLedgerRate) {
		this.isvSeparateLedgerRate = isvSeparateLedgerRate;
	}

	public String getLogoUrl() {
		return this.logoUrl;
	}
	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	public String getMerchantAppId() {
		return this.merchantAppId;
	}
	public void setMerchantAppId(String merchantAppId) {
		this.merchantAppId = merchantAppId;
	}

	public String getMerchantName() {
		return this.merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public List<OtherSettleAccountDTO> getOtherSettleAccountList() {
		return this.otherSettleAccountList;
	}
	public void setOtherSettleAccountList(List<OtherSettleAccountDTO> otherSettleAccountList) {
		this.otherSettleAccountList = otherSettleAccountList;
	}

	public PromiseConfigDTO getPromiseConfig() {
		return this.promiseConfig;
	}
	public void setPromiseConfig(PromiseConfigDTO promiseConfig) {
		this.promiseConfig = promiseConfig;
	}

	public RiskConfigDTO getRiskConfig() {
		return this.riskConfig;
	}
	public void setRiskConfig(RiskConfigDTO riskConfig) {
		this.riskConfig = riskConfig;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

}
