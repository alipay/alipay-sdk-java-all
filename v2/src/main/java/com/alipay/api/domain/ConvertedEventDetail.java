package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 转化基础信息
 *
 * @author auto create
 * @since 1.0, 2025-05-12 14:24:18
 */
public class ConvertedEventDetail extends AlipayObject {

	private static final long serialVersionUID = 2299857943981273575L;

	/**
	 * 转化
	 */
	@ApiField("converted_event")
	private String convertedEvent;

	/**
	 * 转化名称
	 */
	@ApiField("converted_event_name")
	private String convertedEventName;

	public String getConvertedEvent() {
		return this.convertedEvent;
	}
	public void setConvertedEvent(String convertedEvent) {
		this.convertedEvent = convertedEvent;
	}

	public String getConvertedEventName() {
		return this.convertedEventName;
	}
	public void setConvertedEventName(String convertedEventName) {
		this.convertedEventName = convertedEventName;
	}

}
