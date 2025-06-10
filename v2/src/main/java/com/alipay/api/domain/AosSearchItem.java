package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * Aos搜索结果实体
 *
 * @author auto create
 * @since 1.0, 2023-08-28 20:36:58
 */
public class AosSearchItem extends AlipayObject {

	private static final long serialVersionUID = 6231397434372219754L;

	/**
	 * 业务主键
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 元数据信息
	 */
	@ApiField("meta")
	private String meta;

	/**
	 * 埋点参数
	 */
	@ApiField("sequence")
	private String sequence;

	/**
	 * 摘要值
	 */
	@ApiField("snippet")
	private String snippet;

	/**
	 * 搜索的展示的内容
	 */
	@ApiField("text")
	private String text;

	/**
	 * 标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 数据类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * 跳转链接地址
	 */
	@ApiField("url")
	private String url;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getMeta() {
		return this.meta;
	}
	public void setMeta(String meta) {
		this.meta = meta;
	}

	public String getSequence() {
		return this.sequence;
	}
	public void setSequence(String sequence) {
		this.sequence = sequence;
	}

	public String getSnippet() {
		return this.snippet;
	}
	public void setSnippet(String snippet) {
		this.snippet = snippet;
	}

	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
