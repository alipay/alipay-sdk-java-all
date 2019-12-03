package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备wifi配置
 *
 * @author auto create
 * @since 1.0, 2019-06-20 21:52:40
 */
public class AlipayCommerceIotWifiSetModel extends AlipayObject {

	private static final long serialVersionUID = 8231228544819642979L;

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
