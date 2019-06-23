package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员通用设备、环境相关信息
 *
 * @author auto create
 * @since 1.0, 2017-06-22 16:42:37
 */
public class AlipayUserDeviceInfo extends AlipayObject {

	private static final long serialVersionUID = 2288583465165531394L;

	/**
	 * 扩展信息，json格式的字符串
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 移动设备国际身份码缩写：移动设备国际身份码缩写。仅移动端
	 */
	@ApiField("imei")
	private String imei;

	/**
	 * ipv4地址
	 */
	@ApiField("ip")
	private String ip;

	/**
	 * mac地址，冒号分隔
	 */
	@ApiField("mac")
	private String mac;

	/**
	 * 操作系统名称
	 */
	@ApiField("os_name")
	private String osName;

	/**
	 * 操作系统版本号
	 */
	@ApiField("os_version")
	private String osVersion;

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

	public String getIp() {
		return this.ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getMac() {
		return this.mac;
	}
	public void setMac(String mac) {
		this.mac = mac;
	}

	public String getOsName() {
		return this.osName;
	}
	public void setOsName(String osName) {
		this.osName = osName;
	}

	public String getOsVersion() {
		return this.osVersion;
	}
	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}

}
