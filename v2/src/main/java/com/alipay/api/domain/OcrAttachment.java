package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-01-15 12:57:41
 */
public class OcrAttachment extends AlipayObject {

	private static final long serialVersionUID = 4875543249691173392L;

	/**
	 * 附件id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 附件类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * 附件地址
	 */
	@ApiField("url")
	private String url;

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
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
