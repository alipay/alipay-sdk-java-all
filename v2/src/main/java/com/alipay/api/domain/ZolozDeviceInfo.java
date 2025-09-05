package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备信息
 *
 * @author auto create
 * @since 1.0, 2018-11-19 21:01:20
 */
public class ZolozDeviceInfo extends AlipayObject {

	private static final long serialVersionUID = 8581164188262814878L;

	/**
	 * 客户端设备指纹
	 */
	@ApiField("apdid")
	private String apdid;

	/**
	 * 无线客户端名称
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 无线客户端版本
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * GSM基站号,是个16位的数据
	 */
	@ApiField("cid")
	private String cid;

	/**
	 * 屏幕长
	 */
	@ApiField("h")
	private String h;

	/**
	 * 用户当前操作手机硬件标识
	 */
	@ApiField("imei")
	private String imei;

	/**
	 * 手机的SIM卡信息
	 */
	@ApiField("imsi")
	private String imsi;

	/**
	 * 客户端ip
	 */
	@ApiField("ip")
	private String ip;

	/**
	 * GSM基站区域
	 */
	@ApiField("lac")
	private String lac;

	/**
	 * 出现地址的纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 出现地址的纬度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * MAC地址
	 */
	@ApiField("mac")
	private String mac;

	/**
	 * GSM基站国家代码,移动国家代码(中国的为460)
	 */
	@ApiField("mcc")
	private String mcc;

	/**
	 * GSM基站网络代码,移动网络号码(中国移动为00，中国联通为01，中国电信为02)
	 */
	@ApiField("mnc")
	private String mnc;

	/**
	 * 设备具体型号(IOS,ANDROID共享)
	 */
	@ApiField("model")
	private String model;

	/**
	 * 手机平台
	 */
	@ApiField("os")
	private String os;

	/**
	 * 分辨率
	 */
	@ApiField("px")
	private String px;

	/**
	 * Android设备QEMU虚拟化标识
	 */
	@ApiField("qemu")
	private String qemu;

	/**
	 * 设备系统版本
	 */
	@ApiField("release")
	private String release;

	/**
	 * 返回码
	 */
	@ApiField("ret_code")
	private String retCode;

	/**
	 * 是否越狱
	 */
	@ApiField("root")
	private String root;

	/**
	 * GSM基站信号强度
	 */
	@ApiField("rssi")
	private String rssi;

	/**
	 * 统一SDK版本
	 */
	@ApiField("sdk_name")
	private String sdkName;

	/**
	 * 统一SDK版本
	 */
	@ApiField("sdk_version")
	private String sdkVersion;

	/**
	 * sn
	 */
	@ApiField("sn")
	private String sn;

	/**
	 * wifi的名称
	 */
	@ApiField("ssid")
	private String ssid;

	/**
	 * 是否成功
	 */
	@ApiField("success")
	private Boolean success;

	/**
	 * 快捷tid
	 */
	@ApiField("tid")
	private String tid;

	/**
	 * 淘宝无线安全设备标识
	 */
	@ApiField("umid")
	private String umid;

	/**
	 * 淘系客户端和友盟使用的设备标识
	 */
	@ApiField("utdid")
	private String utdid;

	/**
	 * 屏幕宽
	 */
	@ApiField("w")
	private String w;

	/**
	 * wifi的mac地址
	 */
	@ApiField("wireless_mac")
	private String wirelessMac;

	public String getApdid() {
		return this.apdid;
	}
	public void setApdid(String apdid) {
		this.apdid = apdid;
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

	public String getCid() {
		return this.cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getH() {
		return this.h;
	}
	public void setH(String h) {
		this.h = h;
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

	public String getIp() {
		return this.ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getLac() {
		return this.lac;
	}
	public void setLac(String lac) {
		this.lac = lac;
	}

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return this.longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getMac() {
		return this.mac;
	}
	public void setMac(String mac) {
		this.mac = mac;
	}

	public String getMcc() {
		return this.mcc;
	}
	public void setMcc(String mcc) {
		this.mcc = mcc;
	}

	public String getMnc() {
		return this.mnc;
	}
	public void setMnc(String mnc) {
		this.mnc = mnc;
	}

	public String getModel() {
		return this.model;
	}
	public void setModel(String model) {
		this.model = model;
	}

	public String getOs() {
		return this.os;
	}
	public void setOs(String os) {
		this.os = os;
	}

	public String getPx() {
		return this.px;
	}
	public void setPx(String px) {
		this.px = px;
	}

	public String getQemu() {
		return this.qemu;
	}
	public void setQemu(String qemu) {
		this.qemu = qemu;
	}

	public String getRelease() {
		return this.release;
	}
	public void setRelease(String release) {
		this.release = release;
	}

	public String getRetCode() {
		return this.retCode;
	}
	public void setRetCode(String retCode) {
		this.retCode = retCode;
	}

	public String getRoot() {
		return this.root;
	}
	public void setRoot(String root) {
		this.root = root;
	}

	public String getRssi() {
		return this.rssi;
	}
	public void setRssi(String rssi) {
		this.rssi = rssi;
	}

	public String getSdkName() {
		return this.sdkName;
	}
	public void setSdkName(String sdkName) {
		this.sdkName = sdkName;
	}

	public String getSdkVersion() {
		return this.sdkVersion;
	}
	public void setSdkVersion(String sdkVersion) {
		this.sdkVersion = sdkVersion;
	}

	public String getSn() {
		return this.sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}

	public String getSsid() {
		return this.ssid;
	}
	public void setSsid(String ssid) {
		this.ssid = ssid;
	}

	public Boolean getSuccess() {
		return this.success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getTid() {
		return this.tid;
	}
	public void setTid(String tid) {
		this.tid = tid;
	}

	public String getUmid() {
		return this.umid;
	}
	public void setUmid(String umid) {
		this.umid = umid;
	}

	public String getUtdid() {
		return this.utdid;
	}
	public void setUtdid(String utdid) {
		this.utdid = utdid;
	}

	public String getW() {
		return this.w;
	}
	public void setW(String w) {
		this.w = w;
	}

	public String getWirelessMac() {
		return this.wirelessMac;
	}
	public void setWirelessMac(String wirelessMac) {
		this.wirelessMac = wirelessMac;
	}

}
