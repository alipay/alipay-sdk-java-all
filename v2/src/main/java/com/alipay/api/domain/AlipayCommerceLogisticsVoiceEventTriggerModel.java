package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 实时触发N6设备播放指定语音
 *
 * @author auto create
 * @since 1.0, 2026-07-09 10:29:33
 */
public class AlipayCommerceLogisticsVoiceEventTriggerModel extends AlipayObject {

	private static final long serialVersionUID = 6778133361344915823L;

	/**
	 * 提示音类型
	 */
	@ApiField("msg_type")
	private String msgType;

	/**
	 * N6D设备序列号
	 */
	@ApiField("sn_id")
	private String snId;

	public String getMsgType() {
		return this.msgType;
	}
	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	public String getSnId() {
		return this.snId;
	}
	public void setSnId(String snId) {
		this.snId = snId;
	}

}
