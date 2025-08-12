package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 流式内容结构单元
 *
 * @author auto create
 * @since 1.0, 2024-09-24 13:28:19
 */
public class ContentUnit extends AlipayObject {

	private static final long serialVersionUID = 3564953583241192217L;

	/**
	 * 单次推送的内容
	 */
	@ApiField("content")
	private StreamContent content;

	/**
	 * 内容id
	 */
	@ApiField("content_id")
	private String contentId;

	/**
	 * text-文本
steam-流式
template-卡片
	 */
	@ApiField("content_type")
	private String contentType;

	/**
	 * 多条内容的排序序号
	 */
	@ApiField("index_id")
	private Long indexId;

	public StreamContent getContent() {
		return this.content;
	}
	public void setContent(StreamContent content) {
		this.content = content;
	}

	public String getContentId() {
		return this.contentId;
	}
	public void setContentId(String contentId) {
		this.contentId = contentId;
	}

	public String getContentType() {
		return this.contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public Long getIndexId() {
		return this.indexId;
	}
	public void setIndexId(Long indexId) {
		this.indexId = indexId;
	}

}
