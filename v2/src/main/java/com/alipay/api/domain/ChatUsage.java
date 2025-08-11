package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * Token 消耗的详细信息。
 *
 * @author auto create
 * @since 1.0, 2025-07-31 15:33:54
 */
public class ChatUsage extends AlipayObject {

	private static final long serialVersionUID = 8683321517989418337L;

	/**
	 * input 部分消耗的 Token 总数。
	 */
	@ApiField("input_count")
	private Long inputCount;

	/**
	 * output 部分消耗的 Token 总数。
	 */
	@ApiField("output_count")
	private Long outputCount;

	/**
	 * 本次对话消耗的 Token 总数，包括 input 和 output 部分的消耗。
	 */
	@ApiField("token_count")
	private Long tokenCount;

	public Long getInputCount() {
		return this.inputCount;
	}
	public void setInputCount(Long inputCount) {
		this.inputCount = inputCount;
	}

	public Long getOutputCount() {
		return this.outputCount;
	}
	public void setOutputCount(Long outputCount) {
		this.outputCount = outputCount;
	}

	public Long getTokenCount() {
		return this.tokenCount;
	}
	public void setTokenCount(Long tokenCount) {
		this.tokenCount = tokenCount;
	}

}
