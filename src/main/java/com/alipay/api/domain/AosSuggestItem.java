package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * query suggest实体
 *
 * @author auto create
 * @since 1.0, 2022-11-25 11:46:27
 */
public class AosSuggestItem extends AlipayObject {

	private static final long serialVersionUID = 2258326817469542342L;

	/**
	 * item的打分
	 */
	@ApiField("score")
	private String score;

	/**
	 * 搜索结果item的sequence用于关联搜索热搜和用户点击行为
	 */
	@ApiField("sequence")
	private String sequence;

	/**
	 * suggest的词
	 */
	@ApiField("title")
	private String title;

	/**
	 * 结果item的trace_id用于关联搜索推荐和用户行为
	 */
	@ApiField("trace_id")
	private String traceId;

	public String getScore() {
		return this.score;
	}
	public void setScore(String score) {
		this.score = score;
	}

	public String getSequence() {
		return this.sequence;
	}
	public void setSequence(String sequence) {
		this.sequence = sequence;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getTraceId() {
		return this.traceId;
	}
	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

}
