package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 好大夫的患者附件
 *
 * @author auto create
 * @since 1.0, 2025-10-23 18:22:55
 */
public class HDFPatientAttachment extends AlipayObject {

	private static final long serialVersionUID = 2781394782846669979L;

	/**
	 * 附件的文件类型。如，png、pdf
	 */
	@ApiField("type")
	private String type;

	/**
	 * 好大夫的图片url
	 */
	@ApiField("url")
	private String url;

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
