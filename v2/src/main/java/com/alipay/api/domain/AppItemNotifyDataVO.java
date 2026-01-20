package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品通知消息内容
 *
 * @author auto create
 * @since 1.0, 2023-10-24 14:37:12
 */
public class AppItemNotifyDataVO extends AlipayObject {

	private static final long serialVersionUID = 5477521295518215424L;

	/**
	 * 商品数据变更后内容
	 */
	@ApiField("after")
	private AppItemDataDiffVO after;

	/**
	 * 商品数据变更前内容
	 */
	@ApiField("before")
	private AppItemDataDiffVO before;

	/**
	 * 商品数据变更所属的事件类型
	 */
	@ApiField("event_type")
	private String eventType;

	/**
	 * 当前操作所发生的站点
	 */
	@ApiField("source")
	private String source;

	public AppItemDataDiffVO getAfter() {
		return this.after;
	}
	public void setAfter(AppItemDataDiffVO after) {
		this.after = after;
	}

	public AppItemDataDiffVO getBefore() {
		return this.before;
	}
	public void setBefore(AppItemDataDiffVO before) {
		this.before = before;
	}

	public String getEventType() {
		return this.eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}
