package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 文搜图场景下图片信息结构体
 *
 * @author auto create
 * @since 1.0, 2026-05-26 14:10:31
 */
public class OpenSearchImageBO extends AlipayObject {

	private static final long serialVersionUID = 1533928651845748733L;

	/**
	 * 图片资源的唯一ID，用于资源有问题的时候，快速定位资源
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 原始文档路径
	 */
	@ApiField("doc_url")
	private String docUrl;

	/**
	 * 多模态理解，对图片进行描述
	 */
	@ApiField("generated_desc")
	private String generatedDesc;

	/**
	 * 图片高度,单位px
	 */
	@ApiField("pic_height")
	private String picHeight;

	/**
	 * 图片存储到蚂蚁cnd的地址
	 */
	@ApiField("pic_url")
	private String picUrl;

	/**
	 * 图片宽度,单位px
	 */
	@ApiField("pic_width")
	private String picWidth;

	/**
	 * 排序使用的相关性分，取值0-1
	 */
	@ApiField("sort_values")
	private String sortValues;

	/**
	 * 图片的title，完全基于爬虫能力选择，无固定长度
	 */
	@ApiField("title")
	private String title;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getDocUrl() {
		return this.docUrl;
	}
	public void setDocUrl(String docUrl) {
		this.docUrl = docUrl;
	}

	public String getGeneratedDesc() {
		return this.generatedDesc;
	}
	public void setGeneratedDesc(String generatedDesc) {
		this.generatedDesc = generatedDesc;
	}

	public String getPicHeight() {
		return this.picHeight;
	}
	public void setPicHeight(String picHeight) {
		this.picHeight = picHeight;
	}

	public String getPicUrl() {
		return this.picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getPicWidth() {
		return this.picWidth;
	}
	public void setPicWidth(String picWidth) {
		this.picWidth = picWidth;
	}

	public String getSortValues() {
		return this.sortValues;
	}
	public void setSortValues(String sortValues) {
		this.sortValues = sortValues;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
