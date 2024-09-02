package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 流式内容信息单元
 *
 * @author auto create
 * @since 1.0, 2024-08-30 14:22:46
 */
public class StreamContent extends AlipayObject {

	private static final long serialVersionUID = 7549955356823524255L;

	/**
	 * Continue  继续应答
Finish      完成
Interrupt  中断并给予兜底应答
	 */
	@ApiField("reply_cmd")
	private String replyCmd;

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

	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}

}
