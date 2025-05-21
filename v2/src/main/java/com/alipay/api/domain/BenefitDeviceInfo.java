package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备信息
 *
 * @author auto create
 * @since 1.0, 2024-08-02 10:17:52
 */
public class BenefitDeviceInfo extends AlipayObject {

	private static final long serialVersionUID = 1837793239156454727L;

	/**
	 * 设备ID
	 */
	@ApiField("apd_id")
	private String apdId;

	/**
	 * 钱包版本
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 手机品牌，非固定值
	 */
	@ApiField("mobile_brand")
	private String mobileBrand;

	/**
	 * 手机机型
	 */
	@ApiField("mobile_model")
	private String mobileModel;

	/**
	 * 操作系统
	 */
	@ApiField("os_type")
	private String osType;

	/**
	 * 屏幕高，单位：px
	 */
	@ApiField("screen_height")
	private String screenHeight;

	/**
	 * 屏幕宽，单位：px
	 */
	@ApiField("screen_width")
	private String screenWidth;

	/**
	 * 操作系统类型
	 */
	@ApiField("system_type")
	private String systemType;

	/**
	 * 操作系统版本
	 */
	@ApiField("system_version")
	private String systemVersion;

	/**
	 * 无线设备统一ID方案
	 */
	@ApiField("utd_id")
	private String utdId;

	public String getApdId() {
		return this.apdId;
	}
	public void setApdId(String apdId) {
		this.apdId = apdId;
	}

	public String getAppVersion() {
		return this.appVersion;
	}
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public String getMobileBrand() {
		return this.mobileBrand;
	}
	public void setMobileBrand(String mobileBrand) {
		this.mobileBrand = mobileBrand;
	}

	public String getMobileModel() {
		return this.mobileModel;
	}
	public void setMobileModel(String mobileModel) {
		this.mobileModel = mobileModel;
	}

	public String getOsType() {
		return this.osType;
	}
	public void setOsType(String osType) {
		this.osType = osType;
	}

	public String getScreenHeight() {
		return this.screenHeight;
	}
	public void setScreenHeight(String screenHeight) {
		this.screenHeight = screenHeight;
	}

	public String getScreenWidth() {
		return this.screenWidth;
	}
	public void setScreenWidth(String screenWidth) {
		this.screenWidth = screenWidth;
	}

	public String getSystemType() {
		return this.systemType;
	}
	public void setSystemType(String systemType) {
		this.systemType = systemType;
	}

	public String getSystemVersion() {
		return this.systemVersion;
	}
	public void setSystemVersion(String systemVersion) {
		this.systemVersion = systemVersion;
	}

	public String getUtdId() {
		return this.utdId;
	}
	public void setUtdId(String utdId) {
		this.utdId = utdId;
	}

}
