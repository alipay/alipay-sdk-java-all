package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * iot营销语音推送
 *
 * @author auto create
 * @since 1.0, 2021-01-13 19:16:43
 */
public class AlipayCommerceIotDeviceAudioSendModel extends AlipayObject {

	private static final long serialVersionUID = 8562425246327393382L;

	/**
	 * 语音id, 也就是语音合成接口返回的audio_id
	 */
	@ApiField("audio_id")
	private String audioId;

	/**
	 * 语音播报规则,当播放场景为CUSTOM_AUDIO时需传入.
参数为json字符串. 
start_time: 每天播报的开始时间;
end_time:每天播报的结束时间;
interval:播报间隔,单位为秒;
status: 取值为on/off. 表示开关状态.
示例值的含义是在每天的8:00到18:00点之间,每隔300s播报一次语音;
当需要关闭自定义语音时,传入{"status":"off"}
	 */
	@ApiField("audio_rule")
	private String audioRule;

	/**
	 * 设备的唯一标识,设备id
	 */
	@ApiField("biz_tid")
	private String bizTid;

	/**
	 * 语音播放场景. 可选值: TRADE,CUSTOM_AUDIO
TRADE: 表示该语音的播放场景是到账播报场景, 通过该接口将语音推下去,当发生交易时, 再调用播报接口触发语音播报; 
CUSTOM_AUDIO: 自定义语音播报场景, 通过传入audio_rule参数,指定特定的播报间隔, 设备会自动按照该规则进行播报
	 */
	@ApiField("play_type")
	private String playType;

	public String getAudioId() {
		return this.audioId;
	}
	public void setAudioId(String audioId) {
		this.audioId = audioId;
	}

	public String getAudioRule() {
		return this.audioRule;
	}
	public void setAudioRule(String audioRule) {
		this.audioRule = audioRule;
	}

	public String getBizTid() {
		return this.bizTid;
	}
	public void setBizTid(String bizTid) {
		this.bizTid = bizTid;
	}

	public String getPlayType() {
		return this.playType;
	}
	public void setPlayType(String playType) {
		this.playType = playType;
	}

}
