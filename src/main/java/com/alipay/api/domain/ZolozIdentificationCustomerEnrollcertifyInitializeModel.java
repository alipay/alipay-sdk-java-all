package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人脸注册初始化
 *
 * @author auto create
 * @since 1.0, 2022-03-31 19:07:34
 */
public class ZolozIdentificationCustomerEnrollcertifyInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 8849512376859642622L;

	/**
	 * 商户请求的唯一标志，该标识作为对账的关键信息，商户要保证其唯一性
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 业务场景名字
	 */
	@ApiField("biz_scene_name")
	private String bizSceneName;

	/**
	 * 实人信息：证件名字
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * 实人信息：证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 实人信息：证件类型
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 0：匿名注册  1：匿名认证   2：实名认证
	 */
	@ApiField("face_type")
	private Long faceType;

	/**
	 * 人脸引导页是否显示
	 */
	@ApiField("has_welcome_page")
	private Boolean hasWelcomePage;

	/**
	 * metainfo环境参数
	 */
	@ApiField("metainfo")
	private String metainfo;

	/**
	 * 手机号码
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 商户的用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getBizSceneName() {
		return this.bizSceneName;
	}
	public void setBizSceneName(String bizSceneName) {
		this.bizSceneName = bizSceneName;
	}

	public String getCertName() {
		return this.certName;
	}
	public void setCertName(String certName) {
		this.certName = certName;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public Long getFaceType() {
		return this.faceType;
	}
	public void setFaceType(Long faceType) {
		this.faceType = faceType;
	}

	public Boolean getHasWelcomePage() {
		return this.hasWelcomePage;
	}
	public void setHasWelcomePage(Boolean hasWelcomePage) {
		this.hasWelcomePage = hasWelcomePage;
	}

	public String getMetainfo() {
		return this.metainfo;
	}
	public void setMetainfo(String metainfo) {
		this.metainfo = metainfo;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
