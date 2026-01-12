package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 流式内容信息单元
 *
 * @author auto create
 * @since 1.0, 2025-11-20 10:08:12
 */
public class AIStreamContent extends AlipayObject {

	private static final long serialVersionUID = 4575877135659323274L;

	/**
	 * 卡片类型
	 */
	@ApiField("content_type")
	private String contentType;

	/**
	 * 是否还有下文
	 */
	@ApiField("has_next")
	private Boolean hasNext;

	/**
	 * 顺序
	 */
	@ApiField("index")
	private Long index;

	/**
	 * 内部业务信息
	 */
	@ApiField("inner_biz_content")
	private String innerBizContent;

	/**
	 * 卡片唯一ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 文本
	 */
	@ApiField("text")
	private String text;

	public String getContentType() {
		return this.contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public Boolean getHasNext() {
		return this.hasNext;
	}
	public void setHasNext(Boolean hasNext) {
		this.hasNext = hasNext;
	}

	public Long getIndex() {
		return this.index;
	}
	public void setIndex(Long index) {
		this.index = index;
	}

	public String getInnerBizContent() {
		return this.innerBizContent;
	}
	public void setInnerBizContent(String innerBizContent) {
		this.innerBizContent = innerBizContent;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}

}
