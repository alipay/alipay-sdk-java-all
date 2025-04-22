package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 地理围栏事件
 *
 * @author auto create
 * @since 1.0, 2019-09-18 20:15:07
 */
public class FenceEvent extends AlipayObject {

	private static final long serialVersionUID = 4242921417839392123L;

	/**
	 * 语音事件列表. 可以是多条语音. 进入围栏后,会依次触发列表中的语音播报, 适合于既有营销语音,又有到站语音的场景
	 */
	@ApiListField("audio_events")
	@ApiField("audio_event")
	private List<AudioEvent> audioEvents;

	/**
	 * 地理围栏时间编码. 在相同route_code下,需要唯一
	 */
	@ApiField("fence_code")
	private String fenceCode;

	/**
	 * 纬度,最多允许6位小数.目前只支持国内的经纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度,最多允许6位小数. 目前只支持国内的经纬度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 如果进入围栏后有多条语音,此参数用于设置多条语音之间的时间间隔.单位为秒. 不传默认为0, 也就是多条语音连续播报
	 */
	@ApiField("multi_audio_interval")
	private String multiAudioInterval;

	/**
	 * 围栏圆的半径,单位为米,只允许整数
	 */
	@ApiField("radius")
	private String radius;

	public List<AudioEvent> getAudioEvents() {
		return this.audioEvents;
	}
	public void setAudioEvents(List<AudioEvent> audioEvents) {
		this.audioEvents = audioEvents;
	}

	public String getFenceCode() {
		return this.fenceCode;
	}
	public void setFenceCode(String fenceCode) {
		this.fenceCode = fenceCode;
	}

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return this.longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getMultiAudioInterval() {
		return this.multiAudioInterval;
	}
	public void setMultiAudioInterval(String multiAudioInterval) {
		this.multiAudioInterval = multiAudioInterval;
	}

	public String getRadius() {
		return this.radius;
	}
	public void setRadius(String radius) {
		this.radius = radius;
	}

}
