package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * AI慧眼产品-AI防伪识别结果类
 *
 * @author auto create
 * @since 1.0, 2026-08-18 15:49:40
 */
public class DeepFakeResult extends AlipayObject {

	private static final long serialVersionUID = 7463417991237619761L;

	/**
	 * 检测明细
	 */
	@ApiField("fake_reason")
	private String fakeReason;

	/**
	 * 检测是通过
	 */
	@ApiField("result")
	private String result;

	/**
	 * 检测分，取值0-1。
	 */
	@ApiField("score")
	private String score;

	public String getFakeReason() {
		return this.fakeReason;
	}
	public void setFakeReason(String fakeReason) {
		this.fakeReason = fakeReason;
	}

	public String getResult() {
		return this.result;
	}
	public void setResult(String result) {
		this.result = result;
	}

	public String getScore() {
		return this.score;
	}
	public void setScore(String score) {
		this.score = score;
	}

}
