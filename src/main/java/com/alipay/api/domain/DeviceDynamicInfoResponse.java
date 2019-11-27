package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * pos设备动态信息
 *
 * @author auto create
 * @since 1.0, 2018-05-02 18:48:13
 */
public class DeviceDynamicInfoResponse extends AlipayObject {

	private static final long serialVersionUID = 6548971834242838923L;

	/**
	 * 设备最后一次使用的激活码
	 */
	@ApiField("activation_code")
	private String activationCode;

	/**
	 * 激活编号
	 */
	@ApiField("activation_seq")
	private Long activationSeq;

	/**
	 * 激活还是取消激活的状态ACTIVATION,UNACTIVATION
	 */
	@ApiField("activation_status")
	private String activationStatus;

	/**
	 * 激活或者取消激活时间
	 */
	@ApiField("activation_time")
	private Date activationTime;

	/**
	 * 口碑app版本号。
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 设备心跳连接次数
	 */
	@ApiField("connect_num")
	private Long connectNum;

	/**
	 * 设备基本信息
	 */
	@ApiField("device_basic_info_response")
	private DeviceBasicInfoResponse deviceBasicInfoResponse;

	/**
	 * 设备当前状态，目前只有“可用”
	 */
	@ApiField("device_status")
	private String deviceStatus;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 最后一次心跳连接时间
	 */
	@ApiField("last_connect_time")
	private Date lastConnectTime;

	/**
	 * 是否是主设备
	 */
	@ApiField("main_device")
	private Boolean mainDevice;

	/**
	 * 商户ID
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * rom版本号
	 */
	@ApiField("rom_version")
	private String romVersion;

	/**
	 * 店铺ID
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getActivationCode() {
		return this.activationCode;
	}
	public void setActivationCode(String activationCode) {
		this.activationCode = activationCode;
	}

	public Long getActivationSeq() {
		return this.activationSeq;
	}
	public void setActivationSeq(Long activationSeq) {
		this.activationSeq = activationSeq;
	}

	public String getActivationStatus() {
		return this.activationStatus;
	}
	public void setActivationStatus(String activationStatus) {
		this.activationStatus = activationStatus;
	}

	public Date getActivationTime() {
		return this.activationTime;
	}
	public void setActivationTime(Date activationTime) {
		this.activationTime = activationTime;
	}

	public String getAppVersion() {
		return this.appVersion;
	}
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public Long getConnectNum() {
		return this.connectNum;
	}
	public void setConnectNum(Long connectNum) {
		this.connectNum = connectNum;
	}

	public DeviceBasicInfoResponse getDeviceBasicInfoResponse() {
		return this.deviceBasicInfoResponse;
	}
	public void setDeviceBasicInfoResponse(DeviceBasicInfoResponse deviceBasicInfoResponse) {
		this.deviceBasicInfoResponse = deviceBasicInfoResponse;
	}

	public String getDeviceStatus() {
		return this.deviceStatus;
	}
	public void setDeviceStatus(String deviceStatus) {
		this.deviceStatus = deviceStatus;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public Date getLastConnectTime() {
		return this.lastConnectTime;
	}
	public void setLastConnectTime(Date lastConnectTime) {
		this.lastConnectTime = lastConnectTime;
	}

	public Boolean getMainDevice() {
		return this.mainDevice;
	}
	public void setMainDevice(Boolean mainDevice) {
		this.mainDevice = mainDevice;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getRomVersion() {
		return this.romVersion;
	}
	public void setRomVersion(String romVersion) {
		this.romVersion = romVersion;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
