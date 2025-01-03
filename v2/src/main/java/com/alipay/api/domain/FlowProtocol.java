package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 流量商品协议
 *
 * @author auto create
 * @since 1.0, 2024-07-11 14:16:47
 */
public class FlowProtocol extends AlipayObject {

	private static final long serialVersionUID = 8638974151668353348L;

	/**
	 * 用户协议
	 */
	@ApiField("content")
	private String content;

	/**
	 * 内容样式
	 */
	@ApiField("content_type")
	private String contentType;

	/**
	 * 名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 版本号
	 */
	@ApiField("protocol_version")
	private String protocolVersion;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getContentType() {
		return this.contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getProtocolVersion() {
		return this.protocolVersion;
	}
	public void setProtocolVersion(String protocolVersion) {
		this.protocolVersion = protocolVersion;
	}

}
