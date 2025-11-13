package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 热搜实体数据
 *
 * @author auto create
 * @since 1.0, 2023-07-31 16:55:19
 */
public class AosHotItem extends AlipayObject {

	private static final long serialVersionUID = 8262247736492338484L;

	/**
	 * 业务链路ID
	 */
	@ApiField("biz_trace_id")
	private String bizTraceId;

	/**
	 * 图片类型热搜
	 */
	@ApiField("image")
	private String image;

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
	 * 热搜的展示title
	 */
	@ApiField("title")
	private String title;

	/**
	 * 热搜结果item的trace_id用于关联搜索热搜和用户行为 当前字段已废弃(接口改造导致参数冲突)
	 */
	@ApiField("trace_id")
	@Deprecated
	private String traceId;

	public String getBizTraceId() {
		return this.bizTraceId;
	}
	public void setBizTraceId(String bizTraceId) {
		this.bizTraceId = bizTraceId;
	}

	public String getImage() {
		return this.image;
	}
	public void setImage(String image) {
		this.image = image;
	}

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
