package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.device.trade.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-16 14:27:55
 */
public class AlipayOfflineProviderDeviceTradeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6418279717726188399L;

	/** 
	 * 累计有效交易笔数
	 */
	@ApiField("alipay_trade_count")
	private String alipayTradeCount;

	/** 
	 * 设备SN
	 */
	@ApiField("device_sn")
	private String deviceSn;

	/** 
	 * 间联商户id
	 */
	@ApiField("smid")
	private String smid;

	/** 
	 * 累计有效碰交易笔数区间
	 */
	@ApiField("touch_trade_count_range")
	private String touchTradeCountRange;

	public void setAlipayTradeCount(String alipayTradeCount) {
		this.alipayTradeCount = alipayTradeCount;
	}
	public String getAlipayTradeCount( ) {
		return this.alipayTradeCount;
	}

	public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
	}
	public String getDeviceSn( ) {
		return this.deviceSn;
	}

	public void setSmid(String smid) {
		this.smid = smid;
	}
	public String getSmid( ) {
		return this.smid;
	}

	public void setTouchTradeCountRange(String touchTradeCountRange) {
		this.touchTradeCountRange = touchTradeCountRange;
	}
	public String getTouchTradeCountRange( ) {
		return this.touchTradeCountRange;
	}

}
