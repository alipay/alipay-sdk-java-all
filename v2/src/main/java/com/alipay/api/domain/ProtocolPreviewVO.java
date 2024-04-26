package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 协议预览结果
 *
 * @author auto create
 * @since 1.0, 2020-09-02 17:59:13
 */
public class ProtocolPreviewVO extends AlipayObject {

	private static final long serialVersionUID = 7161552718312793575L;

	/**
	 * 协议内容
	 */
	@ApiField("protocol_content")
	private String protocolContent;

	/**
	 * oss文件地址
	 */
	@ApiField("protocol_file_path")
	private String protocolFilePath;

	/**
	 * 支付宝商户协议
	 */
	@ApiField("protocol_name")
	private String protocolName;

	public String getProtocolContent() {
		return this.protocolContent;
	}
	public void setProtocolContent(String protocolContent) {
		this.protocolContent = protocolContent;
	}

	public String getProtocolFilePath() {
		return this.protocolFilePath;
	}
	public void setProtocolFilePath(String protocolFilePath) {
		this.protocolFilePath = protocolFilePath;
	}

	public String getProtocolName() {
		return this.protocolName;
	}
	public void setProtocolName(String protocolName) {
		this.protocolName = protocolName;
	}

}
