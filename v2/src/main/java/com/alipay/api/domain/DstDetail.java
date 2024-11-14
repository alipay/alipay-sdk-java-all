package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 多轮问答信息
 *
 * @author auto create
 * @since 1.0, 2024-06-06 11:13:53
 */
public class DstDetail extends AlipayObject {

	private static final long serialVersionUID = 6447646584786463366L;

	/**
	 * 多轮答案内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 意图信息
	 */
	@ApiField("intent")
	private String intent;

	/**
	 * 是否以流的形式输出
	 */
	@ApiField("stream_output")
	private Boolean streamOutput;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getIntent() {
		return this.intent;
	}
	public void setIntent(String intent) {
		this.intent = intent;
	}

	public Boolean getStreamOutput() {
		return this.streamOutput;
	}
	public void setStreamOutput(Boolean streamOutput) {
		this.streamOutput = streamOutput;
	}

}
