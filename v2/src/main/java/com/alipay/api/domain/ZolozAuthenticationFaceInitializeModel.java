package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人脸原子产品初始化接口
 *
 * @author auto create
 * @since 1.0, 2019-01-08 18:29:28
 */
public class ZolozAuthenticationFaceInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 8365519872992264211L;

	/**
	 * apdidToken
	 */
	@ApiField("apdid_token")
	private String apdidToken;

	/**
	 * App名称
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * App版本
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * base version
	 */
	@ApiField("base_ver")
	private String baseVer;

	/**
	 * bioMetaInfo
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
	 * extInfo
	 */
	@ApiField("ext_info")
	private FaceExtParams extInfo;

	/**
	 * FaceMachineInfo
	 */
	@ApiField("machine_info")
	private FaceMachineInfo machineInfo;

	/**
	 * FaceMerchantInfo
	 */
	@ApiField("merchant_info")
	private FaceMerchantInfo merchantInfo;

	/**
	 * 操作系统版本
	 */
	@ApiField("os_version")
	private String osVersion;

	/**
	 * 业务ID
	 */
	@ApiField("remote_log_id")
	private String remoteLogId;

	/**
	 * zim version
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
