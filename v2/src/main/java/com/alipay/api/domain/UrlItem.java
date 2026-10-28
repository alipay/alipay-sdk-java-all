package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-10-14 16:27:59
 */
public class UrlItem extends AlipayObject {

	private static final long serialVersionUID = 5873572778969597637L;

	/**
	 * 附件 ID
	 */
	@ApiField("attachment_id")
	private Long attachmentId;

	/**
	 * 文件路径
	 */
	@ApiField("file_path")
	private String filePath;

	/**
	 * t链接
	 */
	@ApiField("murl")
	private String murl;

	/**
	 * nm链接
	 */
	@ApiField("nurl")
	private String nurl;

	/**
	 * 是否带签名
	 */
	@ApiField("signed")
	private Boolean signed;

	/**
	 * t链接
	 */
	@ApiField("turl")
	private String turl;

	/**
	 * 主链接
	 */
	@ApiField("url")
	private String url;

	public Long getAttachmentId() {
		return this.attachmentId;
	}
	public void setAttachmentId(Long attachmentId) {
		this.attachmentId = attachmentId;
	}

	public String getFilePath() {
		return this.filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getMurl() {
		return this.murl;
	}
	public void setMurl(String murl) {
		this.murl = murl;
	}

	public String getNurl() {
		return this.nurl;
	}
	public void setNurl(String nurl) {
		this.nurl = nurl;
	}

	public Boolean getSigned() {
		return this.signed;
	}
	public void setSigned(Boolean signed) {
		this.signed = signed;
	}

	public String getTurl() {
		return this.turl;
	}
	public void setTurl(String turl) {
		this.turl = turl;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
