package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 流式内容信息单元
 *
 * @author auto create
 * @since 1.0, 2024-09-24 13:28:19
 */
public class StreamContent extends AlipayObject {

	private static final long serialVersionUID = 8399918822276251172L;

	/**
	 * 代表当前流式类型推送内容状态标识
	 */
	@ApiField("reply_cmd")
	private String replyCmd;

	/**
	 * 标识为增量还是全量返回流式文本
	 */
	@ApiField("stream_type")
	private String streamType;

	/**
	 * 卡片模版code
	 */
	@ApiField("template_code")
	private String templateCode;

	/**
	 * 卡片值
	 */
	@ApiField("template_data")
	private String templateData;

	/**
	 * 单次推送的流式文本内容
	 */
	@ApiField("text")
	private String text;

	public String getReplyCmd() {
		return this.replyCmd;
	}
	public void setReplyCmd(String replyCmd) {
		this.replyCmd = replyCmd;
	}

	public String getStreamType() {
		return this.streamType;
	}
	public void setStreamType(String streamType) {
		this.streamType = streamType;
	}

	public String getTemplateCode() {
		return this.templateCode;
	}
	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}

	public String getTemplateData() {
		return this.templateData;
	}
	public void setTemplateData(String templateData) {
		this.templateData = templateData;
	}

	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}

}
