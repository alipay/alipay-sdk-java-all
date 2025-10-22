package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开放认证商户配置
 *
 * @author auto create
 * @since 1.0, 2023-03-01 14:25:16
 */
public class OpenCertifyMerchantConfig extends AlipayObject {

	private static final long serialVersionUID = 8261328236346126838L;

	/**
	 * 用于开放认证授权
	 */
	@ApiField("auth_scope")
	private String authScope;

	/**
	 * 用于指定授权类型，与auth_scope配合使用
	 */
	@ApiField("auth_type")
	private String authType;

	/**
	 * 不传默认为reserve
	 */
	@ApiField("face_reserve_strategy")
	private String faceReserveStrategy;

	/**
	 * 若有特殊人脸等级采集要求，可指定等级
	 */
	@ApiField("facial_picture_level")
	private String facialPictureLevel;

	/**
	 * 用于授权二级商户操作
	 */
	@ApiField("linked_merchant_app_id")
	private String linkedMerchantAppId;

	/**
	 * 用于指定展示的商户logo
	 */
	@ApiField("linked_merchant_logo_url")
	private String linkedMerchantLogoUrl;

	/**
	 * 用于指定展示的商户名称
	 */
	@ApiField("linked_merchant_name")
	private String linkedMerchantName;

	/**
	 * 在拥有该权限前提下，用于商户控制是否透出活体人脸
	 */
	@ApiField("out_put_facial_picture")
	private Boolean outPutFacialPicture;

	/**
	 * 认证成功后需要跳转的地址，一般为商户业务页面；若无跳转地址可填空字符"";
	 */
	@ApiField("return_url")
	private String returnUrl;

	public String getAuthScope() {
		return this.authScope;
	}
	public void setAuthScope(String authScope) {
		this.authScope = authScope;
	}

	public String getAuthType() {
		return this.authType;
	}
	public void setAuthType(String authType) {
		this.authType = authType;
	}

	public String getFaceReserveStrategy() {
		return this.faceReserveStrategy;
	}
	public void setFaceReserveStrategy(String faceReserveStrategy) {
		this.faceReserveStrategy = faceReserveStrategy;
	}

	public String getFacialPictureLevel() {
		return this.facialPictureLevel;
	}
	public void setFacialPictureLevel(String facialPictureLevel) {
		this.facialPictureLevel = facialPictureLevel;
	}

	public String getLinkedMerchantAppId() {
		return this.linkedMerchantAppId;
	}
	public void setLinkedMerchantAppId(String linkedMerchantAppId) {
		this.linkedMerchantAppId = linkedMerchantAppId;
	}

	public String getLinkedMerchantLogoUrl() {
		return this.linkedMerchantLogoUrl;
	}
	public void setLinkedMerchantLogoUrl(String linkedMerchantLogoUrl) {
		this.linkedMerchantLogoUrl = linkedMerchantLogoUrl;
	}

	public String getLinkedMerchantName() {
		return this.linkedMerchantName;
	}
	public void setLinkedMerchantName(String linkedMerchantName) {
		this.linkedMerchantName = linkedMerchantName;
	}

	public Boolean getOutPutFacialPicture() {
		return this.outPutFacialPicture;
	}
	public void setOutPutFacialPicture(Boolean outPutFacialPicture) {
		this.outPutFacialPicture = outPutFacialPicture;
	}

	public String getReturnUrl() {
		return this.returnUrl;
	}
	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}

}
