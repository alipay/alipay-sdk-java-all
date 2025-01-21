package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 文章附件信息
 *
 * @author auto create
 * @since 1.0, 2024-08-13 20:44:49
 */
public class ArticleAttachmentInfo extends AlipayObject {

	private static final long serialVersionUID = 7877334975292249197L;

	/**
	 * 文章附件
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * 附件id
	 */
	@ApiField("id")
	private Long id;

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

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
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
