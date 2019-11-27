package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * iot设备adb账号认证
 *
 * @author auto create
 * @since 1.0, 2019-04-09 21:51:15
 */
public class AlipayCommerceIotRemotecontrolAdbCertifyModel extends AlipayObject {

	private static final long serialVersionUID = 8512256555435416246L;

	/**
	 * adb版本
	 */
	@ApiField("adb_version")
	private String adbVersion;

	/**
	 * 鉴权动态令牌
	 */
	@ApiField("dy_token")
	private String dyToken;

	/**
	 * 扩展属性
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 设备分类ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * pc的mac 地址
	 */
	@ApiField("mac_address")
	private String macAddress;

	/**
	 * adb用户的密码
	 */
	@ApiField("pwd")
	private String pwd;

	/**
	 * adb用户名
	 */
	@ApiField("user_name")
	private String userName;

	public String getAdbVersion() {
		return this.adbVersion;
	}
	public void setAdbVersion(String adbVersion) {
		this.adbVersion = adbVersion;
	}

	public String getDyToken() {
		return this.dyToken;
	}
	public void setDyToken(String dyToken) {
		this.dyToken = dyToken;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getMacAddress() {
		return this.macAddress;
	}
	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}

	public String getPwd() {
		return this.pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
