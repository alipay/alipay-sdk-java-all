package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.device.broadcast.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:36
 */
public class AlipayCommerceIotDeviceBroadcastQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3286536266918857639L;

	/** 
	 * 播报时间,单位为秒. 如果没有播报,则返回空字符串
	 */
	@ApiField("broadcast_time")
	private String broadcastTime;

	/** 
	 * 播报结果. true表示播报成功,false表示未播报. 注意:播报结果的查询可能有一定延迟,延迟时间为5s-1min左右; 并且播报结果只能查询最近1周内的数据.
	 */
	@ApiField("result")
	private String result;

	public void setBroadcastTime(String broadcastTime) {
		this.broadcastTime = broadcastTime;
	}
	public String getBroadcastTime( ) {
		return this.broadcastTime;
	}

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
