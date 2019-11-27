package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生活号摘要信息
 *
 * @author auto create
 * @since 1.0, 2019-07-12 15:39:24
 */
public class PublicSummaryInfo extends AlipayObject {

	private static final long serialVersionUID = 3133831532593536942L;

	/**
	 * 生活号id
	 */
	@ApiField("public_id")
	private String publicId;

	/**
	 * 生活号名称
	 */
	@ApiField("public_name")
	private String publicName;

	public String getPublicId() {
		return this.publicId;
	}
	public void setPublicId(String publicId) {
		this.publicId = publicId;
	}

	public String getPublicName() {
		return this.publicName;
	}
	public void setPublicName(String publicName) {
		this.publicName = publicName;
	}

}
