package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 远程控制N6设备的语音播放音量
 *
 * @author auto create
 * @since 1.0, 2026-07-09 10:29:29
 */
public class AlipayCommerceLogisticsDeviceVolumeSetModel extends AlipayObject {

	private static final long serialVersionUID = 5853371863448623974L;

	/**
	 * 设备序列号
	 */
	@ApiField("sn_id")
	private String snId;

	/**
	 * 0-6整数。0=静音，6=最大音量
	 */
	@ApiField("volume")
	private Long volume;

	public String getSnId() {
		return this.snId;
	}
	public void setSnId(String snId) {
		this.snId = snId;
	}

	public Long getVolume() {
		return this.volume;
	}
	public void setVolume(Long volume) {
		this.volume = volume;
	}

}
