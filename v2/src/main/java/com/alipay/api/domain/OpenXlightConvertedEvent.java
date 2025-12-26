package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 灯火定向已转化事件
 *
 * @author auto create
 * @since 1.0, 2025-05-12 11:28:00
 */
public class OpenXlightConvertedEvent extends AlipayObject {

	private static final long serialVersionUID = 5786816541589584438L;

	/**
	 * 转化事件英文值
	 */
	@ApiField("event")
	private String event;

	/**
	 * 转化事件对应中文名称
	 */
	@ApiField("name")
	private String name;

	public String getEvent() {
		return this.event;
	}
	public void setEvent(String event) {
		this.event = event;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
