package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * AI门店解绑接口
 *
 * @author auto create
 * @since 1.0, 2026-02-10 17:27:43
 */
public class AlipayMsaasMediarecogAivisionstoredShopUnbindModel extends AlipayObject {

	private static final long serialVersionUID = 2423118761788495749L;

	/**
	 * 门店设备的sn
	 */
	@ApiField("device_sn")
	private String deviceSn;

	/**
	 * isv pid值
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/**
	 * 解绑原因
	 */
	@ApiField("reason")
	private String reason;

	/**
	 * 门店的id
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

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getShopPid() {
		return this.shopPid;
	}
	public void setShopPid(String shopPid) {
		this.shopPid = shopPid;
	}

}
