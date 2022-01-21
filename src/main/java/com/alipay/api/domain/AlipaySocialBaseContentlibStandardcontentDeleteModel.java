package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 内容删除
 *
 * @author auto create
 * @since 1.0, 2021-11-12 15:44:24
 */
public class AlipaySocialBaseContentlibStandardcontentDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 5479971289897941151L;

	/**
	 * 内容ID
	 */
	@ApiField("content_id")
	private String contentId;

	/**
	 * 生活号+号ID，只有MCN机构为达人号ID删除内容才需要传入
	 */
	@ApiField("public_id")
	private String publicId;

	public String getContentId() {
		return this.contentId;
	}
	public void setContentId(String contentId) {
		this.contentId = contentId;
	}

	public String getPublicId() {
		return this.publicId;
	}
	public void setPublicId(String publicId) {
		this.publicId = publicId;
	}

}
