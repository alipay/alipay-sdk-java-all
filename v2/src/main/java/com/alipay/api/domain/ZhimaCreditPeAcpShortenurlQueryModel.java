package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻可信名片受理台链接转换服务
 *
 * @author auto create
 * @since 1.0, 2026-05-20 21:52:44
 */
public class ZhimaCreditPeAcpShortenurlQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5141185493773424576L;

	/**
	 * 原始链接
	 */
	@ApiField("schema_url")
	private String schemaUrl;

	public String getSchemaUrl() {
		return this.schemaUrl;
	}
	public void setSchemaUrl(String schemaUrl) {
		this.schemaUrl = schemaUrl;
	}

}
