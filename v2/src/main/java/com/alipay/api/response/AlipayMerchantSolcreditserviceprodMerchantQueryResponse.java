package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OtherSettleAccountDTO;
import com.alipay.api.domain.PromiseConfigDTO;
import com.alipay.api.domain.RiskConfigDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.solcreditserviceprod.merchant.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-14 20:02:21
 */
public class AlipayMerchantSolcreditserviceprodMerchantQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2252241827282464955L;

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
	 * 商家自定义
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
	 * 失败原因
	 */
	@ApiField("review_fail_reason")
	private String reviewFailReason;

	/** 
	 * 初始化: INIT;
审核中: UNDER_REVIEW;
已通过: PASSED;
未通过: FAILED
	 */
	@ApiField("review_status")
	private String reviewStatus;

	/** 
	 * 最新审核版本号
	 */
	@ApiField("review_version_no")
	private String reviewVersionNo;

	/** 
	 * 信用服务风控配置，为必传字段。此字段为复杂模型，其中类目code为必传属性。
	 */
	@ApiField("risk_config")
	private RiskConfigDTO riskConfig;

	/** 
	 * 对应使用场景
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/** 
	 * 直付通进件
	 */
	@ApiField("smid")
	private String smid;

	/** 
	 * 初始化: INIT;
正常: NORMAL
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 为空则表示暂无审核通过版本
	 */
	@ApiField("version_no")
	private String versionNo;

	public void setAlipaySettlementAccount(String alipaySettlementAccount) {
		this.alipaySettlementAccount = alipaySettlementAccount;
	}
	public String getAlipaySettlementAccount( ) {
		return this.alipaySettlementAccount;
	}

	public void setAppJumpLink(String appJumpLink) {
		this.appJumpLink = appJumpLink;
	}
	public String getAppJumpLink( ) {
		return this.appJumpLink;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	public String getContactEmail( ) {
		return this.contactEmail;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getContactNumber( ) {
		return this.contactNumber;
	}

	public void setIsvSeparateLedgerRate(String isvSeparateLedgerRate) {
		this.isvSeparateLedgerRate = isvSeparateLedgerRate;
	}
	public String getIsvSeparateLedgerRate( ) {
		return this.isvSeparateLedgerRate;
	}

	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}
	public String getLogoUrl( ) {
		return this.logoUrl;
	}

	public void setMerchantAppId(String merchantAppId) {
		this.merchantAppId = merchantAppId;
	}
	public String getMerchantAppId( ) {
		return this.merchantAppId;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public String getMerchantName( ) {
		return this.merchantName;
	}

	public void setOtherSettleAccountList(List<OtherSettleAccountDTO> otherSettleAccountList) {
		this.otherSettleAccountList = otherSettleAccountList;
	}
	public List<OtherSettleAccountDTO> getOtherSettleAccountList( ) {
		return this.otherSettleAccountList;
	}

	public void setPromiseConfig(PromiseConfigDTO promiseConfig) {
		this.promiseConfig = promiseConfig;
	}
	public PromiseConfigDTO getPromiseConfig( ) {
		return this.promiseConfig;
	}

	public void setReviewFailReason(String reviewFailReason) {
		this.reviewFailReason = reviewFailReason;
	}
	public String getReviewFailReason( ) {
		return this.reviewFailReason;
	}

	public void setReviewStatus(String reviewStatus) {
		this.reviewStatus = reviewStatus;
	}
	public String getReviewStatus( ) {
		return this.reviewStatus;
	}

	public void setReviewVersionNo(String reviewVersionNo) {
		this.reviewVersionNo = reviewVersionNo;
	}
	public String getReviewVersionNo( ) {
		return this.reviewVersionNo;
	}

	public void setRiskConfig(RiskConfigDTO riskConfig) {
		this.riskConfig = riskConfig;
	}
	public RiskConfigDTO getRiskConfig( ) {
		return this.riskConfig;
	}

	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}
	public String getSceneCode( ) {
		return this.sceneCode;
	}

	public void setSmid(String smid) {
		this.smid = smid;
	}
	public String getSmid( ) {
		return this.smid;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setVersionNo(String versionNo) {
		this.versionNo = versionNo;
	}
	public String getVersionNo( ) {
		return this.versionNo;
	}

}
