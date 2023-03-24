package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人脸服务初始化(一体化)
 *
 * @author auto create
 * @since 1.0, 2021-12-24 19:13:12
 */
public class ZolozIdentificationCustomerCertifyzhubInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 7715171151732629467L;

	/**
	 * 设备token
	 */
	@ApiField("apdidtoken")
	private String apdidtoken;

	/**
	 * 应用名字
	 */
	@ApiField("appname")
	private String appname;

	/**
	 * 应用版本号
	 */
	@ApiField("appversion")
	private String appversion;

	/**
	 * 人脸sdk元信息
	 */
	@ApiField("biometainfo")
	private String biometainfo;

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
	 * 用于区分不同的业务场景，默认情况下不用填写，目前定义biz_type=3代表实人认证小程序，biz_type=4代表钉钉团餐业务匿名注册，biz_type=5代表钉钉团餐业务实名比对
	 */
	@ApiField("biz_type")
	private String bizType;

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
	 * 机型
	 */
	@ApiField("devicemodel")
	private String devicemodel;

	/**
	 * 设备类型
	 */
	@ApiField("devicetype")
	private String devicetype;

	/**
	 * 0：匿名注册  1：匿名认证   2：实名认证   3：实名转匿名注册。
	 */
	@ApiField("face_type")
	private Long faceType;

	/**
	 * 人脸引导页是否显示
	 */
	@ApiField("has_welcome_page")
	private Boolean hasWelcomePage;

	/**
	 * 手机号码
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 操作系统版本号
	 */
	@ApiField("osversion")
	private String osversion;

	/**
	 * true：代表后置摄像头
false：代表前置摄像头
	 */
	@ApiField("use_back_camera")
	private Boolean useBackCamera;

	/**
	 * 商户的用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getApdidtoken() {
		return this.apdidtoken;
	}
	public void setApdidtoken(String apdidtoken) {
		this.apdidtoken = apdidtoken;
	}

	public String getAppname() {
		return this.appname;
	}
	public void setAppname(String appname) {
		this.appname = appname;
	}

	public String getAppversion() {
		return this.appversion;
	}
	public void setAppversion(String appversion) {
		this.appversion = appversion;
	}

	public String getBiometainfo() {
		return this.biometainfo;
	}
	public void setBiometainfo(String biometainfo) {
		this.biometainfo = biometainfo;
	}

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

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
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

	public String getDevicemodel() {
		return this.devicemodel;
	}
	public void setDevicemodel(String devicemodel) {
		this.devicemodel = devicemodel;
	}

	public String getDevicetype() {
		return this.devicetype;
	}
	public void setDevicetype(String devicetype) {
		this.devicetype = devicetype;
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

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getOsversion() {
		return this.osversion;
	}
	public void setOsversion(String osversion) {
		this.osversion = osversion;
	}

	public Boolean getUseBackCamera() {
		return this.useBackCamera;
	}
	public void setUseBackCamera(Boolean useBackCamera) {
		this.useBackCamera = useBackCamera;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
