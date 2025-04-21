package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 附件信息
 *
 * @author auto create
 * @since 1.0, 2024-06-05 13:52:16
 */
public class AttachmentDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 5875677799626158273L;

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
