package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 供应链验码附件信息
 *
 * @author auto create
 * @since 1.0, 2023-11-20 16:06:22
 */
public class SupplierAppendixUrl extends AlipayObject {

	private static final long serialVersionUID = 5416775993766463318L;

	/**
	 * 图片名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 支持扩展名：jpg、png、jpeg
	 */
	@ApiField("suffix")
	private String suffix;

	/**
	 * 图片地址
	 */
	@ApiField("url")
	private String url;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getSuffix() {
		return this.suffix;
	}
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
