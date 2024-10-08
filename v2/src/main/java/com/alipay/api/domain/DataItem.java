package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 搜索结果数据实体
 *
 * @author auto create
 * @since 1.0, 2023-07-31 17:12:53
 */
public class DataItem extends AlipayObject {

	private static final long serialVersionUID = 3326744414314686146L;

	/**
	 * 业务链路id
	 */
	@ApiField("biz_trace_id")
	private String bizTraceId;

	/**
	 * 根据搜索请求参数ext_res_field返回的指定字段
	 */
	@ApiListField("ext_res_field")
	@ApiField("string")
	private List<String> extResField;

	/**
	 * item的高亮的搜索摘要
	 */
	@ApiField("highlight_summary")
	private String highlightSummary;

	/**
	 * 带高亮的title
	 */
	@ApiField("highlight_title")
	private String highlightTitle;

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
	 * 可搜索的商品总数
	 */
	@ApiField("item_total_count")
	private Long itemTotalCount;

	/**
	 * item的打分
	 */
	@ApiField("score")
	private String score;

	/**
	 * 搜索结果item的sequence用于关联搜索结果和用户行为
	 */
	@ApiField("sequence")
	private String sequence;

	/**
	 * item的搜索摘要
	 */
	@ApiField("summary")
	private String summary;

	/**
	 * item的title
	 */
	@ApiField("title")
	private String title;

	/**
	 * 搜索结果item的trace_id用于关联搜索结果和用户行为 当前字段已废弃(接口改造导致字段冲突)
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

	public List<String> getExtResField() {
		return this.extResField;
	}
	public void setExtResField(List<String> extResField) {
		this.extResField = extResField;
	}

	public String getHighlightSummary() {
		return this.highlightSummary;
	}
	public void setHighlightSummary(String highlightSummary) {
		this.highlightSummary = highlightSummary;
	}

	public String getHighlightTitle() {
		return this.highlightTitle;
	}
	public void setHighlightTitle(String highlightTitle) {
		this.highlightTitle = highlightTitle;
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

	public Long getItemTotalCount() {
		return this.itemTotalCount;
	}
	public void setItemTotalCount(Long itemTotalCount) {
		this.itemTotalCount = itemTotalCount;
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

	public String getSummary() {
		return this.summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
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
