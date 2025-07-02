package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 刷脸支付初始化
 *
 * @author auto create
 * @since 1.0, 2022-10-10 11:01:34
 */
public class ZolozAuthenticationSmilepayInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 7398688315447356182L;

	/**
	 * 设备指纹，用于唯一标识一台设备
	 */
	@ApiField("apdid_token")
	private String apdidToken;

	/**
	 * 人脸识别应用名称
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 人脸识别应用版本号
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 基础包版本号
	 */
	@ApiField("base_ver")
	private String baseVer;

	/**
	 * 生物识别元信息
	 */
	@ApiField("bio_meta_info")
	private String bioMetaInfo;

	/**
	 * 设备型号
	 */
	@ApiField("device_model")
	private String deviceModel;

	/**
	 * 设备类型
	 */
	@ApiField("device_type")
	private String deviceType;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private FaceExtParams extInfo;

	/**
	 * 机具信息，调用人脸识别SDK获取
	 */
	@ApiField("machine_info")
	private FaceMachineInfo machineInfo;

	/**
	 * 商户信息
	 */
	@ApiField("merchant_info")
	private FaceMerchantInfo merchantInfo;

	/**
	 * 操作系统版本号
	 */
	@ApiField("os_version")
	private String osVersion;

	/**
	 * 业务ID
	 */
	@ApiField("remote_log_id")
	private String remoteLogId;

	/**
	 * ZIM版本号
	 */
	@ApiField("zim_ver")
	private String zimVer;

	public String getApdidToken() {
		return this.apdidToken;
	}
	public void setApdidToken(String apdidToken) {
		this.apdidToken = apdidToken;
	}

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getAppVersion() {
		return this.appVersion;
	}
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public String getBaseVer() {
		return this.baseVer;
	}
	public void setBaseVer(String baseVer) {
		this.baseVer = baseVer;
	}

	public String getBioMetaInfo() {
		return this.bioMetaInfo;
	}
	public void setBioMetaInfo(String bioMetaInfo) {
		this.bioMetaInfo = bioMetaInfo;
	}

	public String getDeviceModel() {
		return this.deviceModel;
	}
	public void setDeviceModel(String deviceModel) {
		this.deviceModel = deviceModel;
	}

	public String getDeviceType() {
		return this.deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public FaceExtParams getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(FaceExtParams extInfo) {
		this.extInfo = extInfo;
	}

	public FaceMachineInfo getMachineInfo() {
		return this.machineInfo;
	}
	public void setMachineInfo(FaceMachineInfo machineInfo) {
		this.machineInfo = machineInfo;
	}

	public FaceMerchantInfo getMerchantInfo() {
		return this.merchantInfo;
	}
	public void setMerchantInfo(FaceMerchantInfo merchantInfo) {
		this.merchantInfo = merchantInfo;
	}

	public String getOsVersion() {
		return this.osVersion;
	}
	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}

	public String getRemoteLogId() {
		return this.remoteLogId;
	}
	public void setRemoteLogId(String remoteLogId) {
		this.remoteLogId = remoteLogId;
	}

	public String getZimVer() {
		return this.zimVer;
	}
	public void setZimVer(String zimVer) {
		this.zimVer = zimVer;
	}

}
