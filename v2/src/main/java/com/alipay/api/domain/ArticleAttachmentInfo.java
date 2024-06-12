package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 文章附件信息
 *
 * @author auto create
 * @since 1.0, 2021-01-06 19:42:53
 */
public class ArticleAttachmentInfo extends AlipayObject {

	private static final long serialVersionUID = 8831911843382796592L;

	/**
	 * 文章附件
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * 附件完整Key
	 */
	@ApiField("key")
	private String key;

	/**
	 * 附件的url
	 */
	@ApiField("url")
	private String url;

	public String getFileName() {
		return this.fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
