package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 热点榜单结果
 *
 * @author auto create
 * @since 1.0, 2024-05-21 16:29:49
 */
public class RankHotDataResult extends AlipayObject {

	private static final long serialVersionUID = 1398891899727918412L;

	/**
	 * 热点榜id
	 */
	@ApiField("hot_id")
	private String hotId;

	/**
	 * 序号
	 */
	@ApiField("index")
	private String index;

	/**
	 * 标签
	 */
	@ApiField("label")
	private String label;

	/**
	 * 发布时间戳
	 */
	@ApiField("publish_time")
	private String publishTime;

	/**
	 * 排名
	 */
	@ApiField("rank")
	private String rank;

	/**
	 * 车系id
	 */
	@ApiField("series_id")
	private String seriesId;

	/**
	 * 标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 内容id列表
	 */
	@ApiListField("unique_id")
	@ApiField("string")
	private List<String> uniqueId;

	public String getHotId() {
		return this.hotId;
	}
	public void setHotId(String hotId) {
		this.hotId = hotId;
	}

	public String getIndex() {
		return this.index;
	}
	public void setIndex(String index) {
		this.index = index;
	}

	public String getLabel() {
		return this.label;
	}
	public void setLabel(String label) {
		this.label = label;
	}

	public String getPublishTime() {
		return this.publishTime;
	}
	public void setPublishTime(String publishTime) {
		this.publishTime = publishTime;
	}

	public String getRank() {
		return this.rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getSeriesId() {
		return this.seriesId;
	}
	public void setSeriesId(String seriesId) {
		this.seriesId = seriesId;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public List<String> getUniqueId() {
		return this.uniqueId;
	}
	public void setUniqueId(List<String> uniqueId) {
		this.uniqueId = uniqueId;
	}

}
