package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * IOT设备语音播报结果查询
 *
 * @author auto create
 * @since 1.0, 2023-07-05 14:50:13
 */
public class AlipayCommerceIotDeviceBroadcastQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2485197196634736731L;

	/**
	 * 设备的唯一标识,设备id
	 */
	@ApiField("biz_tid")
	private String bizTid;

	/**
	 * 交易流水号, 此参数即为语音播报接口alipay.commerce.iot.device.audio.sync传入的trade_id
	 */
	@ApiField("trade_id")
	private String tradeId;

	public String getBizTid() {
		return this.bizTid;
	}
	public void setBizTid(String bizTid) {
		this.bizTid = bizTid;
	}

	public String getTradeId() {
		return this.tradeId;
	}
	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}

}
