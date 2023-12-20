package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 附件信息
 *
 * @author auto create
 * @since 1.0, 2023-12-01 13:56:47
 */
public class AttachmentDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 1326211948878368643L;

	/**
	 * 附件标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 附件url
	 */
	@ApiField("url")
	private String url;

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
