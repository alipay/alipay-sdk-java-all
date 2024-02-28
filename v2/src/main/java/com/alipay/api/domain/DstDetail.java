package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 多轮问答信息
 *
 * @author auto create
 * @since 1.0, 2024-01-16 10:23:50
 */
public class DstDetail extends AlipayObject {

	private static final long serialVersionUID = 5663176328543656572L;

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

}
