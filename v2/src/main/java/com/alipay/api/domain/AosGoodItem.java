package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * Aos商品数据
 *
 * @author auto create
 * @since 1.0, 2023-07-26 17:21:37
 */
public class AosGoodItem extends AlipayObject {

	private static final long serialVersionUID = 3494993298833273175L;

	/**
	 * 业务链路ID
	 */
	@ApiField("biz_trace_id")
	private String bizTraceId;

	/**
	 * data的唯一id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 图片列表
	 */
	@ApiListField("images")
	@ApiField("string")
	private List<String> images;

	/**
	 * 得分
	 */
	@ApiField("score")
	private String score;

	/**
	 * item的title
	 */
	@ApiField("title")
	private String title;

	/**
	 * 搜索结果item的trace_id用于关联搜索结果和用户行为 当前字段已废弃(业务代码改造参数冲突)
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

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public List<String> getImages() {
		return this.images;
	}
	public void setImages(List<String> images) {
		this.images = images;
	}

	public String getScore() {
		return this.score;
	}
	public void setScore(String score) {
		this.score = score;
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
