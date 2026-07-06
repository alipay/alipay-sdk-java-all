package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店提供AI能力
 *
 * @author auto create
 * @since 1.0, 2026-02-10 17:32:43
 */
public class AlipayMsaasMediarecogAivisionstoredShopBindModel extends AlipayObject {

	private static final long serialVersionUID = 7644438458551427541L;

	/**
	 * 设备sn
	 */
	@ApiField("device_sn")
	private String deviceSn;

	/**
	 * isv提供的指定id
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/**
	 * isv的门店pid
	 */
	@ApiField("shop_pid")
	private String shopPid;

	public String getDeviceSn() {
		return this.deviceSn;
	}
	public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
	}

	public String getIsvPid() {
		return this.isvPid;
	}
	public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
	}

	public String getShopPid() {
		return this.shopPid;
	}
	public void setShopPid(String shopPid) {
		this.shopPid = shopPid;
	}

}
