package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁售后补充凭证
 *
 * @author auto create
 * @since 1.0, 2025-08-22 20:57:18
 */
public class RentAftersaleMediaInfoVO extends AlipayObject {

	private static final long serialVersionUID = 2136726635183529279L;

	/**
	 * 材料类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * 材料链接
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
