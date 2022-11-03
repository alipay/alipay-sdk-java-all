package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 心跳信息采集接口
 *
 * @author auto create
 * @since 1.0, 2018-08-24 17:06:57
 */
public class KoubeiMerchantDeviceHeartbeatUploadModel extends AlipayObject {

	private static final long serialVersionUID = 6658831947977685385L;

	/**
	 * 前台/后台app信息，name传递应用名称，version传递应用版本信息，status传递应用状态，枚举：active----运行，background----后台运行
	 */
	@ApiField("app_info")
	private String appInfo;

	/**
	 * 心跳时间段内的机具异常原因，如有多个用“|”分隔。
HE_PRINTER——打印机异常；
HE_LOUDSPEAKER——音响异常；
HE_BOH-----后厨屏显异常
HE_OTHER——其他硬件异常
	 */
	@ApiField("exception_info")
	private String exceptionInfo;

	/**
	 * 心跳信息发送方自定义，json格式
	 */
	@ApiField("extend_info")
	private String extendInfo;

	/**
	 * 设备型号
	 */
	@ApiField("hardware_version")
	private String hardwareVersion;

	/**
	 * isv_appid
	 */
	@ApiField("isv_app_id")
	private String isvAppId;

	/**
	 * isv商户pid
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/**
	 * ISV 心跳服务器时间
	 */
	@ApiField("isv_server_time")
	private String isvServerTime;

	/**
	 * lbs 经纬度信息
	 */
	@ApiField("lbs")
	private String lbs;

	/**
	 * lbs获取方式：WIFI/BASE-STATION/GPS/AGPS
	 */
	@ApiField("lbs_type")
	private String lbsType;

	/**
	 * MAC 地址
	 */
	@ApiField("mac")
	private String mac;

	/**
	 * 机器制造商
	 */
	@ApiField("manufacturer")
	private String manufacturer;

	/**
	 * 局域网IP
	 */
	@ApiField("network_ip")
	private String networkIp;

	/**
	 * 网络名称
	 */
	@ApiField("network_name")
	private String networkName;

	/**
	 * pos设备连接的网络类型
：2G,3G,4G,WIFI,LAN(有线网
络)
	 */
	@ApiField("network_type")
	private String networkType;

	/**
	 * 发送心跳的设备所依赖的支付宝产品（如 点餐的为 CO）
	 */
	@ApiField("product")
	private String product;

	/**
	 * 门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 设备SN
	 */
	@ApiField("sn_id")
	private String snId;

	/**
	 * isv点餐应用的版本信息
	 */
	@ApiField("soft_version")
	private String softVersion;

	/**
	 * 系统类型
	 */
	@ApiField("sys_type")
	private String sysType;

	/**
	 * 系统版本
	 */
	@ApiField("sys_version")
	private String sysVersion;

	/**
	 * 心跳发生时间
	 */
	@ApiField("time")
	private String time;

	public String getAppInfo() {
		return this.appInfo;
	}
	public void setAppInfo(String appInfo) {
		this.appInfo = appInfo;
	}

	public String getExceptionInfo() {
		return this.exceptionInfo;
	}
	public void setExceptionInfo(String exceptionInfo) {
		this.exceptionInfo = exceptionInfo;
	}

	public String getExtendInfo() {
		return this.extendInfo;
	}
	public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
	}

	public String getHardwareVersion() {
		return this.hardwareVersion;
	}
	public void setHardwareVersion(String hardwareVersion) {
		this.hardwareVersion = hardwareVersion;
	}

	public String getIsvAppId() {
		return this.isvAppId;
	}
	public void setIsvAppId(String isvAppId) {
		this.isvAppId = isvAppId;
	}

	public String getIsvPid() {
		return this.isvPid;
	}
	public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
	}

	public String getIsvServerTime() {
		return this.isvServerTime;
	}
	public void setIsvServerTime(String isvServerTime) {
		this.isvServerTime = isvServerTime;
	}

	public String getLbs() {
		return this.lbs;
	}
	public void setLbs(String lbs) {
		this.lbs = lbs;
	}

	public String getLbsType() {
		return this.lbsType;
	}
	public void setLbsType(String lbsType) {
		this.lbsType = lbsType;
	}

	public String getMac() {
		return this.mac;
	}
	public void setMac(String mac) {
		this.mac = mac;
	}

	public String getManufacturer() {
		return this.manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getNetworkIp() {
		return this.networkIp;
	}
	public void setNetworkIp(String networkIp) {
		this.networkIp = networkIp;
	}

	public String getNetworkName() {
		return this.networkName;
	}
	public void setNetworkName(String networkName) {
		this.networkName = networkName;
	}

	public String getNetworkType() {
		return this.networkType;
	}
	public void setNetworkType(String networkType) {
		this.networkType = networkType;
	}

	public String getProduct() {
		return this.product;
	}
	public void setProduct(String product) {
		this.product = product;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getSnId() {
		return this.snId;
	}
	public void setSnId(String snId) {
		this.snId = snId;
	}

	public String getSoftVersion() {
		return this.softVersion;
	}
	public void setSoftVersion(String softVersion) {
		this.softVersion = softVersion;
	}

	public String getSysType() {
		return this.sysType;
	}
	public void setSysType(String sysType) {
		this.sysType = sysType;
	}

	public String getSysVersion() {
		return this.sysVersion;
	}
	public void setSysVersion(String sysVersion) {
		this.sysVersion = sysVersion;
	}

	public String getTime() {
		return this.time;
	}
	public void setTime(String time) {
		this.time = time;
	}

}
