package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 客流走廊地址列表
 *
 * @author auto create
 * @since 1.0, 2019-11-21 16:32:14
 */
public class CloudbusTransitItem extends AlipayObject {

	private static final long serialVersionUID = 5776185178412647863L;

	/**
	 * 月份
	 */
	@ApiField("month")
	private String month;

	/**
	 * oss访问地址
	 */
	@ApiField("url")
	private String url;

	public String getMonth() {
		return this.month;
	}
	public void setMonth(String month) {
		this.month = month;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
