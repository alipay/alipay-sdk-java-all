package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 兴趣社区发布内容关联的超链接
 *
 * @author auto create
 * @since 1.0, 2025-01-16 15:37:25
 */
public class IcommunityContentUrlIndex extends AlipayObject {

	private static final long serialVersionUID = 2736446844556526778L;

	/**
	 * 内容关联的链接值
	 */
	@ApiField("content_link_url")
	private String contentLinkUrl;

	/**
	 * 内容关联超链接名称
	 */
	@ApiField("content_link_url_name")
	private String contentLinkUrlName;

	/**
	 * 关联超链接的内容对象在内容文本中的结束位置
	 */
	@ApiField("url_end_index")
	private String urlEndIndex;

	/**
	 * 关联超链接的内容对象在内容文本中的起始位置
	 */
	@ApiField("url_start_index")
	private String urlStartIndex;

	public String getContentLinkUrl() {
		return this.contentLinkUrl;
	}
	public void setContentLinkUrl(String contentLinkUrl) {
		this.contentLinkUrl = contentLinkUrl;
	}

	public String getContentLinkUrlName() {
		return this.contentLinkUrlName;
	}
	public void setContentLinkUrlName(String contentLinkUrlName) {
		this.contentLinkUrlName = contentLinkUrlName;
	}

	public String getUrlEndIndex() {
		return this.urlEndIndex;
	}
	public void setUrlEndIndex(String urlEndIndex) {
		this.urlEndIndex = urlEndIndex;
	}

	public String getUrlStartIndex() {
		return this.urlStartIndex;
	}
	public void setUrlStartIndex(String urlStartIndex) {
		this.urlStartIndex = urlStartIndex;
	}

}
