package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 延迟生效信息
 *
 * @author auto create
 * @since 1.0, 2018-01-22 16:28:59
 */
public class InteligentDelayInfo extends AlipayObject {

	private static final long serialVersionUID = 3882971644915432347L;

	/**
	 * 延迟类型，目前支持以下类型
ABSOLUTELY：按绝对值延迟
BYDAY：按天延迟
	 */
	@ApiField("type")
	private String type;

	/**
	 * 延迟值，单位分钟
按绝对值延迟延迟24*60 (1天)表示，当日08:00:00领到的券要到隔日的08:00:00才能使用
按天延迟延迟24*60(1天)表示，当日08:00:00领到的券，隔日00:00:00点就可以用
	 */
	@ApiField("value")
	private String value;

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
