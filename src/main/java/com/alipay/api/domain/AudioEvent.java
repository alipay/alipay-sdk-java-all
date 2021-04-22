package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 围栏的语音事件
 *
 * @author auto create
 * @since 1.0, 2019-09-18 20:12:31
 */
public class AudioEvent extends AlipayObject {

	private static final long serialVersionUID = 3282951183155651698L;

	/**
	 * 语音id, 也就是语音合成接口返回的audio_id
	 */
	@ApiField("audio_id")
	private String audioId;

	/**
	 * 播报语音的结束时间,标准时间格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 播报语音的开始时间,标准时间格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("start_time")
	private Date startTime;

	public String getAudioId() {
		return this.audioId;
	}
	public void setAudioId(String audioId) {
		this.audioId = audioId;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

}
