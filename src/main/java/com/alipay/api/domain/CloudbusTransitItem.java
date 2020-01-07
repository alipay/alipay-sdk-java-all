package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 客流走廊地址列表
 *
 * @author auto create
 * @since 1.0, 2019-12-10 22:35:28
 */
public class CloudbusTransitItem extends AlipayObject {

	private static final long serialVersionUID = 1217982988191674832L;

	/**
	 * 月份
	 */
	@ApiField("month")
	private String month;

	/**
	 * 客流走廊类型，枚举  0 公共出行 1 不含地铁 2 现有线网
	 */
	@ApiField("type")
	private String type;

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
