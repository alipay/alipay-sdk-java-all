package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机具激活
 *
 * @author auto create
 * @since 1.0, 2022-05-31 19:30:33
 */
public class AlipayCommerceIotMdeviceprodDeviceInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 6791814251873169439L;

	/**
	 * 设备sn，通常置于设备标签中
	 */
	@ApiField("device_sn")
	private String deviceSn;

	/**
	 * 扩展信息，必须为JSON格式
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * IMEI移动设备识别码
	 */
	@ApiField("imei")
	private String imei;

	/**
	 * 物料id,需支付宝同学提供
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * mac地址，网络设备网卡地址
	 */
	@ApiField("mac")
	private String mac;

	/**
	 * 设备无线网络类型，可选项[2G,3G,4G,WIRED,BT,OTHER,NONE]
2G-2G移动网络
3G-3G移动网络
4G-4G移动网络
WIRED-有线网络
WIFI-无线网络
BT-蓝牙
OTHER-其他网络类型
NONE-无联网功能
	 */
	@ApiField("net_type")
	private String netType;

	/**
	 * 软件版本
	 */
	@ApiField("os_version")
	private String osVersion;

	/**
	 * 加签明文，针对带miniSDK的特殊设备使用，其他设备不需要填该内容
	 */
	@ApiField("plain_text")
	private String plainText;

	/**
	 * 加签信息，针对带miniSDK的特殊设备使用，其他设备不需要填写该内容
	 */
	@ApiField("sign_info")
	private String signInfo;

	/**
	 * 供应商id,该值由支付宝同学提供
	 */
	@ApiField("supplier_id")
	private String supplierId;

	public String getDeviceSn() {
		return this.deviceSn;
	}
	public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
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

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getMac() {
		return this.mac;
	}
	public void setMac(String mac) {
		this.mac = mac;
	}

	public String getNetType() {
		return this.netType;
	}
	public void setNetType(String netType) {
		this.netType = netType;
	}

	public String getOsVersion() {
		return this.osVersion;
	}
	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}

	public String getPlainText() {
		return this.plainText;
	}
	public void setPlainText(String plainText) {
		this.plainText = plainText;
	}

	public String getSignInfo() {
		return this.signInfo;
	}
	public void setSignInfo(String signInfo) {
		this.signInfo = signInfo;
	}

	public String getSupplierId() {
		return this.supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

}
