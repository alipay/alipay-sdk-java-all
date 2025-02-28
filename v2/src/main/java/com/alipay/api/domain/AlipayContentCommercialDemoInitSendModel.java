package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * demo初始化成功通知API
 *
 * @author auto create
 * @since 1.0, 2024-07-18 14:15:02
 */
public class AlipayContentCommercialDemoInitSendModel extends AlipayObject {

	private static final long serialVersionUID = 5658324262293547556L;

	/**
	 * 应用ID
	 */
	@ApiField("appid")
	private String appid;

	/**
	 * 玩法token
	 */
	@ApiField("biztoken")
	private String biztoken;

	/**
	 * 消息唯一id，幂等消费
	 */
	@ApiField("msgid")
	private String msgid;

	/**
	 * 毫秒级时间戳
	 */
	@ApiField("timestamp_ms")
	private String timestampMs;

	public String getAppid() {
		return this.appid;
	}
	public void setAppid(String appid) {
		this.appid = appid;
	}

	public String getBiztoken() {
		return this.biztoken;
	}
	public void setBiztoken(String biztoken) {
		this.biztoken = biztoken;
	}

	public String getMsgid() {
		return this.msgid;
	}
	public void setMsgid(String msgid) {
		this.msgid = msgid;
	}

	public String getTimestampMs() {
		return this.timestampMs;
	}
	public void setTimestampMs(String timestampMs) {
		this.timestampMs = timestampMs;
	}

}
