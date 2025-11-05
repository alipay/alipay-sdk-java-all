package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PromiseConfigDTO;
import com.alipay.api.domain.RiskConfigDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.solcreditserviceprod.merchantreview.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-14 20:02:20
 */
public class AlipayMerchantSolcreditserviceprodMerchantreviewQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1834268126124826418L;

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
	 * 信用服务守护配置，为必传字段。此字段为复杂模型，其中商户服务电话为必传属性。
	 */
	@ApiField("promise_config")
	private PromiseConfigDTO promiseConfig;

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
	 * 为空则表示暂无审核通过版本
	 */
	@ApiField("version_no")
	private String versionNo;

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

	public void setPromiseConfig(PromiseConfigDTO promiseConfig) {
		this.promiseConfig = promiseConfig;
	}
	public PromiseConfigDTO getPromiseConfig( ) {
		return this.promiseConfig;
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

	public void setVersionNo(String versionNo) {
		this.versionNo = versionNo;
	}
	public String getVersionNo( ) {
		return this.versionNo;
	}

}
