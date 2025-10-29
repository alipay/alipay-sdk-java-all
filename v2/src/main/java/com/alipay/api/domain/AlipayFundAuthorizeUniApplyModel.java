package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 超上借支授权申请
 *
 * @author auto create
 * @since 1.0, 2025-08-12 15:10:01
 */
public class AlipayFundAuthorizeUniApplyModel extends AlipayObject {

	private static final long serialVersionUID = 5817736911463273369L;

	/**
	 * 超时时间，过期跳转链接失效，格式为yyyy-MM-dd HH:mm。不传，有效期默认7天
	 */
	@ApiField("apply_expire_time")
	private String applyExpireTime;

	/**
	 * 业务扩展数据
	 */
	@ApiField("auth_biz_param")
	private AuthBizParam authBizParam;

	/**
	 * 授权失效时间，格式为yyyy-MM-dd HH:mm。 不传默认2115-01-01 00:00过期
	 */
	@ApiField("auth_expire_time")
	private String authExpireTime;

	/**
	 * 出资授权校验规则条目
	 */
	@ApiField("authorize_check_rule")
	private AuthorizeCheckRule authorizeCheckRule;

	/**
	 * 授权跳转类型，有限枚举：SHORT_URL
	 */
	@ApiField("authorize_link_type")
	private String authorizeLinkType;

	/**
	 * 回跳地址
	 */
	@ApiField("back_url")
	private String backUrl;

	/**
	 * 回跳地址类型
默认值: BACK_ALIPAY
	 */
	@ApiField("back_url_type")
	private String backUrlType;

	/**
	 * 业务场景码，固定值
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 跳转渠道，优先枚举值:
pc, h5, tinyapp
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 授权申请外部业务号，用于幂等控制
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 商户信息
	 */
	@ApiField("partner_info")
	private AuthParticipantInfo partnerInfo;

	/**
	 * 授权主体
	 */
	@ApiField("principal_info")
	private AuthParticipantInfo principalInfo;

	/**
	 * 业务产品码，固定值
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 业务子场景码
	 */
	@ApiField("sub_biz_scene")
	private String subBizScene;

	/**
	 * 第三方数据信息
	 */
	@ApiField("third_party_info")
	private AuthParticipantInfo thirdPartyInfo;

	public String getApplyExpireTime() {
		return this.applyExpireTime;
	}
	public void setApplyExpireTime(String applyExpireTime) {
		this.applyExpireTime = applyExpireTime;
	}

	public AuthBizParam getAuthBizParam() {
		return this.authBizParam;
	}
	public void setAuthBizParam(AuthBizParam authBizParam) {
		this.authBizParam = authBizParam;
	}

	public String getAuthExpireTime() {
		return this.authExpireTime;
	}
	public void setAuthExpireTime(String authExpireTime) {
		this.authExpireTime = authExpireTime;
	}

	public AuthorizeCheckRule getAuthorizeCheckRule() {
		return this.authorizeCheckRule;
	}
	public void setAuthorizeCheckRule(AuthorizeCheckRule authorizeCheckRule) {
		this.authorizeCheckRule = authorizeCheckRule;
	}

	public String getAuthorizeLinkType() {
		return this.authorizeLinkType;
	}
	public void setAuthorizeLinkType(String authorizeLinkType) {
		this.authorizeLinkType = authorizeLinkType;
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

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public AuthParticipantInfo getPartnerInfo() {
		return this.partnerInfo;
	}
	public void setPartnerInfo(AuthParticipantInfo partnerInfo) {
		this.partnerInfo = partnerInfo;
	}

	public AuthParticipantInfo getPrincipalInfo() {
		return this.principalInfo;
	}
	public void setPrincipalInfo(AuthParticipantInfo principalInfo) {
		this.principalInfo = principalInfo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getSubBizScene() {
		return this.subBizScene;
	}
	public void setSubBizScene(String subBizScene) {
		this.subBizScene = subBizScene;
	}

	public AuthParticipantInfo getThirdPartyInfo() {
		return this.thirdPartyInfo;
	}
	public void setThirdPartyInfo(AuthParticipantInfo thirdPartyInfo) {
		this.thirdPartyInfo = thirdPartyInfo;
	}

}
