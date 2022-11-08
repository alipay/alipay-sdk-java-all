package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 消息数据
 *
 * @author auto create
 * @since 1.0, 2022-04-19 11:19:20
 */
public class MsgContent extends AlipayObject {

	private static final long serialVersionUID = 6729314662864437862L;

	/**
	 * 内容产生的时间
	 */
	@ApiField("content_timestamp")
	private String contentTimestamp;

	/**
	 * 内容类型
	 */
	@ApiField("content_type")
	private String contentType;

	public String getContentTimestamp() {
		return this.contentTimestamp;
	}
	public void setContentTimestamp(String contentTimestamp) {
		this.contentTimestamp = contentTimestamp;
	}

	public String getContentType() {
		return this.contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

}
