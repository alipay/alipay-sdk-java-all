package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备wifi配置
 *
 * @author auto create
 * @since 1.0, 2023-07-05 14:51:05
 */
public class AlipayCommerceIotWifiSetModel extends AlipayObject {

	private static final long serialVersionUID = 3664663566542344253L;

	/**
	 * 设备唯一id
	 */
	@ApiField("biz_tid")
	private String bizTid;

	/**
	 * 设置wifi
	 */
	@ApiField("pwd")
	private String pwd;

	/**
	 * wifi名称
	 */
	@ApiField("ssid")
	private String ssid;

	public String getBizTid() {
		return this.bizTid;
	}
	public void setBizTid(String bizTid) {
		this.bizTid = bizTid;
	}

	public String getPwd() {
		return this.pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getSsid() {
		return this.ssid;
	}
	public void setSsid(String ssid) {
		this.ssid = ssid;
	}

}
