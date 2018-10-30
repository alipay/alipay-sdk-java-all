package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 厂商支付授权时上传设备数据接口，目前主要包含三星支付。com
 *
 * @author auto create
 * @since 1.0, 2016-05-19 17:02:20
 */
public class AlipayTradeVendorpayDevicedataUploadModel extends AlipayObject {

	private static final long serialVersionUID = 5597532738589557335L;

	/**
	 * 客户端应用包标识
	 */
	@ApiField("app_package_name")
	private String appPackageName;

	/**
	 * 扩展字段
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 国际移动设备标识
	 */
	@ApiField("imei")
	private String imei;

	/**
	 * 国际移动用户识别码
	 */
	@ApiField("imsi")
	private String imsi;

	/**
	 * mac地址
	 */
	@ApiField("mac")
	private String mac;

	/**
	 * 手机机型
	 */
	@ApiField("machine_type")
	private String machineType;

	/**
	 * 手机系统版本
	 */
	@ApiField("phone_sys_version")
	private String phoneSysVersion;

	/**
	 * 厂商公钥、base64编码
	 */
	@ApiField("public_key")
	private String publicKey;

	/**
	 * 设备应用来源，厂商支付标记
	 */
	@ApiField("tidsource")
	private String tidsource;

	/**
	 * 设备标识符
	 */
	@ApiField("uuid")
	private String uuid;

	/**
	 * 厂商名字
	 */
	@ApiField("vendor")
	private String vendor;

	public String getAppPackageName() {
		return this.appPackageName;
	}
	public void setAppPackageName(String appPackageName) {
		this.appPackageName = appPackageName;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getImei() {
		return this.imei;
	}
	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getImsi() {
		return this.imsi;
	}
	public void setImsi(String imsi) {
		this.imsi = imsi;
	}

	public String getMac() {
		return this.mac;
	}
	public void setMac(String mac) {
		this.mac = mac;
	}

	public String getMachineType() {
		return this.machineType;
	}
	public void setMachineType(String machineType) {
		this.machineType = machineType;
	}

	public String getPhoneSysVersion() {
		return this.phoneSysVersion;
	}
	public void setPhoneSysVersion(String phoneSysVersion) {
		this.phoneSysVersion = phoneSysVersion;
	}

	public String getPublicKey() {
		return this.publicKey;
	}
	public void setPublicKey(String publicKey) {
		this.publicKey = publicKey;
	}

	public String getTidsource() {
		return this.tidsource;
	}
	public void setTidsource(String tidsource) {
		this.tidsource = tidsource;
	}

	public String getUuid() {
		return this.uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getVendor() {
		return this.vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

}
