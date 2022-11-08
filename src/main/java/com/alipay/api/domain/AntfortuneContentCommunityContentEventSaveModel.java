package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 事件上报服务
 *
 * @author auto create
 * @since 1.0, 2022-03-28 16:00:51
 */
public class AntfortuneContentCommunityContentEventSaveModel extends AlipayObject {

	private static final long serialVersionUID = 1429543942183336839L;

	/**
	 * 事件内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 事件内容来源
	 */
	@ApiField("source")
	private String source;

	/**
	 * 事件时间
	 */
	@ApiField("time")
	private Date time;

	/**
	 * 标题
	 */
	@ApiField("title")
	private String title;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public Date getTime() {
		return this.time;
	}
	public void setTime(Date time) {
		this.time = time;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
