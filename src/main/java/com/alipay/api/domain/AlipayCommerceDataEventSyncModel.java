package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户自主监控事件数据上报接口
 *
 * @author auto create
 * @since 1.0, 2019-05-23 15:24:10
 */
public class AlipayCommerceDataEventSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7549727424145472191L;

	/**
	 * 事件描述
	 */
	@ApiField("content")
	private String content;

	/**
	 * 事件分组
	 */
	@ApiField("group")
	private String group;

	/**
	 * 事件名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 事件发生的时间戳
	 */
	@ApiField("time")
	private Long time;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getGroup() {
		return this.group;
	}
	public void setGroup(String group) {
		this.group = group;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Long getTime() {
		return this.time;
	}
	public void setTime(Long time) {
		this.time = time;
	}

}
